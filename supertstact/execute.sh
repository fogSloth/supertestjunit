#!bin/sh
export VNC_VIEW_ONLY=1
sendMsg(){
    code=$1
    msg=$2
    url=$3
    echo "{
        \"generation-id\": \"${JOB_ID}\",
        \"id\": \"${BUILD_ID}\",
        \"triggeredBy\": \"${TRIGGERED_BY}\",
        \"code\": \"${code}\",
        \"msg\": \"${msg}\",
        \"date\": \"$(date -Is)\",
        \"downloadUrl\": \"${url}\"
    }" > msg.json

    _RETURN=$(curl -sL -w "%{http_code}" -H "Content-Type: application/json" -X POST ${URL_NOTIFICATIONS} -d @msg.json)
    echo "End send notification  HTTP return CODE: $_RETURN"
}

/usr/bin/chromedriver -v
/opt/bin/generate-config
/opt/bin/start-vnc.sh &
/opt/bin/start-xvfb.sh &
/opt/bin/start-novnc.sh &

cp -r ./resources ./app/projectFolderExe
cd /app/projectFolderExe
mkdir -p report/resources
echo "Start test execution"
java -jar supertstactExe.jar > test.log 2> report/errors.log
echo "End test execution"

# The zip folder contains execution logs and all necessary resources
cd /app/projectFolderExe
rm execute.sh msg.json summary.log test.log && zip -r projectFolderExe.zip .

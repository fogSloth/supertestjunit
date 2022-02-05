ARG CR_URL
FROM selenium/standalone-edge as final
ENV VNC_NO_PASSWORD=true
ENV VNC_VIEW_ONLY=1
USER root
RUN apt-get update && apt-get install zip && apt-get install curl jq && apt-get -qqy install zip tmux ffmpeg
WORKDIR /app
COPY ./ /app

FROM maven:3.6.3-jdk-8 as build

ARG NEXUS_USR_READ
ARG NEXUS_PSW_READ
ARG NEXUS_URL_MVN


WORKDIR /src
# Copy pom files to install necessary packages
# It must be done this way to run with Kaniko cache.
COPY pom.xml .
COPY ./.m2 ./.m2

RUN mvn -s .m2/settings.xml install -DskipTests

# Copy code, otherwhise a copy .. instruction prevents Kaniko cache to run succesfully.
COPY ./src/ ./src/
COPY ./resources/ ./resources/

RUN mvn -s .m2/settings.xml package -DskipTests

#Create folder to zip
WORKDIR /projectFolderExe

#Copy needs to build executable ZIP
RUN cp -r /src/resources ./ && cp /src/target/supertstactExe.jar ./ && cp -r /src/target/lib ./
COPY ./extent_config.xml ./
COPY ./config.properties ./
COPY ./README.md ./




FROM final
WORKDIR /app
COPY --from=build /projectFolderExe /app/projectFolderExe
RUN cp /app/execute.sh /app/projectFolderExe
WORKDIR /app/projectFolderExe

# RUN useradd -u 1001 nonrootuser
# RUN chown -R 1001:1001 $CATALINA_HOME
package com.dedalow.release5;

import com.dedalow.utils.Utils;
import com.dedalow.utils.Constant;
import com.dedalow.report.Report;




import com.dedalow.request.patch;
import com.dedalow.request.post;
import com.dedalow.request.postError;
import com.dedalow.request.get;
import com.dedalow.request.put;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import com.google.common.base.Throwables;
import io.restassured.response.Response;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Release5BackendBeforeEach{

    private Class reflectiveClass;
    private Constant constant;
    private WebDriver driver;
    private String handler;
    private JavascriptExecutor js;
    private Properties prop;
    private File folderDownloads;
    private HashMap<String, String> excelSheet;
    private String finalResult;
    public ExtentTest test;
    public String level;
    public String caseName;
    
    
    
    
    
    
	private static patch patch;
	private static post post;
	private static postError postError;
	private static get get;
	private static put put;

    public Release5BackendBeforeEach(Class reflectiveClass) throws Exception {
        this.reflectiveClass = reflectiveClass;
        getPrepareBeforeEach();
        js = (JavascriptExecutor)driver;
        
		patch = new patch();
		post = new post();
		postError = new postError();
		get = new get();
		put = new put();
        
         
        
    }

    public void getPrepareBeforeEach() throws Exception {
      this.driver = (WebDriver) reflectiveClass.getField("driver").get(reflectiveClass);
      this.constant = (Constant) reflectiveClass.getField("constant").get(reflectiveClass);
      this.prop = (Properties) reflectiveClass.getField("prop").get(reflectiveClass);
      this.folderDownloads = (File) reflectiveClass.getField("folderDownloads").get(reflectiveClass);
      this.handler = (String) reflectiveClass.getField("handler").get(reflectiveClass);
      this.excelSheet = (HashMap) reflectiveClass.getField("excelSheet").get(reflectiveClass);
      this.finalResult = (String) reflectiveClass.getField("finalResult").get(reflectiveClass);
      this.level = (String) reflectiveClass.getField("level").get(reflectiveClass);
      this.caseName = (String) reflectiveClass.getField("caseName").get(reflectiveClass);
    }
    
    public void doBackendBeforeEach() throws Exception {

            Report.reportLog(reflectiveClass, "BeforeEach BackendBeforeEach of execution", "INFO", 0, Status.PASS, false, "", "", null);
            
			constant.isBackend = true;
            constant.apiResponse = post.postPOST5();
    		Report.reportLog(reflectiveClass, "The field post5 completed", "INFO", 0, Status.PASS, false, "BackendInvoke postPOST5 <strong> POST </strong> completed "
        	+ "<br> <strong> Url: </strong>" + post.uriResolved + " </br>"+ "<strong> Request: </strong></br>"
    		+ "<textarea readonly>" + post.jsonBody + " </textarea>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
            constant.isBackend = false;
            
            constant.isBackend = true;
            
            assertTrue(constant.apiResponse.getHeader("Content-Type").contains("utf-8"),
            "Error assertion BackendAssertion26 check the Header return Content-Type: "
            + constant.apiResponse.getHeader("Content-Type") + ", expected contains utf-8");
            Report.reportLog(reflectiveClass, "Correct assertion BackendAssertion26 check the Header return Content-Type: "
            + constant.apiResponse.getHeader("Content-Type") + ", expected contains utf-8", "INFO", 0, Status.PASS, false, "Correct assertion BackendAssertion26 check the Header <br><strong>return</strong> Content-Type: "  + constant.apiResponse.getHeader("Content-Type")
            + ",</br> <strong> expected </strong> contains utf-8", "backendAssertion", null);
            
            
            assertTrue(constant.apiResponse.jsonPath().getString("job").contains("leader"),
            "Error assertion BackendAssertion27 check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected contains leader");
            Report.reportLog(reflectiveClass, "Correct assertion BackendAssertion27 check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected contains leader", "INFO", 0, Status.PASS, false, "Correct assertion BackendAssertion27 check the Body <br><strong>return</strong> job: "  + constant.apiResponse.jsonPath().getString("job")
            + ",</br> <strong> expected </strong> contains leader", "backendAssertion", null);
            
            
			
        	assertTrue(201 == constant.apiResponse.getStatusCode(),
        	"VerdictPost3 returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 201");
        	Report.reportLog(reflectiveClass, "Correct assertion in VerdictPost3 returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 201", "INFO", 0, Status.PASS, false, "Correct assertion in VerdictPost3 <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 201", "backendAssertion", null);
            constant.isBackend = false;
            
            constant.isBackend = true;
            constant.apiResponse = get.getGET5();
    		Report.reportLog(reflectiveClass, "The field get5 completed", "INFO", 0, Status.PASS, false, "BackendInvoke getGET5 <strong> GET </strong> completed "
        	+ "<br> <strong> Url: </strong>" + get.uriResolved + " </br>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
            constant.isBackend = false;
            
            constant.isBackend = true;
            
            assertTrue(constant.apiResponse.jsonPath().getString("support").contains("[text:To keep ReqRes free, contributions towards server costs are appreciated!, url:https://reqres.in/#support-heading]"),
            "Error assertion BackendAssertion28 check the Body return support: "
            + constant.apiResponse.jsonPath().getString("support") + ", expected contains [text:To keep ReqRes free, contributions towards server costs are appreciated!, url:https://reqres.in/#support-heading]");
            Report.reportLog(reflectiveClass, "Correct assertion BackendAssertion28 check the Body return support: "
            + constant.apiResponse.jsonPath().getString("support") + ", expected contains [text:To keep ReqRes free, contributions towards server costs are appreciated!, url:https://reqres.in/#support-heading]", "INFO", 0, Status.PASS, false, "Correct assertion BackendAssertion28 check the Body <br><strong>return</strong> support: "  + constant.apiResponse.jsonPath().getString("support")
            + ",</br> <strong> expected </strong> contains [text:To keep ReqRes free, contributions towards server costs are appreciated!, url:https://reqres.in/#support-heading]", "backendAssertion", null);
            
            
			
        	assertTrue(200 == constant.apiResponse.getStatusCode(),
        	"VerdictGet3 returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 200");
        	Report.reportLog(reflectiveClass, "Correct assertion in VerdictGet3 returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 200", "INFO", 0, Status.PASS, false, "Correct assertion in VerdictGet3 <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 200", "backendAssertion", null);
            constant.isBackend = false;
            
            constant.isBackend = true;
            constant.apiResponse = patch.patchPATCH5();
    		Report.reportLog(reflectiveClass, "The field patch5 completed", "INFO", 0, Status.PASS, false, "BackendInvoke patchPATCH5 <strong> PATCH </strong> completed "
        	+ "<br> <strong> Url: </strong>" + patch.uriResolved + " </br>"+ "<strong> Request: </strong></br>"
    		+ "<textarea readonly>" + patch.jsonBody + " </textarea>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
            constant.isBackend = false;
            
            constant.isBackend = true;
            
            assertTrue(constant.apiResponse.jsonPath().getString("updatedAt").contains("2022"),
            "Error assertion BackendAssertion29 check the Body return updatedAt: "
            + constant.apiResponse.jsonPath().getString("updatedAt") + ", expected contains 2022");
            Report.reportLog(reflectiveClass, "Correct assertion BackendAssertion29 check the Body return updatedAt: "
            + constant.apiResponse.jsonPath().getString("updatedAt") + ", expected contains 2022", "INFO", 0, Status.PASS, false, "Correct assertion BackendAssertion29 check the Body <br><strong>return</strong> updatedAt: "  + constant.apiResponse.jsonPath().getString("updatedAt")
            + ",</br> <strong> expected </strong> contains 2022", "backendAssertion", null);
            
            
			
        	assertTrue(200 == constant.apiResponse.getStatusCode(),
        	"VerdictPatch3 returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 200");
        	Report.reportLog(reflectiveClass, "Correct assertion in VerdictPatch3 returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 200", "INFO", 0, Status.PASS, false, "Correct assertion in VerdictPatch3 <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 200", "backendAssertion", null);
            constant.isBackend = false;
            
            constant.isBackend = true;
            constant.apiResponse = put.putPUT5();
    		Report.reportLog(reflectiveClass, "The field put5 completed", "INFO", 0, Status.PASS, false, "BackendInvoke putPUT5 <strong> PUT </strong> completed "
        	+ "<br> <strong> Url: </strong>" + put.uriResolved + " </br>"+ "<strong> Request: </strong></br>"
    		+ "<textarea readonly>" + put.jsonBody + " </textarea>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
            constant.isBackend = false;
            
            constant.isBackend = true;
            
            assertTrue(!constant.apiResponse.jsonPath().getString("job").contains("jesus"),
            "Error assertion BackendAssertion25 check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected notContains jesus");
            Report.reportLog(reflectiveClass, "Correct assertion BackendAssertion25 check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected notContains jesus", "INFO", 0, Status.PASS, false, "Correct assertion BackendAssertion25 check the Body <br><strong>return</strong> job: "  + constant.apiResponse.jsonPath().getString("job")
            + ",</br> <strong> expected </strong> notContains jesus", "backendAssertion", null);
            
            
			
        	assertTrue(200 == constant.apiResponse.getStatusCode(),
        	"VerdictPut3 returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 200");
        	Report.reportLog(reflectiveClass, "Correct assertion in VerdictPut3 returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 200", "INFO", 0, Status.PASS, false, "Correct assertion in VerdictPut3 <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 200", "backendAssertion", null);
            constant.isBackend = false;
            
            constant.isBackend = true;
            constant.apiResponse = postError.postErrorPOST5();
    		Report.reportLog(reflectiveClass, "The field postError5 completed", "INFO", 0, Status.PASS, false, "BackendInvoke postErrorPOST5 <strong> POST </strong> completed "
        	+ "<br> <strong> Url: </strong>" + postError.uriResolved + " </br>"+ "<strong> Request: </strong></br>"
    		+ "<textarea readonly>" + postError.jsonBody + " </textarea>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
            constant.isBackend = false;
            
            constant.isBackend = true;
            
			
        	assertTrue(201 == constant.apiResponse.getStatusCode(),
        	"VerdictPostError3 returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 201");
        	Report.reportLog(reflectiveClass, "Correct assertion in VerdictPostError3 returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 201", "INFO", 0, Status.PASS, false, "Correct assertion in VerdictPostError3 <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 201", "backendAssertion", null);
            constant.isBackend = false;
            
            
	}
}
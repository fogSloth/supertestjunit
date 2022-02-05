package com.dedalow.actions;

import com.dedalow.utils.Utils;
import com.dedalow.utils.Constant;
import com.dedalow.report.Report;
import com.dedalow.request.patch;
import com.dedalow.request.get;
import com.dedalow.request.postUriContext;
import com.dedalow.request.post;
import com.dedalow.request.postError;
import com.dedalow.request.put;
import io.restassured.response.Response;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class BackendAction2Action{

    private Class reflectiveClass;
    private Constant constant;
    private WebDriver driver;
    private String handler;
    private JavascriptExecutor js;
    private Properties prop;
    private String level;
    private String caseName;
    private File folderTestCase;
    private File folderDownloads;
    private String finalResult;
    private HashMap<String, String> excelSheet;
    
	private static patch patch;
	private static get get;
	private static postUriContext postUriContext;
	private static post post;
	private static postError postError;
	private static put put;
      
    
    public BackendAction2Action(Class reflectiveClass) throws Exception {
        this.reflectiveClass = reflectiveClass;
        getPrepareAction();
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor)driver;
		patch = new patch();
		get = new get();
		postUriContext = new postUriContext();
		post = new post();
		postError = new postError();
		put = new put();
    }

    public void getPrepareAction() throws Exception {
        this.driver = (WebDriver) reflectiveClass.getField("driver").get(reflectiveClass);
        this.constant = (Constant) reflectiveClass.getField("constant").get(reflectiveClass);
        this.prop = (Properties) reflectiveClass.getField("prop").get(reflectiveClass);
        this.level = (String) reflectiveClass.getField("level").get(reflectiveClass);
        this.folderDownloads = (File) reflectiveClass.getField("folderDownloads").get(reflectiveClass);
        this.finalResult = (String) reflectiveClass.getField("finalResult").get(reflectiveClass);
        this.folderTestCase = (File) reflectiveClass.getField("folderTestCase").get(reflectiveClass);
        this.caseName = (String) reflectiveClass.getField("caseName").get(reflectiveClass);
        this.handler = (String) reflectiveClass.getField("handler").get(reflectiveClass);
        this.excelSheet = (HashMap) reflectiveClass.getField("excelSheet").get(reflectiveClass);
    }

    public BackendAction2Action postPOST4() throws Exception {
        constant.isBackend = true;
        constant.apiResponse = post.postPOST4();
    		Report.reportLog(reflectiveClass, "The field post4 completed", "INFO", 0, Status.PASS, false, "BackendInvoke postPOST4 <strong> POST </strong> completed "
        	+ "<br> <strong> Url: </strong>" + post.uriResolved + " </br>"+ "<strong> Request: </strong></br>"
    		+ "<textarea readonly>" + post.jsonBody + " </textarea>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
        Report.reportLog(reflectiveClass, "postPOST4 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        constant.isBackend = false;
        return this;
    }

    public BackendAction2Action VerdictPost1() throws Exception {
        constant.isBackend = true;
        
            assertTrue(constant.apiResponse.getHeader("Content-Type").contains("utf-8"),
            "Error assertion BackendAssertion23 check the Header return Content-Type: "
            + constant.apiResponse.getHeader("Content-Type") + ", expected contains utf-8");
            Report.reportLog(reflectiveClass, "Correct assertion BackendAssertion23 check the Header return Content-Type: "
            + constant.apiResponse.getHeader("Content-Type") + ", expected contains utf-8", "INFO", 0, Status.PASS, false, "Correct assertion BackendAssertion23 check the Header <br><strong>return</strong> Content-Type: "  + constant.apiResponse.getHeader("Content-Type")
            + ",</br> <strong> expected </strong> contains utf-8", "backendAssertion", null);
            
            
            assertTrue(constant.apiResponse.jsonPath().getString("job").contains("leader"),
            "Error assertion BackendAssertion24 check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected contains leader");
            Report.reportLog(reflectiveClass, "Correct assertion BackendAssertion24 check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected contains leader", "INFO", 0, Status.PASS, false, "Correct assertion BackendAssertion24 check the Body <br><strong>return</strong> job: "  + constant.apiResponse.jsonPath().getString("job")
            + ",</br> <strong> expected </strong> contains leader", "backendAssertion", null);
            
            
			
        	assertTrue(201 == constant.apiResponse.getStatusCode(),
        	"VerdictPost1 returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 201");
        	Report.reportLog(reflectiveClass, "Correct assertion in VerdictPost1 returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 201", "INFO", 0, Status.PASS, false, "Correct assertion in VerdictPost1 <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 201", "backendAssertion", null);
        Report.reportLog(reflectiveClass, "VerdictPost1 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        	constant.isBackend = false;
          return this;
    }
    
    public BackendAction2Action getGET4() throws Exception {
        constant.isBackend = true;
        constant.apiResponse = get.getGET4();
    		Report.reportLog(reflectiveClass, "The field get4 completed", "INFO", 0, Status.PASS, false, "BackendInvoke getGET4 <strong> GET </strong> completed "
        	+ "<br> <strong> Url: </strong>" + get.uriResolved + " </br>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
        Report.reportLog(reflectiveClass, "getGET4 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        constant.isBackend = false;
        return this;
    }

    public BackendAction2Action VerdictGet1() throws Exception {
        constant.isBackend = true;
        
            assertTrue(constant.apiResponse.jsonPath().getString("support").contains("[text:To keep ReqRes free, contributions towards server costs are appreciated!, url:https://reqres.in/#support-heading]"),
            "Error assertion BackendAssertion20 check the Body return support: "
            + constant.apiResponse.jsonPath().getString("support") + ", expected contains [text:To keep ReqRes free, contributions towards server costs are appreciated!, url:https://reqres.in/#support-heading]");
            Report.reportLog(reflectiveClass, "Correct assertion BackendAssertion20 check the Body return support: "
            + constant.apiResponse.jsonPath().getString("support") + ", expected contains [text:To keep ReqRes free, contributions towards server costs are appreciated!, url:https://reqres.in/#support-heading]", "INFO", 0, Status.PASS, false, "Correct assertion BackendAssertion20 check the Body <br><strong>return</strong> support: "  + constant.apiResponse.jsonPath().getString("support")
            + ",</br> <strong> expected </strong> contains [text:To keep ReqRes free, contributions towards server costs are appreciated!, url:https://reqres.in/#support-heading]", "backendAssertion", null);
            
            
			
        	assertTrue(200 == constant.apiResponse.getStatusCode(),
        	"VerdictGet1 returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 200");
        	Report.reportLog(reflectiveClass, "Correct assertion in VerdictGet1 returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 200", "INFO", 0, Status.PASS, false, "Correct assertion in VerdictGet1 <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 200", "backendAssertion", null);
        Report.reportLog(reflectiveClass, "VerdictGet1 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        	constant.isBackend = false;
          return this;
    }
    
    public BackendAction2Action patchPATCH4() throws Exception {
        constant.isBackend = true;
        constant.apiResponse = patch.patchPATCH4();
    		Report.reportLog(reflectiveClass, "The field patch4 completed", "INFO", 0, Status.PASS, false, "BackendInvoke patchPATCH4 <strong> PATCH </strong> completed "
        	+ "<br> <strong> Url: </strong>" + patch.uriResolved + " </br>"+ "<strong> Request: </strong></br>"
    		+ "<textarea readonly>" + patch.jsonBody + " </textarea>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
        Report.reportLog(reflectiveClass, "patchPATCH4 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        constant.isBackend = false;
        return this;
    }

    public BackendAction2Action VerdictPatch1() throws Exception {
        constant.isBackend = true;
        
            assertTrue(constant.apiResponse.jsonPath().getString("updatedAt").contains("2022"),
            "Error assertion BackendAssertion21 check the Body return updatedAt: "
            + constant.apiResponse.jsonPath().getString("updatedAt") + ", expected contains 2022");
            Report.reportLog(reflectiveClass, "Correct assertion BackendAssertion21 check the Body return updatedAt: "
            + constant.apiResponse.jsonPath().getString("updatedAt") + ", expected contains 2022", "INFO", 0, Status.PASS, false, "Correct assertion BackendAssertion21 check the Body <br><strong>return</strong> updatedAt: "  + constant.apiResponse.jsonPath().getString("updatedAt")
            + ",</br> <strong> expected </strong> contains 2022", "backendAssertion", null);
            
            
			
        	assertTrue(200 == constant.apiResponse.getStatusCode(),
        	"VerdictPatch1 returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 200");
        	Report.reportLog(reflectiveClass, "Correct assertion in VerdictPatch1 returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 200", "INFO", 0, Status.PASS, false, "Correct assertion in VerdictPatch1 <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 200", "backendAssertion", null);
        Report.reportLog(reflectiveClass, "VerdictPatch1 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        	constant.isBackend = false;
          return this;
    }
    
    public BackendAction2Action putPUT4() throws Exception {
        constant.isBackend = true;
        constant.apiResponse = put.putPUT4();
    		Report.reportLog(reflectiveClass, "The field put4 completed", "INFO", 0, Status.PASS, false, "BackendInvoke putPUT4 <strong> PUT </strong> completed "
        	+ "<br> <strong> Url: </strong>" + put.uriResolved + " </br>"+ "<strong> Request: </strong></br>"
    		+ "<textarea readonly>" + put.jsonBody + " </textarea>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
        Report.reportLog(reflectiveClass, "putPUT4 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        constant.isBackend = false;
        return this;
    }

    public BackendAction2Action VerdictPut1() throws Exception {
        constant.isBackend = true;
        
            assertTrue(!constant.apiResponse.jsonPath().getString("job").contains("jesus"),
            "Error assertion BackendAssertion22 check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected notContains jesus");
            Report.reportLog(reflectiveClass, "Correct assertion BackendAssertion22 check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected notContains jesus", "INFO", 0, Status.PASS, false, "Correct assertion BackendAssertion22 check the Body <br><strong>return</strong> job: "  + constant.apiResponse.jsonPath().getString("job")
            + ",</br> <strong> expected </strong> notContains jesus", "backendAssertion", null);
            
            
			
        	assertTrue(200 == constant.apiResponse.getStatusCode(),
        	"VerdictPut1 returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 200");
        	Report.reportLog(reflectiveClass, "Correct assertion in VerdictPut1 returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 200", "INFO", 0, Status.PASS, false, "Correct assertion in VerdictPut1 <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 200", "backendAssertion", null);
        Report.reportLog(reflectiveClass, "VerdictPut1 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        	constant.isBackend = false;
          return this;
    }
    
    public BackendAction2Action postErrorPOST4() throws Exception {
        constant.isBackend = true;
        constant.apiResponse = postError.postErrorPOST4();
    		Report.reportLog(reflectiveClass, "The field postError4 completed", "INFO", 0, Status.PASS, false, "BackendInvoke postErrorPOST4 <strong> POST </strong> completed "
        	+ "<br> <strong> Url: </strong>" + postError.uriResolved + " </br>"+ "<strong> Request: </strong></br>"
    		+ "<textarea readonly>" + postError.jsonBody + " </textarea>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
        Report.reportLog(reflectiveClass, "postErrorPOST4 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        constant.isBackend = false;
        return this;
    }

    public BackendAction2Action VerdictPostError1() throws Exception {
        constant.isBackend = true;
        
			
        	assertTrue(201 == constant.apiResponse.getStatusCode(),
        	"VerdictPostError1 returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 201");
        	Report.reportLog(reflectiveClass, "Correct assertion in VerdictPostError1 returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 201", "INFO", 0, Status.PASS, false, "Correct assertion in VerdictPostError1 <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 201", "backendAssertion", null);
        Report.reportLog(reflectiveClass, "VerdictPostError1 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        	constant.isBackend = false;
          return this;
    }
    
    public BackendAction2Action postUriContextPOST() throws Exception {
        constant.isBackend = true;
        constant.apiResponse = postUriContext.postUriContextPOST();
    		Report.reportLog(reflectiveClass, "The field postUriContext completed", "INFO", 0, Status.PASS, false, "BackendInvoke postUriContextPOST <strong> POST </strong> completed "
        	+ "<br> <strong> Url: </strong>" + postUriContext.uriResolved + " </br>"+ "<strong> Request: </strong></br>"
    		+ "<textarea readonly>" + postUriContext.jsonBody + " </textarea>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
        Report.reportLog(reflectiveClass, "postUriContextPOST action completed", "INFO", 0, Status.PASS, false, "", "", null);
        constant.isBackend = false;
        return this;
    }

    
    public void doBackendAction2Action() throws Exception {
    
    
		postPOST4();
    
		VerdictPost1();
    
		getGET4();
    
		VerdictGet1();
    
		patchPATCH4();
    
		VerdictPatch1();
    
		putPUT4();
    
		VerdictPut1();
    
		postErrorPOST4();
    
		VerdictPostError1();
    
		postUriContextPOST();
    
		
    }
}
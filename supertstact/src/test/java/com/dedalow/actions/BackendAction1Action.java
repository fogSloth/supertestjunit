package com.dedalow.actions;

import com.dedalow.utils.Utils;
import com.dedalow.utils.Constant;
import com.dedalow.report.Report;
import com.dedalow.request.post;
import com.dedalow.request.postError;
import com.dedalow.request.get;
import com.dedalow.request.put;
import com.dedalow.request.patch;
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

public class BackendAction1Action{

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
    
	private static BackendAction2Action backendAction2Action;
	private static post post;
	private static postError postError;
	private static get get;
	private static put put;
	private static patch patch;
      
    
    public BackendAction1Action(Class reflectiveClass) throws Exception {
        this.reflectiveClass = reflectiveClass;
        getPrepareAction();
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor)driver;
		backendAction2Action = new BackendAction2Action(reflectiveClass);
		post = new post();
		postError = new postError();
		get = new get();
		put = new put();
		patch = new patch();
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

    public BackendAction1Action postPOST3() throws Exception {
        constant.isBackend = true;
        constant.apiResponse = post.postPOST3();
    		Report.reportLog(reflectiveClass, "The field post3 completed", "INFO", 0, Status.PASS, false, "BackendInvoke postPOST3 <strong> POST </strong> completed "
        	+ "<br> <strong> Url: </strong>" + post.uriResolved + " </br>"+ "<strong> Request: </strong></br>"
    		+ "<textarea readonly>" + post.jsonBody + " </textarea>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
        Report.reportLog(reflectiveClass, "postPOST3 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        constant.isBackend = false;
        return this;
    }

    public BackendAction1Action VerdictPost() throws Exception {
        constant.isBackend = true;
        
            assertTrue(constant.apiResponse.getHeader("Content-Type").contains("utf-8"),
            "Error assertion BackendAssertion15 check the Header return Content-Type: "
            + constant.apiResponse.getHeader("Content-Type") + ", expected contains utf-8");
            Report.reportLog(reflectiveClass, "Correct assertion BackendAssertion15 check the Header return Content-Type: "
            + constant.apiResponse.getHeader("Content-Type") + ", expected contains utf-8", "INFO", 0, Status.PASS, false, "Correct assertion BackendAssertion15 check the Header <br><strong>return</strong> Content-Type: "  + constant.apiResponse.getHeader("Content-Type")
            + ",</br> <strong> expected </strong> contains utf-8", "backendAssertion", null);
            
            
            assertTrue(constant.apiResponse.jsonPath().getString("job").contains("leader"),
            "Error assertion BackendAssertion16 check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected contains leader");
            Report.reportLog(reflectiveClass, "Correct assertion BackendAssertion16 check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected contains leader", "INFO", 0, Status.PASS, false, "Correct assertion BackendAssertion16 check the Body <br><strong>return</strong> job: "  + constant.apiResponse.jsonPath().getString("job")
            + ",</br> <strong> expected </strong> contains leader", "backendAssertion", null);
            
            
			
        	assertTrue(201 == constant.apiResponse.getStatusCode(),
        	"VerdictPost returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 201");
        	Report.reportLog(reflectiveClass, "Correct assertion in VerdictPost returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 201", "INFO", 0, Status.PASS, false, "Correct assertion in VerdictPost <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 201", "backendAssertion", null);
        Report.reportLog(reflectiveClass, "VerdictPost action completed", "INFO", 0, Status.PASS, false, "", "", null);
        	constant.isBackend = false;
          return this;
    }
    
    public BackendAction1Action getGET3() throws Exception {
        constant.isBackend = true;
        constant.apiResponse = get.getGET3();
    		Report.reportLog(reflectiveClass, "The field get3 completed", "INFO", 0, Status.PASS, false, "BackendInvoke getGET3 <strong> GET </strong> completed "
        	+ "<br> <strong> Url: </strong>" + get.uriResolved + " </br>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
        Report.reportLog(reflectiveClass, "getGET3 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        constant.isBackend = false;
        return this;
    }

    public BackendAction1Action VerdictGet() throws Exception {
        constant.isBackend = true;
        
            assertTrue(constant.apiResponse.jsonPath().getString("support").contains("[text:To keep ReqRes free, contributions towards server costs are appreciated!, url:https://reqres.in/#support-heading]"),
            "Error assertion BackendAssertion17 check the Body return support: "
            + constant.apiResponse.jsonPath().getString("support") + ", expected contains [text:To keep ReqRes free, contributions towards server costs are appreciated!, url:https://reqres.in/#support-heading]");
            Report.reportLog(reflectiveClass, "Correct assertion BackendAssertion17 check the Body return support: "
            + constant.apiResponse.jsonPath().getString("support") + ", expected contains [text:To keep ReqRes free, contributions towards server costs are appreciated!, url:https://reqres.in/#support-heading]", "INFO", 0, Status.PASS, false, "Correct assertion BackendAssertion17 check the Body <br><strong>return</strong> support: "  + constant.apiResponse.jsonPath().getString("support")
            + ",</br> <strong> expected </strong> contains [text:To keep ReqRes free, contributions towards server costs are appreciated!, url:https://reqres.in/#support-heading]", "backendAssertion", null);
            
            
			
        	assertTrue(200 == constant.apiResponse.getStatusCode(),
        	"VerdictGet returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 200");
        	Report.reportLog(reflectiveClass, "Correct assertion in VerdictGet returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 200", "INFO", 0, Status.PASS, false, "Correct assertion in VerdictGet <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 200", "backendAssertion", null);
        Report.reportLog(reflectiveClass, "VerdictGet action completed", "INFO", 0, Status.PASS, false, "", "", null);
        	constant.isBackend = false;
          return this;
    }
    
    public BackendAction1Action patchPATCH3() throws Exception {
        constant.isBackend = true;
        constant.apiResponse = patch.patchPATCH3();
    		Report.reportLog(reflectiveClass, "The field patch3 completed", "INFO", 0, Status.PASS, false, "BackendInvoke patchPATCH3 <strong> PATCH </strong> completed "
        	+ "<br> <strong> Url: </strong>" + patch.uriResolved + " </br>"+ "<strong> Request: </strong></br>"
    		+ "<textarea readonly>" + patch.jsonBody + " </textarea>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
        Report.reportLog(reflectiveClass, "patchPATCH3 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        constant.isBackend = false;
        return this;
    }

    public BackendAction1Action VerdictPatch() throws Exception {
        constant.isBackend = true;
        
            assertTrue(constant.apiResponse.jsonPath().getString("updatedAt").contains("2022"),
            "Error assertion BackendAssertion18 check the Body return updatedAt: "
            + constant.apiResponse.jsonPath().getString("updatedAt") + ", expected contains 2022");
            Report.reportLog(reflectiveClass, "Correct assertion BackendAssertion18 check the Body return updatedAt: "
            + constant.apiResponse.jsonPath().getString("updatedAt") + ", expected contains 2022", "INFO", 0, Status.PASS, false, "Correct assertion BackendAssertion18 check the Body <br><strong>return</strong> updatedAt: "  + constant.apiResponse.jsonPath().getString("updatedAt")
            + ",</br> <strong> expected </strong> contains 2022", "backendAssertion", null);
            
            
			
        	assertTrue(200 == constant.apiResponse.getStatusCode(),
        	"VerdictPatch returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 200");
        	Report.reportLog(reflectiveClass, "Correct assertion in VerdictPatch returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 200", "INFO", 0, Status.PASS, false, "Correct assertion in VerdictPatch <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 200", "backendAssertion", null);
        Report.reportLog(reflectiveClass, "VerdictPatch action completed", "INFO", 0, Status.PASS, false, "", "", null);
        	constant.isBackend = false;
          return this;
    }
    
    public BackendAction1Action putPUT3() throws Exception {
        constant.isBackend = true;
        constant.apiResponse = put.putPUT3();
    		Report.reportLog(reflectiveClass, "The field put3 completed", "INFO", 0, Status.PASS, false, "BackendInvoke putPUT3 <strong> PUT </strong> completed "
        	+ "<br> <strong> Url: </strong>" + put.uriResolved + " </br>"+ "<strong> Request: </strong></br>"
    		+ "<textarea readonly>" + put.jsonBody + " </textarea>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
        Report.reportLog(reflectiveClass, "putPUT3 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        constant.isBackend = false;
        return this;
    }

    public BackendAction1Action VerdictPut() throws Exception {
        constant.isBackend = true;
        
            assertTrue(!constant.apiResponse.jsonPath().getString("job").contains("jesus"),
            "Error assertion BackendAssertion19 check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected notContains jesus");
            Report.reportLog(reflectiveClass, "Correct assertion BackendAssertion19 check the Body return job: "
            + constant.apiResponse.jsonPath().getString("job") + ", expected notContains jesus", "INFO", 0, Status.PASS, false, "Correct assertion BackendAssertion19 check the Body <br><strong>return</strong> job: "  + constant.apiResponse.jsonPath().getString("job")
            + ",</br> <strong> expected </strong> notContains jesus", "backendAssertion", null);
            
            
			
        	assertTrue(200 == constant.apiResponse.getStatusCode(),
        	"VerdictPut returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 200");
        	Report.reportLog(reflectiveClass, "Correct assertion in VerdictPut returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 200", "INFO", 0, Status.PASS, false, "Correct assertion in VerdictPut <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 200", "backendAssertion", null);
        Report.reportLog(reflectiveClass, "VerdictPut action completed", "INFO", 0, Status.PASS, false, "", "", null);
        	constant.isBackend = false;
          return this;
    }
    
    public BackendAction1Action postErrorPOST3() throws Exception {
        constant.isBackend = true;
        constant.apiResponse = postError.postErrorPOST3();
    		Report.reportLog(reflectiveClass, "The field postError3 completed", "INFO", 0, Status.PASS, false, "BackendInvoke postErrorPOST3 <strong> POST </strong> completed "
        	+ "<br> <strong> Url: </strong>" + postError.uriResolved + " </br>"+ "<strong> Request: </strong></br>"
    		+ "<textarea readonly>" + postError.jsonBody + " </textarea>",
        	"<strong> Response: </strong></br><textarea readonly>" + constant.apiResponse.asString() + "</textarea>", null);
	
        Report.reportLog(reflectiveClass, "postErrorPOST3 action completed", "INFO", 0, Status.PASS, false, "", "", null);
        constant.isBackend = false;
        return this;
    }

    public BackendAction1Action VerdictPostError() throws Exception {
        constant.isBackend = true;
        
			
        	assertTrue(201 == constant.apiResponse.getStatusCode(),
        	"VerdictPostError returns " + constant.apiResponse.getStatusCode()
        	+ " status code, expected 201");
        	Report.reportLog(reflectiveClass, "Correct assertion in VerdictPostError returns "
        	+ constant.apiResponse.getStatusCode() + " status code, expected 201", "INFO", 0, Status.PASS, false, "Correct assertion in VerdictPostError <br><strong>returns</strong> "
        	+ constant.apiResponse.getStatusCode() + " status code, </br><strong>expected</strong> 201", "backendAssertion", null);
        Report.reportLog(reflectiveClass, "VerdictPostError action completed", "INFO", 0, Status.PASS, false, "", "", null);
        	constant.isBackend = false;
          return this;
    }
    
    
    public void doBackendAction1Action() throws Exception {
    
    
		postPOST3();
    
		VerdictPost();
    
		getGET3();
    
		VerdictGet();
    
		patchPATCH3();
    
		VerdictPatch();
    
		putPUT3();
    
		VerdictPut();
    
		postErrorPOST3();
    
		VerdictPostError();
    
		backendAction2Action.doBackendAction2Action();
      	Report.reportLog(reflectiveClass, "BackendAction2Action action completed", "INFO", 0, Status.PASS, false, "", "", null);
    
		
    }
}
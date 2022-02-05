package com.dedalow.actions;

import com.dedalow.utils.Utils;
import com.dedalow.utils.Constant;
import com.dedalow.report.Report;
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

public class PushGogsGlobalAction{

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
    
      
	private static By checkPushGogs = By.xpath("/html/body/div[12]/div/div/div[2]/div/div[1]/span[1]");
	private By CheckPushGogsNotVisible = By.xpath("/html/body/div[11]/span[3]");
	private By Run = By.xpath("/html/body/cad-modal/div/div/div/div[3]/button[2]");
	private By EjecutePlugIn = By.xpath("//span[contains(text(),'Execute plug-in')]");
	private By ShowResults = By.xpath("//a[contains(text(),'Show results...')]");
	private By EjecutePlugIn1 = By.xpath("//span[contains(text(),'Execute plug-in')]");
	private By PushToGogs = By.xpath("//a[contains(text(), 'Generate and Push')]");
    
    public PushGogsGlobalAction(Class reflectiveClass) throws Exception {
        this.reflectiveClass = reflectiveClass;
        getPrepareAction();
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor)driver;
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

    
      
	public PushGogsGlobalAction EjecutePlugIn1() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(EjecutePlugIn1));
            Report.reportLog(reflectiveClass, "Condition EjecutePlugIn1 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(EjecutePlugIn1).click();
            Report.reportLog(reflectiveClass, "Clicked EjecutePlugIn1", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
      
	public PushGogsGlobalAction PushToGogs() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PushToGogs));
            Report.reportLog(reflectiveClass, "Condition PushToGogs isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(PushToGogs).click();
            Report.reportLog(reflectiveClass, "Clicked PushToGogs", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      public PushGogsGlobalAction CheckPushGogsNotVisible() {
        	
			new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(CheckPushGogsNotVisible));
            Report.reportLog(reflectiveClass, "Condition CheckPushGogsNotVisible isVisible finished", "INFO", 60, Status.PASS, true, "", "", null);

        	return this;
    }

	
      
	public PushGogsGlobalAction Run() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Run));
            Report.reportLog(reflectiveClass, "Condition Run isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(Run).click();
            Report.reportLog(reflectiveClass, "Clicked Run", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
      
	public PushGogsGlobalAction EjecutePlugIn() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(EjecutePlugIn));
            Report.reportLog(reflectiveClass, "Condition EjecutePlugIn isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(EjecutePlugIn).click();
            Report.reportLog(reflectiveClass, "Clicked EjecutePlugIn", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
      }
      
      
	public PushGogsGlobalAction ShowResults() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ShowResults));
            Report.reportLog(reflectiveClass, "Condition ShowResults isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(ShowResults).click();
            Report.reportLog(reflectiveClass, "Clicked ShowResults", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
	public PushGogsGlobalAction FrontEndVerdictStepsAction() {
        
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(checkPushGogs));
            Report.reportLog(reflectiveClass, "Condition checkPushGogs isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue(driver.findElement(checkPushGogs).getText().contains("correctly"), "Field checkPushGogs not found in assertion");
        	Report.reportLog(reflectiveClass, "The field correctly has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field FrontEndVerdictStepsAction has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    
    public void doPushGogsGlobalAction() throws Exception {
    
    
		EjecutePlugIn1();
    
		PushToGogs();
    
		Run();
    
		CheckPushGogsNotVisible();
      
		EjecutePlugIn();
    	Thread.sleep(1000);

		ShowResults();
    
		FrontEndVerdictStepsAction();
    
		
    }
}
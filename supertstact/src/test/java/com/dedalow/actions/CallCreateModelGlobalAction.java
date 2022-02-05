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

public class CallCreateModelGlobalAction{

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
    
	private static CreateModelGlobalAction createModelGlobalAction;
      
	private By CreateNew = By.xpath("//button[contains(text(),'Create new...')]");
	private By AsyncCondition4 = By.xpath("div[@class='loader-bg']");
	private By CreateNewProject = By.xpath("//button[contains(text(),'+ Create new project')]");
	private By NameProject = By.xpath("/html/body/div[12]/div/div/div[3]/div[2]/div[1]/input");
	private By NewProject = By.xpath("/html/body/div[10]/div/div[1]/div/a");
	private By waitTesting = By.xpath("//*[@id=\"myCards\"]/div[2]/div/div/div/div[1]/a/div/div[1]");
	private By CreateSeed = By.xpath("/html/body/div[12]/div/div/div[4]/button[1]");
    
    public CallCreateModelGlobalAction(Class reflectiveClass) throws Exception {
        this.reflectiveClass = reflectiveClass;
        getPrepareAction();
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor)driver;
		createModelGlobalAction = new CreateModelGlobalAction(reflectiveClass);
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

    
      
	public CallCreateModelGlobalAction NewProject() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(NewProject));
            Report.reportLog(reflectiveClass, "Condition NewProject isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(NewProject).click();
            Report.reportLog(reflectiveClass, "Clicked NewProject", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
      }
      
      
	public CallCreateModelGlobalAction CreateNew() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(CreateNew));
            Report.reportLog(reflectiveClass, "Condition CreateNew isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(CreateNew).click();
            Report.reportLog(reflectiveClass, "Clicked CreateNew", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
      }
      public CallCreateModelGlobalAction AsyncCondition4() {
        	
			new WebDriverWait(driver, 40).until(ExpectedConditions.invisibilityOfElementLocated(AsyncCondition4));
            Report.reportLog(reflectiveClass, "Condition AsyncCondition4 isNotVisible finished", "INFO", 40, Status.PASS, true, "", "", null);

        	return this;
    }

	
      
	public CallCreateModelGlobalAction CreateNewProject() throws Exception {
        	driver.findElement(NameProject).clear();
            driver.findElement(NameProject).sendKeys("globaljunit");
            Report.reportLog(reflectiveClass, "Typed " + "globaljunit in NameProject", "INFO", 0, Status.PASS, true, "", "", null);
		
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(CreateNewProject));
            Report.reportLog(reflectiveClass, "Condition CreateNewProject isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(CreateNewProject).click();
            Report.reportLog(reflectiveClass, "Clicked CreateNewProject", "INFO", 8000, Status.PASS, true, "", "", null);
            return this;
      }
      public CallCreateModelGlobalAction waitTesting() {
        	
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(waitTesting));
            Report.reportLog(reflectiveClass, "Condition waitTesting isClickable finished", "INFO", 20, Status.PASS, true, "", "", null);

        	return this;
    }

	
      
	public CallCreateModelGlobalAction CreateSeed() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(CreateSeed));
            Report.reportLog(reflectiveClass, "Condition CreateSeed isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(CreateSeed).click();
            Report.reportLog(reflectiveClass, "Clicked CreateSeed", "INFO", 3000, Status.PASS, true, "", "", null);
            return this;
      }
      
    public void doCallCreateModelGlobalAction() throws Exception {
    
    
		NewProject();
    	Thread.sleep(1000);

		CreateNew();
    	Thread.sleep(1000);

		CreateNewProject();
    	Thread.sleep(8000);

		AsyncCondition4();
      
		CreateSeed();
    	Thread.sleep(3000);

		waitTesting();
      
		createModelGlobalAction.doCreateModelGlobalAction();
      	Report.reportLog(reflectiveClass, "CreateModelGlobalAction action completed", "INFO", 0, Status.PASS, false, "", "", null);
    
		
    }
}
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

public class CreateModelGlobalAction{

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
    
      
	private By GetInTestSuiteModel = By.id("I_000001");
	private By CursorBoxStart = By.id("I_000001");
	private By AddBoxExecuteContext_Destination = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
    private By AddBoxExecuteContext = By.xpath("//*[@id=\"/C/L/jD\"]");
	private By MoveBoxFrontEndNavigate_Destination = By.xpath("");
    private By MoveBoxFrontEndNavigate = By.id("I_000000");
	private By GetInTestingContext = By.id("I_000000");
	private By GoBack = By.xpath("//i[contains(text(),'arrow_upward')]");
	private By GoBack1 = By.xpath("//i[contains(text(),'arrow_upward')]");
	private By AddBoxTestCaseModel_Destination = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
    private By AddBoxTestCaseModel = By.xpath("//*[@id=\"/C/L/c\"]");
	private By AddBoxFrontEndContext_Destination = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
    private By AddBoxFrontEndContext = By.xpath("//*[@id=\"/C/L/WJ\"]");
	private By AsyncCondition6 = By.xpath("//span[contains(@title,'everiscad.test.TestModel')]");
	private By TestingModule = By.xpath("//span[contains(@title,'everiscad.test.TestModel')]");
	private By AddBoxTestingContext_Destination = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
    private By AddBoxTestingContext = By.xpath("//*[@id=\"/C/L/f\"]");
	private By MoveBoxTestingContext_Destination = By.xpath("");
    private By MoveBoxTestingContext = By.id("I_000000");
	private By AddUri = By.id("I_000001");
	private By valueUri = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div/div/ul/li[4]/div/ul/li[5]/div/div[2]/input");
	private By SelectFrontEndContext = By.id("I_000001");
	private By GoBack2 = By.xpath("//i[contains(text(),'arrow_upward')]");
	private By AddBoxTestSuiteModel_Destination = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
    private By AddBoxTestSuiteModel = By.xpath("//*[@id=\"/C/L/F\"]");
	private By MoveTestCaseModel_Destination = By.xpath("");
    private By MoveTestCaseModel = By.id("I_000000");
	private By GetInTestCaseModel = By.id("I_000000");
	private By AddBoxFrontEndNavigate_Destination = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
    private By AddBoxFrontEndNavigate = By.xpath("//*[@id=\"/C/L/E\"]");
	private By AddFlow_Destination = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[2]/div[2]/div/div[4]");
    private By AddFlow = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[2]/div[3]/div/div[5]");
	private By AddBoxStart_Destination = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
    private By AddBoxStart = By.xpath("//*[@id=\"/C/L/g\"]");
	private By GoBack3 = By.xpath("//i[contains(text(),'arrow_upward')]");
	private By GetInExecute = By.id("I_000002");
    
    public CreateModelGlobalAction(Class reflectiveClass) throws Exception {
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

    public CreateModelGlobalAction AsyncCondition6() {
        	
			new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(AsyncCondition6));
            Report.reportLog(reflectiveClass, "Condition AsyncCondition6 isClickable finished", "INFO", 40, Status.PASS, true, "", "", null);

        	return this;
    }

	
      
	public CreateModelGlobalAction TestingModule() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(TestingModule));
            Report.reportLog(reflectiveClass, "Condition TestingModule isClickable finished", "ASYNCHRONOUS", 0);

            Actions action = new Actions(driver);
            action.doubleClick(driver.findElement(TestingModule)).perform();
            Report.reportLog(reflectiveClass, "Double clicked TestingModule", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      public CreateModelGlobalAction AddBoxTestingContext() {
        Actions action = new Actions(driver);
        action.dragAndDrop(driver.findElement(AddBoxTestingContext), driver.findElement(AddBoxTestingContext_Destination)).release().build().perform();
        Report.reportLog(reflectiveClass, "AddBoxTestingContext action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }

	public CreateModelGlobalAction MoveBoxTestingContext() {
        Actions action = new Actions(driver);
        action.dragAndDropBy(driver.findElement(MoveBoxTestingContext), 200, 0).release().build().perform();
        Report.reportLog(reflectiveClass, "MoveBoxTestingContext action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }

	
      
	public CreateModelGlobalAction GetInTestingContext() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(GetInTestingContext));
            Report.reportLog(reflectiveClass, "Condition GetInTestingContext isClickable finished", "ASYNCHRONOUS", 0);

            Actions action = new Actions(driver);
            action.doubleClick(driver.findElement(GetInTestingContext)).perform();
            Report.reportLog(reflectiveClass, "Double clicked GetInTestingContext", "INFO", 5000, Status.PASS, true, "", "", null);
            return this;
      }
      public CreateModelGlobalAction AddBoxExecuteContext() {
        Actions action = new Actions(driver);
        action.dragAndDrop(driver.findElement(AddBoxExecuteContext), driver.findElement(AddBoxExecuteContext_Destination)).release().build().perform();
        Report.reportLog(reflectiveClass, "AddBoxExecuteContext action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }

	public CreateModelGlobalAction AddBoxFrontEndContext() {
        Actions action = new Actions(driver);
        action.dragAndDrop(driver.findElement(AddBoxFrontEndContext), driver.findElement(AddBoxFrontEndContext_Destination)).release().build().perform();
        Report.reportLog(reflectiveClass, "AddBoxFrontEndContext action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }

	
      
	public CreateModelGlobalAction SelectFrontEndContext() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SelectFrontEndContext));
            Report.reportLog(reflectiveClass, "Condition SelectFrontEndContext isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(SelectFrontEndContext).click();
            Report.reportLog(reflectiveClass, "Clicked SelectFrontEndContext", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
      
	public CreateModelGlobalAction AddUri() throws Exception {
        	driver.findElement(valueUri).clear();
            driver.findElement(valueUri).sendKeys("https://cad-alfa-thecide.caddev.everis.com/profile/login?redirect=%2F");
            Report.reportLog(reflectiveClass, "Typed " + "https://cad-alfa-thecide.caddev.everis.com/profile/login?redirect=%2F in valueUri", "INFO", 0, Status.PASS, true, "", "", null);
		
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AddUri));
            Report.reportLog(reflectiveClass, "Condition AddUri isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(AddUri).click();
            Report.reportLog(reflectiveClass, "Clicked AddUri", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
      
	public CreateModelGlobalAction GoBack2() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(GoBack2));
            Report.reportLog(reflectiveClass, "Condition GoBack2 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(GoBack2).click();
            Report.reportLog(reflectiveClass, "Clicked GoBack2", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      public CreateModelGlobalAction AddBoxTestSuiteModel() {
        Actions action = new Actions(driver);
        action.dragAndDrop(driver.findElement(AddBoxTestSuiteModel), driver.findElement(AddBoxTestSuiteModel_Destination)).release().build().perform();
        Report.reportLog(reflectiveClass, "AddBoxTestSuiteModel action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }

	
      
	public CreateModelGlobalAction GetInTestSuiteModel() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(GetInTestSuiteModel));
            Report.reportLog(reflectiveClass, "Condition GetInTestSuiteModel isClickable finished", "ASYNCHRONOUS", 0);

            Actions action = new Actions(driver);
            action.doubleClick(driver.findElement(GetInTestSuiteModel)).perform();
            Report.reportLog(reflectiveClass, "Double clicked GetInTestSuiteModel", "INFO", 2000, Status.PASS, true, "", "", null);
            return this;
      }
      public CreateModelGlobalAction AddBoxTestCaseModel() {
        Actions action = new Actions(driver);
        action.dragAndDrop(driver.findElement(AddBoxTestCaseModel), driver.findElement(AddBoxTestCaseModel_Destination)).release().build().perform();
        Report.reportLog(reflectiveClass, "AddBoxTestCaseModel action completed", "INFO", 2000, Status.PASS, true, "", "", null);
        return this;
    }

	public CreateModelGlobalAction MoveTestCaseModel() {
        Actions action = new Actions(driver);
        action.dragAndDropBy(driver.findElement(MoveTestCaseModel), 0, 170).release().build().perform();
        Report.reportLog(reflectiveClass, "MoveTestCaseModel action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }

	
      
	public CreateModelGlobalAction GetInTestCaseModel() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(GetInTestCaseModel));
            Report.reportLog(reflectiveClass, "Condition GetInTestCaseModel isClickable finished", "ASYNCHRONOUS", 0);

            Actions action = new Actions(driver);
            action.doubleClick(driver.findElement(GetInTestCaseModel)).perform();
            Report.reportLog(reflectiveClass, "Double clicked GetInTestCaseModel", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
      
	public CreateModelGlobalAction GetInExecute() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(GetInExecute));
            Report.reportLog(reflectiveClass, "Condition GetInExecute isClickable finished", "ASYNCHRONOUS", 0);

            Actions action = new Actions(driver);
            action.doubleClick(driver.findElement(GetInExecute)).perform();
            Report.reportLog(reflectiveClass, "Double clicked GetInExecute", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
      }
      public CreateModelGlobalAction AddBoxFrontEndNavigate() {
        Actions action = new Actions(driver);
        action.dragAndDrop(driver.findElement(AddBoxFrontEndNavigate), driver.findElement(AddBoxFrontEndNavigate_Destination)).release().build().perform();
        Report.reportLog(reflectiveClass, "AddBoxFrontEndNavigate action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }

	public CreateModelGlobalAction MoveBoxFrontEndNavigate() {
        Actions action = new Actions(driver);
        action.dragAndDropBy(driver.findElement(MoveBoxFrontEndNavigate), 170, 0).release().build().perform();
        Report.reportLog(reflectiveClass, "MoveBoxFrontEndNavigate action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }

	public CreateModelGlobalAction AddBoxStart() {
        Actions action = new Actions(driver);
        action.dragAndDrop(driver.findElement(AddBoxStart), driver.findElement(AddBoxStart_Destination)).release().build().perform();
        Report.reportLog(reflectiveClass, "AddBoxStart action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }

	
      
	public CreateModelGlobalAction CursorBoxStart() throws Exception {
        
            
            Actions action = new Actions(driver);
            action.moveToElement(driver.findElement(CursorBoxStart)).perform();
            Report.reportLog(reflectiveClass, "Moved to CursorBoxStart", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
      }
      public CreateModelGlobalAction AddFlow() {
        Actions action = new Actions(driver);
        action.dragAndDrop(driver.findElement(AddFlow), driver.findElement(AddFlow_Destination)).release().build().perform();
        Report.reportLog(reflectiveClass, "AddFlow action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }

	
      
	public CreateModelGlobalAction GoBack3() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(GoBack3));
            Report.reportLog(reflectiveClass, "Condition GoBack3 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(GoBack3).click();
            Report.reportLog(reflectiveClass, "Clicked GoBack3", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
      
	public CreateModelGlobalAction GoBack1() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(GoBack1));
            Report.reportLog(reflectiveClass, "Condition GoBack1 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(GoBack1).click();
            Report.reportLog(reflectiveClass, "Clicked GoBack1", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
      
	public CreateModelGlobalAction GoBack() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(GoBack));
            Report.reportLog(reflectiveClass, "Condition GoBack isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(GoBack).click();
            Report.reportLog(reflectiveClass, "Clicked GoBack", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
    public void doCreateModelGlobalAction() throws Exception {
    
    
		AsyncCondition6();
      
		TestingModule();
    
		AddBoxTestingContext();
    
		MoveBoxTestingContext();
    
		GetInTestingContext();
    	Thread.sleep(5000);

		AddBoxExecuteContext();
    
		AddBoxFrontEndContext();
    
		SelectFrontEndContext();
    
		AddUri();
    
		GoBack2();
    
		AddBoxTestSuiteModel();
    
		GetInTestSuiteModel();
    	Thread.sleep(2000);

		AddBoxTestCaseModel();
    	Thread.sleep(2000);

		MoveTestCaseModel();
    
		GetInTestCaseModel();
    
		GetInExecute();
    	Thread.sleep(1000);

		AddBoxFrontEndNavigate();
    	Thread.sleep(1000);

		MoveBoxFrontEndNavigate();
    	Thread.sleep(1000);

		AddBoxStart();
    	Thread.sleep(1000);

		CursorBoxStart();
    	Thread.sleep(1000);

		AddFlow();
    	Thread.sleep(1000);

		GoBack3();
    
		GoBack1();
    
		GoBack();
    
		
    }
}
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

public class LocalRelease6Action{

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
    
      
	private static By CheckLastNameAction = By.xpath("//label[contains(text(),'LastName')]");
	private static By SaveEmailAction = By.xpath("//label[contains(text(),'Email')]");
	private By ClickFirstNameAction = By.name("name");
	private By WriteFirstNameAction = By.name("name");
	private By ClickEmailAction = By.name("email");
	private By WriteEmailAction = By.name("email");
	private By ClickLastNameAction = By.name("name");
	private By WriteLastNameAction = By.name("name");
	private static By checkFirstNameAction = By.xpath("//label[contains(text(),'Name')]");
	private static By SaveLastNameAction = By.xpath("//label[contains(text(),'LastName')]");
    
    public LocalRelease6Action(Class reflectiveClass) throws Exception {
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

    public LocalRelease6Action goForm () {
        driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/");
        Report.reportLog(reflectiveClass, "goForm action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }

	
      
	public LocalRelease6Action ClickFirstNameAction(HashMap<String, String> variables) throws Exception {
        	driver.findElement(WriteFirstNameAction).clear();
                driver.findElement(WriteFirstNameAction).sendKeys(variables.get("LocalVariable"));
                Report.reportLog(reflectiveClass, "Typed " + variables.get("LocalVariable") + " in WriteFirstNameAction", "INFO", 0, Status.PASS, true, "", "", null);
		
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ClickFirstNameAction));
            Report.reportLog(reflectiveClass, "Condition ClickFirstNameAction isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(ClickFirstNameAction).click();
            Report.reportLog(reflectiveClass, "Clicked ClickFirstNameAction", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
	public LocalRelease6Action StoreLastNameAction(HashMap<String, String> testActionVariable) {
        
			assertTrue(testActionVariable.get("LocalVariable").equals(driver.findElement(checkFirstNameAction).getText()), "Field checkFirstNameAction not found in assertion");
        	Report.reportLog(reflectiveClass, "The field "+testActionVariable.get("LocalVariable")+" has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        testActionVariable.put("LocalVariable", driver.findElement(SaveLastNameAction).getText());
        Report.reportLog(reflectiveClass, "New value for the variable LocalVariable = " + driver.findElement(SaveLastNameAction).getText(), "INFO", 0, Status.PASS, false, "", "", null);

        Report.reportLog(reflectiveClass, "The field StoreLastNameAction has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    
      
	public LocalRelease6Action ClickLastNameAction(HashMap<String, String> variables) throws Exception {
        	driver.findElement(WriteLastNameAction).clear();
                driver.findElement(WriteLastNameAction).sendKeys(variables.get("LocalVariable"));
                Report.reportLog(reflectiveClass, "Typed " + variables.get("LocalVariable") + " in WriteLastNameAction", "INFO", 0, Status.PASS, true, "", "", null);
		
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ClickLastNameAction));
            Report.reportLog(reflectiveClass, "Condition ClickLastNameAction isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(ClickLastNameAction).click();
            Report.reportLog(reflectiveClass, "Clicked ClickLastNameAction", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
	public LocalRelease6Action StoreEmailAction(HashMap<String, String> testActionVariable) {
        
			assertTrue(testActionVariable.get("LocalVariable").equals(driver.findElement(CheckLastNameAction).getText()), "Field CheckLastNameAction not found in assertion");
        	Report.reportLog(reflectiveClass, "The field "+testActionVariable.get("LocalVariable")+" has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        testActionVariable.put("LocalVariable", driver.findElement(SaveEmailAction).getText());
        Report.reportLog(reflectiveClass, "New value for the variable LocalVariable = " + driver.findElement(SaveEmailAction).getText(), "INFO", 0, Status.PASS, false, "", "", null);

        Report.reportLog(reflectiveClass, "The field StoreEmailAction has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    
      
	public LocalRelease6Action ClickEmailAction(HashMap<String, String> variables) throws Exception {
        	driver.findElement(WriteEmailAction).clear();
                driver.findElement(WriteEmailAction).sendKeys(variables.get("LocalVariable"));
                Report.reportLog(reflectiveClass, "Typed " + variables.get("LocalVariable") + " in WriteEmailAction", "INFO", 0, Status.PASS, true, "", "", null);
		
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ClickEmailAction));
            Report.reportLog(reflectiveClass, "Condition ClickEmailAction isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(ClickEmailAction).click();
            Report.reportLog(reflectiveClass, "Clicked ClickEmailAction", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
    public void doLocalRelease6Action() throws Exception {
    	HashMap<String, String> testActionVariable = new HashMap<String, String>();
		testActionVariable.put("LocalVariable", "Name");
	
    
		goForm();
    
		ClickFirstNameAction(testActionVariable);
    
		StoreLastNameAction(testActionVariable);
    
		ClickLastNameAction(testActionVariable);
    
		StoreEmailAction(testActionVariable);
    
		ClickEmailAction(testActionVariable);
    
		
    }
}
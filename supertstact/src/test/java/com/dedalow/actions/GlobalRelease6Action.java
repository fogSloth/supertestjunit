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

public class GlobalRelease6Action{

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
    
      
	private static By CheckEmailAction = By.xpath("//label[contains(text(),'Email')]");
	private static By SavePhoneAction = By.xpath("//label[contains(text(),'Phone')]");
	private By ClickPhoneAction = By.name("phone");
	private By writePhoneAction = By.name("phone");
	private static By checkPhoneAction = By.xpath("//label[contains(text(),'Phone')]");
	private static By SaveAddressAction = By.xpath("//label[contains(text(),'Address')]");
	private By clickAddressAction = By.name("address");
	private By writeAddressAction = By.name("address");
	private static By checkAddressAction = By.xpath("//label[contains(text(),'Address')]");
	private static By saveCityAction = By.xpath("//label[contains(text(),'City')]");
	private By clickCityAction = By.name("city");
	private By writeCityAction = By.name("city");
    
    public GlobalRelease6Action(Class reflectiveClass) throws Exception {
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

    
	public GlobalRelease6Action StorePhoneAction(HashMap<String, String> testActionVariable) {
        
			assertTrue(testActionVariable.get("GlobalVariable").equals(driver.findElement(CheckEmailAction).getText()), "Field CheckEmailAction not found in assertion");
        	Report.reportLog(reflectiveClass, "The field "+testActionVariable.get("GlobalVariable")+" has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        testActionVariable.put("GlobalVariable", driver.findElement(SavePhoneAction).getText());
        Report.reportLog(reflectiveClass, "New value for the variable GlobalVariable = " + driver.findElement(SavePhoneAction).getText(), "INFO", 0, Status.PASS, false, "", "", null);

        Report.reportLog(reflectiveClass, "The field StorePhoneAction has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    
      
	public GlobalRelease6Action ClickPhoneAction(HashMap<String, String> variables) throws Exception {
        	driver.findElement(writePhoneAction).clear();
                driver.findElement(writePhoneAction).sendKeys(variables.get("GlobalVariable"));
                Report.reportLog(reflectiveClass, "Typed " + variables.get("GlobalVariable") + " in writePhoneAction", "INFO", 0, Status.PASS, true, "", "", null);
		
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ClickPhoneAction));
            Report.reportLog(reflectiveClass, "Condition ClickPhoneAction isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(ClickPhoneAction).click();
            Report.reportLog(reflectiveClass, "Clicked ClickPhoneAction", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
	public GlobalRelease6Action StoreAddressAction(HashMap<String, String> testActionVariable) {
        
			assertTrue(testActionVariable.get("GlobalVariable").equals(driver.findElement(checkPhoneAction).getText()), "Field checkPhoneAction not found in assertion");
        	Report.reportLog(reflectiveClass, "The field "+testActionVariable.get("GlobalVariable")+" has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        testActionVariable.put("GlobalVariable", driver.findElement(SaveAddressAction).getText());
        Report.reportLog(reflectiveClass, "New value for the variable GlobalVariable = " + driver.findElement(SaveAddressAction).getText(), "INFO", 0, Status.PASS, false, "", "", null);

        Report.reportLog(reflectiveClass, "The field StoreAddressAction has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    
      
	public GlobalRelease6Action clickAddressAction(HashMap<String, String> variables) throws Exception {
        	driver.findElement(writeAddressAction).clear();
                driver.findElement(writeAddressAction).sendKeys(variables.get("GlobalVariable"));
                Report.reportLog(reflectiveClass, "Typed " + variables.get("GlobalVariable") + " in writeAddressAction", "INFO", 0, Status.PASS, true, "", "", null);
		
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(clickAddressAction));
            Report.reportLog(reflectiveClass, "Condition clickAddressAction isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(clickAddressAction).click();
            Report.reportLog(reflectiveClass, "Clicked clickAddressAction", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
	public GlobalRelease6Action StoreCityAction(HashMap<String, String> testActionVariable) {
        
			assertTrue(testActionVariable.get("GlobalVariable").equals(driver.findElement(checkAddressAction).getText()), "Field checkAddressAction not found in assertion");
        	Report.reportLog(reflectiveClass, "The field "+testActionVariable.get("GlobalVariable")+" has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        testActionVariable.put("GlobalVariable", driver.findElement(saveCityAction).getText());
        Report.reportLog(reflectiveClass, "New value for the variable GlobalVariable = " + driver.findElement(saveCityAction).getText(), "INFO", 0, Status.PASS, false, "", "", null);

        Report.reportLog(reflectiveClass, "The field StoreCityAction has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    
      
	public GlobalRelease6Action clickCityAction(HashMap<String, String> variables) throws Exception {
        	driver.findElement(writeCityAction).clear();
                driver.findElement(writeCityAction).sendKeys(variables.get("GlobalVariable"));
                Report.reportLog(reflectiveClass, "Typed " + variables.get("GlobalVariable") + " in writeCityAction", "INFO", 0, Status.PASS, true, "", "", null);
		
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(clickCityAction));
            Report.reportLog(reflectiveClass, "Condition clickCityAction isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(clickCityAction).click();
            Report.reportLog(reflectiveClass, "Clicked clickCityAction", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
    public void doGlobalRelease6Action() throws Exception {
    	HashMap<String, String> testActionVariable = new HashMap<String, String>();
		testActionVariable.put("GlobalVariable", "Email");
	
    
		StorePhoneAction(testActionVariable);
    
		ClickPhoneAction(testActionVariable);
    
		StoreAddressAction(testActionVariable);
    
		clickAddressAction(testActionVariable);
    
		StoreCityAction(testActionVariable);
    
		clickCityAction(testActionVariable);
    
		
    }
}
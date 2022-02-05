package com.dedalow.release6;

import com.dedalow.utils.Utils;
import com.dedalow.utils.Constant;
import com.dedalow.report.Report;



import com.dedalow.pages.Release6Page;

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

public class Release6BeforeEach1{

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
    
    
    
	private static Release6Page release6Page;
    
    
	private static By CheckEmail = By.xpath("//label[contains(text(),'Email')]");
	private static By CheckTitle1 = By.xpath("//h2[contains(text(),'formPage')]");
	private static By checkFirstName = By.xpath("//label[contains(text(),'Name')]");
	private static By CheckLastName = By.xpath("//label[contains(text(),'LastName')]");
    
	private static By SaveFirstName = By.xpath("(//label[contains(text(),'Name')])[1]");
	private static By SaveLastName = By.xpath("//label[contains(text(),'LastName')]");
	private static By SaveEmail = By.xpath("//label[contains(text(),'Email')]");

    public Release6BeforeEach1(Class reflectiveClass) throws Exception {
        this.reflectiveClass = reflectiveClass;
        getPrepareBeforeEach();
        js = (JavascriptExecutor)driver;
        
        
		release6Page = new Release6Page(reflectiveClass);
         
        
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
    
    public void doBeforeEach1() throws Exception {
		HashMap<String, String> BeforeEachVariable = new HashMap<String, String>();
			BeforeEachVariable.put("BeforeEachVariable", "formPage");
			
			
            Report.reportLog(reflectiveClass, "BeforeEach BeforeEach1 of execution", "INFO", 0, Status.PASS, false, "", "", null);
            
			driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/");
            Report.reportLog(reflectiveClass, "Navigated to " + "https://cad-uat-cadqa-supertestui.caddev.everis.com/", "INFO", 0, Status.PASS, true, "", "", null);
			
			assertTrue(driver.getCurrentUrl().equals("https://cad-uat-cadqa-supertestui.caddev.everis.com/"), "Field CheckPage1 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field https://cad-uat-cadqa-supertestui.caddev.everis.com/ has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			assertTrue(BeforeEachVariable.get("BeforeEachVariable").equals(driver.findElement(CheckTitle1).getText()), "Field CheckTitle1 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field "+BeforeEachVariable.get("BeforeEachVariable")+" has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            BeforeEachVariable.put("BeforeEachVariable", driver.findElement(SaveFirstName).getText());
            Report.reportLog(reflectiveClass, "New value for the variable BeforeEachVariable = " + driver.findElement(SaveFirstName).getText(), "INFO", 0, Status.PASS, false, "", "", null);

            Report.reportLog(reflectiveClass, "The field CheckPage has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            release6Page.ClickFirstName(BeforeEachVariable);
            
			
			assertTrue(BeforeEachVariable.get("BeforeEachVariable").equals(driver.findElement(checkFirstName).getText()), "Field checkFirstName not found in assertion");
        	Report.reportLog(reflectiveClass, "The field "+BeforeEachVariable.get("BeforeEachVariable")+" has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            BeforeEachVariable.put("BeforeEachVariable", driver.findElement(SaveLastName).getText());
            Report.reportLog(reflectiveClass, "New value for the variable BeforeEachVariable = " + driver.findElement(SaveLastName).getText(), "INFO", 0, Status.PASS, false, "", "", null);

            Report.reportLog(reflectiveClass, "The field StoreLastName has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            release6Page.ClickLastName(BeforeEachVariable);
            
			
			assertTrue(BeforeEachVariable.get("BeforeEachVariable").equals(driver.findElement(CheckLastName).getText()), "Field CheckLastName not found in assertion");
        	Report.reportLog(reflectiveClass, "The field "+BeforeEachVariable.get("BeforeEachVariable")+" has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            BeforeEachVariable.put("BeforeEachVariable", driver.findElement(SaveEmail).getText());
            Report.reportLog(reflectiveClass, "New value for the variable BeforeEachVariable = " + driver.findElement(SaveEmail).getText(), "INFO", 0, Status.PASS, false, "", "", null);

            Report.reportLog(reflectiveClass, "The field StoreEmail has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            release6Page.ClickEmail(BeforeEachVariable);
            
			
			assertTrue(BeforeEachVariable.get("BeforeEachVariable").equals(driver.findElement(CheckEmail).getText()), "Field CheckEmail not found in assertion");
        	Report.reportLog(reflectiveClass, "The field "+BeforeEachVariable.get("BeforeEachVariable")+" has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            
            Report.reportLog(reflectiveClass, "The field AssertEmail has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            
	}
}
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

public class AndAction1{

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
    
      
	private static By Name1 = By.name("name");
	private static By Phone1 = By.name("phone");
	private static By LastName1 = By.name("lastName");
	private static By Email1 = By.name("email");
    
    public AndAction1(Class reflectiveClass) throws Exception {
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

    
	public AndAction1 CheckExcel() {
        
			assertTrue(driver.getCurrentUrl().equals("https://cad-uat-cadqa-supertestui.caddev.everis.com/"), "Field CheckExcel not found in assertion");
        	Report.reportLog(reflectiveClass, "The field https://cad-uat-cadqa-supertestui.caddev.everis.com/ has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			assertTrue(excelSheet.get("Name:CheckText").equals(driver.findElement(Name1).getAttribute("value")), "Field Name1 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field "+ excelSheet.get("Name:CheckText") +" has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			assertTrue(excelSheet.get("Phone:CheckText").equals(driver.findElement(Phone1).getAttribute("value")), "Field Phone1 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field "+ excelSheet.get("Phone:CheckText") +" has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			assertTrue(excelSheet.get("LastName:CheckText").equals(driver.findElement(LastName1).getAttribute("value")), "Field LastName1 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field "+ excelSheet.get("LastName:CheckText") +" has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			assertTrue(excelSheet.get("Email:CheckText").equals(driver.findElement(Email1).getAttribute("value")), "Field Email1 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field "+ excelSheet.get("Email:CheckText") +" has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field CheckExcel has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    
    public void doAndAction1() throws Exception {
    
    
		CheckExcel();
    
		
    }
}
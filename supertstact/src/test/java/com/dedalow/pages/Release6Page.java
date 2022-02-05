package com.dedalow.pages;

import java.util.logging.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.Status;
import com.dedalow.report.Report;
import com.dedalow.utils.Utils;
import com.dedalow.utils.Constant;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Release6Page {

    private WebDriver driver;
    private Class reflectiveClass;
    private JavascriptExecutor js;
    private static Logger logger = Utils.logger();
    
	private By ClickPhone = By.name("phone");
	private By WritePhone = By.name("phone");
	private By ClickAddress = By.name("address");
	private By WriteAddress = By.name("address");
	private By ClickCity = By.name("city");
	private By WriteCity = By.name("city");
	private By ClickZipcode = By.name("zipcode");
	private By WriteZipcode = By.name("zipcode");
	private By ClickZipcode1 = By.name("zipcode");
	private By WriteZipcode1 = By.name("zipcode");
	private By ClickProject = By.name("textArea");
	private By WriteProject = By.name("textArea");
	private By ClickEmail = By.name("email");
	private By WriteEmail = By.name("email");
	private By ClickLastName = By.name("lastName");
	private By WriteLastName = By.name("lastName");
	private By ClickFirstName = By.name("name");
	private By WriteFirstName = By.name("name");
    
    
    public Release6Page(Class reflectiveClass) throws Exception {
        this.reflectiveClass = reflectiveClass;
        this.driver = (WebDriver) reflectiveClass.getField("driver").get(reflectiveClass);
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor)driver;
        
    }
        
	public Release6Page ClickPhone(HashMap<String, String> variables) throws Exception {
        	driver.findElement(WritePhone).clear();
                driver.findElement(WritePhone).sendKeys(variables.get("BeforeVariable"));
                Report.reportLog(reflectiveClass, "Typed " + variables.get("BeforeVariable") + " in WritePhone", "INFO", 0, Status.PASS, true, "", "", null);
		
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ClickPhone));
            Report.reportLog(reflectiveClass, "Condition ClickPhone isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(ClickPhone).click();
            Report.reportLog(reflectiveClass, "Clicked ClickPhone", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public Release6Page ClickAddress(HashMap<String, String> variables) throws Exception {
        	driver.findElement(WriteAddress).clear();
                driver.findElement(WriteAddress).sendKeys(variables.get("BeforeVariable"));
                Report.reportLog(reflectiveClass, "Typed " + variables.get("BeforeVariable") + " in WriteAddress", "INFO", 0, Status.PASS, true, "", "", null);
		
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ClickAddress));
            Report.reportLog(reflectiveClass, "Condition ClickAddress isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(ClickAddress).click();
            Report.reportLog(reflectiveClass, "Clicked ClickAddress", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public Release6Page ClickCity(HashMap<String, String> variables) throws Exception {
        	driver.findElement(WriteCity).clear();
                driver.findElement(WriteCity).sendKeys(variables.get("ExecuteVariable"));
                Report.reportLog(reflectiveClass, "Typed " + variables.get("ExecuteVariable") + " in WriteCity", "INFO", 0, Status.PASS, true, "", "", null);
		
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ClickCity));
            Report.reportLog(reflectiveClass, "Condition ClickCity isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(ClickCity).click();
            Report.reportLog(reflectiveClass, "Clicked ClickCity", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public Release6Page ClickZipcode(HashMap<String, String> variables) throws Exception {
        	driver.findElement(WriteZipcode).clear();
                driver.findElement(WriteZipcode).sendKeys(variables.get("ExecuteVariable"));
                Report.reportLog(reflectiveClass, "Typed " + variables.get("ExecuteVariable") + " in WriteZipcode", "INFO", 0, Status.PASS, true, "", "", null);
		
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ClickZipcode));
            Report.reportLog(reflectiveClass, "Condition ClickZipcode isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(ClickZipcode).click();
            Report.reportLog(reflectiveClass, "Clicked ClickZipcode", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public Release6Page ClickZipcode1(HashMap<String, String> variables) throws Exception {
        	driver.findElement(WriteZipcode1).clear();
                driver.findElement(WriteZipcode1).sendKeys(variables.get("AfterVariable"));
                Report.reportLog(reflectiveClass, "Typed " + variables.get("AfterVariable") + " in WriteZipcode1", "INFO", 0, Status.PASS, true, "", "", null);
		
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ClickZipcode1));
            Report.reportLog(reflectiveClass, "Condition ClickZipcode1 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(ClickZipcode1).click();
            Report.reportLog(reflectiveClass, "Clicked ClickZipcode1", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public Release6Page ClickProject(HashMap<String, String> variables) throws Exception {
        	driver.findElement(WriteProject).clear();
                driver.findElement(WriteProject).sendKeys(variables.get("AfterVariable"));
                Report.reportLog(reflectiveClass, "Typed " + variables.get("AfterVariable") + " in WriteProject", "INFO", 0, Status.PASS, true, "", "", null);
		
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ClickProject));
            Report.reportLog(reflectiveClass, "Condition ClickProject isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(ClickProject).click();
            Report.reportLog(reflectiveClass, "Clicked ClickProject", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public Release6Page ClickEmail(HashMap<String, String> variables) throws Exception {
        	driver.findElement(WriteEmail).clear();
                driver.findElement(WriteEmail).sendKeys(variables.get("BeforeEachVariable"));
                Report.reportLog(reflectiveClass, "Typed " + variables.get("BeforeEachVariable") + " in WriteEmail", "INFO", 0, Status.PASS, true, "", "", null);
		
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ClickEmail));
            Report.reportLog(reflectiveClass, "Condition ClickEmail isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(ClickEmail).click();
            Report.reportLog(reflectiveClass, "Clicked ClickEmail", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public Release6Page ClickLastName(HashMap<String, String> variables) throws Exception {
        	driver.findElement(WriteLastName).clear();
                driver.findElement(WriteLastName).sendKeys(variables.get("BeforeEachVariable"));
                Report.reportLog(reflectiveClass, "Typed " + variables.get("BeforeEachVariable") + " in WriteLastName", "INFO", 0, Status.PASS, true, "", "", null);
		
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ClickLastName));
            Report.reportLog(reflectiveClass, "Condition ClickLastName isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(ClickLastName).click();
            Report.reportLog(reflectiveClass, "Clicked ClickLastName", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public Release6Page ClickFirstName(HashMap<String, String> variables) throws Exception {
        	driver.findElement(WriteFirstName).clear();
                driver.findElement(WriteFirstName).sendKeys(variables.get("BeforeEachVariable"));
                Report.reportLog(reflectiveClass, "Typed " + variables.get("BeforeEachVariable") + " in WriteFirstName", "INFO", 0, Status.PASS, true, "", "", null);
		
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ClickFirstName));
            Report.reportLog(reflectiveClass, "Condition ClickFirstName isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(ClickFirstName).click();
            Report.reportLog(reflectiveClass, "Clicked ClickFirstName", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
}
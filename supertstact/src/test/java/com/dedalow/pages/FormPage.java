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

public class FormPage {

    private WebDriver driver;
    private Class reflectiveClass;
    private JavascriptExecutor js;
    private static Logger logger = Utils.logger();
    
	private By uploadFile = By.id("uploadFile");
	private By dummyClickToForceWait = By.id("name");
	private By downloadFile = By.xpath("//button[contains(text(), 'Download uploadFilefileName')]");
	private By dummyClickToForceWait1 = By.id("name");
	private By downloadFile1 = By.xpath("//button[contains(text(), 'Download uploadFilefileName')]");
	private By uploadFile1 = By.id("uploadFile");
	private By uploadFile2 = By.id("uploadFile");
	private By downloadFile2 = By.xpath("//button[contains(text(), 'Download uploadFilefileName')]");
	private By dummyClickToForceWait2 = By.id("name");
	private By fillInputs = By.id("name");
	private By nameById1 = By.id("name");
	private By lastNameByXpathAndDoubleQuotes1 = By.xpath("//input[@id=\"lastName\"]");
	private By emailByXpathAndSimpleQuote1 = By.xpath("//input[@id='email']");
	private By phoneByName1 = By.name("phone");
	private By fillInputs1 = By.id("name");
	private By nameById2 = By.id("name");
	private By lastNameByXpathAndDoubleQuotes2 = By.xpath("//input[@id=\"lastName\"]");
	private By emailByXpathAndSimpleQuote2 = By.xpath("//input[@id='email']");
	private By phoneByName2 = By.name("phone");
	private By fillInputs2 = By.id("name");
	private By nameById3 = By.id("name");
	private By lastNameByXpathAndDoubleQuotes3 = By.xpath("//input[@id=\"lastName\"]");
	private By emailByXpathAndSimpleQuote3 = By.xpath("//input[@id='email']");
	private By phoneByName3 = By.name("phone");
	private By GoToOk = By.xpath("//button[contains(text(),'goToOk')]");
	private By InputName = By.id("name");
    
    
    public FormPage(Class reflectiveClass) throws Exception {
        this.reflectiveClass = reflectiveClass;
        this.driver = (WebDriver) reflectiveClass.getField("driver").get(reflectiveClass);
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor)driver;
        
    }
        
	public FormPage uploadFile() throws Exception {
        
            
            driver.findElement(uploadFile).sendKeys("C:\\Users\\jperepei\\generated\\Swagger.json");
            Report.reportLog(reflectiveClass, "uploadFile: C:\\Users\\jperepei\\generated\\Swagger.json uploaded", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public FormPage dummyClickToForceWait() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(dummyClickToForceWait));
            Report.reportLog(reflectiveClass, "Condition dummyClickToForceWait isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(dummyClickToForceWait).click();
            Report.reportLog(reflectiveClass, "Clicked dummyClickToForceWait", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public FormPage downloadFile() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(downloadFile));
            Report.reportLog(reflectiveClass, "Condition downloadFile isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(downloadFile).click();
            Report.reportLog(reflectiveClass, "Clicked downloadFile", "INFO", 2000, Status.PASS, true, "", "", null);
            return this;
	}
        
	public FormPage dummyClickToForceWait1() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(dummyClickToForceWait1));
            Report.reportLog(reflectiveClass, "Condition dummyClickToForceWait1 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(dummyClickToForceWait1).click();
            Report.reportLog(reflectiveClass, "Clicked dummyClickToForceWait1", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public FormPage downloadFile1() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(downloadFile1));
            Report.reportLog(reflectiveClass, "Condition downloadFile1 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(downloadFile1).click();
            Report.reportLog(reflectiveClass, "Clicked downloadFile1", "INFO", 2000, Status.PASS, true, "", "", null);
            return this;
	}
        
	public FormPage uploadFile1() throws Exception {
        
            
            driver.findElement(uploadFile1).sendKeys("C:\\Users\\jperepei\\generated\\Swagger.json");
            Report.reportLog(reflectiveClass, "uploadFile1: C:\\Users\\jperepei\\generated\\Swagger.json uploaded", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public FormPage uploadFile2() throws Exception {
        
            
            driver.findElement(uploadFile2).sendKeys("C:\\Users\\jperepei\\generated\\Swagger.json");
            Report.reportLog(reflectiveClass, "uploadFile2: C:\\Users\\jperepei\\generated\\Swagger.json uploaded", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public FormPage downloadFile2() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(downloadFile2));
            Report.reportLog(reflectiveClass, "Condition downloadFile2 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(downloadFile2).click();
            Report.reportLog(reflectiveClass, "Clicked downloadFile2", "INFO", 2000, Status.PASS, true, "", "", null);
            return this;
	}
        
	public FormPage dummyClickToForceWait2() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(dummyClickToForceWait2));
            Report.reportLog(reflectiveClass, "Condition dummyClickToForceWait2 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(dummyClickToForceWait2).click();
            Report.reportLog(reflectiveClass, "Clicked dummyClickToForceWait2", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public FormPage fillInputs() throws Exception {
        	driver.findElement(nameById1).clear();
            driver.findElement(nameById1).sendKeys("a name");
            Report.reportLog(reflectiveClass, "Typed " + "a name in nameById1", "INFO", 0, Status.PASS, true, "", "", null);
			driver.findElement(lastNameByXpathAndDoubleQuotes1).clear();
            driver.findElement(lastNameByXpathAndDoubleQuotes1).sendKeys("a last name");
            Report.reportLog(reflectiveClass, "Typed " + "a last name in lastNameByXpathAndDoubleQuotes1", "INFO", 0, Status.PASS, true, "", "", null);
			driver.findElement(emailByXpathAndSimpleQuote1).clear();
            driver.findElement(emailByXpathAndSimpleQuote1).sendKeys("an email");
            Report.reportLog(reflectiveClass, "Typed " + "an email in emailByXpathAndSimpleQuote1", "INFO", 0, Status.PASS, true, "", "", null);
			driver.findElement(phoneByName1).clear();
            driver.findElement(phoneByName1).sendKeys("123456");
            Report.reportLog(reflectiveClass, "Typed " + "123456 in phoneByName1", "INFO", 0, Status.PASS, true, "", "", null);
		
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(fillInputs));
            Report.reportLog(reflectiveClass, "Condition fillInputs isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(fillInputs).click();
            Report.reportLog(reflectiveClass, "Clicked fillInputs", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public FormPage fillInputs1() throws Exception {
        	driver.findElement(nameById2).clear();
            driver.findElement(nameById2).sendKeys("a name");
            Report.reportLog(reflectiveClass, "Typed " + "a name in nameById2", "INFO", 0, Status.PASS, true, "", "", null);
			driver.findElement(lastNameByXpathAndDoubleQuotes2).clear();
            driver.findElement(lastNameByXpathAndDoubleQuotes2).sendKeys("a last name");
            Report.reportLog(reflectiveClass, "Typed " + "a last name in lastNameByXpathAndDoubleQuotes2", "INFO", 0, Status.PASS, true, "", "", null);
			driver.findElement(emailByXpathAndSimpleQuote2).clear();
            driver.findElement(emailByXpathAndSimpleQuote2).sendKeys("an email");
            Report.reportLog(reflectiveClass, "Typed " + "an email in emailByXpathAndSimpleQuote2", "INFO", 0, Status.PASS, true, "", "", null);
			driver.findElement(phoneByName2).clear();
            driver.findElement(phoneByName2).sendKeys("123456");
            Report.reportLog(reflectiveClass, "Typed " + "123456 in phoneByName2", "INFO", 0, Status.PASS, true, "", "", null);
		
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(fillInputs1));
            Report.reportLog(reflectiveClass, "Condition fillInputs1 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(fillInputs1).click();
            Report.reportLog(reflectiveClass, "Clicked fillInputs1", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public FormPage fillInputs2() throws Exception {
        	driver.findElement(nameById3).clear();
            driver.findElement(nameById3).sendKeys("a name");
            Report.reportLog(reflectiveClass, "Typed " + "a name in nameById3", "INFO", 0, Status.PASS, true, "", "", null);
			driver.findElement(lastNameByXpathAndDoubleQuotes3).clear();
            driver.findElement(lastNameByXpathAndDoubleQuotes3).sendKeys("a last name");
            Report.reportLog(reflectiveClass, "Typed " + "a last name in lastNameByXpathAndDoubleQuotes3", "INFO", 0, Status.PASS, true, "", "", null);
			driver.findElement(emailByXpathAndSimpleQuote3).clear();
            driver.findElement(emailByXpathAndSimpleQuote3).sendKeys("an email");
            Report.reportLog(reflectiveClass, "Typed " + "an email in emailByXpathAndSimpleQuote3", "INFO", 0, Status.PASS, true, "", "", null);
			driver.findElement(phoneByName3).clear();
            driver.findElement(phoneByName3).sendKeys("123456");
            Report.reportLog(reflectiveClass, "Typed " + "123456 in phoneByName3", "INFO", 0, Status.PASS, true, "", "", null);
		
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(fillInputs2));
            Report.reportLog(reflectiveClass, "Condition fillInputs2 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(fillInputs2).click();
            Report.reportLog(reflectiveClass, "Clicked fillInputs2", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public FormPage GoToOk(HashMap<String, String> excelSheet) throws Exception {
        	driver.findElement(InputName).clear();
            driver.findElement(InputName).sendKeys(excelSheet.get("User:Login"));
            Report.reportLog(reflectiveClass, "Typed " + excelSheet.get("User:Login") + " in InputName", "INFO", 0, Status.PASS, true, "", "", null);
				
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(GoToOk));
            Report.reportLog(reflectiveClass, "Condition GoToOk isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(GoToOk).click();
            Report.reportLog(reflectiveClass, "Clicked GoToOk", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
}
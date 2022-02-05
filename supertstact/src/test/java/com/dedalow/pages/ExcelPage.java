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

public class ExcelPage {

    private WebDriver driver;
    private Class reflectiveClass;
    private JavascriptExecutor js;
    private static Logger logger = Utils.logger();
    
	private By UseExcel = By.name("name");
	private By LastName3 = By.name("lastName");
	private By Name3 = By.name("name");
	private By Phone3 = By.name("phone");
	private By Email3 = By.name("email");
	private By StateSelect = By.name("state");
	private By UseExcel1 = By.name("name");
	private By City3 = By.name("city");
	private By Address3 = By.name("address");
	private By ZipCode3 = By.name("zipcode");
	private By UseExcel2 = By.name("name");
	private By Textarea3 = By.name("textArea");
	private By Website3 = By.name("website");
    
    
    public ExcelPage(Class reflectiveClass) throws Exception {
        this.reflectiveClass = reflectiveClass;
        this.driver = (WebDriver) reflectiveClass.getField("driver").get(reflectiveClass);
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor)driver;
        
    }
        
	public ExcelPage UseExcel(HashMap<String, String> excelSheet) throws Exception {
        	driver.findElement(LastName3).clear();
            driver.findElement(LastName3).sendKeys(excelSheet.get("LastName:MultipleParameter"));
            Report.reportLog(reflectiveClass, "Typed " + excelSheet.get("LastName:MultipleParameter") + " in LastName3", "INFO", 0, Status.PASS, true, "", "", null);
					driver.findElement(Name3).clear();
            driver.findElement(Name3).sendKeys(excelSheet.get("Name:MultipleParameter"));
            Report.reportLog(reflectiveClass, "Typed " + excelSheet.get("Name:MultipleParameter") + " in Name3", "INFO", 0, Status.PASS, true, "", "", null);
					driver.findElement(Phone3).clear();
            driver.findElement(Phone3).sendKeys(excelSheet.get("Phone:MultipleParameter"));
            Report.reportLog(reflectiveClass, "Typed " + excelSheet.get("Phone:MultipleParameter") + " in Phone3", "INFO", 0, Status.PASS, true, "", "", null);
					driver.findElement(Email3).clear();
            driver.findElement(Email3).sendKeys(excelSheet.get("Email:MultipleParameter"));
            Report.reportLog(reflectiveClass, "Typed " + excelSheet.get("Email:MultipleParameter") + " in Email3", "INFO", 0, Status.PASS, true, "", "", null);
				
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(UseExcel));
            Report.reportLog(reflectiveClass, "Condition UseExcel isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(UseExcel).click();
            Report.reportLog(reflectiveClass, "Clicked UseExcel", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public ExcelPage StateSelect() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(StateSelect));
            Report.reportLog(reflectiveClass, "Condition StateSelect isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(StateSelect).click();
            Report.reportLog(reflectiveClass, "Clicked StateSelect", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public ExcelPage UseExcel1(HashMap<String, String> excelSheet) throws Exception {
        	driver.findElement(City3).clear();
            driver.findElement(City3).sendKeys(excelSheet.get("City:MultipleParameter"));
            Report.reportLog(reflectiveClass, "Typed " + excelSheet.get("City:MultipleParameter") + " in City3", "INFO", 0, Status.PASS, true, "", "", null);
					driver.findElement(Address3).clear();
            driver.findElement(Address3).sendKeys(excelSheet.get("Address:MultipleParameter"));
            Report.reportLog(reflectiveClass, "Typed " + excelSheet.get("Address:MultipleParameter") + " in Address3", "INFO", 0, Status.PASS, true, "", "", null);
					driver.findElement(ZipCode3).clear();
            driver.findElement(ZipCode3).sendKeys(excelSheet.get("ZipCode:MultipleParameter"));
            Report.reportLog(reflectiveClass, "Typed " + excelSheet.get("ZipCode:MultipleParameter") + " in ZipCode3", "INFO", 0, Status.PASS, true, "", "", null);
				
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(UseExcel1));
            Report.reportLog(reflectiveClass, "Condition UseExcel1 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(UseExcel1).click();
            Report.reportLog(reflectiveClass, "Clicked UseExcel1", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public ExcelPage UseExcel2(HashMap<String, String> excelSheet) throws Exception {
        	driver.findElement(Textarea3).clear();
            driver.findElement(Textarea3).sendKeys(excelSheet.get("Textarea:MultipleParameter"));
            Report.reportLog(reflectiveClass, "Typed " + excelSheet.get("Textarea:MultipleParameter") + " in Textarea3", "INFO", 0, Status.PASS, true, "", "", null);
					driver.findElement(Website3).clear();
            driver.findElement(Website3).sendKeys(excelSheet.get("Website:MultipleParameter"));
            Report.reportLog(reflectiveClass, "Typed " + excelSheet.get("Website:MultipleParameter") + " in Website3", "INFO", 0, Status.PASS, true, "", "", null);
				
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(UseExcel2));
            Report.reportLog(reflectiveClass, "Condition UseExcel2 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(UseExcel2).click();
            Report.reportLog(reflectiveClass, "Clicked UseExcel2", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
}
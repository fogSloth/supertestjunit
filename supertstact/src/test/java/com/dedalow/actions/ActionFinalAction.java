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

public class ActionFinalAction{

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
    
      
	private By UseExcel2 = By.name("name");
	private By Textarea = By.name("textArea");
	private By Website = By.name("website");
    
    public ActionFinalAction(Class reflectiveClass) throws Exception {
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

    
      
	public ActionFinalAction UseExcel2() throws Exception {
        	driver.findElement(Textarea).clear();
            driver.findElement(Textarea).sendKeys(excelSheet.get("Textarea:MultipleParameter"));
            Report.reportLog(reflectiveClass, "Typed " + excelSheet.get("Textarea:MultipleParameter") + " in Textarea", "INFO", 0, Status.PASS, true, "", "", null);
					driver.findElement(Website).clear();
            driver.findElement(Website).sendKeys(excelSheet.get("Website:MultipleParameter"));
            Report.reportLog(reflectiveClass, "Typed " + excelSheet.get("Website:MultipleParameter") + " in Website", "INFO", 0, Status.PASS, true, "", "", null);
				
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(UseExcel2));
            Report.reportLog(reflectiveClass, "Condition UseExcel2 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(UseExcel2).click();
            Report.reportLog(reflectiveClass, "Clicked UseExcel2", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
    public void doActionFinalAction() throws Exception {
    
    
		UseExcel2();
    
		
    }
}
package com.dedalow.regresionCustomAction;

import com.dedalow.utils.Utils;
import com.dedalow.utils.Constant;
import com.dedalow.report.Report;


import com.dedalow.customActions.CustomEach;

import com.dedalow.pages.FormPage;

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

public class RegresionCustomActionBeforeEach2{

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
    
	private static CustomEach customEach;
    
    
	private static FormPage formPage;
    
    
    

    public RegresionCustomActionBeforeEach2(Class reflectiveClass) throws Exception {
        this.reflectiveClass = reflectiveClass;
        getPrepareBeforeEach();
        js = (JavascriptExecutor)driver;
        
        
		formPage = new FormPage(reflectiveClass);
         
        
		customEach = new CustomEach(driver);
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
    
    public void doBeforeEach2() throws Exception {
		HashMap<String, String> BeforeEachVariable = new HashMap<String, String>();
			BeforeEachVariable.put("Variable", "RegresionCustom");
			
			
            Report.reportLog(reflectiveClass, "BeforeEach BeforeEach2 of execution", "INFO", 0, Status.PASS, false, "", "", null);
            
			driver.get(prop.getProperty("WEB_URL") + "");
            Report.reportLog(reflectiveClass, "Navigated to " + prop.getProperty("WEB_URL") + "", "INFO", 0, Status.PASS, true, "", "", null);
			formPage.GoToOk(excelSheet);
            
			
	customEach.doCustomEach(reflectiveClass, BeforeEachVariable);
            constant.test.log(Status.PASS, "CustomEach completed");
            Report.capScreen(reflectiveClass);
            

	}
}
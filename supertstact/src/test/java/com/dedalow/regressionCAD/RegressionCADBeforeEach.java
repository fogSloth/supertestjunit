package com.dedalow.regressionCAD;

import com.dedalow.utils.Utils;
import com.dedalow.utils.Constant;
import com.dedalow.report.Report;

import com.dedalow.actions.GoToAppGlobalAction;



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

public class RegressionCADBeforeEach{

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
    
    
	private static GoToAppGlobalAction goToAppGlobalAction;
    
    
    
    

    public RegressionCADBeforeEach(Class reflectiveClass) throws Exception {
        this.reflectiveClass = reflectiveClass;
        getPrepareBeforeEach();
        js = (JavascriptExecutor)driver;
        
        
        
		goToAppGlobalAction = new GoToAppGlobalAction(reflectiveClass); 
        
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
    
    public void doBeforeEach() throws Exception {

            Report.reportLog(reflectiveClass, "BeforeEach BeforeEach of execution", "INFO", 0, Status.PASS, false, "", "", null);
            
			
			goToAppGlobalAction.doGoToAppGlobalAction();
            Report.reportLog(reflectiveClass, "Action GoToAppGlobalAction finished","INFO", 0, Status.PASS, false, "", "", null);
            
            
	}
}
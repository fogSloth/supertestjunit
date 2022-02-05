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

public class AndAction2{

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
    
      
	private By openNewTab = By.xpath("//a[contains(text(),'The home page')]");
    
    public AndAction2(Class reflectiveClass) throws Exception {
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

    
      
	public AndAction2 openNewTab() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(openNewTab));
            Report.reportLog(reflectiveClass, "Condition openNewTab isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(openNewTab).click();
            Report.reportLog(reflectiveClass, "Clicked openNewTab", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
      }
      public AndAction2 ChangeWindowHtml() throws Exception {
      for (String winHandle : driver.getWindowHandles()) {
        if ("HTML For Beginners The Easy Way: Start Learning HTML & CSS Today »".equals(driver.switchTo().window(winHandle).getTitle())) {
          driver.switchTo().window(winHandle);
          Report.reportLog(reflectiveClass, "ChangeWindowHtml action completed", "INFO", 0, Status.PASS, true, "", "", null);
          return this;
        }
      }
      throw new Exception("Error: Window/Tab HTML For Beginners The Easy Way: Start Learning HTML & CSS Today » not found");
    }

	
    public void doAndAction2() throws Exception {
    
    
		openNewTab();
    	Thread.sleep(1000);

		ChangeWindowHtml();
    
		
    }
}
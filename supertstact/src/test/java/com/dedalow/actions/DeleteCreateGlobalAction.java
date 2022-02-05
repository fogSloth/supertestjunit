package com.dedalow.actions;

import com.dedalow.utils.Utils;
import com.dedalow.utils.Constant;
import com.dedalow.report.Report;
import com.dedalow.customActions.DeleteProyect;
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

public class DeleteCreateGlobalAction{

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
    
	private static DeleteProyect deleteProyect;
      
	private By GoToProfile = By.xpath("/html/body/div/div/header/nav/div/ul/li[3]/a");
	private By MenuProyects = By.xpath("/html/body/div/div/aside/section/ul/li[4]/a");
	private By SignOut = By.xpath("//button[contains(text(),'Sign Out')]");
    
    public DeleteCreateGlobalAction(Class reflectiveClass) throws Exception {
        this.reflectiveClass = reflectiveClass;
        getPrepareAction();
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor)driver;
		deleteProyect = new DeleteProyect(driver);
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

    public DeleteCreateGlobalAction IndexProfile () {
        driver.get(prop.getProperty("WEB_URL") + "/profile/home");
        Report.reportLog(reflectiveClass, "IndexProfile action completed", "INFO", 1000, Status.PASS, true, "", "", null);
        return this;
    }

	
      
	public DeleteCreateGlobalAction MenuProyects() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(MenuProyects));
            Report.reportLog(reflectiveClass, "Condition MenuProyects isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(MenuProyects).click();
            Report.reportLog(reflectiveClass, "Clicked MenuProyects", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
      }
      public DeleteCreateGlobalAction DeleteProyect() throws Exception {
          deleteProyect.doDeleteProyect(reflectiveClass);
          Report.reportLog(reflectiveClass, "DeleteProyect action completed", "INFO", 1000, Status.PASS, false, "", "", null);
          return this;
        }

        
      
	public DeleteCreateGlobalAction GoToProfile() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(GoToProfile));
            Report.reportLog(reflectiveClass, "Condition GoToProfile isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(GoToProfile).click();
            Report.reportLog(reflectiveClass, "Clicked GoToProfile", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
      }
      
      
	public DeleteCreateGlobalAction SignOut() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SignOut));
            Report.reportLog(reflectiveClass, "Condition SignOut isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(SignOut).click();
            Report.reportLog(reflectiveClass, "Clicked SignOut", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
    public void doDeleteCreateGlobalAction() throws Exception {
    
    
		IndexProfile();
    	Thread.sleep(1000);

		MenuProyects();
    	Thread.sleep(1000);

		DeleteProyect();
    	Thread.sleep(1000);

		GoToProfile();
    	Thread.sleep(1000);

		SignOut();
    
		
    }
}
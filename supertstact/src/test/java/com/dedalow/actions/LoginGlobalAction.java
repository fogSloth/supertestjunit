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

public class LoginGlobalAction{

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
    
      
	private By AsyncCondition5 = By.xpath("/html/body/div[4]/div/nav/div/div[2]/div[3]/ul/li/a/strong");
	private By SingIn = By.id("login");
	private By UserName = By.id("id_username");
	private By Password = By.xpath("//input[@id='id_password']");
	private static By checkNameProfile = By.xpath("/html/body/div[4]/div/nav/div/div[2]/div[3]/ul/li/a/strong");
    
    public LoginGlobalAction(Class reflectiveClass) throws Exception {
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

    public LoginGlobalAction FrontEndNavigate () {
        driver.get(prop.getProperty("WEB_URL") + "");
        Report.reportLog(reflectiveClass, "FrontEndNavigate action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }

	public LoginGlobalAction AsyncCondition5() {
        	
			new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(AsyncCondition5));
            Report.reportLog(reflectiveClass, "Condition AsyncCondition5 isVisible finished", "INFO", 60, Status.PASS, true, "", "", null);

        	return this;
    }

	
      
	public LoginGlobalAction SingIn() throws Exception {
        	driver.findElement(UserName).clear();
            driver.findElement(UserName).sendKeys(excelSheet.get("User:Login"));
            Report.reportLog(reflectiveClass, "Typed " + excelSheet.get("User:Login") + " in UserName", "INFO", 0, Status.PASS, true, "", "", null);
					driver.findElement(Password).clear();
            driver.findElement(Password).sendKeys(excelSheet.get("Password:Login"));
            Report.reportLog(reflectiveClass, "Typed " + excelSheet.get("Password:Login") + " in Password", "INFO", 0, Status.PASS, true, "", "", null);
				
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SingIn));
            Report.reportLog(reflectiveClass, "Condition SingIn isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(SingIn).click();
            Report.reportLog(reflectiveClass, "Clicked SingIn", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
	public LoginGlobalAction CheckProfile() {
        
			assertTrue(excelSheet.get("User:Login").equals(driver.findElement(checkNameProfile).getText()), "Field checkNameProfile not found in assertion");
        	Report.reportLog(reflectiveClass, "The field "+ excelSheet.get("User:Login") +" has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field CheckProfile has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    
    public void doLoginGlobalAction() throws Exception {
    
    
		FrontEndNavigate();
    
		SingIn();
    
		AsyncCondition5();
      
		CheckProfile();
    
		
    }
}
package com.dedalow.release6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Throwables;
import com.dedalow.utils.Utils;
import com.dedalow.utils.DriverInit;
import com.dedalow.utils.Constant;
import com.dedalow.report.ExtentHtml;
import com.dedalow.report.Report;
import com.dedalow.Launcher;

import com.aventstack.extentreports.Status;


import com.dedalow.pages.Release6Page;
import com.dedalow.actions.GlobalRelease6Action;
import com.dedalow.actions.LocalRelease6Action;

public class Test_PSFUEND02E0114 {
   
    private static Class reflectiveClass;
    private static Launcher launcher = new Launcher();
    public static DriverInit driverInit = new DriverInit();
    public static Constant constant = launcher.constant;
    public static String suiteName = "Release6";
    public static String caseName = Test_PSFUEND02E0114.class.getSimpleName();
    public static String modelDocumentation = "";
    public static WebDriver driver;

    public static Properties prop;
    public static String level;
    public static String handler;
    public static String finalResult = "OK";
    public static File folderTestCase;
    public static File folderDownloads;
    public static HashMap<String, String> excelSheet;

    
    private static Release6BeforeEach1 release6BeforeEach1;
	private static Release6Page release6Page;
	private static GlobalRelease6Action globalRelease6Action;
	private static LocalRelease6Action localRelease6Action;
    
	private static By CheckPhone = By.xpath("//label[contains(text(),'Phone')]");
	private static By CheckAddress = By.xpath("//label[contains(text(),'Address')]");
	private static By CheckZipcode = By.xpath("//label[contains(text(),'Zipcode')]");
	private static By CheckZipcode1 = By.xpath("//label[contains(text(),'Zipcode')]");
	private static By CheckProject = By.xpath("//label[contains(text(),'Textarea')]");
	private static By SaveAddress = By.xpath("//label[contains(text(),'Address')]");
	private static By SaveCity = By.xpath("//label[contains(text(),'City')]");
	private static By SaveZipcode = By.xpath("//label[contains(text(),'Zipcode')]");
	private static By SaveZipcode1 = By.xpath("//label[contains(text(),'Zipcode')]");
	private static By SaveProject = By.xpath("//label[contains(text(),'Textarea')]");
    
    @BeforeEach
    public void beforeEach() throws Exception {
        try {
			setUp();
            constant.initialize = new ExtentHtml(suiteName, caseName, modelDocumentation);
            constant.test = constant.initialize.getTest();
            driver = setUpEnvironment(folderDownloads, prop, "MAIN_CONTEXT", constant.contextsDriver);
                
        	release6BeforeEach1.doBeforeEach1();
        } catch (AssertionError | Exception e) {
            Report.reportErrors(e.getMessage());
			finalResult = "BQ";
            Report.reportLog(reflectiveClass, e.getMessage(), level, 0, Status.FAIL, true, "isCatch", "", Throwables.getStackTraceAsString(e));
            throw new Exception(e);
		}
    }

    public void before() throws Exception {
        try {
            
            		HashMap<String, String> beforeVariable = new HashMap<String, String>();
			beforeVariable.put("BeforeVariable", "Phone");
			
			
            Report.reportLog(reflectiveClass, "Before of execution", "INFO", 0, Status.PASS, false, "", "", null);
            
			release6Page.ClickPhone(beforeVariable);
            
			
			assertTrue(beforeVariable.get("BeforeVariable").equals(driver.findElement(CheckPhone).getText()), "Field CheckPhone not found in assertion");
        	Report.reportLog(reflectiveClass, "The field "+beforeVariable.get("BeforeVariable")+" has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            beforeVariable.put("BeforeVariable", driver.findElement(SaveAddress).getText());
            Report.reportLog(reflectiveClass, "New value for the variable BeforeVariable = " + driver.findElement(SaveAddress).getText(), "INFO", 0, Status.PASS, false, "", "", null);

            Report.reportLog(reflectiveClass, "The field StoreAddress has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            release6Page.ClickAddress(beforeVariable);
            
			
			assertTrue(beforeVariable.get("BeforeVariable").equals(driver.findElement(CheckAddress).getText()), "Field CheckAddress not found in assertion");
        	Report.reportLog(reflectiveClass, "The field "+beforeVariable.get("BeforeVariable")+" has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            
            Report.reportLog(reflectiveClass, "The field AssertAddress has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            
        } catch (AssertionError | Exception e) {
            finalResult = "BQ";
            throw new Exception(e);
        }
    }

    @Test
	@DisplayName("Test_PSFUEND02E0114")
	public void test() throws Exception {
        try {
            before();
            
            		HashMap<String, String> executeVariable = new HashMap<String, String>();
			executeVariable.put("ExecuteVariable", "");
			
			
            Report.reportLog(reflectiveClass, "Start of execution", "INFO", 0, Status.PASS, false, "", "", null);
            
			
            executeVariable.put("ExecuteVariable", driver.findElement(SaveCity).getText());
            Report.reportLog(reflectiveClass, "New value for the variable ExecuteVariable = " + driver.findElement(SaveCity).getText(), "INFO", 0, Status.PASS, false, "", "", null);

            Report.reportLog(reflectiveClass, "The field StoreCity has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            release6Page.ClickCity(executeVariable);
            
			release6Page.ClickZipcode(executeVariable);
            
			
            executeVariable.put("ExecuteVariable", driver.findElement(SaveZipcode).getText());
            Report.reportLog(reflectiveClass, "New value for the variable ExecuteVariable = " + driver.findElement(SaveZipcode).getText(), "INFO", 0, Status.PASS, false, "", "", null);

            Report.reportLog(reflectiveClass, "The field StoreZipcode has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            
			assertTrue(executeVariable.get("ExecuteVariable").equals(driver.findElement(CheckZipcode).getText()), "Field CheckZipcode not found in assertion");
        	Report.reportLog(reflectiveClass, "The field "+executeVariable.get("ExecuteVariable")+" has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            
            Report.reportLog(reflectiveClass, "The field AssertZipcode has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            
			localRelease6Action.doLocalRelease6Action();
            Report.reportLog(reflectiveClass, "Action LocalRelease6Action finished","INFO", 0, Status.PASS, false, "", "", null);
            
            
			globalRelease6Action.doGlobalRelease6Action();
            Report.reportLog(reflectiveClass, "Action GlobalRelease6Action finished","INFO", 0, Status.PASS, false, "", "", null);
            
            
        } catch (AssertionError | Exception e) {
            Report.reportErrors(e.getMessage());
            if (finalResult != "BQ") {
				finalResult = "KO";
			}
            Report.reportLog(reflectiveClass, e.getMessage(), level, 0, Status.FAIL, true, "isCatch", "", Throwables.getStackTraceAsString(e));
            throw new Exception(e);
        }
    }

    public void after() {
        constant.isAfter = true;
        constant.isBackend = false;
        try {
            
            		HashMap<String, String> afterVariable = new HashMap<String, String>();
			afterVariable.put("AfterVariable", "");
			
			
            Report.reportLog(reflectiveClass, "After of execution", "INFO", 0, Status.PASS, false, "", "", null);
            
			
            afterVariable.put("AfterVariable", driver.findElement(SaveZipcode1).getText());
            Report.reportLog(reflectiveClass, "New value for the variable AfterVariable = " + driver.findElement(SaveZipcode1).getText(), "INFO", 0, Status.PASS, false, "", "", null);

            Report.reportLog(reflectiveClass, "The field StoreZipcode1 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            release6Page.ClickZipcode1(afterVariable);
            
			
			assertTrue(afterVariable.get("AfterVariable").equals(driver.findElement(CheckZipcode1).getText()), "Field CheckZipcode1 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field "+afterVariable.get("AfterVariable")+" has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            afterVariable.put("AfterVariable", driver.findElement(SaveProject).getText());
            Report.reportLog(reflectiveClass, "New value for the variable AfterVariable = " + driver.findElement(SaveProject).getText(), "INFO", 0, Status.PASS, false, "", "", null);

            Report.reportLog(reflectiveClass, "The field StoreProject has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            release6Page.ClickProject(afterVariable);
            
			
			assertTrue(afterVariable.get("AfterVariable").equals(driver.findElement(CheckProject).getText()), "Field CheckProject not found in assertion");
        	Report.reportLog(reflectiveClass, "The field "+afterVariable.get("AfterVariable")+" has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            
            Report.reportLog(reflectiveClass, "The field AssertProject has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            
        } catch (AssertionError | Exception e) {
            Report.reportErrors(e.getMessage());
			constant.captureLog = "KO";
			constant.afterResult = "not succesfully";
            Report.reportLog(reflectiveClass, e.getMessage(), level, 0, Status.WARNING, true, "isCatch", "", Throwables.getStackTraceAsString(e));
        }
    }

    @AfterEach
    public void afterEach()  {
        boolean screenShot = true;
        after();
        
        if (finalResult == "OK") {
            Report.reportLog(reflectiveClass, "Result on Test_PSFUEND02E0114: " + finalResult, "INFO", 0, Status.PASS, false, "", "", null);
        } else {
            Report.reportLog(reflectiveClass, "Result on Test_PSFUEND02E0114: " + finalResult, "INFO", 0, Status.FAIL, false, "", "", null);
        }
        constant.logger.info("Result on Test_PSFUEND02E0114: " + finalResult);
		constant.logger.info("After execution finished: " + constant.afterResult);
        Utils.tearDown(reflectiveClass);
		Utils.finalReports(reflectiveClass, screenShot);
		constant.initialize.flush();
    }
    
    
	public static void setUp() throws Exception{
        try{
            constant.defaultValues();
            constant.folderTestSuite = new File(constant.folderLogs + constant.fileSystem.getSeparator() + suiteName);
            constant.folderTestSuite.mkdirs();
            folderTestCase = new File(constant.folderTestSuite + constant.fileSystem.getSeparator() + caseName);
            folderTestCase.mkdirs();
            folderDownloads = new File(folderTestCase + constant.fileSystem.getSeparator() + "files");
            folderDownloads.mkdirs();
            prop = Utils.getConfigProperties();
            level = prop.getProperty("LOG_LEVEL");
            Utils.setEncoding();
        } catch (Exception e) {
            e.printStackTrace();
            Report.reportErrors(e.getMessage());
            throw new Exception(e);
        }
    }

    public static WebDriver setUpEnvironment(File folderDownloads, Properties prop,
        String nameDriver, Map<String, WebDriver> contextsDriver) throws Exception {
        driver = driverInit.driverSelector(folderDownloads, prop, nameDriver, contextsDriver);
            handler = driver.getWindowHandle();
        reflectiveClass = Utils.getReflective(Test_PSFUEND02E0114.class.getCanonicalName());
			release6BeforeEach1 = new Release6BeforeEach1(reflectiveClass);
		release6Page = new Release6Page(reflectiveClass);
		globalRelease6Action = new GlobalRelease6Action(reflectiveClass);
		localRelease6Action = new LocalRelease6Action(reflectiveClass);
        return driver;
    }
}
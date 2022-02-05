package com.dedalow.regressionOther;

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


import com.dedalow.pages.FormPage;
import com.dedalow.actions.GoToAppGlobalAction;

public class Test_PSFUEND02E0107 {
   
    private static Class reflectiveClass;
    private static Launcher launcher = new Launcher();
    public static DriverInit driverInit = new DriverInit();
    public static Constant constant = launcher.constant;
    public static String suiteName = "RegressionOther";
    public static String caseName = Test_PSFUEND02E0107.class.getSimpleName();
    public static String modelDocumentation = "";
    public static WebDriver driver;

    public static Properties prop;
    public static String level;
    public static String handler;
    public static String finalResult = "OK";
    public static File folderTestCase;
    public static File folderDownloads;
    public static HashMap<String, String> excelSheet;

    
	private static FormPage formPage;
	private static GoToAppGlobalAction goToAppGlobalAction;
    
	private static By titleH11 = By.xpath("//h1[contains(text(),'HTML For Beginners')]");
	private static By Name2 = By.name("name");
	private static By Phone2 = By.name("phone");
	private static By LastName2 = By.name("lastName");
	private static By Email2 = By.name("email");
	private static By City2 = By.name("city");
	private static By ZipCode2 = By.name("zipcode");
	private static By Address2 = By.name("address");
	private static By Website2 = By.name("website");
	private static By Textarea2 = By.name("textArea");
    
    @BeforeEach
    public void beforeEach() throws Exception {
        try {
			setUp();
            constant.initialize = new ExtentHtml(suiteName, caseName, modelDocumentation);
            constant.test = constant.initialize.getTest();
            driver = setUpEnvironment(folderDownloads, prop, "MAIN_CONTEXT", constant.contextsDriver);
                
        } catch (AssertionError | Exception e) {
            Report.reportErrors(e.getMessage());
			finalResult = "BQ";
            Report.reportLog(reflectiveClass, e.getMessage(), level, 0, Status.FAIL, true, "isCatch", "", Throwables.getStackTraceAsString(e));
            throw new Exception(e);
		}
    }

    public void before() throws Exception {
        try {
            
            
            Report.reportLog(reflectiveClass, "Before of execution", "INFO", 0, Status.PASS, false, "", "", null);
            
			
			goToAppGlobalAction.doGoToAppGlobalAction();
            Report.reportLog(reflectiveClass, "Action GoToAppGlobalAction finished","INFO", 0, Status.PASS, false, "", "", null);
            
            formPage.uploadFile();
            
			formPage.downloadFile();
            
			Thread.sleep(2000);
			formPage.dummyClickToForceWait();
            
			
        } catch (AssertionError | Exception e) {
            finalResult = "BQ";
            throw new Exception(e);
        }
    }

    @Test
	@DisplayName("Test_PSFUEND02E0107")
	public void test() throws Exception {
        try {
            before();
            
            
            Report.reportLog(reflectiveClass, "Start of execution", "INFO", 0, Status.PASS, false, "", "", null);
            
			
			goToAppGlobalAction.doGoToAppGlobalAction();
            Report.reportLog(reflectiveClass, "Action GoToAppGlobalAction finished","INFO", 0, Status.PASS, false, "", "", null);
            
            formPage.uploadFile1();
            
			formPage.downloadFile1();
            
			Thread.sleep(2000);
			formPage.dummyClickToForceWait1();
            
			
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
            
            
            Report.reportLog(reflectiveClass, "After of execution", "INFO", 0, Status.PASS, false, "", "", null);
            
			
			goToAppGlobalAction.doGoToAppGlobalAction();
            Report.reportLog(reflectiveClass, "Action GoToAppGlobalAction finished","INFO", 0, Status.PASS, false, "", "", null);
            
            formPage.uploadFile2();
            
			formPage.downloadFile2();
            
			Thread.sleep(2000);
			formPage.dummyClickToForceWait2();
            
			
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
            Report.reportLog(reflectiveClass, "Result on Test_PSFUEND02E0107: " + finalResult, "INFO", 0, Status.PASS, false, "", "", null);
        } else {
            Report.reportLog(reflectiveClass, "Result on Test_PSFUEND02E0107: " + finalResult, "INFO", 0, Status.FAIL, false, "", "", null);
        }
        constant.logger.info("Result on Test_PSFUEND02E0107: " + finalResult);
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
        reflectiveClass = Utils.getReflective(Test_PSFUEND02E0107.class.getCanonicalName());
		formPage = new FormPage(reflectiveClass);
		goToAppGlobalAction = new GoToAppGlobalAction(reflectiveClass);
        return driver;
    }
}
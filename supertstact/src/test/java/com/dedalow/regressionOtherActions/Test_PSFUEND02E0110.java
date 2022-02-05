package com.dedalow.regressionOtherActions;

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


import com.dedalow.actions.GivenAction;
import com.dedalow.actions.AndAction;
import com.dedalow.actions.AndAction5;
import com.dedalow.actions.ThenAction1;
import com.dedalow.actions.WhenAction;
import com.dedalow.actions.AndAction7;
import com.dedalow.actions.AndAction4;
import com.dedalow.actions.WhenAction2;
import com.dedalow.actions.AndAction2;

public class Test_PSFUEND02E0110 {
   
    private static Class reflectiveClass;
    private static Launcher launcher = new Launcher();
    public static DriverInit driverInit = new DriverInit();
    public static Constant constant = launcher.constant;
    public static String suiteName = "RegressionOtherActions";
    public static String caseName = Test_PSFUEND02E0110.class.getSimpleName();
    public static String modelDocumentation = "";
    public static WebDriver driver;

    public static Properties prop;
    public static String level;
    public static String handler;
    public static String finalResult = "OK";
    public static File folderTestCase;
    public static File folderDownloads;
    public static HashMap<String, String> excelSheet;

    
	private static GivenAction givenAction;
	private static AndAction andAction;
	private static AndAction5 andAction5;
	private static ThenAction1 thenAction1;
	private static WhenAction whenAction;
	private static AndAction7 andAction7;
	private static AndAction4 andAction4;
	private static WhenAction2 whenAction2;
	private static AndAction2 andAction2;
    
    
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
            
			
			givenAction.doGivenAction();
            Report.reportLog(reflectiveClass, "Action GivenAction finished","INFO", 5000, Status.PASS, false, "", "", null);
            
            
			Thread.sleep(5000);
			andAction.doAndAction();
            Report.reportLog(reflectiveClass, "Action AndAction finished","INFO", 0, Status.PASS, false, "", "", null);
            
            
        } catch (AssertionError | Exception e) {
            finalResult = "BQ";
            throw new Exception(e);
        }
    }

    @Test
	@DisplayName("Test_PSFUEND02E0110")
	public void test() throws Exception {
        try {
            before();
            
            
            Report.reportLog(reflectiveClass, "Start of execution", "INFO", 0, Status.PASS, false, "", "", null);
            
			
			whenAction.doWhenAction();
            Report.reportLog(reflectiveClass, "Action WhenAction finished","INFO", 5000, Status.PASS, false, "", "", null);
            
            
			Thread.sleep(5000);
			andAction2.doAndAction2();
            Report.reportLog(reflectiveClass, "Action AndAction2 finished","INFO", 5000, Status.PASS, false, "", "", null);
            
            
			Thread.sleep(5000);
			andAction4.doAndAction4();
            Report.reportLog(reflectiveClass, "Action AndAction4 finished","INFO", 5000, Status.PASS, false, "", "", null);
            
            
			Thread.sleep(5000);
			whenAction2.doWhenAction2();
            Report.reportLog(reflectiveClass, "Action WhenAction2 finished","INFO", 5000, Status.PASS, false, "", "", null);
            
            
			Thread.sleep(5000);
			andAction5.doAndAction5();
            Report.reportLog(reflectiveClass, "Action AndAction5 finished","INFO", 5000, Status.PASS, false, "", "", null);
            
            
			Thread.sleep(5000);
			thenAction1.doThenAction1();
            Report.reportLog(reflectiveClass, "Action ThenAction1 finished","INFO", 5000, Status.PASS, false, "", "", null);
            
            
			Thread.sleep(5000);
			andAction7.doAndAction7();
            Report.reportLog(reflectiveClass, "Action AndAction7 finished","INFO", 0, Status.PASS, false, "", "", null);
            
            
        } catch (AssertionError | Exception e) {
            Report.reportErrors(e.getMessage());
            if (finalResult != "BQ") {
				finalResult = "KO";
			}
            Report.reportLog(reflectiveClass, e.getMessage(), level, 0, Status.FAIL, true, "isCatch", "", Throwables.getStackTraceAsString(e));
            throw new Exception(e);
        }
    }

    

    @AfterEach
    public void afterEach()  {
        boolean screenShot = true;
        
        
        if (finalResult == "OK") {
            Report.reportLog(reflectiveClass, "Result on Test_PSFUEND02E0110: " + finalResult, "INFO", 0, Status.PASS, false, "", "", null);
        } else {
            Report.reportLog(reflectiveClass, "Result on Test_PSFUEND02E0110: " + finalResult, "INFO", 0, Status.FAIL, false, "", "", null);
        }
        constant.logger.info("Result on Test_PSFUEND02E0110: " + finalResult);
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
        reflectiveClass = Utils.getReflective(Test_PSFUEND02E0110.class.getCanonicalName());
		givenAction = new GivenAction(reflectiveClass);
		andAction = new AndAction(reflectiveClass);
		andAction5 = new AndAction5(reflectiveClass);
		thenAction1 = new ThenAction1(reflectiveClass);
		whenAction = new WhenAction(reflectiveClass);
		andAction7 = new AndAction7(reflectiveClass);
		andAction4 = new AndAction4(reflectiveClass);
		whenAction2 = new WhenAction2(reflectiveClass);
		andAction2 = new AndAction2(reflectiveClass);
        return driver;
    }
}
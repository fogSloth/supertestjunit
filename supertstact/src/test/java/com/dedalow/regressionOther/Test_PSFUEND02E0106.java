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


import com.dedalow.pages.HtmlPage;

public class Test_PSFUEND02E0106 {
   
    private static Class reflectiveClass;
    private static Launcher launcher = new Launcher();
    public static DriverInit driverInit = new DriverInit();
    public static Constant constant = launcher.constant;
    public static String suiteName = "RegressionOther";
    public static String caseName = Test_PSFUEND02E0106.class.getSimpleName();
    public static String modelDocumentation = "";
    public static WebDriver driver;

    public static Properties prop;
    public static String level;
    public static String handler;
    public static String finalResult = "OK";
    public static File folderTestCase;
    public static File folderDownloads;
    public static HashMap<String, String> excelSheet;

    
	private static HtmlPage htmlPage;
    
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
            
			driver.get(prop.getProperty("WEB_URL") + "");
            Report.reportLog(reflectiveClass, "Navigated to " + prop.getProperty("WEB_URL") + "", "INFO", 0, Status.PASS, true, "", "", null);
			driver = setUpEnvironment(folderDownloads, prop, "JIRAITO", constant.contextsDriver);
            Report.reportLog(reflectiveClass, "ContextChange NewBrowserWIKIPEDIA finished","INFO", 1000, Status.PASS, true, "", "", null);
        
			Thread.sleep(1000);driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
            Report.reportLog(reflectiveClass, "Navigated to " + "https://es.wikipedia.org/wiki/Wikipedia:Portada", "INFO", 0, Status.PASS, true, "", "", null);
			
			assertTrue(driver.getCurrentUrl().equals("https://es.wikipedia.org/wiki/Wikipedia:Portada"), "Field WebJIRAITO1 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field https://es.wikipedia.org/wiki/Wikipedia:Portada has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            
            Report.reportLog(reflectiveClass, "The field WebJIRAITO has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            
        } catch (AssertionError | Exception e) {
            finalResult = "BQ";
            throw new Exception(e);
        }
    }

    @Test
	@DisplayName("Test_PSFUEND02E0106")
	public void test() throws Exception {
        try {
            before();
            
            
            Report.reportLog(reflectiveClass, "Start of execution", "INFO", 0, Status.PASS, false, "", "", null);
            
			driver = setUpEnvironment(folderDownloads, prop, "Html", constant.contextsDriver);
            Report.reportLog(reflectiveClass, "ContextChange NewBrowserHTML finished","INFO", 1000, Status.PASS, true, "", "", null);
        
			Thread.sleep(1000);driver.get("https://html.com/attributes/a-target/");
            Report.reportLog(reflectiveClass, "Navigated to " + "https://html.com/attributes/a-target/", "INFO", 0, Status.PASS, true, "", "", null);
			htmlPage.openNewTab();
            
			Thread.sleep(1000);
			boolean ChangeWindowHtml = false;
            for (String winHandle : driver.getWindowHandles()) {
                if ("HTML For Beginners The Easy Way: Start Learning HTML & CSS Today »".equals(driver.switchTo().window(winHandle).getTitle())) {
                    driver.switchTo().window(winHandle);
                    ChangeWindowHtml = true;
                    break;
                }
            }
            if (!ChangeWindowHtml) throw new Exception ("Error: Window/Tab HTML For Beginners The Easy Way: Start Learning HTML & CSS Today » not found");
            Report.reportLog(reflectiveClass, "ContextChange ChangeWindowHtml finished","INFO", 0, Status.PASS, true, "", "", null);
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(titleH11));
            Report.reportLog(reflectiveClass, "Condition titleH11 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue(driver.findElement(titleH11).getText().contains("HTML For Beginners"), "Field titleH11 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field HTML For Beginners has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            
            Report.reportLog(reflectiveClass, "The field CheckTitle has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            driver.switchTo().window(handler);
            driver.switchTo().defaultContent();
            Report.reportLog(reflectiveClass, "ContextChange ChangeHTMLInitialPage finished","INFO", 0, Status.PASS, true, "", "", null);
        
            
			assertTrue(driver.getCurrentUrl().equals("https://html.com/attributes/a-target/"), "Field CheckPageHTMLInitial1 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field https://html.com/attributes/a-target/ has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            
            Report.reportLog(reflectiveClass, "The field CheckPageHTMLInitial1 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            driver = setUpEnvironment(folderDownloads, prop, "MAIN_CONTEXT", constant.contextsDriver);
            Report.reportLog(reflectiveClass, "ContextChange ChangeCAD finished","INFO", 0, Status.PASS, true, "", "", null);
        
			assertTrue(driver.getCurrentUrl().equals("https://cad-uat-cadqa-supertestui.caddev.everis.com/"), "Field CheckPageCAD1 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field https://cad-uat-cadqa-supertestui.caddev.everis.com/ has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            
            Report.reportLog(reflectiveClass, "The field CheckPageCAD1 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            
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
            Report.reportLog(reflectiveClass, "Result on Test_PSFUEND02E0106: " + finalResult, "INFO", 0, Status.PASS, false, "", "", null);
        } else {
            Report.reportLog(reflectiveClass, "Result on Test_PSFUEND02E0106: " + finalResult, "INFO", 0, Status.FAIL, false, "", "", null);
        }
        constant.logger.info("Result on Test_PSFUEND02E0106: " + finalResult);
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
        reflectiveClass = Utils.getReflective(Test_PSFUEND02E0106.class.getCanonicalName());
		htmlPage = new HtmlPage(reflectiveClass);
        return driver;
    }
}
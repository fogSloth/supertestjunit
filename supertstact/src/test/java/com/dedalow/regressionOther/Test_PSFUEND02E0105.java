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
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
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


import com.dedalow.pages.ExcelPage;

public class Test_PSFUEND02E0105 {
   
    private static Class reflectiveClass;
    private static Launcher launcher = new Launcher();
    public static DriverInit driverInit = new DriverInit();
    public static Constant constant = launcher.constant;
    public static String suiteName = "RegressionOther";
    public static String caseName = Test_PSFUEND02E0105.class.getSimpleName();
    public static String modelDocumentation = "";
    public static WebDriver driver;

    public static Properties prop;
    public static String level;
    public static String handler;
    public static String finalResult = "OK";
    public static File folderTestCase;
    public static File folderDownloads;
    public static HashMap<String, String> excelSheet;

    
	private static ExcelPage excelPage;
    
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
            if (constant.excelSheets == null) {
                Report.reportErrors(suiteName + " - " + caseName + ": Error reading from Excel");
            } else {
                excelSheet = constant.excelSheets.get(constant.iterationExcel);
                constant.initialize = new ExtentHtml(suiteName, caseName+ " (" 
                + ++constant.iterationExcel  + " of " + constant.excelSheets.size() + ")", modelDocumentation);
                constant.test = constant.initialize.getTest();
            }
            driver = setUpEnvironment(folderDownloads, prop, "MAIN_CONTEXT", constant.contextsDriver);
                Report.reportLog(reflectiveClass, "Dataset row " + constant.iterationExcel + " start execution: " + excelSheet, "INFO", 0, Status.PASS, false, "", "", null);
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
            
			driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/");
            Report.reportLog(reflectiveClass, "Navigated to " + "https://cad-uat-cadqa-supertestui.caddev.everis.com/", "INFO", 0, Status.PASS, true, "", "", null);
			excelPage.UseExcel(excelSheet);
            
			
			assertTrue(driver.getCurrentUrl().equals("https://cad-uat-cadqa-supertestui.caddev.everis.com/"), "Field CheckExcel11 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field https://cad-uat-cadqa-supertestui.caddev.everis.com/ has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			assertTrue(excelSheet.get("Name:CheckText").equals(driver.findElement(Name2).getAttribute("value")), "Field Name2 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field "+ excelSheet.get("Name:CheckText") +" has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			assertTrue(excelSheet.get("Phone:CheckText").equals(driver.findElement(Phone2).getAttribute("value")), "Field Phone2 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field "+ excelSheet.get("Phone:CheckText") +" has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			assertTrue(excelSheet.get("LastName:CheckText").equals(driver.findElement(LastName2).getAttribute("value")), "Field LastName2 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field "+ excelSheet.get("LastName:CheckText") +" has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			assertTrue(excelSheet.get("Email:CheckText").equals(driver.findElement(Email2).getAttribute("value")), "Field Email2 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field "+ excelSheet.get("Email:CheckText") +" has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            
            Report.reportLog(reflectiveClass, "The field CheckExcel1 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            
        } catch (AssertionError | Exception e) {
            finalResult = "BQ";
            throw new Exception(e);
        }
    }

    @ParameterizedTest
	@MethodSource("setUpExcel")
	@DisplayName("Test_PSFUEND02E0105")
	public void test() throws Exception {
        try {
            before();
            
            
            Report.reportLog(reflectiveClass, "Start of execution", "INFO", 0, Status.PASS, false, "", "", null);
            
			excelPage.UseExcel1(excelSheet);
            
			excelPage.StateSelect();
            
			
			assertTrue(driver.getCurrentUrl().equals("https://cad-uat-cadqa-supertestui.caddev.everis.com/"), "Field CheckExcel21 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field https://cad-uat-cadqa-supertestui.caddev.everis.com/ has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			assertTrue(excelSheet.get("City:CheckText").equals(driver.findElement(City2).getAttribute("value")), "Field City2 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field "+ excelSheet.get("City:CheckText") +" has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			assertTrue(excelSheet.get("ZipCode:CheckText").equals(driver.findElement(ZipCode2).getAttribute("value")), "Field ZipCode2 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field "+ excelSheet.get("ZipCode:CheckText") +" has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			assertTrue(excelSheet.get("Address:CheckText").equals(driver.findElement(Address2).getAttribute("value")), "Field Address2 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field "+ excelSheet.get("Address:CheckText") +" has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            
            Report.reportLog(reflectiveClass, "The field CheckExcel2 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            
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
            
			excelPage.UseExcel2(excelSheet);
            
			
			assertTrue(driver.getCurrentUrl().equals("https://cad-uat-cadqa-supertestui.caddev.everis.com/"), "Field CheckExcel3 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field https://cad-uat-cadqa-supertestui.caddev.everis.com/ has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			assertTrue(excelSheet.get("Website:CheckText").equals(driver.findElement(Website2).getAttribute("value")), "Field Website2 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field "+ excelSheet.get("Website:CheckText") +" has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			assertTrue(excelSheet.get("Textarea:CheckText").equals(driver.findElement(Textarea2).getAttribute("value")), "Field Textarea2 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field "+ excelSheet.get("Textarea:CheckText") +" has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            
            Report.reportLog(reflectiveClass, "The field CheckExcel3 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            
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
            Report.reportLog(reflectiveClass, "Result on Test_PSFUEND02E0105 row" + constant.iterationExcel + ": " + finalResult, "INFO", 0, Status.PASS, false, "", "", null);
        } else {
            Report.reportLog(reflectiveClass, "Result on Test_PSFUEND02E0105 row" + constant.iterationExcel + ": " + finalResult, "INFO", 0, Status.FAIL, false, "", "", null);
        }
        constant.logger.info("Result on Test_PSFUEND02E0105 row" + constant.iterationExcel + ": " + finalResult);
		constant.logger.info("After execution finished: " + constant.afterResult);
        Utils.tearDown(reflectiveClass);
		finalResult = "OK";
		constant.afterResult = "succesfully";
		constant.captureLog = "OK";
		constant.isAfter = false;
        if (constant.iterationExcel == constant.excelSheets.size()) {
            Utils.finalReports(reflectiveClass, screenShot);
            constant.initialize.flush();
        } else {
            constant.initialize.flush();
        }
        
    }
    
    private static ArrayList<HashMap<String, String>> setUpExcel() throws Exception {
        setUp();
        constant.excelSheets = constant.sheets.get("CheckText:MultipleParameter");
        return constant.excelSheets;
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
		constant.sheets = Utils.readExcel(prop.getProperty("DATASET"));
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
        reflectiveClass = Utils.getReflective(Test_PSFUEND02E0105.class.getCanonicalName());
		excelPage = new ExcelPage(reflectiveClass);
        return driver;
    }
}
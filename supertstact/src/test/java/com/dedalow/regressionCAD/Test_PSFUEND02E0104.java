package com.dedalow.regressionCAD;

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
import com.dedalow.pages.ButtonsPage;
import com.dedalow.pages.DragAndDropPage;

public class Test_PSFUEND02E0104 {
   
    private static Class reflectiveClass;
    private static Launcher launcher = new Launcher();
    public static DriverInit driverInit = new DriverInit();
    public static Constant constant = launcher.constant;
    public static String suiteName = "RegressionCAD";
    public static String caseName = Test_PSFUEND02E0104.class.getSimpleName();
    public static String modelDocumentation = "";
    public static WebDriver driver;

    public static Properties prop;
    public static String level;
    public static String handler;
    public static String finalResult = "OK";
    public static File folderTestCase;
    public static File folderDownloads;
    public static HashMap<String, String> excelSheet;

    
    private static RegressionCADBeforeEach regressionCADBeforeEach;
	private static FormPage formPage;
	private static ButtonsPage buttonsPage;
	private static DragAndDropPage dragAndDropPage;
    
	private By AsyncCondition1 = By.id("doubleClickToOk");
	private By AsyncCondition2 = By.id("doubleClickToOk");
	private By AsyncCondition3 = By.id("doubleClickToOk");
	private static By assertTitle4 = By.xpath("//h2");
	private static By assertNameById1 = By.id("name");
	private static By assertLastNameByXpathDoubleQuotes1 = By.xpath("//*[@id=\"lastName\"]");
	private static By assertEmailByXpathSingleQuote1 = By.xpath("//*[@id='email']");
	private static By assertPhoneByName1 = By.name("phone");
	private static By assertContains1 = By.id("name");
	private static By assertNotContains1 = By.id("name");
	private static By assertDistinct1 = By.id("name");
	private static By assertTitle5 = By.xpath("//h2");
	private static By assertTitle6 = By.xpath("//h2");
	private static By assertTitle7 = By.xpath("//h2");
	private static By assertTitle8 = By.xpath("//h2");
	private static By assertNameById2 = By.id("name");
	private static By assertLastNameByXpathDoubleQuotes2 = By.xpath("//*[@id=\"lastName\"]");
	private static By assertEmailByXpathSingleQuote2 = By.xpath("//*[@id='email']");
	private static By assertPhoneByName2 = By.name("phone");
	private static By assertContains2 = By.id("name");
	private static By assertNotContains2 = By.id("name");
	private static By assertDistinct2 = By.id("name");
	private static By assertTitle9 = By.xpath("//h2");
	private static By assertTitle10 = By.xpath("//h2");
	private static By assertTitle11 = By.xpath("//h2");
	private static By assertTitle12 = By.xpath("//h2");
	private static By assertNameById3 = By.id("name");
	private static By assertLastNameByXpathDoubleQuotes3 = By.xpath("//*[@id=\"lastName\"]");
	private static By assertEmailByXpathSingleQuote3 = By.xpath("//*[@id='email']");
	private static By assertPhoneByName3 = By.name("phone");
	private static By assertContains3 = By.id("name");
	private static By assertNotContains3 = By.id("name");
	private static By assertDistinct3 = By.id("name");
	private static By assertTitle13 = By.xpath("//h2");
	private static By assertTitle14 = By.xpath("//h2");
	private static By assertTitle15 = By.xpath("//h2");
    
    @BeforeEach
    public void beforeEach() throws Exception {
        try {
			setUp();
            constant.initialize = new ExtentHtml(suiteName, caseName, modelDocumentation);
            constant.test = constant.initialize.getTest();
            driver = setUpEnvironment(folderDownloads, prop, "MAIN_CONTEXT", constant.contextsDriver);
                
        	regressionCADBeforeEach.doBeforeEach();
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
            
			formPage.fillInputs();
            
			
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertNameById1));
            Report.reportLog(reflectiveClass, "Condition assertNameById1 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("a name".equals(driver.findElement(assertNameById1).getAttribute("ng-reflect-model")), "Field assertNameById1 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field a name has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertLastNameByXpathDoubleQuotes1));
            Report.reportLog(reflectiveClass, "Condition assertLastNameByXpathDoubleQuotes1 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("a last name".equals(driver.findElement(assertLastNameByXpathDoubleQuotes1).getAttribute("ng-reflect-model")), "Field assertLastNameByXpathDoubleQuotes1 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field a last name has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertEmailByXpathSingleQuote1));
            Report.reportLog(reflectiveClass, "Condition assertEmailByXpathSingleQuote1 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("an email".equals(driver.findElement(assertEmailByXpathSingleQuote1).getAttribute("ng-reflect-model")), "Field assertEmailByXpathSingleQuote1 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field an email has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertPhoneByName1));
            Report.reportLog(reflectiveClass, "Condition assertPhoneByName1 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("123456".equals(driver.findElement(assertPhoneByName1).getAttribute("ng-reflect-model")), "Field assertPhoneByName1 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field 123456 has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertContains1));
            Report.reportLog(reflectiveClass, "Condition assertContains1 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue(driver.findElement(assertContains1).getAttribute("ng-reflect-model").contains("nam"), "Field assertContains1 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field nam has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertNotContains1));
            Report.reportLog(reflectiveClass, "Condition assertNotContains1 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue(!driver.findElement(assertNotContains1).getAttribute("ng-reflect-model").contains("not contained"), "Field assertNotContains1 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field not contained has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertDistinct1));
            Report.reportLog(reflectiveClass, "Condition assertDistinct1 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue(!"another name".equals(driver.findElement(assertDistinct1).getAttribute("ng-reflect-model")), "Field assertDistinct1 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field another name has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            
            Report.reportLog(reflectiveClass, "The field assertInputs has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage");
            Report.reportLog(reflectiveClass, "Navigated to " + "https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage", "INFO", 0, Status.PASS, true, "", "", null);
			buttonsPage.disableButtons();
            
			buttonsPage.leftClickById();
            
			
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertTitle5));
            Report.reportLog(reflectiveClass, "Condition assertTitle5 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("OkPage".equals(driver.findElement(assertTitle5).getText()), "Field assertTitle5 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field OkPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            
            Report.reportLog(reflectiveClass, "The field assertOkPage1 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage");
            Report.reportLog(reflectiveClass, "Navigated to " + "https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage", "INFO", 0, Status.PASS, true, "", "", null);
			buttonsPage.disableButtons1();
            
			buttonsPage.leftClickByXpath();
            
			
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertTitle6));
            Report.reportLog(reflectiveClass, "Condition assertTitle6 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("OkPage".equals(driver.findElement(assertTitle6).getText()), "Field assertTitle6 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field OkPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            
            Report.reportLog(reflectiveClass, "The field assertOkPage2 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage");
            Report.reportLog(reflectiveClass, "Navigated to " + "https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage", "INFO", 0, Status.PASS, true, "", "", null);
			buttonsPage.disableButtons2();
            
			
			
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AsyncCondition1));
            Report.reportLog(reflectiveClass, "Condition AsyncCondition1 isClickable finished", "INFO", 20, Status.PASS, true, "", "", null);

			buttonsPage.doubleClickById();
            
			
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertTitle7));
            Report.reportLog(reflectiveClass, "Condition assertTitle7 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("OkPage".equals(driver.findElement(assertTitle7).getText()), "Field assertTitle7 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field OkPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            
            Report.reportLog(reflectiveClass, "The field assertOkPage3 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/dragAndDropPage");
            Report.reportLog(reflectiveClass, "Navigated to " + "https://cad-uat-cadqa-supertestui.caddev.everis.com/dragAndDropPage", "INFO", 0, Status.PASS, true, "", "", null);
			dragAndDropPage.enableDrag();
            
			dragAndDropPage.dragImage2();
            
			
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertTitle4));
            Report.reportLog(reflectiveClass, "Condition assertTitle4 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("OkPage".equals(driver.findElement(assertTitle4).getText()), "Field assertTitle4 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field OkPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            
            Report.reportLog(reflectiveClass, "The field assertOkPage has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            
        } catch (AssertionError | Exception e) {
            finalResult = "BQ";
            throw new Exception(e);
        }
    }

    @Test
	@DisplayName("Test_PSFUEND02E0104")
	public void test() throws Exception {
        try {
            before();
            
            
            Report.reportLog(reflectiveClass, "Start of execution", "INFO", 0, Status.PASS, false, "", "", null);
            
			driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/");
            Report.reportLog(reflectiveClass, "Navigated to " + "https://cad-uat-cadqa-supertestui.caddev.everis.com/", "INFO", 0, Status.PASS, true, "", "", null);
			formPage.fillInputs1();
            
			
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertNameById2));
            Report.reportLog(reflectiveClass, "Condition assertNameById2 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("a name".equals(driver.findElement(assertNameById2).getAttribute("ng-reflect-model")), "Field assertNameById2 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field a name has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertLastNameByXpathDoubleQuotes2));
            Report.reportLog(reflectiveClass, "Condition assertLastNameByXpathDoubleQuotes2 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("a last name".equals(driver.findElement(assertLastNameByXpathDoubleQuotes2).getAttribute("ng-reflect-model")), "Field assertLastNameByXpathDoubleQuotes2 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field a last name has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertEmailByXpathSingleQuote2));
            Report.reportLog(reflectiveClass, "Condition assertEmailByXpathSingleQuote2 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("an email".equals(driver.findElement(assertEmailByXpathSingleQuote2).getAttribute("ng-reflect-model")), "Field assertEmailByXpathSingleQuote2 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field an email has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertPhoneByName2));
            Report.reportLog(reflectiveClass, "Condition assertPhoneByName2 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("123456".equals(driver.findElement(assertPhoneByName2).getAttribute("ng-reflect-model")), "Field assertPhoneByName2 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field 123456 has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertContains2));
            Report.reportLog(reflectiveClass, "Condition assertContains2 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue(driver.findElement(assertContains2).getAttribute("ng-reflect-model").contains("nam"), "Field assertContains2 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field nam has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertNotContains2));
            Report.reportLog(reflectiveClass, "Condition assertNotContains2 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue(!driver.findElement(assertNotContains2).getAttribute("ng-reflect-model").contains("not contained"), "Field assertNotContains2 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field not contained has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertDistinct2));
            Report.reportLog(reflectiveClass, "Condition assertDistinct2 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue(!"another name".equals(driver.findElement(assertDistinct2).getAttribute("ng-reflect-model")), "Field assertDistinct2 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field another name has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            
            Report.reportLog(reflectiveClass, "The field assertInputs1 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage");
            Report.reportLog(reflectiveClass, "Navigated to " + "https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage", "INFO", 0, Status.PASS, true, "", "", null);
			buttonsPage.disableButtons3();
            
			buttonsPage.leftClickById1();
            
			
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertTitle9));
            Report.reportLog(reflectiveClass, "Condition assertTitle9 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("OkPage".equals(driver.findElement(assertTitle9).getText()), "Field assertTitle9 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field OkPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            
            Report.reportLog(reflectiveClass, "The field assertOkPage5 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage");
            Report.reportLog(reflectiveClass, "Navigated to " + "https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage", "INFO", 0, Status.PASS, true, "", "", null);
			buttonsPage.disableButtons4();
            
			buttonsPage.leftClickByXpath1();
            
			
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertTitle10));
            Report.reportLog(reflectiveClass, "Condition assertTitle10 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("OkPage".equals(driver.findElement(assertTitle10).getText()), "Field assertTitle10 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field OkPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            
            Report.reportLog(reflectiveClass, "The field assertOkPage6 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage");
            Report.reportLog(reflectiveClass, "Navigated to " + "https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage", "INFO", 0, Status.PASS, true, "", "", null);
			buttonsPage.disableButtons5();
            
			
			
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AsyncCondition2));
            Report.reportLog(reflectiveClass, "Condition AsyncCondition2 isClickable finished", "INFO", 20, Status.PASS, true, "", "", null);

			buttonsPage.doubleClickById1();
            
			
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertTitle11));
            Report.reportLog(reflectiveClass, "Condition assertTitle11 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("OkPage".equals(driver.findElement(assertTitle11).getText()), "Field assertTitle11 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field OkPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            
            Report.reportLog(reflectiveClass, "The field assertOkPage7 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/dragAndDropPage");
            Report.reportLog(reflectiveClass, "Navigated to " + "https://cad-uat-cadqa-supertestui.caddev.everis.com/dragAndDropPage", "INFO", 0, Status.PASS, true, "", "", null);
			dragAndDropPage.enableDrag1();
            
			dragAndDropPage.dragImage4();
            
			
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertTitle8));
            Report.reportLog(reflectiveClass, "Condition assertTitle8 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("OkPage".equals(driver.findElement(assertTitle8).getText()), "Field assertTitle8 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field OkPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            
            Report.reportLog(reflectiveClass, "The field assertOkPage4 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            
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
            
			driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/");
            Report.reportLog(reflectiveClass, "Navigated to " + "https://cad-uat-cadqa-supertestui.caddev.everis.com/", "INFO", 0, Status.PASS, true, "", "", null);
			formPage.fillInputs2();
            
			
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertNameById3));
            Report.reportLog(reflectiveClass, "Condition assertNameById3 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("a name".equals(driver.findElement(assertNameById3).getAttribute("ng-reflect-model")), "Field assertNameById3 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field a name has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertLastNameByXpathDoubleQuotes3));
            Report.reportLog(reflectiveClass, "Condition assertLastNameByXpathDoubleQuotes3 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("a last name".equals(driver.findElement(assertLastNameByXpathDoubleQuotes3).getAttribute("ng-reflect-model")), "Field assertLastNameByXpathDoubleQuotes3 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field a last name has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertEmailByXpathSingleQuote3));
            Report.reportLog(reflectiveClass, "Condition assertEmailByXpathSingleQuote3 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("an email".equals(driver.findElement(assertEmailByXpathSingleQuote3).getAttribute("ng-reflect-model")), "Field assertEmailByXpathSingleQuote3 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field an email has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertPhoneByName3));
            Report.reportLog(reflectiveClass, "Condition assertPhoneByName3 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("123456".equals(driver.findElement(assertPhoneByName3).getAttribute("ng-reflect-model")), "Field assertPhoneByName3 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field 123456 has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertContains3));
            Report.reportLog(reflectiveClass, "Condition assertContains3 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue(driver.findElement(assertContains3).getAttribute("ng-reflect-model").contains("nam"), "Field assertContains3 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field nam has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertNotContains3));
            Report.reportLog(reflectiveClass, "Condition assertNotContains3 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue(!driver.findElement(assertNotContains3).getAttribute("ng-reflect-model").contains("not contained"), "Field assertNotContains3 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field not contained has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertDistinct3));
            Report.reportLog(reflectiveClass, "Condition assertDistinct3 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue(!"another name".equals(driver.findElement(assertDistinct3).getAttribute("ng-reflect-model")), "Field assertDistinct3 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field another name has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            
            Report.reportLog(reflectiveClass, "The field assertInputs2 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage");
            Report.reportLog(reflectiveClass, "Navigated to " + "https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage", "INFO", 0, Status.PASS, true, "", "", null);
			buttonsPage.disableButtons7();
            
			buttonsPage.leftClickById2();
            
			
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertTitle13));
            Report.reportLog(reflectiveClass, "Condition assertTitle13 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("OkPage".equals(driver.findElement(assertTitle13).getText()), "Field assertTitle13 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field OkPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            
            Report.reportLog(reflectiveClass, "The field assertOkPage9 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage");
            Report.reportLog(reflectiveClass, "Navigated to " + "https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage", "INFO", 0, Status.PASS, true, "", "", null);
			buttonsPage.disableButtons8();
            
			buttonsPage.leftClickByXpath2();
            
			
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertTitle14));
            Report.reportLog(reflectiveClass, "Condition assertTitle14 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("OkPage".equals(driver.findElement(assertTitle14).getText()), "Field assertTitle14 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field OkPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            
            Report.reportLog(reflectiveClass, "The field assertOkPage10 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage");
            Report.reportLog(reflectiveClass, "Navigated to " + "https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage", "INFO", 0, Status.PASS, true, "", "", null);
			buttonsPage.disableButtons6();
            
			
			
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AsyncCondition3));
            Report.reportLog(reflectiveClass, "Condition AsyncCondition3 isClickable finished", "INFO", 20, Status.PASS, true, "", "", null);

			buttonsPage.doubleClickById2();
            
			
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertTitle15));
            Report.reportLog(reflectiveClass, "Condition assertTitle15 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("OkPage".equals(driver.findElement(assertTitle15).getText()), "Field assertTitle15 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field OkPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            
            Report.reportLog(reflectiveClass, "The field assertOkPage11 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/dragAndDropPage");
            Report.reportLog(reflectiveClass, "Navigated to " + "https://cad-uat-cadqa-supertestui.caddev.everis.com/dragAndDropPage", "INFO", 0, Status.PASS, true, "", "", null);
			dragAndDropPage.enableDrag2();
            
			dragAndDropPage.dragImage6();
            
			
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertTitle12));
            Report.reportLog(reflectiveClass, "Condition assertTitle12 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("OkPage".equals(driver.findElement(assertTitle12).getText()), "Field assertTitle12 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field OkPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
            
            Report.reportLog(reflectiveClass, "The field assertOkPage8 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
            
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
            Report.reportLog(reflectiveClass, "Result on Test_PSFUEND02E0104: " + finalResult, "INFO", 0, Status.PASS, false, "", "", null);
        } else {
            Report.reportLog(reflectiveClass, "Result on Test_PSFUEND02E0104: " + finalResult, "INFO", 0, Status.FAIL, false, "", "", null);
        }
        constant.logger.info("Result on Test_PSFUEND02E0104: " + finalResult);
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
        reflectiveClass = Utils.getReflective(Test_PSFUEND02E0104.class.getCanonicalName());
			regressionCADBeforeEach = new RegressionCADBeforeEach(reflectiveClass);
		formPage = new FormPage(reflectiveClass);
		buttonsPage = new ButtonsPage(reflectiveClass);
		dragAndDropPage = new DragAndDropPage(reflectiveClass);
        return driver;
    }
}
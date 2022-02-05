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

public class SimpleActionsGlobalAction{

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
    
      
	private static By assertTitle16 = By.xpath("//h2");
	private static By assertTitle17 = By.xpath("//h2");
	private By doubleClickById1 = By.id("doubleClickToOk");
	private By AsyncCondition7 = By.id("doubleClickToOk");
	private By disableButtons3 = By.id("disableButtons");
	private By enableDrag1 = By.id("initEvents");
	private By dragImage_Destination4 = By.id("dropArea");
    private By dragImage7 = By.id("imageToDrop");
	private static By assertTitle18 = By.xpath("//h2");
	private By fillInputs1 = By.id("name");
	private By nameById4 = By.id("name");
	private By lastNameByXpathAndDoubleQuotes4 = By.xpath("//input[@id=\"lastName\"]");
	private By emailByXpathAndSimpleQuote4 = By.xpath("//input[@id='email']");
	private By phoneByName4 = By.name("phone");
	private static By assertNameById4 = By.id("name");
	private static By assertLastNameByXpathDoubleQuotes4 = By.xpath("//*[@id=\"lastName\"]");
	private static By assertEmailByXpathSingleQuote4 = By.xpath("//*[@id='email']");
	private static By assertPhoneByName4 = By.name("phone");
	private static By assertContains4 = By.id("name");
	private static By assertNotContains4 = By.id("name");
	private static By assertDistinct4 = By.id("name");
	private By leftClickById1 = By.id("clickToOk");
	private static By assertTitle19 = By.xpath("//h2");
	private By disableButtons4 = By.id("disableButtons");
	private By disableButtons5 = By.id("disableButtons");
	private By leftClickByXpath1 = By.xpath("//*[@id=\"clickToOk\"]");
    
    public SimpleActionsGlobalAction(Class reflectiveClass) throws Exception {
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

    public SimpleActionsGlobalAction goToApp2 () {
        driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/");
        Report.reportLog(reflectiveClass, "goToApp2 action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }

	
      
	public SimpleActionsGlobalAction fillInputs1() throws Exception {
        	driver.findElement(nameById4).clear();
            driver.findElement(nameById4).sendKeys("a name");
            Report.reportLog(reflectiveClass, "Typed " + "a name in nameById4", "INFO", 0, Status.PASS, true, "", "", null);
			driver.findElement(lastNameByXpathAndDoubleQuotes4).clear();
            driver.findElement(lastNameByXpathAndDoubleQuotes4).sendKeys("a last name");
            Report.reportLog(reflectiveClass, "Typed " + "a last name in lastNameByXpathAndDoubleQuotes4", "INFO", 0, Status.PASS, true, "", "", null);
			driver.findElement(emailByXpathAndSimpleQuote4).clear();
            driver.findElement(emailByXpathAndSimpleQuote4).sendKeys("an email");
            Report.reportLog(reflectiveClass, "Typed " + "an email in emailByXpathAndSimpleQuote4", "INFO", 0, Status.PASS, true, "", "", null);
			driver.findElement(phoneByName4).clear();
            driver.findElement(phoneByName4).sendKeys("123456");
            Report.reportLog(reflectiveClass, "Typed " + "123456 in phoneByName4", "INFO", 0, Status.PASS, true, "", "", null);
		
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(fillInputs1));
            Report.reportLog(reflectiveClass, "Condition fillInputs1 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(fillInputs1).click();
            Report.reportLog(reflectiveClass, "Clicked fillInputs1", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
	public SimpleActionsGlobalAction assertInputs1() {
        
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertNameById4));
            Report.reportLog(reflectiveClass, "Condition assertNameById4 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("a name".equals(driver.findElement(assertNameById4).getAttribute("ng-reflect-model")), "Field assertNameById4 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field a name has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertLastNameByXpathDoubleQuotes4));
            Report.reportLog(reflectiveClass, "Condition assertLastNameByXpathDoubleQuotes4 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("a last name".equals(driver.findElement(assertLastNameByXpathDoubleQuotes4).getAttribute("ng-reflect-model")), "Field assertLastNameByXpathDoubleQuotes4 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field a last name has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertEmailByXpathSingleQuote4));
            Report.reportLog(reflectiveClass, "Condition assertEmailByXpathSingleQuote4 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("an email".equals(driver.findElement(assertEmailByXpathSingleQuote4).getAttribute("ng-reflect-model")), "Field assertEmailByXpathSingleQuote4 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field an email has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertPhoneByName4));
            Report.reportLog(reflectiveClass, "Condition assertPhoneByName4 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("123456".equals(driver.findElement(assertPhoneByName4).getAttribute("ng-reflect-model")), "Field assertPhoneByName4 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field 123456 has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertContains4));
            Report.reportLog(reflectiveClass, "Condition assertContains4 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue(driver.findElement(assertContains4).getAttribute("ng-reflect-model").contains("nam"), "Field assertContains4 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field nam has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertNotContains4));
            Report.reportLog(reflectiveClass, "Condition assertNotContains4 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue(!driver.findElement(assertNotContains4).getAttribute("ng-reflect-model").contains("not contained"), "Field assertNotContains4 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field not contained has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertDistinct4));
            Report.reportLog(reflectiveClass, "Condition assertDistinct4 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue(!"another name".equals(driver.findElement(assertDistinct4).getAttribute("ng-reflect-model")), "Field assertDistinct4 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field another name has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field assertInputs1 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    public SimpleActionsGlobalAction goToButtons5 () {
        driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage");
        Report.reportLog(reflectiveClass, "goToButtons5 action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }

	
      
	public SimpleActionsGlobalAction disableButtons4() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(disableButtons4));
            Report.reportLog(reflectiveClass, "Condition disableButtons4 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(disableButtons4).click();
            Report.reportLog(reflectiveClass, "Clicked disableButtons4", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
      
	public SimpleActionsGlobalAction leftClickById1() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(leftClickById1));
            Report.reportLog(reflectiveClass, "Condition leftClickById1 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(leftClickById1).click();
            Report.reportLog(reflectiveClass, "Clicked leftClickById1", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
	public SimpleActionsGlobalAction assertOkPage7() {
        
			assertTrue(driver.getCurrentUrl().equals(prop.getProperty("WEB_URL") + "OkPage"), "Field assertOkPage7 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field OkPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertTitle19));
            Report.reportLog(reflectiveClass, "Condition assertTitle19 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("OkPage".equals(driver.findElement(assertTitle19).getText()), "Field assertTitle19 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field OkPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field assertOkPage7 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    public SimpleActionsGlobalAction goToButtons3 () {
        driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage");
        Report.reportLog(reflectiveClass, "goToButtons3 action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }

	
      
	public SimpleActionsGlobalAction disableButtons5() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(disableButtons5));
            Report.reportLog(reflectiveClass, "Condition disableButtons5 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(disableButtons5).click();
            Report.reportLog(reflectiveClass, "Clicked disableButtons5", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
      
	public SimpleActionsGlobalAction leftClickByXpath1() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(leftClickByXpath1));
            Report.reportLog(reflectiveClass, "Condition leftClickByXpath1 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(leftClickByXpath1).click();
            Report.reportLog(reflectiveClass, "Clicked leftClickByXpath1", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
	public SimpleActionsGlobalAction assertOkPage5() {
        
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertTitle17));
            Report.reportLog(reflectiveClass, "Condition assertTitle17 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("OkPage".equals(driver.findElement(assertTitle17).getText()), "Field assertTitle17 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field OkPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field assertOkPage5 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    public SimpleActionsGlobalAction goToButtons4 () {
        driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage");
        Report.reportLog(reflectiveClass, "goToButtons4 action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }

	public SimpleActionsGlobalAction AsyncCondition7() {
        	
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AsyncCondition7));
            Report.reportLog(reflectiveClass, "Condition AsyncCondition7 isClickable finished", "INFO", 20, Status.PASS, true, "", "", null);

        	return this;
    }

	
      
	public SimpleActionsGlobalAction disableButtons3() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(disableButtons3));
            Report.reportLog(reflectiveClass, "Condition disableButtons3 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(disableButtons3).click();
            Report.reportLog(reflectiveClass, "Clicked disableButtons3", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
      
	public SimpleActionsGlobalAction doubleClickById1() throws Exception {
        
            
            Actions action = new Actions(driver);
            action.doubleClick(driver.findElement(doubleClickById1)).perform();
            Report.reportLog(reflectiveClass, "Double clicked doubleClickById1", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
	public SimpleActionsGlobalAction assertOkPage4() {
        
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertTitle16));
            Report.reportLog(reflectiveClass, "Condition assertTitle16 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("OkPage".equals(driver.findElement(assertTitle16).getText()), "Field assertTitle16 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field OkPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field assertOkPage4 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    public SimpleActionsGlobalAction goToDragAndDrop1 () {
        driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/dragAndDropPage");
        Report.reportLog(reflectiveClass, "goToDragAndDrop1 action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }

	
      
	public SimpleActionsGlobalAction enableDrag1() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(enableDrag1));
            Report.reportLog(reflectiveClass, "Condition enableDrag1 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(enableDrag1).click();
            Report.reportLog(reflectiveClass, "Clicked enableDrag1", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      public SimpleActionsGlobalAction dragImage1() {
        Actions action = new Actions(driver);
        action.dragAndDrop(driver.findElement(dragImage7), driver.findElement(dragImage_Destination4)).release().build().perform();
        Report.reportLog(reflectiveClass, "dragImage1 action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }

	
	public SimpleActionsGlobalAction assertOkPage6() {
        
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertTitle18));
            Report.reportLog(reflectiveClass, "Condition assertTitle18 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("OkPage".equals(driver.findElement(assertTitle18).getText()), "Field assertTitle18 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field OkPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field assertOkPage6 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    
    public void doSimpleActionsGlobalAction() throws Exception {
    
    
		goToApp2();
    
		fillInputs1();
    
		assertInputs1();
    
		goToButtons5();
    
		disableButtons4();
    
		leftClickById1();
    
		assertOkPage7();
    
		goToButtons3();
    
		disableButtons5();
    
		leftClickByXpath1();
    
		assertOkPage5();
    
		goToButtons4();
    
		disableButtons3();
    
		AsyncCondition7();
      
		doubleClickById1();
    
		assertOkPage4();
    
		goToDragAndDrop1();
    
		enableDrag1();
    
		dragImage1();
    
		assertOkPage6();
    
		
    }
}
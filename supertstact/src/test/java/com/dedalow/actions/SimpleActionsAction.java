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

public class SimpleActionsAction{

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
    
      
	private static By assertTitle = By.xpath("//h2");
	private static By assertTitle1 = By.xpath("//h2");
	private By doubleClickById = By.id("doubleClickToOk");
	private By AsyncCondition = By.id("doubleClickToOk");
	private By disableButtons = By.id("disableButtons");
	private By enableDrag = By.id("initEvents");
	private By dragImage_Destination = By.id("dropArea");
    private By dragImage = By.id("imageToDrop");
	private static By assertTitle2 = By.xpath("//h2");
	private By fillInputs = By.id("name");
	private By nameById = By.id("name");
	private By lastNameByXpathAndDoubleQuotes = By.xpath("//input[@id=\"lastName\"]");
	private By emailByXpathAndSimpleQuote = By.xpath("//input[@id='email']");
	private By phoneByName = By.name("phone");
	private static By assertNameById = By.id("name");
	private static By assertLastNameByXpathDoubleQuotes = By.xpath("//*[@id=\"lastName\"]");
	private static By assertEmailByXpathSingleQuote = By.xpath("//*[@id='email']");
	private static By assertPhoneByName = By.name("phone");
	private static By assertContains = By.id("name");
	private static By assertNotContains = By.id("name");
	private static By assertDistinct = By.id("name");
	private By leftClickById = By.id("clickToOk");
	private static By assertTitle3 = By.xpath("//h2");
	private By disableButtons1 = By.id("disableButtons");
	private By disableButtons2 = By.id("disableButtons");
	private By leftClickByXpath = By.xpath("//*[@id=\"clickToOk\"]");
    
    public SimpleActionsAction(Class reflectiveClass) throws Exception {
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

    public SimpleActionsAction goToApp () {
        driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/");
        Report.reportLog(reflectiveClass, "goToApp action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }

	
      
	public SimpleActionsAction fillInputs() throws Exception {
        	driver.findElement(nameById).clear();
            driver.findElement(nameById).sendKeys("a name");
            Report.reportLog(reflectiveClass, "Typed " + "a name in nameById", "INFO", 0, Status.PASS, true, "", "", null);
			driver.findElement(lastNameByXpathAndDoubleQuotes).clear();
            driver.findElement(lastNameByXpathAndDoubleQuotes).sendKeys("a last name");
            Report.reportLog(reflectiveClass, "Typed " + "a last name in lastNameByXpathAndDoubleQuotes", "INFO", 0, Status.PASS, true, "", "", null);
			driver.findElement(emailByXpathAndSimpleQuote).clear();
            driver.findElement(emailByXpathAndSimpleQuote).sendKeys("an email");
            Report.reportLog(reflectiveClass, "Typed " + "an email in emailByXpathAndSimpleQuote", "INFO", 0, Status.PASS, true, "", "", null);
			driver.findElement(phoneByName).clear();
            driver.findElement(phoneByName).sendKeys("123456");
            Report.reportLog(reflectiveClass, "Typed " + "123456 in phoneByName", "INFO", 0, Status.PASS, true, "", "", null);
		
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(fillInputs));
            Report.reportLog(reflectiveClass, "Condition fillInputs isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(fillInputs).click();
            Report.reportLog(reflectiveClass, "Clicked fillInputs", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
	public SimpleActionsAction assertInputs() {
        
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertNameById));
            Report.reportLog(reflectiveClass, "Condition assertNameById isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("a name".equals(driver.findElement(assertNameById).getAttribute("ng-reflect-model")), "Field assertNameById not found in assertion");
        	Report.reportLog(reflectiveClass, "The field a name has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertLastNameByXpathDoubleQuotes));
            Report.reportLog(reflectiveClass, "Condition assertLastNameByXpathDoubleQuotes isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("a last name".equals(driver.findElement(assertLastNameByXpathDoubleQuotes).getAttribute("ng-reflect-model")), "Field assertLastNameByXpathDoubleQuotes not found in assertion");
        	Report.reportLog(reflectiveClass, "The field a last name has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertEmailByXpathSingleQuote));
            Report.reportLog(reflectiveClass, "Condition assertEmailByXpathSingleQuote isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("an email".equals(driver.findElement(assertEmailByXpathSingleQuote).getAttribute("ng-reflect-model")), "Field assertEmailByXpathSingleQuote not found in assertion");
        	Report.reportLog(reflectiveClass, "The field an email has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertPhoneByName));
            Report.reportLog(reflectiveClass, "Condition assertPhoneByName isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("123456".equals(driver.findElement(assertPhoneByName).getAttribute("ng-reflect-model")), "Field assertPhoneByName not found in assertion");
        	Report.reportLog(reflectiveClass, "The field 123456 has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertContains));
            Report.reportLog(reflectiveClass, "Condition assertContains isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue(driver.findElement(assertContains).getAttribute("ng-reflect-model").contains("nam"), "Field assertContains not found in assertion");
        	Report.reportLog(reflectiveClass, "The field nam has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertNotContains));
            Report.reportLog(reflectiveClass, "Condition assertNotContains isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue(!driver.findElement(assertNotContains).getAttribute("ng-reflect-model").contains("not contained"), "Field assertNotContains not found in assertion");
        	Report.reportLog(reflectiveClass, "The field not contained has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertDistinct));
            Report.reportLog(reflectiveClass, "Condition assertDistinct isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue(!"another name".equals(driver.findElement(assertDistinct).getAttribute("ng-reflect-model")), "Field assertDistinct not found in assertion");
        	Report.reportLog(reflectiveClass, "The field another name has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field assertInputs has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    public SimpleActionsAction goToButtons2 () {
        driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage");
        Report.reportLog(reflectiveClass, "goToButtons2 action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }

	
      
	public SimpleActionsAction disableButtons1() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(disableButtons1));
            Report.reportLog(reflectiveClass, "Condition disableButtons1 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(disableButtons1).click();
            Report.reportLog(reflectiveClass, "Clicked disableButtons1", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
      
	public SimpleActionsAction leftClickById() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(leftClickById));
            Report.reportLog(reflectiveClass, "Condition leftClickById isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(leftClickById).click();
            Report.reportLog(reflectiveClass, "Clicked leftClickById", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
	public SimpleActionsAction assertOkPage3() {
        
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertTitle3));
            Report.reportLog(reflectiveClass, "Condition assertTitle3 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("OkPage".equals(driver.findElement(assertTitle3).getText()), "Field assertTitle3 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field OkPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field assertOkPage3 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    public SimpleActionsAction goToButtons () {
        driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage");
        Report.reportLog(reflectiveClass, "goToButtons action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }

	
      
	public SimpleActionsAction disableButtons2() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(disableButtons2));
            Report.reportLog(reflectiveClass, "Condition disableButtons2 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(disableButtons2).click();
            Report.reportLog(reflectiveClass, "Clicked disableButtons2", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
      
	public SimpleActionsAction leftClickByXpath() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(leftClickByXpath));
            Report.reportLog(reflectiveClass, "Condition leftClickByXpath isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(leftClickByXpath).click();
            Report.reportLog(reflectiveClass, "Clicked leftClickByXpath", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
	public SimpleActionsAction assertOkPage1() {
        
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertTitle1));
            Report.reportLog(reflectiveClass, "Condition assertTitle1 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("OkPage".equals(driver.findElement(assertTitle1).getText()), "Field assertTitle1 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field OkPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field assertOkPage1 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    public SimpleActionsAction goToButtons1 () {
        driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/buttonsPage");
        Report.reportLog(reflectiveClass, "goToButtons1 action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }

	public SimpleActionsAction AsyncCondition() {
        	
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AsyncCondition));
            Report.reportLog(reflectiveClass, "Condition AsyncCondition isClickable finished", "INFO", 20, Status.PASS, true, "", "", null);

        	return this;
    }

	
      
	public SimpleActionsAction disableButtons() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(disableButtons));
            Report.reportLog(reflectiveClass, "Condition disableButtons isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(disableButtons).click();
            Report.reportLog(reflectiveClass, "Clicked disableButtons", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
      
	public SimpleActionsAction doubleClickById() throws Exception {
        
            
            Actions action = new Actions(driver);
            action.doubleClick(driver.findElement(doubleClickById)).perform();
            Report.reportLog(reflectiveClass, "Double clicked doubleClickById", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      
	public SimpleActionsAction assertOkPage() {
        
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertTitle));
            Report.reportLog(reflectiveClass, "Condition assertTitle isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("OkPage".equals(driver.findElement(assertTitle).getText()), "Field assertTitle not found in assertion");
        	Report.reportLog(reflectiveClass, "The field OkPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field assertOkPage has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    public SimpleActionsAction goToDragAndDrop () {
        driver.get("https://cad-uat-cadqa-supertestui.caddev.everis.com/dragAndDropPage");
        Report.reportLog(reflectiveClass, "goToDragAndDrop action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }

	
      
	public SimpleActionsAction enableDrag() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(enableDrag));
            Report.reportLog(reflectiveClass, "Condition enableDrag isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(enableDrag).click();
            Report.reportLog(reflectiveClass, "Clicked enableDrag", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
      }
      public SimpleActionsAction dragImage() {
        Actions action = new Actions(driver);
        action.dragAndDrop(driver.findElement(dragImage), driver.findElement(dragImage_Destination)).release().build().perform();
        Report.reportLog(reflectiveClass, "dragImage action completed", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }

	
	public SimpleActionsAction assertOkPage2() {
        
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(assertTitle2));
            Report.reportLog(reflectiveClass, "Condition assertTitle2 isVisible finished", "ASYNCHRONOUS", 0);

			assertTrue("OkPage".equals(driver.findElement(assertTitle2).getText()), "Field assertTitle2 not found in assertion");
        	Report.reportLog(reflectiveClass, "The field OkPage has been found on assertion", "INFO", 0, Status.PASS, true, "", "", null);
            
        
        Report.reportLog(reflectiveClass, "The field assertOkPage2 has been found on assertions", "INFO", 0, Status.PASS, false, "", "", null);
        return this;
    }
    
    public void doSimpleActionsAction() throws Exception {
    
    
		goToApp();
    
		fillInputs();
    
		assertInputs();
    
		goToButtons2();
    
		disableButtons1();
    
		leftClickById();
    
		assertOkPage3();
    
		goToButtons();
    
		disableButtons2();
    
		leftClickByXpath();
    
		assertOkPage1();
    
		goToButtons1();
    
		disableButtons();
    
		AsyncCondition();
      
		doubleClickById();
    
		assertOkPage();
    
		goToDragAndDrop();
    
		enableDrag();
    
		dragImage();
    
		assertOkPage2();
    
		
    }
}
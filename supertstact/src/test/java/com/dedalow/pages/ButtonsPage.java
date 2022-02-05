package com.dedalow.pages;

import java.util.logging.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.Status;
import com.dedalow.report.Report;
import com.dedalow.utils.Utils;
import com.dedalow.utils.Constant;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ButtonsPage {

    private WebDriver driver;
    private Class reflectiveClass;
    private JavascriptExecutor js;
    private static Logger logger = Utils.logger();
    
	private By leftClickById = By.id("clickToOk");
	private By disableButtons = By.id("disableButtons");
	private By disableButtons1 = By.id("disableButtons");
	private By leftClickByXpath = By.xpath("//*[@id=\"clickToOk\"]");
	private By doubleClickById = By.id("doubleClickToOk");
	private By disableButtons2 = By.id("disableButtons");
	private By leftClickById1 = By.id("clickToOk");
	private By disableButtons3 = By.id("disableButtons");
	private By disableButtons4 = By.id("disableButtons");
	private By leftClickByXpath1 = By.xpath("//*[@id=\"clickToOk\"]");
	private By doubleClickById1 = By.id("doubleClickToOk");
	private By disableButtons5 = By.id("disableButtons");
	private By disableButtons6 = By.id("disableButtons");
	private By leftClickById2 = By.id("clickToOk");
	private By disableButtons7 = By.id("disableButtons");
	private By disableButtons8 = By.id("disableButtons");
	private By leftClickByXpath2 = By.xpath("//*[@id=\"clickToOk\"]");
	private By doubleClickById2 = By.id("doubleClickToOk");
    
    
    public ButtonsPage(Class reflectiveClass) throws Exception {
        this.reflectiveClass = reflectiveClass;
        this.driver = (WebDriver) reflectiveClass.getField("driver").get(reflectiveClass);
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor)driver;
        
    }
        
	public ButtonsPage leftClickById() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(leftClickById));
            Report.reportLog(reflectiveClass, "Condition leftClickById isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(leftClickById).click();
            Report.reportLog(reflectiveClass, "Clicked leftClickById", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public ButtonsPage disableButtons() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(disableButtons));
            Report.reportLog(reflectiveClass, "Condition disableButtons isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(disableButtons).click();
            Report.reportLog(reflectiveClass, "Clicked disableButtons", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public ButtonsPage disableButtons1() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(disableButtons1));
            Report.reportLog(reflectiveClass, "Condition disableButtons1 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(disableButtons1).click();
            Report.reportLog(reflectiveClass, "Clicked disableButtons1", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public ButtonsPage leftClickByXpath() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(leftClickByXpath));
            Report.reportLog(reflectiveClass, "Condition leftClickByXpath isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(leftClickByXpath).click();
            Report.reportLog(reflectiveClass, "Clicked leftClickByXpath", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public ButtonsPage doubleClickById() throws Exception {
        
            
            Actions action = new Actions(driver);
            action.doubleClick(driver.findElement(doubleClickById)).perform();
            Report.reportLog(reflectiveClass, "Double clicked doubleClickById", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public ButtonsPage disableButtons2() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(disableButtons2));
            Report.reportLog(reflectiveClass, "Condition disableButtons2 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(disableButtons2).click();
            Report.reportLog(reflectiveClass, "Clicked disableButtons2", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public ButtonsPage leftClickById1() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(leftClickById1));
            Report.reportLog(reflectiveClass, "Condition leftClickById1 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(leftClickById1).click();
            Report.reportLog(reflectiveClass, "Clicked leftClickById1", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public ButtonsPage disableButtons3() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(disableButtons3));
            Report.reportLog(reflectiveClass, "Condition disableButtons3 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(disableButtons3).click();
            Report.reportLog(reflectiveClass, "Clicked disableButtons3", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public ButtonsPage disableButtons4() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(disableButtons4));
            Report.reportLog(reflectiveClass, "Condition disableButtons4 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(disableButtons4).click();
            Report.reportLog(reflectiveClass, "Clicked disableButtons4", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public ButtonsPage leftClickByXpath1() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(leftClickByXpath1));
            Report.reportLog(reflectiveClass, "Condition leftClickByXpath1 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(leftClickByXpath1).click();
            Report.reportLog(reflectiveClass, "Clicked leftClickByXpath1", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public ButtonsPage doubleClickById1() throws Exception {
        
            
            Actions action = new Actions(driver);
            action.doubleClick(driver.findElement(doubleClickById1)).perform();
            Report.reportLog(reflectiveClass, "Double clicked doubleClickById1", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public ButtonsPage disableButtons5() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(disableButtons5));
            Report.reportLog(reflectiveClass, "Condition disableButtons5 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(disableButtons5).click();
            Report.reportLog(reflectiveClass, "Clicked disableButtons5", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public ButtonsPage disableButtons6() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(disableButtons6));
            Report.reportLog(reflectiveClass, "Condition disableButtons6 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(disableButtons6).click();
            Report.reportLog(reflectiveClass, "Clicked disableButtons6", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public ButtonsPage leftClickById2() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(leftClickById2));
            Report.reportLog(reflectiveClass, "Condition leftClickById2 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(leftClickById2).click();
            Report.reportLog(reflectiveClass, "Clicked leftClickById2", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public ButtonsPage disableButtons7() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(disableButtons7));
            Report.reportLog(reflectiveClass, "Condition disableButtons7 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(disableButtons7).click();
            Report.reportLog(reflectiveClass, "Clicked disableButtons7", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public ButtonsPage disableButtons8() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(disableButtons8));
            Report.reportLog(reflectiveClass, "Condition disableButtons8 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(disableButtons8).click();
            Report.reportLog(reflectiveClass, "Clicked disableButtons8", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public ButtonsPage leftClickByXpath2() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(leftClickByXpath2));
            Report.reportLog(reflectiveClass, "Condition leftClickByXpath2 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(leftClickByXpath2).click();
            Report.reportLog(reflectiveClass, "Clicked leftClickByXpath2", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public ButtonsPage doubleClickById2() throws Exception {
        
            
            Actions action = new Actions(driver);
            action.doubleClick(driver.findElement(doubleClickById2)).perform();
            Report.reportLog(reflectiveClass, "Double clicked doubleClickById2", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
}
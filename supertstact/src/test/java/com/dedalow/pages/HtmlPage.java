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

public class HtmlPage {

    private WebDriver driver;
    private Class reflectiveClass;
    private JavascriptExecutor js;
    private static Logger logger = Utils.logger();
    
	private By openNewTab = By.xpath("//a[contains(text(),'The home page')]");
    
    
    public HtmlPage(Class reflectiveClass) throws Exception {
        this.reflectiveClass = reflectiveClass;
        this.driver = (WebDriver) reflectiveClass.getField("driver").get(reflectiveClass);
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor)driver;
        
    }
        
	public HtmlPage openNewTab() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(openNewTab));
            Report.reportLog(reflectiveClass, "Condition openNewTab isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(openNewTab).click();
            Report.reportLog(reflectiveClass, "Clicked openNewTab", "INFO", 1000, Status.PASS, true, "", "", null);
            return this;
	}
}
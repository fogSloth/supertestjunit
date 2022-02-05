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

public class DragAndDropPage {

    private WebDriver driver;
    private Class reflectiveClass;
    private JavascriptExecutor js;
    private static Logger logger = Utils.logger();
    
	private By enableDrag = By.id("initEvents");
	private By enableDrag1 = By.id("initEvents");
	private By enableDrag2 = By.id("initEvents");
	private By dragImage_Destination1 = By.id("dropArea");
    private By dragImage2 = By.id("imageToDrop");
	private By dragImage_Destination2 = By.id("dropArea");
    private By dragImage4 = By.id("imageToDrop");
	private By dragImage_Destination3 = By.id("dropArea");
    private By dragImage6 = By.id("imageToDrop");
    
    
    public DragAndDropPage(Class reflectiveClass) throws Exception {
        this.reflectiveClass = reflectiveClass;
        this.driver = (WebDriver) reflectiveClass.getField("driver").get(reflectiveClass);
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor)driver;
        
    }
        
	public DragAndDropPage enableDrag() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(enableDrag));
            Report.reportLog(reflectiveClass, "Condition enableDrag isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(enableDrag).click();
            Report.reportLog(reflectiveClass, "Clicked enableDrag", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public DragAndDropPage enableDrag1() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(enableDrag1));
            Report.reportLog(reflectiveClass, "Condition enableDrag1 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(enableDrag1).click();
            Report.reportLog(reflectiveClass, "Clicked enableDrag1", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
        
	public DragAndDropPage enableDrag2() throws Exception {
        
            
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(enableDrag2));
            Report.reportLog(reflectiveClass, "Condition enableDrag2 isClickable finished", "ASYNCHRONOUS", 0);

            driver.findElement(enableDrag2).click();
            Report.reportLog(reflectiveClass, "Clicked enableDrag2", "INFO", 0, Status.PASS, true, "", "", null);
            return this;
	}
	public DragAndDropPage dragImage2() {
        Actions action = new Actions(driver);
        action.dragAndDrop(driver.findElement(dragImage2), driver.findElement(dragImage_Destination1)).release().build().perform();
        Report.reportLog(reflectiveClass, "Drag and drop from dragImage2 to dragImage_Destination1", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }
    
	public DragAndDropPage dragImage4() {
        Actions action = new Actions(driver);
        action.dragAndDrop(driver.findElement(dragImage4), driver.findElement(dragImage_Destination2)).release().build().perform();
        Report.reportLog(reflectiveClass, "Drag and drop from dragImage4 to dragImage_Destination2", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }
    
	public DragAndDropPage dragImage6() {
        Actions action = new Actions(driver);
        action.dragAndDrop(driver.findElement(dragImage6), driver.findElement(dragImage_Destination3)).release().build().perform();
        Report.reportLog(reflectiveClass, "Drag and drop from dragImage6 to dragImage_Destination3", "INFO", 0, Status.PASS, true, "", "", null);
        return this;
    }
    
}
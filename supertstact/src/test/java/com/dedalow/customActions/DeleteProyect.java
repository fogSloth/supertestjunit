package com.dedalow.customActions;
import com.dedalow.actions.DeleteCreateGlobalAction;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// Project Classes
import com.dedalow.utils.Utils;
import com.dedalow.report.Report;
import com.dedalow.Launcher;

// SQL
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

// Oracle
import oracle.ucp.jdbc.PoolDataSourceFactory;
import oracle.ucp.jdbc.PoolDataSource;

// Report HTML
import com.aventstack.extentreports.Status;

public class DeleteProyect {

    private WebDriver driver;
    private JavascriptExecutor js;
    private Properties prop;
    private File folderTestCase;
    private File folderDownloads;
    private String level;
    private String handler;
    private String suiteName;
    private String caseName;
    private String finalResult;
    private HashMap<String, String> excelSheet;

    /**
     * Constructor
     * 
     * @param driver
     * @throws Exception
     */
    public DeleteProyect(WebDriver driver) throws Exception {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        js = (JavascriptExecutor) driver;
    }

    /**
     * Test variables Prepare the different variables that the user can use to
     * develop the DeleteProyect
     * 
     * @param reflectiveClass
     */
    public void getPrepareDeleteProyect(Class reflectiveClass) throws Exception {
        this.prop = (Properties) reflectiveClass.getField("prop").get(reflectiveClass);
        this.level = (String) reflectiveClass.getField("level").get(reflectiveClass);
        this.handler = (String) reflectiveClass.getField("handler").get(reflectiveClass);
        this.suiteName = (String) reflectiveClass.getField("suiteName").get(reflectiveClass);
        this.caseName = (String) reflectiveClass.getField("caseName").get(reflectiveClass);
        this.finalResult = (String) reflectiveClass.getField("finalResult").get(reflectiveClass);
        this.folderTestCase = (File) reflectiveClass.getField("folderTestCase").get(reflectiveClass);
        this.folderDownloads = (File) reflectiveClass.getField("folderDownloads").get(reflectiveClass);
        this.excelSheet = (HashMap) reflectiveClass.getField("excelSheet").get(reflectiveClass);
    }

    /**
     * Space for user-defined methods
     */
     public void ActionDeleteProyect() throws Exception {
      String nameProyect = "globaljunit";
      By searchProyect = By.xpath("/html/body/div/div/div/section[2]/div/div/div[2]/div[1]/div[2]/div/label/input");
      By selectProyect = By.xpath("//span[contains(text(),'" + nameProyect + "')]");
      By removeProyect = By.xpath("//button[contains(text(),'Delete Project ...')]");
      By checkConfirmation = By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[1]");
      
      driver.findElement(searchProyect).clear();
      driver.findElement(searchProyect).sendKeys(nameProyect);
      driver.findElement(selectProyect).click();
      Thread.sleep(1000);
      driver.findElement(removeProyect).click();
      Thread.sleep(1000);
      driver.findElement(checkConfirmation).click();
	}

    
    /**
     * Class method called from the TestCase thread. Add inside the order of funcions calls desired.
     * 
     * @param reflectiveClass
     * @throws Exception
     */
    public void doDeleteProyect(Class reflectiveClass) throws Exception {
        getPrepareDeleteProyect(reflectiveClass);
        ActionDeleteProyect();
        // All functions designed in this class and not included as a call in this method will be ignored during test execution
        Report.reportLog(reflectiveClass, "", "INFO", 0);
    }
}
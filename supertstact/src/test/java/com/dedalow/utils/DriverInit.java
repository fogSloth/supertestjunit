package com.dedalow.utils;
import java.io.File;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverInit {

    public Logger logger = Utils.logger();
    public String driverType;
    public WebDriver driver = null;
    public String driverPath;
    public String[] driverOptions;
    public String pathFolderDownloads;
    public int timeOut;
    public List<String> listNamesChrome = Arrays.asList("chrome", "googlechrome");
    public List<String> listNamesFirefox = Arrays.asList("firefox", "mozilla", "mozillafirefox", "gecko");
    public List<String> listNamesExplorer = Arrays.asList("ie", "internetexplorer", "explorer", "iexplorer");
    public List<String> listNameseEdge = Arrays.asList("edge", "msedge");
    
	public WebDriver initChromedriver(Properties prop, File folderDownloads) throws Exception {
        try {
            HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
            chromePrefs.put("profile.default_content_settings.popups", 0);
            chromePrefs.put("download.default_directory", folderDownloads.getAbsolutePath());
            ChromeOptions optionsChrome = new ChromeOptions();
            if (!prop.getProperty("WebDriver.DRIVER_OPTIONS").isEmpty()) {
                optionsChrome.addArguments(driverOptions);
            }
            optionsChrome.setExperimentalOption("prefs", chromePrefs);
            WebDriverManager.chromedriver().driverVersion(prop.getProperty("WebDriver.DRIVER_VERSION")).setup();
            WebDriver chromeDriver = new ChromeDriver(optionsChrome);
            return chromeDriver;
        } catch (IllegalStateException e) {
            throw new Exception (e.getMessage());
        }
    }
        
	public WebDriver initGeckodriver(Properties prop, File folderDownloads) throws Exception {
        try {
            FirefoxProfile profile = new FirefoxProfile();
            profile.setPreference("browser.download.manager.useWindow", false);
            profile.setPreference("browser.download.dir", folderDownloads.getAbsolutePath());
            profile.setPreference("browser.download.manager.showAlertOnComplete", true);
            profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
                "text/plain, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, application/octet-stream,"
                + "application/binary, text/csv, application/csv, application/excel,"
                + "text/comma-separated-values, text/xml, application/xml");
            profile.setPreference("browser.download.folderList",2);
            FirefoxOptions optionsFirefox = new FirefoxOptions();
            if (!prop.getProperty("WebDriver.DRIVER_OPTIONS").isEmpty()) {
                optionsFirefox.addArguments(driverOptions);
            }
            optionsFirefox.setProfile(profile);
            WebDriverManager.firefoxdriver().driverVersion(prop.getProperty("WebDriver.DRIVER_VERSION")).setup();
            WebDriver geckoDriver = new FirefoxDriver(optionsFirefox);
            return geckoDriver;
        } catch (IllegalStateException e) {
            throw new Exception (e.getMessage());
        }
    }
        
	public WebDriver initIEDriverServer(Properties prop, File folderDownloads) throws Exception {
        try {
            WebDriverManager.iedriver().driverVersion(prop.getProperty("WebDriver.DRIVER_VERSION")).arch32().setup();
            WebDriver ieDriver = new InternetExplorerDriver();
            return ieDriver;
        } catch (IllegalStateException e) {
            throw new Exception (e.getMessage());
        }
    }
        
	public WebDriver initEdgedriver(Properties prop, File folderDownloads) throws Exception {
        try {
            HashMap<String, Object> edgePrefs = new HashMap<String, Object>();
            edgePrefs.put("profile.default_content_settings.popups", 0);
            edgePrefs.put("download.default_directory", folderDownloads.getAbsolutePath());
            EdgeOptions optionsEdge = new EdgeOptions();
            if (!prop.getProperty("WebDriver.DRIVER_OPTIONS").isEmpty()) {
                optionsEdge.addArguments(driverOptions);
            }
            optionsEdge.setExperimentalOption("prefs", edgePrefs);
            WebDriverManager.edgedriver().driverVersion(prop.getProperty("WebDriver.DRIVER_VERSION")).setup();
            WebDriver edgeDriver = new EdgeDriver(optionsEdge);
            return edgeDriver;
        } catch (IllegalStateException e) {
            throw new Exception (e.getMessage());
        }
    }
    
    public WebDriver driverSelector(File folderDownloads, Properties prop, String nameDriver, Map<String, WebDriver> contextsDriver) throws Exception {
        if (contextsDriver.get(nameDriver) != null) { driver = contextsDriver.get(nameDriver); }
        else {
            driverType = prop.getProperty("WebDriver.BROWSER").toLowerCase().replace(" ", "");
            driverOptions = prop.getProperty("WebDriver.DRIVER_OPTIONS").split(", ");
            pathFolderDownloads = prop.getProperty("FOLDER_DOWNLOAD");
            timeOut = Integer.parseInt(prop.getProperty("WEB_TIMEOUT"));
            
            if (!pathFolderDownloads.isEmpty() && !pathFolderDownloads.equals("default")) {
                folderDownloads = new File(pathFolderDownloads);
            }
            
            if (listNamesChrome.contains(driverType)) {
                driver = initChromedriver(prop, folderDownloads);
            } else if (listNamesFirefox.contains(driverType)) {
                driver = initGeckodriver(prop, folderDownloads);
            } else if (listNamesExplorer.contains(driverType)) {
                driver = initIEDriverServer(prop, folderDownloads);
            } else if (listNameseEdge.contains(driverType)) {
            	driver = initEdgedriver(prop, folderDownloads);
            } else {
                logger.info("The indicated browser does not match the available browsers [Chrome, Firefox, IExplorer, Edge], it is launched by default on chrome");
                driver = initChromedriver(prop, folderDownloads);
            }
            
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeOut));
            contextsDriver.put(nameDriver, driver);

        }

        return driver;
    }

}
package com.dedalow.utils;

import java.io.FileInputStream;
import java.io.IOException;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.ErrorManager;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.text.SimpleDateFormat;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.dedalow.Launcher;
import com.dedalow.report.Report;
import com.aventstack.extentreports.Status;
import com.dedalow.utils.Constant;

public class Utils {

    private static boolean check = true;
    private static Logger logger = Logger.getLogger(Launcher.class.getName());
    private static Handler consoleHandler = initHandler();
    public static Properties prop;

    public static void checkConnection(Properties prop) {
        Pattern regex = Pattern.compile(":?(http(?:s)*://)*([^:|/]*):?([0-9]*)([^$]*)");
    	Matcher homePage = regex.matcher(prop.getProperty("WEB_URL"));
    	homePage.find();
    	try {
    		InetAddress.getByName(homePage.group(2));
		} catch (UnknownHostException e) {
			Report.reportErrors("No connection established");
		}
    }
    
    public static Properties getConfigProperties() throws Exception {
        try {
            prop = new Properties();
            prop.load(new FileInputStream("config.properties"));
            checkConnection(prop);
            return prop;
        } catch (Exception e) {
            throw new Exception ("Can not find config.properties file");
        }
    }

    public static HashMap readExcel(String path) throws IOException {
    HashMap<String, ArrayList<HashMap<String, String>>> sheetList = new HashMap();
    try (FileInputStream fis = new FileInputStream(path)) {
        XSSFWorkbook book = new XSSFWorkbook(fis);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int sheets = book.getNumberOfSheets();
        for (int i = 0; i < sheets; i++) {
            Sheet sheet = book.getSheetAt(i);
            ArrayList<HashMap<String, String>> rowList = new ArrayList();
            sheetList.put(sheet.getSheetName(), rowList);
            
            Iterator<Row> rows = sheet.iterator();
            
            Row keys = rows.next();
            int cols = keys.getPhysicalNumberOfCells();
            
            while (rows.hasNext()) {
                Row row = rows.next();
                HashMap<String, String> rowContent = new HashMap();
                rowList.add(rowContent);
              
                for (int c = 0; c < cols; c++) {
                    XSSFCell cell = (XSSFCell) row.getCell(c);
                    String cellValue = getCellValue(cell, sdf, book);
                    String key = keys.getCell(c).toString();
                    rowContent.put(key + ":" + sheet.getSheetName(), cellValue);
                }
            }
        }   

        sheetList.put("CheckText:MultipleParameter", getTabs("CheckText:MultipleParameter", sheetList));
            sheetList.put("Login", getTabs("Login", sheetList));
        fis.close();
        book.close();
    } catch (Exception e) { 
        Report.reportErrors("Error: Excel dataset's path is not found : " + path + " or dataset is not well formed. " +
        "Check dataset for non-existent path or empty rows and cells");
    }
    if (!check) {
        return null;
    }
    return sheetList;
}

    public static String getCellValue(XSSFCell cell, SimpleDateFormat sdf, XSSFWorkbook book) {
    CellType CellType = cell.getCellType();
    if (CellType == CellType.FORMULA) {
        CellType = cell.getCachedFormulaResultType();
    }
    switch (CellType) {
    case STRING:
        return cell.getRichStringCellValue().getString();
    case NUMERIC:
        String value;
        if(DateUtil.isCellDateFormatted(cell)) {
            value = sdf.format(cell.getDateCellValue()).toString();
        } else {
            DataFormatter df = new DataFormatter();
            FormulaEvaluator evaluator = book.getCreationHelper().createFormulaEvaluator();
            value = df.formatCellValue(cell, evaluator);
        }
        return value;
    case BOOLEAN:
        return String.valueOf(cell.getBooleanCellValue());
    default:
        logger.warning("Check if " + cell + "content is correct");
        return cell.getStringCellValue() != null ? cell.getStringCellValue() : cell.getErrorCellString();
    }
}

    static ArrayList getTabs(String tabString, HashMap<String, ArrayList<HashMap<String, String>>> sheetList) {
        String[] tabs = tabString.split(":");
        ArrayList<HashMap<String, String>> rowList = new ArrayList();
        if (validateExcel(0, sheetList, tabs, "")) {
            rowList = getRows(tabs, rowList, sheetList);
        } else {
            check = false;
        }
        return rowList;
    }
    
    static ArrayList getRows(String[] tabs, ArrayList<HashMap<String, String>> rowList, HashMap<String, ArrayList<HashMap<String, String>>> sheetList) {
        ArrayList<HashMap<String, String>> newRows = new ArrayList();
        for (int i = 0; i < sheetList.get(tabs[0]).size(); i++) {
            HashMap<String, String> newRow = new HashMap();
            for (String tab : tabs) {
                Iterator<String> iterator = sheetList.get(tab).get(i).keySet().iterator();
                while (iterator.hasNext()) {
                    String key = iterator.next();
                    if (!validateExcel(1, sheetList, tabs, sheetList.get(tab).get(i).get(key).toString())) {
                        check = false;
                    }
                    newRow.put(key, sheetList.get(tab).get(i).get(key).toString());
                }
            }
            newRows.add(newRow);
        }
        return newRows;
    }

    static boolean validateExcel(int validation, HashMap<String, ArrayList<HashMap<String, String>>> sheetList, String[] tabs, String valueCol) {
        switch (validation) {
            case 0:
                for (int i = 0; i < tabs.length; i++) {
                    if (sheetList.get(tabs[0]).size() != sheetList.get(tabs[i]).size()) {
                        logger.warning("Data sheets do not have the same number of rows");
                        return false;
                    }
                }
                break;
            case 1:
                if (valueCol == "") {
                    logger.warning("Some columns in data sheet are empty");
                    return false;
                }
                break;
            default:
                Report.reportErrors("Can't find data sheet file");
                return false;
        }
        return true;
    }
    
    public static boolean isElementEnabled(WebElement x, WebDriver driver) {
        turnOffImplicitWaits(driver);
        boolean result = x.isEnabled();
        turnOnImplicitWaits(driver);
        return result;
    }

    private static void turnOffImplicitWaits(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

    private static void turnOnImplicitWaits(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static String generateJSONBody (String JSONPath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(JSONPath)));
    }

    public static Handler initHandler() {
        return new Handler() {
            @Override
            public void publish(LogRecord record) {
                if (getFormatter() == null) {
                    setFormatter(new SimpleFormatter());
                }

                try {
                    String message = getFormatter().format(record);
                    if (record.getLevel().intValue() >= Level.WARNING.intValue()) {
                        System.err.write(message.getBytes());
                    } else {
                        System.out.write(message.getBytes());
                    }
                } catch (Exception exception) {
                    reportError(null, exception, ErrorManager.FORMAT_FAILURE);
                }
            }

            @Override
            public void close() throws SecurityException {
            }

            @Override
            public void flush() {
            }
        };
    }

    public static Logger logger() {
        for (Handler handler : logger.getHandlers()) {
            logger.removeHandler(handler);
        }
        logger = Logger.getLogger(Launcher.class.getName());
        logger.setUseParentHandlers(false);
        logger.addHandler(consoleHandler);
        return logger;
    }

    public static Class getReflective(String classRoute) {
        Class reflectiveClass = null;
        try {
            Object reflective = Class.forName(classRoute).newInstance();
            reflectiveClass = reflective.getClass();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            Report.reportErrors(e.getMessage());
        }
        return reflectiveClass;
    }

    /**
     * Reads and convert to lower cases the SCREENSHOT property of the config.properties file
     * @return String
     * @throws Exception 
     */
    public String configScreenshot() throws Exception {
        getConfigProperties();
        List<String> options = Arrays.asList("always", "only", "never");
        String screenshot = prop.getProperty("SCREENSHOT");
        int spacePosition = screenshot.indexOf(" ");
        String result = screenshot.toLowerCase();

        if (spacePosition > 0) {
            result = result.substring(0, spacePosition);
        }

        if (!options.contains(result)) throw new Exception ("The option of the variable SCREENSHOT in the file config.properties is not correct. "
				+ "It must contain one of these options: Always, Only on error or Never");

        return result;
    }

    public static ArrayList<String> getTestCasesSelected() throws Exception {
    ArrayList<String> testCasesSelected = new ArrayList<String>();
    getConfigProperties();
    if (!prop.getProperty("TESTSUITES").isEmpty() || !prop.getProperty("TESTCASES").isEmpty()) {

        if (!prop.getProperty("TESTSUITES").isEmpty()) {
            String[] testSuites = prop.getProperty("TESTSUITES").split(", | |,");
            for (String suite : testSuites) {
                String nameSuite = suite.substring(0, 1).toLowerCase() + suite.substring(1);
                testCasesSelected = getTestCases(nameSuite, testCasesSelected);
            }
        }

        if(!prop.getProperty("TESTCASES").isEmpty()) {
            String[] testCases = prop.getProperty("TESTCASES").split(", | |,");
            for (String testCase : testCases) {
                ArrayList<String> listTestCases = new ArrayList<String>();
                boolean testCaseExist = false;
                String nameCase = testCase.substring(0, 1).toUpperCase() + testCase.substring(1);

                listTestCases = getTestCases("complete", listTestCases);
                for (String listCase : listTestCases) {
                    if (listCase.contains(nameCase)) {
                        testCasesSelected.add(listCase);
                        testCaseExist = true;
                    }
                }
                if (!testCaseExist) {
                    throw new Exception ("The TestCase " + nameCase + " does not exist");
                }
            }
        }

    } else {
        testCasesSelected = getTestCases("complete", testCasesSelected);
    }

    return testCasesSelected;
}

    public static ArrayList<String> getTestCases(String option, ArrayList<String> testCases) throws Exception {
        switch (option) {
            case "regressionCADActions":
            	testCases.add("com.dedalow.regressionCADActions.Test_PSFUEND02E0108");
			
            break;
			case "regressionOtherActions":
            	testCases.add("com.dedalow.regressionOtherActions.Test_PSFUEND02E0109");
				testCases.add("com.dedalow.regressionOtherActions.Test_PSFUEND02E0111");
				testCases.add("com.dedalow.regressionOtherActions.Test_PSFUEND02E0110");
			
            break;
			case "regressionOther":
            	testCases.add("com.dedalow.regressionOther.Test_PSFUEND02E0106");
				testCases.add("com.dedalow.regressionOther.Test_PSFUEND02E0105");
				testCases.add("com.dedalow.regressionOther.Test_PSFUEND02E0107");
			
            break;
			case "regressionCAD":
            	testCases.add("com.dedalow.regressionCAD.Test_PSFUEND02E0104");
			
            break;
			case "release5":
            	testCases.add("com.dedalow.release5.Test_PSFUEND02E0113");
				testCases.add("com.dedalow.release5.Test_PSFUEND02E0112");
			
            break;
			case "release6":
            	testCases.add("com.dedalow.release6.Test_PSFUEND02E0114");
			
            break;
			case "regresionCustomAction":
            	testCases.add("com.dedalow.regresionCustomAction.Test_PSFUEND02E0115");
				testCases.add("com.dedalow.regresionCustomAction.Test_PSFUEND02E0117");
				testCases.add("com.dedalow.regresionCustomAction.Test_PSFUEND02E0116");
			
            break;
			
            case "complete":
                	testCases.add("com.dedalow.regressionCADActions.Test_PSFUEND02E0108");
				testCases.add("com.dedalow.regressionOtherActions.Test_PSFUEND02E0109");
				testCases.add("com.dedalow.regressionOtherActions.Test_PSFUEND02E0111");
				testCases.add("com.dedalow.regressionOtherActions.Test_PSFUEND02E0110");
				testCases.add("com.dedalow.regressionOther.Test_PSFUEND02E0106");
				testCases.add("com.dedalow.regressionOther.Test_PSFUEND02E0105");
				testCases.add("com.dedalow.regressionOther.Test_PSFUEND02E0107");
				testCases.add("com.dedalow.regressionCAD.Test_PSFUEND02E0104");
				testCases.add("com.dedalow.release5.Test_PSFUEND02E0113");
				testCases.add("com.dedalow.release5.Test_PSFUEND02E0112");
				testCases.add("com.dedalow.release6.Test_PSFUEND02E0114");
				testCases.add("com.dedalow.regresionCustomAction.Test_PSFUEND02E0115");
				testCases.add("com.dedalow.regresionCustomAction.Test_PSFUEND02E0117");
				testCases.add("com.dedalow.regresionCustomAction.Test_PSFUEND02E0116");
			
                break;
            default:
                throw new Exception ("The TestSuite " + option + " does not exist");
        }

        return testCases;
    }

    public static void tearDown(Class reflectiveClass) {
    try {
        String finalResult = (String) reflectiveClass.getField("finalResult").get(reflectiveClass);
        String suiteName = (String) reflectiveClass.getField("suiteName").get(reflectiveClass);
        String caseName = (String) reflectiveClass.getField("caseName").get(reflectiveClass);
        Constant constant = (Constant) reflectiveClass.getField("constant").get(reflectiveClass);
        
        constant.results.add(finalResult);
        Report.addResults(suiteName, caseName, constant.results);
        constant.initialize.flush();
        for (Map.Entry<String, WebDriver> context : constant.contextsDriver.entrySet()) {
            if (!context.getValue().toString().contains("Firefox")) {
                context.getValue().close();
            }
            context.getValue().quit();
        }
        constant.contextsDriver.clear();
    } catch (Exception e) {
        Report.reportErrors(e.getMessage());
    }
}

    public static void finalReports(Class reflectiveClass, boolean screenShot) {
    try {
        String suiteName = (String) reflectiveClass.getField("suiteName").get(reflectiveClass);
        String caseName = (String) reflectiveClass.getField("caseName").get(reflectiveClass);

        Report.reportExcel(reflectiveClass);
           
    } catch (Exception e) {
        Report.reportErrors(e.getMessage());
    }
}

    public static Boolean checkDownload(Class reflectiveClass, String path,
		Integer directoryLength, File directoryPath) throws Exception {
		long start = System.currentTimeMillis();
		long end = start + Long.parseLong(prop.getProperty("WEB_TIMEOUT"))*1000;

		while (System.currentTimeMillis() <= end) {
			if (directoryLength != directoryPath.listFiles().length) {
				if (!checkFilesExtension(directoryPath, ".crdownload")) {
					Report.reportLog(reflectiveClass, "File downloaded in " + path, "INFO", 0, Status.PASS, false, "", "",
							null);
					 return true;
				}
			}
		}

		Report.reportLog(reflectiveClass, "Reached timeOut. Specify more time in config.properties file", "INFO", 0,
				Status.FAIL, false, "", "", null);

		return false;
	}

    public static Boolean checkFilesExtension (File directoryPath, String extension) {

    	File[] files  = directoryPath.listFiles();
    	Arrays.sort(files, Comparator.comparingLong(File::lastModified).reversed());

		return files[0].toString().endsWith(extension) || files[0].toString().endsWith(".tmp");
    }

    public static void setEncoding() {
		try {
			System.setProperty("file.encoding", "UTF-8");
			Field charset = Charset.class.getDeclaredField("defaultCharset");
			charset.setAccessible(true);
			charset.set(null, null);
		} catch (Exception e) {
			Report.reportErrors(e.getMessage());
		}
	}

}
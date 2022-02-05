package com.dedalow.customActions;


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

public class OracleBefore {

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
     * @param driver
	 * @throws Exception
     */
	public OracleBefore(WebDriver driver) throws Exception {
    	PageFactory.initElements(driver, this);
		this.driver = driver;
		js = (JavascriptExecutor) driver;
    }
    
    /**
     * Test variables Prepare the different variables that the user can use to
	 * develop the OracleBefore
     * @param reflectiveClass
     */
    public void getPrepareOracleBefore(Class reflectiveClass) throws Exception {
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
	// The sample demonstrates UCP as client side connection pool.
	// Reference: https://www.oracle.com/es/database/technologies/develop-java-apps-using-jdbc.html
	public void UCPSample() {
    	// User variables
        String DB_URL="jdbc:oracle:thin:@127.0.0.1:1521:ORCL18";
        String DB_USER = "system";
        String DB_PASSWORD = "Welcome_1";
        String CONN_FACTORY_CLASS_NAME="oracle.jdbc.pool.OracleDataSource";
        
		// Get the PoolDataSource for UCP
	    PoolDataSource pds = PoolDataSourceFactory.getPoolDataSource();
	    
	    // Set the connection factory first before all other properties
	    try {
			pds.setConnectionFactoryClassName(CONN_FACTORY_CLASS_NAME);
			pds.setURL(DB_URL);
			pds.setUser(DB_USER);
			pds.setPassword(DB_PASSWORD);
			pds.setConnectionPoolName("JDBC_UCP_POOL");
			
			// Default is 0. Set the initial number of connections to be created
		    // when UCP is started.
		    pds.setInitialPoolSize(5);
		    
		    // Default is 0. Set the minimum number of connections
		    // that is maintained by UCP at runtime.
		    pds.setMinPoolSize(5);
		    
		    // Default is Integer.MAX_VALUE (2147483647). Set the maximum number of
		    // connections allowed on the connection pool.
		    pds.setMaxPoolSize(20);
		    
		    // Default is 30secs. Set the frequency in seconds to enforce the timeout
		    // properties. Applies to inactiveConnectionTimeout(int secs),
		    // AbandonedConnectionTimeout(secs)& TimeToLiveConnectionTimeout(int secs).
		    // Range of valid values is 0 to Integer.MAX_VALUE. .
		    pds.setTimeoutCheckInterval(5);
		    
		    // Default is 0. Set the maximum time, in seconds, that a
		    // connection remains available in the connection pool.
		    pds.setInactiveConnectionTimeout(10);
		    
		    // Get the database connection from UCP.
		    try (Connection conn = pds.getConnection()) {
		      System.out.println("Available connections after checkout: "
		          + pds.getAvailableConnectionsCount());
		      System.out.println("Borrowed connections after checkout: "
		          + pds.getBorrowedConnectionsCount());
		      // Perform a database operation
		      doSQLWork(conn);
		    } catch (SQLException e) {
		        System.out.println("UCPSample - " + "SQLException occurred : "
		                + e.getMessage());
		    }
		    System.out.println("Available connections after checkin: "
		    		+ pds.getAvailableConnectionsCount());
	        System.out.println("Borrowed connections after checkin: "
	        		+ pds.getBorrowedConnectionsCount());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Creates an EMP table and does an insert, update and select operations on the new table created.
	public void doSQLWork(Connection conn) {
		try {
			conn.setAutoCommit(false);
			// Prepare a statement to execute the SQL Queries.
			Statement statement = conn.createStatement();
			// Create table EMP
			statement.executeUpdate("create table EMP(EMPLOYEEID NUMBER,"
					+ "EMPLOYEENAME VARCHAR2 (20))");
			System.out.println("New table EMP is created");
			// Insert some records into the table EMP
			statement.executeUpdate("insert into EMP values(1, 'Jennifer Jones')");
			statement.executeUpdate("insert into EMP values(2, 'Alex Debouir')");
			System.out.println("Two records are inserted.");
			
			// Update a record on EMP table.
			statement.executeUpdate("update EMP set EMPLOYEENAME='Alex Deborie'"
					+ " where EMPLOYEEID=2");
			System.out.println("One record is updated.");
			
			// Verify the table EMP
			ResultSet resultSet = statement.executeQuery("select * from EMP");
			System.out.println("New table EMP contains:");
			System.out.println("EMPLOYEEID" + " " + "EMPLOYEENAME");
			System.out.println("--------------------------");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2));
			}
			System.out.println("Successfully tested a connection from UCP");
		} catch (SQLException e) {
	      System.out.println("UCPSample - "
	    		  + "doSQLWork()- SQLException occurred : " + e.getMessage());
        } finally {
        	// Clean-up after everything
            try (Statement statement = conn.createStatement()) {
              statement.execute("drop table EMP");
            } catch (SQLException e) {
				System.out.println("UCPSample - "
						+ "doSQLWork()- SQLException occurred : " + e.getMessage());
			}
        }
	}
     
     
    /**
     * Class method called from the TestCase thread. Add inside the order of funcions calls desired
     * @param reflectiveClass
	 * @throws Exception
     */
    public void doOracleBefore(Class reflectiveClass) throws Exception {
    	getPrepareOracleBefore(reflectiveClass);
		// All functions designed in this class and not included as a call in this method will be ignored during test execution
        
        // Lift Docker with the Oracle image to run this function
        // UCPSample();
		Report.reportLog(reflectiveClass, "The Oracle template is generated correctly", "INFO", 0, Status.PASS, false, "", "", null);
    }
    
    /**
     * Class method called from the TestCase thread. Add inside the order of funcions calls desired.
	 * With use of the HashMap of variables.
     * @param reflectiveClass
     * @param variables
	 * @throws Exception
     */
    public void doOracleBefore(Class reflectiveClass, HashMap<String, String> variables) throws Exception {
    	getPrepareOracleBefore(reflectiveClass);
        // All functions designed in this class and not included as a call in this method will be ignored during test execution
        Report.reportLog(reflectiveClass, "NOTE, this message does not have to appear in the logs.", "INFO", 0, Status.PASS, false, "", "", null);
    }
}
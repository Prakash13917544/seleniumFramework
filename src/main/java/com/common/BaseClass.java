package com.common;
import org.openqa.selenium.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.utilities.BrowserFactory;
import com.utilities.ConfigFileReader;
import com.utilities.ExcelReader;

import io.github.bonigarcia.wdm.WebDriverManager;

 
public class BaseClass {
	
	public static  WebDriver driver;
	//public static Properties prop = new Properties();
	public static FileReader fr;
	public static ExcelReader excelData;
	public static ConfigFileReader configfileReader;
	public static ExtentReports extent;
    public static ExtentTest test;

	
	@BeforeTest
	public void init() {
		
		try {
			
			
			excelData = new ExcelReader();
			configfileReader=new ConfigFileReader();
			
			
			// Create the ExtentSparkReporter object and set the output path for the report
	        ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport/extentReport.html");
	        spark.config().setReportName("My Automation Test Report");
	        spark.config().setDocumentTitle("My OrangeHRM Execution Report");
	        spark.config().setTheme(Theme.STANDARD);
	        // Create the ExtentReports object and attach the Spark Reporter
	        extent = new ExtentReports();
	        extent.attachReporter(spark);
	       
	        extent.setSystemInfo("OS", "Windows");
	        extent.setSystemInfo("Browser", configfileReader.getBrowser());
	        
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
    @BeforeClass
    public static void setup() throws Exception {
    	
	
		/*
		 * if(driver==null) { File filepath=new File(System.getProperty("user.dir")+
		 * "\\src\\test\\resources\\Configuration.properties"); FileInputStream fis =new
		 * FileInputStream(filepath); prop.load(fis); }
		 * 
		 * 
		 * if(prop.getProperty("browserchrome").equalsIgnoreCase("Chrome")) {
		 * WebDriverManager.chromedriver().setup();
		 * //System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\prakash.pampanagowda\\Documents\\chromedriver.exe"); driver=new
		 * ChromeDriver(); driver.get(prop.getProperty("url")); }
		 */
		/*
		 * if(prop.getProperty("browseredge").equalsIgnoreCase("edge")) {
		 * WebDriverManager.edgedriver().setup();
		 * //System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\prakash.pampanagowda\\Documents\\chromedriver.exe"); driver=new
		 * EdgeDriver(); driver.get(prop.getProperty("url")); }
		 */
    	
		/*
		 * if(prop.getProperty("url").equalsIgnoreCase("url")) { File filepath=new File(
		 * "C:\\Users\\prakash.pampanagowda\\eclipse-workspace\\seleniumframework\\src\\test\\resources\\Configuration.properties"
		 * ); FileInputStream fis =new FileInputStream(filepath); prop.load(fis); }
		 */
    	
    	if(driver==null) {
    		driver=BrowserFactory.getDriver();
    		driver.get(configfileReader.getURL());
    	}
    	
		
			
	}
    
    
    
    @AfterTest
    public void tearDown() {
        // Write the report
        extent.flush();
    }

}

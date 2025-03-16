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
import com.utilities.PropertiesOperation;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

 
public class BaseClass {
	
	public static  WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;
	
	/*
	 * public BaseClass(WebDriver driver) { this.driver=driver;
	 * PageFactory.initElements(driver, this); }
	 */
	

    @BeforeClass
    public static void setup() throws Exception {
    	
    	
		
		 if(driver==null) { File filepath=new File(System.getProperty("user.dir")+
		 "\\src\\test\\resources\\Configuration.properties"); FileInputStream fis =new
		 FileInputStream(filepath); prop.load(fis); }
		 
    	
    	if(prop.getProperty("browserchrome").equalsIgnoreCase("Chrome")) {
    	WebDriverManager.chromedriver().setup();
    	//System.setProperty("webdriver.chrome.driver","C:\\Users\\prakash.pampanagowda\\Documents\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));	    
    	}
    	
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
		
			/*
			 * // TODO Auto-generated method stub //ChromeDriverService service=new
			 * ChromeDriverService.Builder() //.usingDriverExecutable(new
			 * File("C:\\Users\\prakash.pampanagowda\\Documents\\chromedriver.exe")).build()
			 * ;
			 * 
			 * System.setProperty("webdriver.chrome.driver",
			 * "C:\\Users\\prakash.pampanagowda\\Documents\\chromedriver.exe"); WebDriver
			 * driver=new ChromeDriver(); driver.manage().window().maximize();
			 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //String
			 * url=PropertiesOperation.getPropertyByValueBykey("url"); //driver.get(url);
			 * driver.get(
			 * "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			 */

	}

}

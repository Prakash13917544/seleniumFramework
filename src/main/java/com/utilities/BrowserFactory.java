package com.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	public static ConfigFileReader configFileReader;
	public static WebDriver driver;
	
	
	public static WebDriver getDriver() {
		
		configFileReader=new ConfigFileReader();
		
		switch(configFileReader.getBrowser()) {
		
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			return driver;  		
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			return driver;
					
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			return driver;	
			
		default :
				System.out.println("Correct Driver Name is not found in Properties File..");
			   return null;
		}
		
		
	}
	
	
	
	
}

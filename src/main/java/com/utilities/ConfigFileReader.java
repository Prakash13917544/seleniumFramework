package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
		public Properties prop;
		public String filepath="C:\\Users\\prakash.pampanagowda\\eclipse-workspace\\seleniumframework\\src\\test\\resources\\Configuration.properties";
		public FileInputStream fis;	
		
		
		public ConfigFileReader(){
			
				prop = new Properties();
				
				File file=new File(filepath);
				
				try {
					fis = new FileInputStream(file);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("File is not present to read"+e.getMessage());
				}
				
				try {
					prop.load(fis);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("File is not loaded to parse "+e.getMessage());
					e.printStackTrace();
					
				}
			
			
		}
		
		
		public String getURL() {
			return prop.getProperty("url");
		}
		
		public String getBrowser() {
			return prop.getProperty("BrowserName");
		}
		
		public String getTestDataPath() {
			return prop.getProperty("TestDataPath");
		}
		
	
		public String getUsername() {
			
			return prop.getProperty("username");
		}		
		
		public String getPassword() {
			
			return prop.getProperty("password");
		}	
		
		
}	
   
	



package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesOperation {
	
	public static void  main(String[] Arges) throws IOException {
	
	Properties properties = new Properties();
	File filepath=new File("C:\\Users\\prakash.pampanagowda\\eclipse-workspace\\seleniumframework\\src\\test\\resources\\Configuration.properties");
	FileInputStream fis =new FileInputStream(filepath);
	properties.load(fis);
	String url=properties.getProperty("url");
	String browser=properties.getProperty("browser");
	
	System.out.println(url);
	System.out.println(browser);
	System.out.println(System.getProperty("user.dir"));
	
}
}	
   
	



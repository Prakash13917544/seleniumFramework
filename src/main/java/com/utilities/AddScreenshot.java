package com.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class AddScreenshot {
	
	
	 // Method to capture screenshot and return the file path
	
    public static String captureScreenshot(String screenshotName,WebDriver driver) {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenshotPath = "Screenshots/" + screenshotName + getCurrentDate()+".png";
        try {
            FileHandler.copy(screenshot, new File(screenshotPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return screenshotPath;
    }

    
    
	public static String getCurrentDate() {

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yyyy_HH_MM_SS");
		String strDate = formatter.format(date);
		
		
		return strDate;
	}
	
	

}

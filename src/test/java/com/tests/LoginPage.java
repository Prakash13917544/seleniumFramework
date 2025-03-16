package com.tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.common.BaseClass;
import com.pagesobjects.HomePageAdminSearchRecordsOjects;
import com.pagesobjects.LoginPageObjects;
import com.utilities.AddScreenshot;
import com.utilities.ExcelReader;





public class LoginPage extends BaseClass{
	
	@Test
	public  static void testlogin() throws InterruptedException
	   {
		 
		test = extent.createTest("Login Page Validation ");
        test.info(" Login Page Validation is Started:: ");
        Thread.sleep(5000);
        
        test.pass("Login Page",MediaEntityBuilder.createScreenCaptureFromPath(AddScreenshot.captureScreenshot("LoginPage_Screenshot",driver)).build());
        Thread.sleep(5000);
		LoginPageObjects loginobj =new LoginPageObjects(BaseClass.driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		loginobj.setUserName(excelData.getExcelData("login", 1, 0));
		test.pass(" User able to enter valid username :: "+ excelData.getExcelData("login", 1, 0));
		       
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginobj.setPassword(excelData.getExcelData("login", 1, 1));
		
		
		test.pass(" User able to enter valid password :: "+ excelData.getExcelData("login", 1, 1));
		loginobj.clickLogin();
		test.pass(" User able to click on login btn :: ");
		// Add some test steps
        test.pass("Login successfully and Login Page Validation is Passed");
        Thread.sleep(8000);
       
        test.pass("DashBoard Page",MediaEntityBuilder.createScreenCaptureFromPath(AddScreenshot.captureScreenshot("Dashboard_Screenshot",driver)).build());
       
		
		/*
		 * WebElement sl=driver.findElement(By.xpath("//span[text()='Admin']"));
		 * sl.click();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * driver.findElement(By.xpath(
		 * "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]"
		 * )).click(); driver.findElement(By.
		 * xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]")).click(
		 * ); driver.findElement(By.xpath("(//div[.='Admin'])[1]")).click();
		 * driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).
		 * sendKeys("Ash Tyson"); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).
		 * sendKeys(Keys.DOWN);
		 * driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).
		 * sendKeys(Keys.ENTER); driver.findElement(By.
		 * xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]")).click(
		 * ); driver.findElement(By.xpath("(//div[.='Enabled'])[1]")).click();
		 * driver.findElement(By.xpath("//button[@type='submit']")).click();
		 */
		 
		
          }
}
	
	



package com.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.common.BaseClass;
import com.pagesobjects.HomePageAdminSearchRecordsOjects;
import com.pagesobjects.LoginPageObjects;





public class LoginPage extends BaseClass{
	
	@Test
	public void testlogin() throws InterruptedException
	   {
		LoginPageObjects loginobj =new LoginPageObjects(BaseClass.driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginobj.setUserName("Admin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginobj.setPassword("admin123");
		loginobj.clickLogin();
	
	
		
		
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
	
	



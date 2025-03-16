package com.pagesobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']")
	public WebElement profile;
	
	@FindBy(xpath="//a[text()='Logout']")
	public WebElement logout;
	
	
	public LogoutPage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void logoutValidation() {
		
		profile.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		logout.click();
	}
	
	
	
	
	
	
	
	

}

package com.pagesobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.common.BaseClass;
import com.tests.HomePage_Admin_SearchRecords;
public class LoginPageObjects {
	
	public  WebDriver driver;
	
	@FindBy(name="username")
	public WebElement unbtn;
	
	@FindBy(name="password")
	public  WebElement pwbtn;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement lgbtn;
	
	public LoginPageObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 
	
	public  void setUserName(String username) {
		unbtn.sendKeys(username);
	}	
	public  void setPassword(String password) {
		pwbtn.sendKeys(password);
	   
   }
	
	/*
	 * public HomePageAdminSearchRecordsOjects clickLogin() { lgbtn.click(); return
	 * new HomePageAdminSearchRecordsOjects(this.driver);
	 * 
	 * }
	 */
	
	public  void  clickLogin() {
		lgbtn.click();
		
		
	}
	
	
}


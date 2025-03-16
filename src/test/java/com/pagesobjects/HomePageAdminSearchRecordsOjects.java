package com.pagesobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageAdminSearchRecordsOjects {
	
public  WebDriver driver;
	


     @FindBy(xpath = "//span[text()='Admin']")
     public WebElement adminbtn;
     
	 @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
     public WebElement userroleclk;
	 
	 @FindBy(xpath = "(//div[.='Admin'])[1]")
	 
     public WebElement userroleselect;
	 
	 @FindBy(xpath = "//input[@placeholder='Type for hints...']")
     public WebElement userinput;

     
     @FindBy(xpath = "//input[@placeholder='Type for hints...']")
     public WebElement arrowdown;
	 
     @FindBy(xpath = "//input[@placeholder='Type for hints...']")
     public WebElement arrowenter;
     
     
	 @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
     public WebElement statusclick;
	 
	 @FindBy(xpath = "(//div[.='Enabled'])[1]")
	 public WebElement stabtn;
	
	 @FindBy(xpath = "//button[@type='submit']")
	 public WebElement searchbtn;
	
	public HomePageAdminSearchRecordsOjects(WebDriver driver) {
		System.out.println(driver);
		this.driver=driver;
		System.out.println(this.driver);
		PageFactory.initElements(driver, this);
		
	}
	
	
	public  void adminclick(){
		adminbtn.click();
	}	
	
	public  void userRoleclick(){
		userroleclk.click();
	}
	
	public  void userRoleSelect(){
		userroleselect.click();
	}
	
	public  void userInput(){
		userinput.sendKeys("Ash Tyson");
	}
	
	public  void keyDoown(){
		arrowdown.sendKeys(Keys.DOWN);
	}
	
	public  void keyEnter(){
		arrowdown.sendKeys(Keys.ENTER);
	}
	
	
	public  void statusClick(){
		statusclick.click();
	}
	
	public  void statusSelect(){
		stabtn.click();
	}
	
	public  void serachbuttonClick(){
		searchbtn.click();
	}
		

}


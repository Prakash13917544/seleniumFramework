package com.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.common.BaseClass;
import com.pagesobjects.HomePageAdminSearchRecordsOjects;

public class HomePage_Admin_SearchRecords extends BaseClass{
	
	
	@BeforeMethod
	public void clear()
	{
		try {
			LoginPage.testlogin();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void TestSearchRecords() throws InterruptedException
	
	   {
        HomePageAdminSearchRecordsOjects hmobjest=new HomePageAdminSearchRecordsOjects(BaseClass.driver);	
		hmobjest.adminclick();
		hmobjest.userRoleclick();
		hmobjest.userRoleSelect();
		hmobjest.userInput();
		Thread.sleep(6000);
		hmobjest.keyDoown();
		Thread.sleep(6000);
		hmobjest.keyEnter();
		hmobjest.statusClick();
		hmobjest.statusSelect();
		hmobjest.serachbuttonClick();		
	   }
	
	@AfterMethod
	public void closeUp()
	{
		if(driver!=null)
			driver.quit();
	}
	
}


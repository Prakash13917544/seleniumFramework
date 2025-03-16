package com.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.common.BaseClass;
import com.pagesobjects.HomePageAdminSearchRecordsOjects;

public class HomePage_Admin_SearchRecords extends BaseClass{
	

	@Test
	
	public void TestSearchRecords() throws InterruptedException
	
	   {
        System.out.println(BaseClass.driver);
        LoginPage obj=new LoginPage();
        obj.testlogin();
        //HomePageAdminSearchRecordsOjects hmobjest= obj.testlogin();
        System.out.println(BaseClass.driver);
        HomePageAdminSearchRecordsOjects hmobjest=new HomePageAdminSearchRecordsOjects(BaseClass.driver);
			
		hmobjest.adminclick();
		hmobjest.userRoleclick();
		hmobjest.userRoleSelect();
		hmobjest.userInput();
		Thread.sleep(5000);
		hmobjest.keyDoown();
		hmobjest.keyEnter();
		hmobjest.statusClick();
		hmobjest.statusSelect();
		hmobjest.serachbuttonClick();		
}
}


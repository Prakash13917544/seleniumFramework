package com.tests;

import java.time.Duration;

import org.testng.annotations.Test;

import com.common.BaseClass;
import com.pagesobjects.LogoutPage;

public class LogoutTest extends BaseClass{
	
	
	@Test
	public static void  logoutTest() {
		LogoutPage lgout=new LogoutPage(BaseClass.driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		lgout.logoutValidation();
	}

}

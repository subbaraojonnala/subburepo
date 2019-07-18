package com.tests;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import util.TestUtil;

public class LoginTest extends BaseClass{
	

	
		
@Test  (description = "This TC will perorm valid logins")
	
	public void loginToApplication()  {
		
	//setupApplication();
		

		driver.findElement(By.id("username")).sendKeys(prop.getProperty("Username"));
		
		TestUtil.captureScreenshot(driver, "After Username2");
		
driver.findElement(By.id("password")).sendKeys(prop.getProperty("Password"));

TestUtil.captureScreenshot(driver, "After Password2");

driver.findElement(By.className("btn")).click();

TestUtil.captureScreenshot(driver, "After Login2");
System.out.print(driver);
System.out.println("muskoni ra");
			
	}
	
	


}

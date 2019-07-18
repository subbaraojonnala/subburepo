package com.tests;



import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Customers extends 	BaseClass {
		
	
		
@Test (description = "This TC will perorm Customers adding From custoemr form")
			
	public void customerform() {
	System.out.println("tinupo");
	
	//driver.findElement(By.xpath("//a[@class='nav-link'][@href='/company/companies'")).click();
	
	 driver.findElement(By.xpath("//a[@className['nav-link'][@href='/company/companies']")).click();
	
		
		driver.findElement(By.id("add-company")).click();
	
		//driver.findElement(By.xpath("	//*[@id=\"add-company\"]")).click();

		driver.findElement(By.id("name")).sendKeys("TNB4");

		driver.findElement(By.id("code")).sendKeys("TNB5");
		driver.findElement(By.id("pentaCode")).sendKeys("TNB6");

		/*
		 * driver.findElement(By.xpath(
		 * "/html/body/div[2]/main/div/div/div/div[2]/div/form/div[4]/div/span/span/span[1]"
		 * )) .click();
		 * 
		 * try { Thread.sleep(2000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * 
		 * List<WebElement> list = driver.findElements( By.xpath(
		 * "/html/body/div[2]/main/div/div/div/div[2]/div/form/div[4]/div/span/span/span[1]"
		 * ));
		 * 
		 * for (WebElement element : list) { System.out.println(element.getText()); if
		 * (element.getText().contains("Active")) {
		 * 
		 * element.click();
		 * 
		 * break; } }
		 * 
		 * driver.findElement(By.id("save-button")).click();
		 */

		System.out.println("Customerform_TC03");

	}
}

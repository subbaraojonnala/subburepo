package com.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;

import config.PropertiesFile;
import util.TestUtil;


public class BaseClass {
	
	public static WebDriver driver;
	Properties prop=new Properties();
	
	
@BeforeTest
	
	public void setupApplication()
	{
		
		System.setProperty("webdriver.gecko.driver", "D:\\test\\geckodriver-v0.24.0-win64\\geckodriver.exe");

		Reporter.log("=====Application Started======", true);

		 driver = new FirefoxDriver();
		 
		 TestUtil.captureScreenshot(driver, "BrowserStartedFirefox1");
		
		  prop = PropertiesFile.readPropertiesFile();
		  
			driver.get(prop.getProperty("URL"));
		
		
		TestUtil.captureScreenshot(driver, "AfterURL1");
		
	}


	

		
	}
	
	
	
	



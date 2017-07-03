package com.org.commonClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class browserUtility {
	
	public static WebDriver launchBrowser(String BrowserName)
		{		
		if(BrowserName.toLowerCase().contains("firefox"))
		{
			return new FirefoxDriver();
			
		}
		else {
			System.out.println("Please provide a valid browser name.");
			return null;
		}
		}
	
	public static void maximizeBrowser(WebDriver driver)
		{
		driver.manage().window().maximize();
		}
	
	

}

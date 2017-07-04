package com.org.commonClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class browserUtility {
	
	public static WebDriver driver;
	
	public void launchBrowser(String BrowserName,String URL)
		{		
		if(BrowserName.toLowerCase().contains("firefox"))
		{
			driver= new FirefoxDriver();
			
		}
		
		else if (BrowserName.toLowerCase().contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:/Users/r.singh1.AGILECOCKPIT/git/origin/drivers/chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		else
		{
			System.out.println("Please provide a valid browser name.");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(URL);
	}
	

	
	

}

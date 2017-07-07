package com.org.commonClasses;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import com.org.dataReadUtility.readProperties;

public class TestBase{
	
	public WebDriver driver;
	
	browserUtility browserFactory=new browserUtility();
	
	
	@BeforeMethod
	public void LaunchApplication(){
		
		driver=browserFactory.launchBrowser(readProperties.readTestConfig("browser"), readProperties.readTestConfig("url"));
		
	}
	
	@AfterMethod
	public void disposeDriver(){
		driver.quit();
	}

}

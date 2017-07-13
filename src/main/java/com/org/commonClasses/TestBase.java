package com.org.commonClasses;


import org.openqa.selenium.WebDriver;
import com.org.dataReadUtility.readProperties;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class TestBase{
	
	public static WebDriver driver;
	
	WebDriverUtility browserFactory=new WebDriverUtility();
	
	
	@Before
	public void LaunchApplication(){
		
		driver=browserFactory.launchBrowser(readProperties.readTestConfig("browser"));
		browserFactory.maximizeWindow();
		
	}
	
	@After
	public void disposeDriver(){
		driver.quit();
		driver=null;
	}

}

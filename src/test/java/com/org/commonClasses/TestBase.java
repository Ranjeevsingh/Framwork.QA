package com.org.commonClasses;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	browserUtility browserFactory=new browserUtility();
	
	@BeforeTest
	public void LaunchApplication(){
		
		browserFactory.launchBrowser("chrome", "https://live.agilecockpit.com");
		
	}
	
	@AfterTest
	public void disposeDriver(){
		browserUtility.driver.quit();
	}

}

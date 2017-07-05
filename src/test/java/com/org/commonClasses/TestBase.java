package com.org.commonClasses;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.gargoylesoftware.htmlunit.javascript.host.URL;
import com.org.dataReadUtility.readProperties;

public class TestBase {
	
	browserUtility browserFactory=new browserUtility();
	
	@BeforeTest
	public void LaunchApplication(){
		
		browserFactory.launchBrowser(readProperties.readTestConfig("browser"), readProperties.readTestConfig("url"));
		
	}
	
	@AfterTest
	public void disposeDriver(){
		browserUtility.driver.quit();
	}

}

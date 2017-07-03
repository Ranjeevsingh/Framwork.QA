package com.org.Functional.Tests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class GlobalConfig {
	
	@BeforeTest
	public void runApplication(){
		
		System.out.println("BeforeTest");
		
	}
	
	@AfterTest
	public void disposeDriver(){
		System.out.println("ÄfterTest");
	}

}

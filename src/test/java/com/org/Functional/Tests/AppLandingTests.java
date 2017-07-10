package com.org.Functional.Tests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.org.commonClasses.TestBase;
import com.org.pageFunctionLibrary.AppLandingPageMethods;


public class AppLandingTests extends TestBase{
	
	
	AppLandingPageMethods _appLandingPage;
	
	
	
	@Test
	public void CheckAppLandingPage() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "Agile Cockpit Identity Server");
	}
	
	
	@Test
	public void CheckSuccessfulLogin() {
		_appLandingPage=new AppLandingPageMethods(driver);
		_appLandingPage.loginToApplication("r.singh@prowareness.nl", "Nov@2017");
		Assert.assertEquals(driver.findElement(By.linkText("Me")).getText(),"Me");
	}

}

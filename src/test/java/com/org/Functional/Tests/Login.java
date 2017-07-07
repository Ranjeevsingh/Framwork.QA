package com.org.Functional.Tests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.org.appLandingPage.AppLandingPage;
import com.org.commonClasses.TestBase;


public class Login extends TestBase{
	AppLandingPage _appLandingPage;
	@Test
	public void CheckAppLandingPage() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "Agile Cockpit Identity Server");
	
	}
	@Test
	public void CheckSuccessfulLogin() {
		_appLandingPage=new AppLandingPage(driver);
		_appLandingPage.loginToApplication("r.singh@prowareness.nl", "Nov@2017");
		Assert.assertEquals(driver.findElement(By.linkText("Me")).getText(),"Me");
	}

}

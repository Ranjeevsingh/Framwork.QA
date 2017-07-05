package com.org.Functional.Tests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.org.commonClasses.browserUtility;

public class Login {
	
	@Test
	public void CheckAppLandingPage() {
		String title=browserUtility.driver.getTitle();
		Assert.assertEquals(title, "Agile Cockpit Identity Server");
	
	}
	@Test
	public void CheckSuccessfulLogin() {
		browserUtility.driver.findElement(By.name("UserName")).sendKeys("r.singh@prowareness.nl");
		browserUtility.driver.findElement(By.name("Password")).sendKeys("Nov@2017");
		browserUtility.driver.findElement(By.id("login-button")).click();
		Assert.assertEquals(browserUtility.driver.findElement(By.linkText("Me")).getText(),"Me");
	}

}

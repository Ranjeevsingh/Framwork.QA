package com.org.Functional.Tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.org.commonClasses.browserUtility;

public class Login {
	
	@Test
	public void LoginToApplication() {
		String title=browserUtility.driver.getTitle();
		Assert.assertEquals(title, "Agile Cockpit Identity Server");
	
	}

}

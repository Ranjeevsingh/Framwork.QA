package com.org.commonClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class waitUtility {
	public static void implicitWait(WebDriver driver, long seconds){
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
}

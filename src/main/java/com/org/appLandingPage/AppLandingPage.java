package com.org.appLandingPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AppLandingPage {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//input[@name='UserName']")
	WebElement txt_userName;
	
	@FindBy(how=How.XPATH,using="//input[@name='Password']")
	WebElement txt_password;
	
	@FindBy(how=How.XPATH,using="//input[@id='login-button']")
	WebElement button_login;
	
	public AppLandingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginToApplication(String userName, String password)
	{
		txt_userName.sendKeys(userName);
		txt_password.sendKeys(password);
		button_login.click();
	}
	

}

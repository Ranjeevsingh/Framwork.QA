package com.org.pageFunctionLibrary;

import org.openqa.selenium.WebDriver;
import com.org.pageControlsLibrary.AppLandingPageControls;

public class AppLandingPageMethods {
	
	WebDriver driver;
	AppLandingPageControls _appLandingPageControls=new AppLandingPageControls(driver);
	
/*	@FindBy(how=How.XPATH,using="//input[@name='UserName']")
	WebElement txt_userName;
	
	@FindBy(how=How.XPATH,using="//input[@name='Password']")
	WebElement txt_password;
	
	@FindBy(how=How.XPATH,using="//input[@id='login-button']")
	WebElement button_login;
	
	public AppLandingPageMethods(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}*/
	
	public AppLandingPageMethods(WebDriver driver) {
		this.driver=driver;
	}
	
	public void loginToApplication(String userName, String password)
	{
		_appLandingPageControls.txt_userName().sendKeys(userName);
		_appLandingPageControls.txt_password().sendKeys(password);
		_appLandingPageControls.button_login().click();
	}
	

}

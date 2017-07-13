package stepDefinitions;
import com.org.commonClasses.TestBase;
import com.org.pageFunctionLibrary.AppLandingPageMethods;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AppLandingPageStepDefinition{
	
	AppLandingPageMethods appLandingPageMethods=new AppLandingPageMethods(TestBase.driver);
	
	@Given("^I open application url$")
	public void i_open_application_url()
	{
		appLandingPageMethods.openApplication();
	}

	@Then("^I validate the user is on app landing page$")
	public void i_validate_the_user_is_on_app_landing_page()
	{
		appLandingPageMethods.validateLandingPageTitle();
	}
	

	@Then("^I validate user is successfully login to application$")
	public void i_validate_user_is_successfully_login_to_application()
	{
	     //appLandingPageMethods.CheckSuccessfulLogin();
		System.out.println("SX");
	}
	
	@When("^I login with user id (.*) and password (.*)$")
	public void i_login_with_user_id_and_password(String arg1, String arg2){
	    
	    System.out.println(arg1+" and "+arg2);
	    appLandingPageMethods.loginToApplication(arg1, arg2);
	}

}

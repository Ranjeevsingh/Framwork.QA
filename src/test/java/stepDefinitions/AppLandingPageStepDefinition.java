package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AppLandingPageStepDefinition {

	
	@Given("^I navigate to app landing page$")
	public void i_navigate_to_app_landing_page(){
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("SD1");
	}

	@Then("^I validate the user is on app landing page$")
	public void i_validate_the_user_is_on_app_landing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("SD2");
	}

}

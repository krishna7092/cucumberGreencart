package Stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class selectcountryandconfirmationpage {
	@When("user is on add a country {string} and accepted it")
	public void user_is_on_add_a_country_and_accepted_it(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("user is able to see the confirmation page {string}")
	public void user_is_able_to_see_the_confirmation_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("routed to home page successfully")
	public void routed_to_home_page_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	}
	
}

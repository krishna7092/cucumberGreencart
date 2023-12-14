package Stepdefinitions;

import org.openqa.selenium.WebDriver;

import Pageobject.Placeorder;
import Utils.InjectUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class placeorderpage {
	InjectUtils utils;
	Placeorder placeorder;
	public placeorderpage(InjectUtils utils) {
		// TODO Auto-generated constructor stub
		this.utils=utils;
		placeorder=utils.factory.placeorder;
		
	}

	@When("user able to see {string} and {int} at place order page")
	public void user_able_to_see_and_at_place_order_page(String string, int int1) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		placeorder.checkingbeforeplace(string, int1);
	}

	@Then("user able to apply code {string} and place the order")
	public void user_able_to_apply_code_and_place_the_order(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	}

}

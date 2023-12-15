package Stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pageobject.GreencartHome;
import Utils.InjectUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GreencartHomePage {
	
	InjectUtils utils;
	
	
	GreencartHome homepage;
	
	public GreencartHomePage(InjectUtils utils) {
		// TODO Auto-generated constructor stu
		this.utils=utils;
		homepage=utils.factory.greenhome;
	}
	
	
	@When("user is on home page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		utils.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}

	@Then("able to see lot of veggies and fruits")
	public void able_to_see_lot_of_veggies_and_fruits() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user want to check <vegatables> whether they are offer")
	public void user_want_to_check_vegatables_whether_they_are_offer(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    //throw new io.cucumber.java.PendingException();
	}

	
	
	
	@When("user want to add one {string} to cart with count {int}")
	public void user_want_to_add_one_vegatables_to_cart_with_count(String products,int count) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		homepage.oneproduct(products, count);
		
	}

	@Then("user able to add to cart and checkout")
	public void user_able_to_add_to_cart_and_checkout() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		homepage.addtocart();
		homepage.proceedtocheckout();
		
	}
	
	
	
	@When("^user typing invalid (.+)$")
	public void user_typing_invalid_vegatables(String invalidproducts) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println(invalidproducts);
		homepage.searchinhome(invalidproducts);
	}

	@Then("user able to see {string}")
	public void user_able_to_see(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		assertEquals(homepage.noproductisdisplayed(),string);
	}
    
	@Then("user selected few veggies and click deals links")
	public void user_selected_few_veggies_and_click_deals_links() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		
	}	


}

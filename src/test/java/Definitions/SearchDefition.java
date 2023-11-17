package Definitions;

import org.openqa.selenium.Keys;

import Actions.LoginPage;
import Actions.SearchAction;
import Locators.LoginLoc;
import Utility.HelperClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchDefition {
	
	SearchAction sa = new SearchAction();
	LoginLoc loc = new LoginLoc();
	LoginPage action = new LoginPage();

	@Given("launching the lenskart")
	public void launching_the_lenskart() {
		HelperClass.openPage("https://www.lenskart.com/");
	}
	

	@When("given the product name to search")
	public void given_the_product_name_to_search() {
	    sa.setSearch("eyeglasses",Keys.ENTER);
	}

	@Then("asserting the product user searched")
	public void asserting_the_product_user_searched() {
	   System.out.println("working");
	}
}



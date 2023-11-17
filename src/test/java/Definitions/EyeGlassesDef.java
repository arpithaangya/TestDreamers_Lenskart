package Definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import Actions.EyeGlassesAct;
import Utility.HelperClass;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EyeGlassesDef {
	WebDriver driver;
	EyeGlassesAct eyeaction = new EyeGlassesAct();

	@Given("User opens the lenskart webpage")
	public void user_opens_the_lenskart_webpage() {
		HelperClass.openPage("https://www.lenskart.com/");
		 
	  
	}

	@When("User clicks the eyeglasses")
	public void user_clicks_the_eyeglasses() {
		eyeaction.eyeglasses();
	 
	}

	@When("User clicks the view range")
	public void user_clicks_the_view_range() {
	   eyeaction.viewrange();
	}

	@When("User sorts the product by price:low to high")
	public void user_sorts_the_product_by_price_low_to_high() {
	   eyeaction.sortby();
	 
	}

	@When("Filter the frame type by full rim")
	public void filter_the_frame_type_by_full_rim() {
		 eyeaction.frametype();
	}

	@Then("Asserting the frame type to full rim")
	public void asserting_the_frame_type_to_full_rim() {
	   
	}

}

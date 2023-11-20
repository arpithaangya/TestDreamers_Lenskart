package Definitions;

import org.openqa.selenium.WebDriver;

import Actions.EyeGlassesAct;
import Actions.WishListAct;
import Utility.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WishListDef {
	WebDriver driver;
	WishListAct wishaction = new WishListAct();
	EyeGlassesAct eyeaction = new EyeGlassesAct();

	

@Given("User opens the lenskart Webpage")
public void user_opens_the_lenskart_webpage() {
	HelperClass.openPage("https://www.lenskart.com/");
   
}

@When("User clicks the eyeglasses category")
public void user_clicks_the_eyeglasses_category() {
	 eyeaction.eyeglasses();
   
}

@When("User clicks product")
public void user_clicks_product() {

	wishaction.Specs();
   
}

@When("User adds to wish list")
public void user_adds_to_wish_list() {
	wishaction.Wishlist();
  
}

@When("User Clears the WishList")
public void user_clears_the_wish_list() {
	wishaction.Clearlist();
 
}

@Then("Asserting the WishList")
public void asserting_the_wish_list() {
  
}





}

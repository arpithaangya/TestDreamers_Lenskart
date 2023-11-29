package Definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Actions.EyeGlassesAct;
import Actions.WishListAct;
import Locators.WishListLoc;
import Utility.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WishListDef {
	WebDriver driver;
	WishListAct wishaction = new WishListAct();
	EyeGlassesAct eyeaction = new EyeGlassesAct();

HelperClass base ;

@Given("User opens the lenskart Webpage")
public void user_opens_the_lenskart_webpage() {
HelperClass.openPage("https://www.lenskart.com/");
base.log.info("Launching the URL");
}

@When("User clicks the eyeglasses category")
public void user_clicks_the_eyeglasses_category() {
	eyeaction.eyeglasses();
	base.log.info("clicking the Eyeglasses");
}

@When("User adds the first product to wish list")
public void user_adds_the_first_product_to_wish_list() {
	wishaction.Wishlist();
	base.log.info("adding the product to wishlist");
}

@When("User adds the second product to wish list")
public void user_adds_the_second_product_to_wish_list() {
	wishaction.Wishlist1();
	base.log.info("adding the product1 to wishlist");
}

@When("User clicks the product1 in the wish list")
public void user_clicks_the_product1_in_the_wish_list() {
	wishaction.Clickproduct1();
	base.log.info("clicking the product1 in wishlist");
}

@When("User removing the product1")
public void user_removing_the_product1() {
   wishaction.Removeproduct1();
   base.log.info("removing the product1 from wishlist");
}

@Then("Asserting the WishList")
public void asserting_the_wish_list() {
	base.log.info("Asserting the wishlist");
  
}
}




package Definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;

import Actions.EyeGlassesAct;
import Locators.EyeGlassesLoc;
import Locators.WishListLoc;
import Utility.HelperClass;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EyeGlassesDef {
	WebDriver driver;
	EyeGlassesAct eyeaction = new EyeGlassesAct();
	HelperClass base = new HelperClass();
	
	
	@Given("User opens the lenskart webpage")
	public void user_opens_the_lenskart_webpage() {
		HelperClass.openPage("https://www.lenskart.com/");
		base.log.info("Launching the URL");
	}

	@When("User clicks the eyeglasses")
	public void user_clicks_the_eyeglasses() {
		eyeaction.eyeglasses();
		base.log.info("Clicking the Eyeglasses");
	}
//
//	@When("User clicks the view range")
//	public void user_clicks_the_view_range() {
//		 eyeaction.viewrange();
//	 
//	}

	@When("User sorts the product by price:high to low")
	public void user_sorts_the_product_by_price_high_to_low() {
		 eyeaction.sortby();
		 base.log.info("Sorting the product High to Low");
	}

	@When("Filter the frame type by full rim")
	public void filter_the_frame_type_by_full_rim() {
		 eyeaction.frametype();
		 base.log.info("Filtering the FrameType");
	    
	}

	@When("Filter the frame shape by aviator")
	public void filter_the_frame_shape_by_aviator() {
		 eyeaction.frameshape();
		 base.log.info("Filtering the frameshape");
	}

//	@When("Filter the frame colour by silver")
//	public void filter_the_frame_colour_by_silver() {
//		 eyeaction.framecolour();
//	}

	@When("User add the product to the wishlist")
	public void user_add_the_product_to_the_wishlist() {
		 eyeaction.AddWishlist();
		 base.log.info("Adding the product to the wishlist");
	}

//	@When("user clicking the wishlist option")
//	public void user_clicking_the_wishlist_option() {
		 //eyeaction.ClickWishlist();
//	}

	@When("user clicking the product in the wishlist")
	public void user_clicking_the_product_in_the_wishlist() {
		 eyeaction.ClickProduct();
		 base.log.info("Clicking the product");
	}

	@When("user clicking buy now option")
	public void user_clicking_buy_now_option() throws InterruptedException {
		 eyeaction.Buynow();
		 base.log.info("Clicking the buynow option");
	}

	@Then("Asserting the Total payable")
	public void asserting_the_total_payable() {
		Assert.assertEquals(EyeGlassesLoc.Totalpayable.getText(),"₹6500");
		base.log.info("Asserting the text");
	}




}

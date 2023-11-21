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
//
//	@Given("User opens the lenskart webpage")
//	public void user_opens_the_lenskart_webpage() {
//		HelperClass.openPage("https://www.lenskart.com/");
//		 
//	  
//	}
//
//	@When("User clicks the eyeglasses")
//	public void user_clicks_the_eyeglasses() {
//		eyeaction.eyeglasses();
//	 
//	}
//
//	@When("User clicks the view range")
//	public void user_clicks_the_view_range() {
//	   eyeaction.viewrange();
//	}
//
//	@When("User sorts the product by price:low to high")
//	public void user_sorts_the_product_by_price_low_to_high() {
//	   eyeaction.sortby();
//	 
//	}
//
//	@When("Filter the frame type by full rim")
//	public void filter_the_frame_type_by_full_rim() {
//		 eyeaction.frametype();
//	}
//
//	@Then("Asserting the frame type to full rim")
//	public void asserting_the_frame_type_to_full_rim() {
//		Assert.assertEquals(EyeGlassesLoc.Frametype.getText(),"FRAME TYPE  : ");
//	  
//	   
//	}
	
	
	@Given("User opens the lenskart webpage")
	public void user_opens_the_lenskart_webpage() {
		HelperClass.openPage("https://www.lenskart.com/");
	}

	@When("User clicks the eyeglasses")
	public void user_clicks_the_eyeglasses() {
		eyeaction.eyeglasses();
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
	   
	}

	@When("Filter the frame type by full rim")
	public void filter_the_frame_type_by_full_rim() {
		 eyeaction.frametype();
	    
	}

	@When("Filter the frame shape by aviator")
	public void filter_the_frame_shape_by_aviator() {
		 eyeaction.frameshape();
	}

//	@When("Filter the frame colour by silver")
//	public void filter_the_frame_colour_by_silver() {
//		 eyeaction.framecolour();
//	}

	@When("User add the product to the wishlist")
	public void user_add_the_product_to_the_wishlist() {
		 eyeaction.AddWishlist();
	}

	@When("user clicking the wishlist option")
	public void user_clicking_the_wishlist_option() {
		 eyeaction.ClickWishlist();
	}

	@When("user clicking the product in the wishlist")
	public void user_clicking_the_product_in_the_wishlist() {
		 eyeaction.ClickProduct();
	}

	@When("user clicking buy now option")
	public void user_clicking_buy_now_option() throws InterruptedException {
		 eyeaction.Buynow();
	}

	@Then("Asserting the Total payable")
	public void asserting_the_total_payable() {
		Assert.assertEquals(EyeGlassesLoc.Totalpayable.getText(),"₹2400");
	}




}

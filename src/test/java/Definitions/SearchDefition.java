package Definitions;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Actions.LoginPage;
import Actions.SearchAction;
import Locators.LoginLoc;
import Locators.SunglassLocator;
import Utility.HelperClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchDefition {
	
	SearchAction sa = new SearchAction();

	@Given("launching the lenskart")
	public void launching_the_lenskart() {
		HelperClass.openPage("https://www.lenskart.com/");
	}
	

	@When("given the product name to search")
	public void given_the_product_name_to_search() {
	    sa.setSearch("eyeglass");
	}
	
	@When("given the enter")
	public void given_the_enter() throws AWTException {
	   sa.entbutton();
	}
	
	
	@Given("given the filter for frame shape")
	public void given_the_filter_for_frame_shape() {
		
	   
		sa.frameshape();
	}

	@Given("given the filter for frame size")
	public void given_the_filter_for_frame_size() {
	    sa.framesize();
	}

	@Given("given the filter for frame type")
	public void given_the_filter_for_frame_type() {
	    sa.frametype();
	}

	

	@Given("given the sort for result high to low")
	public void given_the_sort_for_result_high_to_low() {
	   sa.searchsort();
	}

	@Given("user selects the eyeglass")
	public void user_selects_the_eyeglass() {
	   sa.product();
	}

	@Given("switch to newly opened tab")
	public void switch_to_newly_opened_tab() {
		Set<String> allWindows = HelperClass.getDriver().getWindowHandles();
		for (String curWindow : allWindows) {
			HelperClass.getDriver().switchTo().window(curWindow);
		}
	}

	@Given("user clicks the select lens")
	public void user_clicks_the_select_lens() {
	   sa.lens();
	}
	
	@When("user clicks the select lens type")
	public void user_clicks_the_select_lens_type() {
	   sa.lensselect();
	}

	@When("user clicks the select premium lens")
	public void user_clicks_the_select_premium_lens() {
	   sa.premiumlens();
	}

	@When("user clicks the select lens coating.")
	public void user_clicks_the_select_lens_coating() {
	   sa.coating();
	}
	
	@When("user click the continue")
	public void user_click_the_continue() {
	      sa.cont();
	}

	@When("user click the checkout glass")
	public void user_click_the_checkout_glass() {
		sa.outcheck();
	}

	@Then("asserting the product user selected with details")
	public void asserting_the_product_user_selected_with_details() {
		sa.asbill();
	}
}



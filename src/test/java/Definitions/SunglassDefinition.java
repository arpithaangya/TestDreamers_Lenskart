package Definitions;

import java.util.List;
import java.util.Set;

import Actions.SunglassAction;
import Utility.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SunglassDefinition {
	SunglassAction sunact = new SunglassAction();
	

@Given("launch the webpage of lenskart")
public void launch_the_webpage_of_lenskart() {
	HelperClass.openPage("https://www.lenskart.com/");
	String parentWindow= HelperClass.getDriver().getWindowHandle();
}
	
	@When("Hover the mouse to sunglasses")
	public void hover_the_mouse_to_sunglasses() {
	    sunact.sunglass();
	}

	@When("Hover the mouse to the men section")
	public void hover_the_mouse_to_the_men_section() {
		sunact.men();
	}

	@When("hover the mouse to the classic sunglasses option and click")
	public void hover_the_mouse_to_the_classic_sunglasses_option_and_click() {
		sunact.classic();
	}

	@When("check the variety of sunglasss")
	public void check_the_variety_of_sunglasss() {
		sunact.range();
	}
	
	@When("click the range")
	public void click_the_range() {
		sunact.seller();
		
		
	}

	@When("Sort the product by price:low to high")
	public void sort_the_product_by_price_low_to_high() {
		sunact.sort();
		
	}

	@When("Filter the frame type by full rim")
	public void filter_the_frame_type_by_full_rim() {
		sunact.filter();
	}

	@When("chose the sunglass")
	public void chose_the_sunglass() {
		sunact.glass();
	}

	@When("switch to another tab")
	public void switch_to_another_tab() {
		Set<String> allWindows = HelperClass.getDriver().getWindowHandles();
		for(String curWindow : allWindows){
			HelperClass.getDriver().switchTo().window(curWindow);
		}
	}

	@When("click the power")
	public void click_the_power() {
		//sunact.power();
	}

	@When("choose the color for sunglass")
	public void choose_the_color_for_sunglass() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click the continue")
	public void click_the_continue() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user given the checkout")
	public void user_given_the_checkout() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("asserting the bill details")
	public void asserting_the_bill_details() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}

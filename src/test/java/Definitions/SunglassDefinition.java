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
	
@When("Hover the mouse to sunglasses and click")
public void hover_the_mouse_to_sunglasses_and_click() {
    sunact.sunglass();}

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
	
	@When("Filtering  frame type by half rim")
	public void filtering_frame_type_by_half_rim() {
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
		sunact.power();
	}

	@When("choose the color for sunglass")
	public void choose_the_color_for_sunglass() {
		sunact.lenscolor();
	}

	@When("click the continue")
	public void click_the_continue() {
		sunact.contbutton();
	}

	@When("user given the checkout")
	public void user_given_the_checkout() {
	    sunact.ckeckout();
	}

	@Then("asserting the bill details")
	public void asserting_the_bill_details() {
	   sunact.bill();
	}


}

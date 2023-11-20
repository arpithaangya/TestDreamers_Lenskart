package Definitions;

import org.openqa.selenium.JavascriptExecutor;

import Actions.KidsAct;
import Utility.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FollowDef {
	KidsAct action = new KidsAct();
	@Given("Home page of Lenskart")
	public void home_page_of_lenskart() {
		HelperClass.openPage("https://www.lenskart.com/");
	}

	@When("Scroll Down")
	public void scroll_down() {
		action.scroll();
	}

	@When("Click on FaceBook")
	public void click_on_face_book() {
        action.fb();
	}

	@Then("Goes to Facebook page")
	public void goes_to_facebook_page() {

	}


}

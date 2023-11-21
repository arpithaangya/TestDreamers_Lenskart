package Definitions;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import Actions.KidsAct;
import Actions.LoginPage;
import Utility.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FollowDef {
	KidsAct action = new KidsAct();
	LoginPage login = new LoginPage();
	@Given("Home page of Lenskart")
	public void home_page_of_lenskart() throws InterruptedException {
		HelperClass.openPage("https://www.lenskart.com/");
		//login.waitimplicit();
		
	}

	@When("Scroll Down")
	public void scroll_down() {
		action.scroll();
	}

	@When("Click on FaceBook")
	public void click_on_face_book() throws InterruptedException {
		login.waitimplicit();
		
        login.fb2();
	}

	@Then("Goes to Facebook page")
	public void goes_to_facebook_page() {
		String tab = login.changetab();
		Assert.assertEquals(tab, "https://www.facebook.com/Lenskartindia");
		
	}
	@When("Click on instagram icon")
	public void click_on_instagram_icon() throws InterruptedException {
         login.waitimplicit();
		
        login.insta();
	}

	@Then("Goes to instagram page")
	public void goes_to_instagram_page() {
		String tab = login.changetab();
		Assert.assertEquals(tab, "https://www.instagram.com/lenskart/");
	}

	@When("Click on twitter icon")
	public void click_on_twitter_icon() throws InterruptedException {
			
		  login.waitimplicit();
			
	        login.twitter();
	}

	@Then("Goes to twitter page")
	public void goes_to_twitter_page() {
		String tab = login.changetab();
		Assert.assertEquals(tab, "https://twitter.com/lenskartME");
	}



}

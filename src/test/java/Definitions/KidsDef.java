package Definitions;

import Actions.KidsAct;
import Actions.LoginPage;
import Utility.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KidsDef {
	HelperClass base;
	KidsAct action = new KidsAct();
	LoginPage login = new LoginPage();
	//log = LogManager.getLogger(KidsAct.class);
	@Given("Go to Url of Lenskart")
	public void go_to_url_of_lenskart() throws InterruptedException {
		HelperClass.openPage("https://www.lenskart.com/");
		
	}

	@When("Click on Kids Glasses")
	public void click_on_kids_glasses() {
	  action.Kids();
	}

	@When("Go to sunglasses")
	public void go_to_sunglasses() throws InterruptedException {
	    action.sun();
	    login.waitimplicit();
	    action.clicksortby();
	    base.log.info("Sorts by new");
	}

	@Then("click on first one")
	public void click_on_first_one() {
	
	   action.select();
	   base.log.info("Clicks the first one");
	   action.change();
	}



}

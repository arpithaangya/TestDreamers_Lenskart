package Definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Actions.ServicesAct;
import Locators.ServicesLoc;
import Locators.WishListLoc;
import Utility.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ServicesDef {
	WebDriver driver;
	ServicesAct Servicesaction = new ServicesAct();


@Given("User opens the lenskart Webpage and scroll and find the services")
public void user_opens_the_lenskart_webpage_and_scroll_and_find_the_services() {
	HelperClass.openPage("https://www.lenskart.com/");
   
}

@When("User clicks the store locator option")
public void user_clicks_the_store_locator_option() {
	 Servicesaction.Storelocator();
}

@When("User clicks the search option and giving location")
public void user_clicks_the_search_option_and_giving_location() {
	 Servicesaction.Search();
}

@When("User clicks the buying guide option")
public void user_clicks_the_buying_guide_option() {
	 Servicesaction.Buyingguide();
}

@When("Asserting the Buying guide page")
public void asserting_the_buying_guide_page() {
	 Servicesaction.Text();
}

@When("User clicks the frame size option")
public void user_clicks_the_frame_size_option() {
	 Servicesaction.Framesize();
    
}

@When("Asserting the frame size page")
public void asserting_the_frame_size_page() {
	 Servicesaction.Facesize();
   
}

@Then("Asserting the feature")
public void asserting_the_feature() {
	Assert.assertEquals(ServicesLoc.Samepage.getText(),"Buy The Best Eyewear From Lenskart");
  
   
}






}

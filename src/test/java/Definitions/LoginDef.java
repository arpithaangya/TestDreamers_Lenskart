package Definitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Actions.LoginPage;
import Locators.LoginLoc;
import Utility.HelperClass;
import Utility.Utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDef {
WebDriver driver;
LoginLoc loc = new LoginLoc();
LoginPage action = new LoginPage();
Utility objUt = new Utility();
@Given("Login page URL of Lenskart")
public void login_page_url_of_lenskart() throws InterruptedException {
	HelperClass.openPage("https://www.lenskart.com/");
	action.waitimplicit();
	//action.close();
	action.signBtn();
}

@When("User enters username")
public void user_enters_username(io.cucumber.datatable.DataTable dataTable) {

	action.emaildata(dataTable);
		
}

@When("user clicks next")
public void user_clicks_next() throws InterruptedException {
	action.clicklogin();
	
		action.waitimplicit();

}

@When("User enters password")
public void user_enters_password(io.cucumber.datatable.DataTable dataTable) {
	
    action.emailpass(dataTable);
	
	
}

@When("User clicks login and goes to home")
public void user_clicks_login() throws InterruptedException {
   action.clicklogin();
   action.waitimplicit();
	String actual = action.profilename();

}

@Then("User will logout")
public void user_will_login_or_fails() throws InterruptedException {
   
	 

     action.logout();
     action.waitimplicit();
}

@Given("goes to Lenskart URL")
public void goes_to_lenskart_url() throws InterruptedException {
	//  HelperClass.openPage(objUt.strUrl);
	  action.signBtn();
}

@When("User enters email1 or phone number")
public void user_enters_email1_or_phone_number() {
	action.email(objUt.stremail);
}

@When("clicks next")
public void clicks_next() throws InterruptedException {
	action.clicklogin();
	
	action.waitimplicit();

}

@When("clicks on forgot password")
public void clicks_on_forgot_password() throws InterruptedException {
	
	action.waitimplicit();
 action.forgot();
 
 
}

@Then("User clicks to send link for reset")
public void user_clicks_to_send_link_for_reset() {
	action.clickemail2(objUt.stremail);
    action.send();
    String req = action.checklinksent();
    System.out.println(action.checklinksent());
  //  Assert.assertEquals(req,"Recovery mail has been sent to your Email");

}




}

package Definitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Actions.LoginPage;
import Locators.LoginLoc;
import Utility.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDef {
WebDriver driver;
LoginLoc loc = new LoginLoc();
LoginPage action = new LoginPage();

@Given("Login page URL of Lenskart")
public void login_page_url_of_lenskart() {
	HelperClass.openPage("https://www.lenskart.com/");
	//action.closeAlert();
	
	action.signBtn();
}

@When("User enters username")
public void user_enters_username(io.cucumber.datatable.DataTable dataTable) {

	action.emaildata(dataTable);
		
}

@When("user clicks next")
public void user_clicks_next() {
	action.clicklogin();
}

@When("User enters password")
public void user_enters_password(io.cucumber.datatable.DataTable dataTable) {
    action.emailpass(dataTable);
	
	
}

@When("User clicks login")
public void user_clicks_login() {
   action.clicklogin();
}

@Then("User will login or fails")
public void user_will_login_or_fails() {
   
	
	
}

@Given("goes to Lenskart URL")
public void goes_to_lenskart_url() {
  
}

@When("User enters email1 or phone number")
public void user_enters_email1_or_phone_number() {

}

@When("clicks next")
public void clicks_next() {
   
}

@When("clicks on forgot password")
public void clicks_on_forgot_password() {
 
}

@Then("User clicks to send link for reset")
public void user_clicks_to_send_link_for_reset() {

}




}

package Definitions;

import java.time.Duration;

import org.testng.Assert;

import Actions.RegisterPageActions;
import Utility.HelperClass;
import Utility.RegisterUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDef {
	RegisterUtility registerData = new RegisterUtility();
	RegisterPageActions objRegister = new RegisterPageActions();
	
	@Given("User opens the Lenskart register page")
	public void user_opens_the_lenskart_register_page() {
		HelperClass.openPage(registerData.url);
		System.out.println("Successfully entered webpage");
	}
	
	@When("User clicks the signup")
	public void user_clicks_the_signup() {
		objRegister.clicksignup();
		System.out.println("Successfully clicked SignUp button");
	}
	
	@When("User enters the valid credentials")
	public void user_enters_the_valid_credentials() {
		objRegister.register(registerData.firstName, registerData.lastName,registerData.mobile,registerData.email,registerData.password);
		System.out.println("Valid Credentials entered");
	}

	@When("User clicks the createAccount")
	public void user_clicks_the_create_account() {
		objRegister.clickcreate();
		System.out.println("Successfully clicked Create an Account button");
	}

	@Then("User should be able to register successfully")
	public void user_should_be_able_to_register_successfully() {
		Assert.assertTrue(objRegister.getWelcomePageText().contains("Eyeglasses"));
		System.out.println("Successfully registered");
	}
}

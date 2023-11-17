package Definitions;

import org.testng.Assert;

import Actions.ComputerGlassActions;
import Utility.HelperClass;
import Utility.RegisterUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComputerGlassStepDef {
	RegisterUtility registerData = new RegisterUtility();
	ComputerGlassActions objComputer = new ComputerGlassActions();
	
	@Given("User goes to the lenskart webpage")
	public void user_goes_to_the_lenskart_webpage() {
		HelperClass.openPage(registerData.url);
		System.out.println("Successfully entered webpage");
	}

	@When("User clicks the computerglasses")
	public void user_clicks_the_computerglasses() {
		objComputer.clickcomputerglasses();
		System.out.println("Successfully clicked computerglass");
	}

	@When("User clicks sortby")
	public void user_clicks_sortby() {
		objComputer.clicksortby();
		System.out.println("Successfully clicked sortby");
	}

	@When("User clicks the product")
	public void user_clicks_the_product() {
		objComputer.clickproduct();
		System.out.println("Successfully clicked the product");
	}

	@When("User clicks the buy now")
	public void user_clicks_the_buy_now() {
		objComputer.clickbuynow();
		System.out.println("Successfully clicked buy now");
	}

	@Then("User should be able to buy the product successfully")
	public void user_should_be_able_to_buy_the_product_successfully() {
		Assert.assertTrue(objComputer.getbilldetails().contains("Bill Details"));
		System.out.println("Successfully bought the product");
	}
}

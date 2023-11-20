package Definitions;

//import org.junit.Assert;
import org.testng.Assert;

import Actions.ComputerGlassActions;
import Locators.ComputerGlassLocators;
import Utility.HelperClass;
import Utility.RegisterUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComputerGlassStepDef {
	RegisterUtility registerData = new RegisterUtility();
	ComputerGlassActions objComputer = new ComputerGlassActions();
	ComputerGlassLocators objComputerLoc = new ComputerGlassLocators();
	
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
		//Assert.assertTrue(objComputer.getbilldetails().contains("Subtotal"));
		//System.out.println(objComputer.getbilldetails());
		//System.out.println("Successfully Lens Type Selected");
		Assert.assertTrue(objComputer.getbilldetails().contains("Total payable"));
		System.out.println(objComputer.getbilldetails());
		System.out.println("Successfully bought the product");
	}
	@When("User clicks the remove")
	public void user_clicks_the_remove() {
		objComputer.clickremove();
		System.out.println("Successfully clicks remove");
	}

	@When("User clicks yes,remove")
	public void user_clicks_yes_remove() {
		objComputer.clickyesremove();
		System.out.println("Successfully removed the product");
	}

	@Then("User should be able to see the cart is empty")
	public void user_should_be_able_to_see_the_cart_is_empty() {
		Assert.assertTrue(objComputer.getcartdetails().contains("Your shopping cart is empty"));
		System.out.println(objComputer.getcartdetails());
		System.out.println("Successfully checked the cart");
	}
}

package Definitions;

import org.testng.Assert;

import Actions.AboutUsActions;
import Utility.HelperClass;
import Utility.RegisterUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AboutUsStepDef {
	RegisterUtility registerData = new RegisterUtility();
	AboutUsActions objAboutUs = new AboutUsActions();
	
	@Given("User goes to lenskart webpage")
	public void user_goes_to_lenskart_webpage() {
		HelperClass.openPage(registerData.url);
		System.out.println("Successfully entered webpage");
	}

	@When("User goes to about us and clicks We are hiring")
	public void user_goes_to_about_us_and_clicks_we_are_hiring() {
		objAboutUs.clickweAreHiring();
		System.out.println("Successfully clicked We Are Hiring");
	}

	@Then("User should be able to see the we are hiring page")
	public void user_should_be_able_to_see_the_we_are_hiring_page() {
		Assert.assertEquals(objAboutUs.getweAreHiringPageText(),"WHY YOU SHOULD JOIN US");
		System.out.println("Successfully opened we are hiring page ");
	
	}

	@When("User clicks Refer and Earn")
	public void user_clicks_refer_and_earn() {
		objAboutUs.clickreferAndEarn();
		System.out.println("Successfully clicked Refer and Earn");
	}

	@Then("User should be able to see the Refer and Earn page")
	public void user_should_be_able_to_see_the_refer_and_earn_page() {
		String expectedTitle = "https://www.lenskart.com/paytm-referral";
		String actualTitle = HelperClass.getDriver().getCurrentUrl();
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Successfully opened Refer and Earn page");
	}

	@When("User clicks About us")
	public void user_clicks_about_us() {
		objAboutUs.clickaboutUs();
		System.out.println("Successfully clicked About us");
	}

	@Then("User should be able to see the About us page")
	public void user_should_be_able_to_see_the_about_us_page() {
		Assert.assertTrue(objAboutUs.getaboutUsPageText().contains("GREAT QUALITY"));
		System.out.println("Successfully opened About us page");
	}

	@When("User clicks lenskart coupons")
	public void user_clicks_lenskart_coupons() {
		objAboutUs.clicklenskartCoupons();
		System.out.println("Successfully clicked lenskart coupons");
	}

	@Then("User should be able to see the lenskart coupons page")
	public void user_should_be_able_to_see_the_lenskart_coupons_page() {
		Assert.assertTrue(objAboutUs.getlenskartCouponsPageText().contains("Dhaakad Hai ft. Surya Kumar Yadav"));
		System.out.println("Successfully opened lenskart coupons page");
	}

}

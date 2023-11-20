package Definitions;

import Actions.AccountAction;
import Utility.HelperClass;
import Utility.Utility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountDefinitions {
	AccountAction action = new AccountAction();
	Utility obj = new Utility();
	String strUrl;
	
	@Given("Launching the lenskart webpage")
	public void launching_the_lenskart_webpage() throws InterruptedException {
		HelperClass.openPage(obj.strUrl);
		Thread.sleep(3000);
		action.pop();
	}

	@When("User enters valid username")
	public void user_enters_valid_username(DataTable dataTable) {
		action.signbtn();
		action.emailData(dataTable);
	}
  
	@When("user clicks the next for login")
	public void user_clicks_the_next_for_login() {
		action.clicksignin();
	}

	@When("User enters valid password")
	public void user_enters_valid_password(DataTable dataTable) {
		action.emailPass(dataTable);
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		 action.clicksignin();
		 action.profileset();
		
	}
	
	@When("user clicks the user account")
	public void user_clicks_the_user_account() {
		action.profileset();
	}

	@When("user clicks the My orders")
	public void user_clicks_the_my_orders() {
		action.myorder();
	}

	@When("again clicks the user account")
	public void again_clicks_the_user_account() {
		action.profile();
	}

	@When("user clicks the my prescription")
	public void user_clicks_the_my_prescription() {
		action.prescription();
	}

	@When("user clicks the store credit")
	public void user_clicks_the_store_credit() {
		action.store();
	}

	@When("user clicks the account information")
	public void user_clicks_the_account_information() {
		action.accinfo();
	}

	@Then("asserting the value of first name")
	public void asserting_the_value_of_first_name() {
		action.accassert();
		
	}


}

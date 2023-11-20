package Definitions;

import Actions.AccountAction;
import Utility.HelperClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AccountDefinitions {
	AccountAction action = new AccountAction();

	
	@Given("Launching the lenskart webpage")
	public void launching_the_lenskart_webpage() throws InterruptedException {
		HelperClass.openPage("https://www.lenskart.com/");
		Thread.sleep(2000);
		//action.signbtn();
	}

	@When("User enters valid username")
	public void user_enters_valid_username(DataTable dataTable) {
		action.emailData(dataTable);
	}

	@When("user clicks the next for login")
	public void user_clicks_the_next_for_login() {
		//action.clickNext();
	}

	@When("User enters valid password")
	public void user_enters_valid_password(DataTable dataTable) {
		action.emailPass(dataTable);
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		// action.clicklogin();
	}
}

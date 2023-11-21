package Definitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import Actions.AccountAction;
import Utility.HelperClass;
import Utility.Utility;
import Utility.UtilityXlsheet;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountDefinitions {
	AccountAction action = new AccountAction();
	Utility obj = new Utility();
	UtilityXlsheet fil = new UtilityXlsheet();
	String strUrl;
	
	@Given("Launching the lenskart webpage")
	public void launching_the_lenskart_webpage() throws InterruptedException {
		HelperClass.openPage(obj.strUrl);
		Thread.sleep(3000);
		action.pop();
	}

	@When("User enters valid username sheetname  {string} and rownumber {int}")
	public void user_enters_valid_username_sheetname_and_rownumber(String sheetname, Integer int1) throws InvalidFormatException, IOException {
		action.signbtn();
	List<Map<String,String>> testdata=fil.getData("src\\test\\resources\\userinput.xlsx", sheetname);
	String email1 = testdata.get(int1).get("email");
	
	action.emailData(email1);
	
	
	
	
		//action.signbtn();
		//action.emailData(dataTable);
	}
  
	@When("user clicks the next for login")
	public void user_clicks_the_next_for_login() {
		action.clicksignin();
	}

	@When("User enters valid password sheetname  {string} and rownumber {int}")
	public void user_enters_valid_password_sheetname_and_rownumber(String sheetname, Integer int1) throws InvalidFormatException, IOException {
		List<Map<String,String>> testdata=fil.getData("src\\test\\resources\\userinput.xlsx", sheetname);
		
		String pass = testdata.get(int1).get("password");
		action.emailPass(pass);
		//action.emailPass(dataTable);
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

package Actions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Locators.AccountLocator;
import Locators.LoginLoc;
import Utility.HelperClass;
import io.cucumber.datatable.DataTable;

public class AccountAction {
	AccountLocator accloc ;
	LoginLoc loc;
	Actions act = new Actions(HelperClass.getDriver());
	public AccountAction() {
		this.accloc =  new AccountLocator();
		this.loc = new LoginLoc();
		PageFactory.initElements(HelperClass.getDriver(), loc);	
		}
	
	public void pop() {
	  act.moveToElement(accloc.pop).click().build().perform();
	}
	
	public void signbtn() {
		act.moveToElement(loc.signin).click().build().perform();
	}
	
	public void emailData(DataTable dataTable) {
		
		List<Map<String,String>> signup = dataTable.asMaps(String.class,String.class);
		for(Map<String,String> form : signup) 
		{
			String username = form.get("email");
			System.out.println("Username :" +username);
			loc.email.sendKeys(username);
		}
	}
	
	public void clickNext() {
          //loc.clicknext.click();
	}
	
	public void emailPass(DataTable dataTable) {
		
		List<Map<String,String>> signup = dataTable.asMaps(String.class,String.class);
		for(Map<String,String> form : signup) 
		{
			String password = form.get("password");
			System.out.println("Password :" +password);
			loc.password.sendKeys(password);
		}
	}
	

}

package Actions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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
		PageFactory.initElements(HelperClass.getDriver(), accloc);	
		PageFactory.initElements(HelperClass.getDriver(), loc);
		}
	
	public void pop() {
	 loc.alertsign.click();
	}
	
	public void signbtn() {
		loc.signin.click();
	}
	
	public void emailData( String email) {
		
		loc.email.sendKeys(email);
		
//		List<Map<String,String>> signup = dataTable.asMaps(String.class,String.class);
//		for(Map<String,String> form : signup) 
//		{
//			String username = form.get("email");
//			System.out.println("Username :" +username);
//			loc.email.sendKeys(username);
//		}
	}
	
	public void clicksignin() {
            loc.login.click();
	}
	
	public void emailPass(String password) {
		
		loc.password.sendKeys(password);
		
//		List<Map<String,String>> signup = dataTable.asMaps(String.class,String.class);
//		for(Map<String,String> form : signup) 
//		{
//			String password = form.get("password");
//			System.out.println("Password :" +password);
//			loc.password.sendKeys(password);
//		}
	}
	public void profileset() {
            act.moveToElement(loc.profilename).click().build().perform();
            
	}
	public void myorder() {
		act.moveToElement(accloc.myorder).click().build().perform();

	}
	
	public void profile() {
		act.moveToElement(accloc.profile).click().build().perform();

	}
	
	public void prescription() {
		 act.moveToElement(accloc.account).click().build().perform();

	}
	
	public void accinfo() {
		act.moveToElement(accloc.accinfo).click().build().perform();

	}
	
	public void store() {
		act.moveToElement(accloc.store).click().build().perform();

	}
	
	
	
	public void outlog() {
		act.moveToElement(accloc.outlog).click().build().perform();

	}
	
	public void accassert() {
		
		System.out.println(accloc.valuecheck.getAttribute("value"));
    Assert.assertEquals(accloc.valuecheck.getAttribute("value"), "arpitha");
      
	}
	
	
           
            
            //act.moveToElement(accloc.profile).click().build().perform();
//            act.moveToElement(accloc.account).click().build().perform();
//            
//            act.moveToElement(accloc.profile).click().build().perform();
//            act.moveToElement(accloc.store).click().build().perform();
//            
//            act.moveToElement(accloc.profile).click().build().perform();
//            act.moveToElement(accloc.accinfo).click().build().perform();
//            
//            act.moveToElement(accloc.profile).click().build().perform();
//            act.moveToElement(accloc.outlog).click().build().perform();
	
	

}

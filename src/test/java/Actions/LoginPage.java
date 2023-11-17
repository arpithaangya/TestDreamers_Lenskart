package Actions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Locators.LoginLoc;
import Utility.HelperClass;
import Utility.Utility;
import junit.framework.Assert;

public class LoginPage {
	
	LoginLoc loc;
	Utility util = new Utility();
	WebDriver driver = HelperClass.getDriver();
	Actions  action = new Actions(HelperClass.getDriver());
		public LoginPage() {
			this.loc = new LoginLoc();
			PageFactory.initElements(HelperClass.getDriver(), loc);
		}

		public void signBtn() {
			loc.signin.click();
		}
		
		public void emaildata(io.cucumber.datatable.DataTable dataTable) {
			
			List<Map<String,String>> signup = dataTable.asMaps(String.class,String.class);
			for(Map<String,String> form : signup) 
			{
				String username = form.get("email");
				System.out.println("Username :" +username);
				loc.email.sendKeys(username);
			}
		}
		
		public void waitimplicit() throws InterruptedException {
			Thread.sleep(1000);
		
		}
		
		public void emailpass(io.cucumber.datatable.DataTable dataTable) {
			
			List<Map<String,String>> signup = dataTable.asMaps(String.class,String.class);
			for(Map<String,String> form : signup) 
			{
				String password = form.get("password");
				System.out.println("Password :" +password);
				loc.password.sendKeys(password);
			}
		}
		
		public void checkLog() {
			String name = loc.profilename.getText();
			System.out.println(name);
		
		}
		public void logout() throws InterruptedException {
				
			    action.moveToElement(loc.profilename).build().perform();
			    Thread.sleep(5000);
			    action.moveToElement(loc.logout).click().build().perform();				
			}
			
      public void close() throws InterruptedException {
				Alert alert = driver.switchTo().alert();
				alert.dismiss();
			}
			
	  public void clicklogin() {
				loc.login.click();
			}
			
	  public void setUserName(String stremail) {
				loc.email.sendKeys(stremail);
			}
	
	  public void email(String stremail) {
			setUserName(stremail);
			 }
	  public void forgot() {
			  loc.forgotpwd.click();
		  }
			
	  public void clickemail2(String stremail) {
		loc.linkemail.sendKeys(stremail);
		
	  }
	  public void send() {
		  loc.linksend.click();
	  }
}

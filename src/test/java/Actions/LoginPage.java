package Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Locators.LoginLoc;
import Locators.RegisterPageLocators;
import Utility.HelperClass;
import Utility.Utility;
//import junit.framework.Assert;

public class LoginPage {
	
	LoginLoc loc;
	Utility util = new Utility();
	WebDriver driver = HelperClass.getDriver();
	RegisterPageLocators registerPageLocators = null;
	Actions  action = new Actions(HelperClass.getDriver());
		public LoginPage() {
			this.loc = new LoginLoc();
			this.registerPageLocators = new RegisterPageLocators();
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
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
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
			String name = loc.profile.getText();
			System.out.println(name);
		
		}
		public String profilename() {
			String name =loc.profile.getText();
			return name;
		}
		public void logout() throws InterruptedException {
				
			    action.moveToElement(loc.profile).build().perform();
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			    action.moveToElement(loc.logout).click().build().perform();		
			    
			    driver.navigate().refresh();
			}
			
      public void close() throws InterruptedException {
    	 
    	  Thread.sleep(1000);
    	  if(loc.no.isDisplayed()) {
    		  loc.no.click();
    	  }
    	  
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
	  public String checklinksent() {
		return loc.linkassert.getText();
		
			  
	 }
	  
		public void fb2() {
			loc.facebook2.click();
		}
		public void twitter() {
			loc.twitter.click();
		}
		public void insta() {
			loc.instagram.click();
		}
		
	public String changetab() {
			
	  String title = null;
       String parentWindow= HelperClass.getDriver().getWindowHandle();
      Set<String> allWindows = driver.getWindowHandles();
		for (String tab : HelperClass.getDriver().getWindowHandles()) {
			HelperClass.getDriver().switchTo().window(tab);
			title = driver.getCurrentUrl();
	    }
			HelperClass.getDriver().switchTo().window(parentWindow);
           return title;
		}
		
		
}

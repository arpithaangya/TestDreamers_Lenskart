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

public class LoginPage {
	WebDriver driver = new EdgeDriver();
	LoginLoc loc;
	
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
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
		
		
		public void logout() throws InterruptedException {
				Actions act = new Actions(driver);
				
			     act.moveToElement(loc.profilename).perform();
			    Thread.sleep(10000);
			    act.moveToElement(loc.logout).click().build().perform();				
			}
			
			
			
			public void close() throws InterruptedException {
			
				Alert alert = driver.switchTo().alert();
				alert.dismiss();
			}
			
			public void clicklogin() {
				loc.login.click();
			}
			
}

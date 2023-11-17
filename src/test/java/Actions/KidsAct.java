package Actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Locators.EyeGlassesLoc;
import Locators.Follow;
import Locators.KidsLoc;
import Utility.HelperClass;

public class KidsAct {

	KidsLoc loc = null;
	Follow follow = null;
	Actions  action = new Actions(HelperClass.getDriver());
	public KidsAct() {
		this.loc = new KidsLoc();
		this.follow = new Follow();
		PageFactory.initElements(HelperClass.getDriver(),loc);
	}
		
		public void Kids() {
			action.moveToElement(loc.Kids).build().perform();
			
		}
		public void sun() {
			loc.Sunglass.click();
		}
		public void select() {
			loc.select.click();
		}
	
		public void scroll() {
			JavascriptExecutor js = (JavascriptExecutor)HelperClass.getDriver();
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		}
		
		public void fb() {
			follow.facebook.click();
		}
		
}

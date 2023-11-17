package Actions;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import Locators.EyeGlassesLoc;
import Utility.HelperClass;

public class EyeGlassesAct {
	EyeGlassesLoc eyeglassesLocators = null;
	Actions  action = new Actions(HelperClass.getDriver());
	public EyeGlassesAct() {
		
	this.eyeglassesLocators = new EyeGlassesLoc();
		PageFactory.initElements(HelperClass.getDriver(),eyeglassesLocators);
	}
		public void eyeglasses() {
			eyeglassesLocators.eyeglasses.click();
		}
	    public void viewrange() {
			eyeglassesLocators.Viewrange.click();
	    	
	    }
//	        action.moveToElement(eyeglassesLocators.eyeglasses);
		
//	    public void women() {
//			action.moveToElement(eyeglassesLocators.women);
//		}
//		public void premiumnEyeglasses() {
////			HelperClass.wait.until(ExpectedConditions.elementToBeClickable(eyeglassesLocators.premiumnEyeglasses));
//			action.moveToElement(eyeglassesLocators.premiumnEyeglasses).click().perform();;
//		}
		public void sortby() {
			Select select = new Select(eyeglassesLocators.sortby);
			select.selectByIndex(2);
		}
		public void frametype() {
			eyeglassesLocators.frametype.click();
		}
 
	
}



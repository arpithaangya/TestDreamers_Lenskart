package Actions;


import java.util.Set;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import Locators.EyeGlassesLoc;
import Utility.HelperClass;

public class EyeGlassesAct {
	EyeGlassesLoc eyeglassesLocators = null;
	Actions  action = new Actions(HelperClass.getDriver());
	String parentWindow= HelperClass.getDriver().getWindowHandle();
	public EyeGlassesAct() {
		
	this.eyeglassesLocators = new EyeGlassesLoc();
		PageFactory.initElements(HelperClass.getDriver(),eyeglassesLocators);
	}
		public void eyeglasses() {
			eyeglassesLocators.eyeglasses.click();
		}
//	    public void viewrange() {
//			eyeglassesLocators.Viewrange.click();
	    	
//	    }
        public void sortby() {
			Select select = new Select(eyeglassesLocators.sortby);
			select.selectByIndex(2);
		}
		public void frametype() {
			eyeglassesLocators.frametype.click();
		}
		public void frameshape() {
			eyeglassesLocators.frameshape.click();
		}
//		public void framecolour() {
//			eyeglassesLocators.framecolour.click();
//		}
		public void  AddWishlist() {
			eyeglassesLocators. AddWishlist.click();
		}
		public void ClickWishlist() {
			//eyeglassesLocators.ClickWishlist.click();
		}
		public void ClickProduct() {
			//HelperClass.wait.until(ExpectedConditions.elementToBeClickable(eyeglassesLocators.ClickProduct));
			eyeglassesLocators.ClickProduct.click();
//			 HelperClass.jse.executeScript("arguments[0].click()",eyeglassesLocators.ClickProduct);
		}
		public void  Buynow() {
//			Thread.sleep(5000);
			//HelperClass.wait.until(ExpectedConditions.elementToBeClickable(eyeglassesLocators.Buynow));
			Set<String> allWindows = HelperClass.getDriver().getWindowHandles();
			for(String curWindow : allWindows){
				HelperClass.getDriver().switchTo().window(curWindow);
			}
			eyeglassesLocators.Buynow.click();
		// HelperClass.jse.executeScript("arguments[0].click()",eyeglassesLocators.Buynow);
		}
//		public String getTotalpayable() {
//			return eyeglassesLocators.Totalpayable.getText();
//		}
// 
	
}



package Actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Locators.EyeGlassesLoc;
import Locators.WishListLoc;
import Utility.HelperClass;

public class WishListAct {
	WishListLoc wishlistLocators = null;
	Actions  action = new Actions(HelperClass.getDriver());
	public WishListAct() {
			
	this.wishlistLocators = new WishListLoc();
	   PageFactory.initElements(HelperClass.getDriver(),wishlistLocators);
    }
	public void Specs() {
       wishlistLocators.Specs.click();
	}
	public void Wishlist() {
	   wishlistLocators.Wishlist.click();
	}
	public void Clearlist() {
		wishlistLocators.Clearlist.click();
	}
}
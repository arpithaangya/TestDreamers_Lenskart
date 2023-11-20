package Actions;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
<<<<<<< HEAD
=======

>>>>>>> 529c7578e128ac74a73738952d7ab0c3d582d6a1
import java.time.Duration;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
<<<<<<< HEAD
=======

>>>>>>> 529c7578e128ac74a73738952d7ab0c3d582d6a1

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
<<<<<<< HEAD

		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(wishlistLocators.Clearlist));
		action.moveToElement(wishlistLocators.Clearlist).click().build().perform();
=======
       wishlistLocators.Clearlist.click();
       HelperClass.wait.until(ExpectedConditions.elementToBeClickable(wishlistLocators.Clearlist));
	   action.moveToElement(wishlistLocators.Clearlist).click().build().perform();;

>>>>>>> 529c7578e128ac74a73738952d7ab0c3d582d6a1
	}
}

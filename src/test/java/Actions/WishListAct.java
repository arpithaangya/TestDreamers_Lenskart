package Actions;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Locators.WishListLoc;
import Utility.HelperClass;

public class WishListAct {
	WishListLoc wishlistLocators = null;
	Actions  action = new Actions(HelperClass.getDriver());
	public WishListAct() {
			
	this.wishlistLocators = new WishListLoc();
	   PageFactory.initElements(HelperClass.getDriver(),wishlistLocators);
    }
	public void Eyeglasses() {
       wishlistLocators.Eyeglasses.click();
	}
	public void Wishlist() {
	   wishlistLocators.Wishlist.click();
	}
	public void  Wishlist1() {
	       wishlistLocators.Wishlist1.click();
	}
	public void Clickproduct1() {
	       wishlistLocators.Clickproduct1.click();
	}
	public void Removeproduct1() {
	       wishlistLocators.Removeproduct1.click();
	}
	
<<<<<<< HEAD
	public void Clearlist() {




	  HelperClass.wait.until(ExpectedConditions.elementToBeClickable(wishlistLocators.Clearlist));
      HelperClass.jse.executeScript("arguments[0].click()",wishlistLocators.Clearlist);

	}
=======
//	public void Clearlist() {
//
//
//
//	  HelperClass.wait.until(ExpectedConditions.elementToBeClickable(wishlistLocators.Clearlist));
//      HelperClass.jse.executeScript("arguments[0].click()",wishlistLocators.Clearlist);
//
//
//
//
//
//
//	}
>>>>>>> 80a3dedf51b71eb76abe6b4fbe94021c07574fe8
}

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
	public void Specs() {
       wishlistLocators.Specs.click();
	}
	public void Wishlist() {
	   wishlistLocators.Wishlist.click();
	}
	public void Specs1() {
	       wishlistLocators.Specs2.click();
	}
	public void Wishlist1() {
	       wishlistLocators.Specs.click();
	}
	public void Removeproduct1() {
	       wishlistLocators.Removeproduct1.click();
	}
	
	public void Clearlist() {



<<<<<<< HEAD


//	  HelperClass.wait.until(ExpectedConditions.elementToBeClickable(wishlistLocators.Clearlist));
//      HelperClass.jse.executeScript("arguments[0].click()",wishlistLocators.Clearlist);


=======
	  HelperClass.wait.until(ExpectedConditions.elementToBeClickable(wishlistLocators.Clearlist));
      HelperClass.jse.executeScript("arguments[0].click()",wishlistLocators.Clearlist);





>>>>>>> 1c8d6ff8bd7b206051960586326b115c322c70d1
	}
}

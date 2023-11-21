package Actions;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
=======

		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(wishlistLocators.Clearlist));
		action.moveToElement(wishlistLocators.Clearlist).click().build().perform();;

>>>>>>> 691e2b04321874d781a60ed60670c038f6603ad6
	  HelperClass.wait.until(ExpectedConditions.elementToBeClickable(wishlistLocators.Clearlist));
      HelperClass.jse.executeScript("arguments[0].click()",wishlistLocators.Clearlist);


<<<<<<< HEAD







=======

       wishlistLocators.Clearlist.click();
       HelperClass.wait.until(ExpectedConditions.elementToBeClickable(wishlistLocators.Clearlist));
	   action.moveToElement(wishlistLocators.Clearlist).click().build().perform();;

=======

	  HelperClass.wait.until(ExpectedConditions.elementToBeClickable(wishlistLocators.Clearlist));
      HelperClass.jse.executeScript("arguments[0].click()",wishlistLocators.Clearlist);

>>>>>>> de7150bb296cb19b445d889bde7e5e4bc7f70ddb
>>>>>>> 691e2b04321874d781a60ed60670c038f6603ad6
	}
}

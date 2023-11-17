package Actions;

<<<<<<< HEAD
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
=======
import java.time.Duration;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
>>>>>>> 8cecd09de1e1bd3c6baaa969425d01bd9602e91d

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
		wishlistLocators.Clearlist.click();
=======
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(wishlistLocators.Clearlist));
		action.moveToElement(wishlistLocators.Clearlist).click().build().perform();;
>>>>>>> 8cecd09de1e1bd3c6baaa969425d01bd9602e91d
	}
}

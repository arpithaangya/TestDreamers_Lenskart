package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListLoc {
	@FindBy(xpath = "(//a[@class='LastRowLink--2q7v0c eqjcih getGaData'])[1]")
	public WebElement Eyeglasses;

	
	@FindBy(xpath= "(//*[name()='svg' and @class='wishlist-icon'])[1]")
	public WebElement Wishlist;






    
	@FindBy(xpath= "(//*[name()='svg' and @class='wishlist-icon'])[2]")
    public WebElement Wishlist1;

	

	
	@FindBy(xpath="(//div[@class='ProductDetailsContainer--13hincy hTVnrF'])[1]")
	public WebElement Clickproduct1;
	
	@FindBy(xpath= "//*[name()=\"svg\" and @fill='red']")
	public WebElement Removeproduct1;
	

	
}

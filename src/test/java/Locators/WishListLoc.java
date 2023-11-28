package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListLoc {
	@FindBy(xpath = "//a[@id='lrd1']")
	public WebElement Eyeglasses;
//	@FindBy(xpath = "(//div[@class='ProductContainer--1h5el3b bIsubZ'])[1]")
//	public WebElement Specs;
//	@FindBy(xpath = "(//div[@class='ProductContainer--1h5el3b bIsubZ'])[2]")
//	public WebElement Specs2;
	
	
	@FindBy(xpath= "(//*[name()='svg' and @class='wishlist-icon'])[1]")
	public WebElement Wishlist;



	//@FindBy(xpath= "//*[name()='svg' and @class='wishlist-icon']")

    
	@FindBy(xpath= "(//*[name()='svg' and @class='wishlist-icon'])[2]")

	public WebElement Wishlist1;
	
	@FindBy(xpath="(//div[@class='ProductDetailsContainer--13hincy hTVnrF'])[1]")
	public WebElement Clickproduct1;
	
	@FindBy(xpath= " //*[name()=\"svg\" and @fill='red']")
	public WebElement Removeproduct1;
	
//	@FindBy(xpath= "//p[@class='NoProductsInfo--hfiv7x bqrwmG']")
//    public static WebElement AssertWishlist;

	
}

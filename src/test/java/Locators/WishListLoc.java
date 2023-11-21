package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListLoc {
	@FindBy(xpath = "//img[@src='https://static5.lenskart.com/media/catalog/product/pro/1/thumbnail/628x301/9df78eab33525d08d6e5fb8d27136e95//j/o/john-jacobs-jj-e10235-c7-eyeglasses_g_2375_image_pla.jpg']\r\n")
	public WebElement Eyeglasses;
	@FindBy(xpath = "(//div[@class='ProductContainer--jvh5co geQZLk'])[1]")
	public WebElement Specs;
	@FindBy(xpath = "(//div[@class='ProductContainer--jvh5co geQZLk'])[2]")
	public WebElement Specs2;
	
	
	@FindBy(xpath= "//*[name()='svg' and @class='wishlist-icon']")
	public WebElement Wishlist;
<<<<<<< HEAD


	@FindBy(xpath= "//div[@id='wishlistView']/div[3]/a")

	public WebElement Clearlist;

//	@FindBy(xpath= "//a[text()='Clear list']")
//    public WebElement Clearlist;

=======
	@FindBy(xpath= "//*[name()='svg' and @class='wishlist-icon']")
	public WebElement Wishlist1;
	@FindBy(xpath="(//a[@class='CrossIcon--ho5u3n cKXlGn cross-icon'])[1]")
	public WebElement Removeproduct1;
	
	
	
	
	@FindBy(xpath= "//a[@class=\"ClearButton--1ohs5m2 hDMYeE\"]")
	public WebElement Clearlist;
	
	
	
	@FindBy(xpath= "//p[@class='NoProductsInfo--hfiv7x bqrwmG']")
    public static WebElement AssertWishlist;
>>>>>>> 8b13bc37926866fdedd285402c2ac9fdd39e83db
	
}

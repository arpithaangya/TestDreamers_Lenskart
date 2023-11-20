package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListLoc {
	@FindBy(xpath = "//img[@src='https://static5.lenskart.com/media/catalog/product/pro/1/thumbnail/628x301/9df78eab33525d08d6e5fb8d27136e95//j/o/john-jacobs-jj-e10235-c7-eyeglasses_g_2375_image_pla.jpg']\r\n")
	public WebElement Eyeglasses;
	@FindBy(xpath = "//img[@SRC='https://static5.lenskart.com/media/catalog/product/pro/1/thumbnail/371x178/9df78eab33525d08d6e5fb8d27136e95//j/o/john-jacobs-jj-e13594-c3-eyeglasses_G_9908.jpg']")
	public WebElement Specs;
	@FindBy(xpath= "//*[name()='svg' and @class='wishlist-icon']")
	public WebElement Wishlist;
	@FindBy(xpath= "//a[text()='Clear list']")
    public WebElement Clearlist;
	
}

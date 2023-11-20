package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ServicesLoc {
	@FindBy(xpath ="//*[@id=\"footerContent\"]/div[1]/div[1]/div[1]/ul/li[1]/a")
	public WebElement Storelocator;
	@FindBy(xpath ="//input[@placeholder='Search by state/pincode/Locality']")
	public WebElement Search;
	@FindBy(xpath ="//a[text()='Buying Guide']")
	public WebElement Buyingguide ;
	@FindBy(xpath="//h3[text()='your']")
	public WebElement Text;
	@FindBy(xpath ="//*[@id=\"footerContent\"]/div[1]/div[1]/div[1]/ul/li[3]/a")
	public WebElement Framesize ;
	@FindBy(xpath ="//h1[text()='How to know your Face Size?']")
	public WebElement Facesize ;
	@FindBy(xpath ="//h1[text()='Buy The Best Eyewear From Lenskart']")
	public static WebElement Samepage ;

}

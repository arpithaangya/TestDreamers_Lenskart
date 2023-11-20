package Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EyeGlassesLoc {


	@FindBy(xpath = "//a[@id='lrd1']")
	public WebElement eyeglasses;
	
//	@FindBy(xpath = "//*[@id=\"next\"]/div[2]/div/div[1]/div[2]/div/div/div[3]/a/div")
//	public WebElement Viewrange;
	
	@FindBy(xpath = "//select[@class='SelectBox--1nxe8z9 eSxoXu']")
	public WebElement sortby;
	
	@FindBy(xpath = "//div[@class='ImageTextSection--htigz9 frbuWE']//child::span[contains(text(),'Full Rim')]")
	public WebElement frametype;
	
	@FindBy(xpath = "//*[@id=\"filter-item-image-5\"]/div/div[1]/img")
	public WebElement frameshape;
	
//	@FindBy(xpath="//*[@id=\"frame_color_id\"]/div[2]/div/div[1]/label/div")
//	public WebElement framecolour;
//	
	@FindBy(xpath="(//div[@class='WishlistContainer--1jtgryj idWPeU']//*[name()='svg' and @xmlns='http://www.w3.org/2000/svg'])[1]")
	public WebElement AddWishlist;
	
	@FindBy(xpath="//div[@class='ActionLink--q9i2mm hBIltA'][3]")
	public WebElement ClickWishlist;
	
	@FindBy(xpath="//div[@class='ProductDetailsContainer--5tx9a5 kskdFK']")
	public WebElement ClickProduct;
	
	@FindBy(xpath="//button[@id='btn-primary']")
	public WebElement Buynow;
	
	@FindBy(xpath = "//div[@class='Text--v1spdc dCEHEJ'][2]")
	public static WebElement Totalpayable;
}
	
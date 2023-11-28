package Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EyeGlassesLoc {


	@FindBy(xpath = "//a[@id='lrd1']")
	public WebElement eyeglasses;



    @FindBy(xpath = "//select[@class='SelectBox--j2i0rr fIEUVK']")
	public WebElement sortby;
	
	@FindBy(xpath = "//img[@class='ImageItem--3d2a48 ghDkGd']")
	public WebElement frametype;
	
	@FindBy(xpath = "(//img[@class='ImageItem--3d2a48 ghDkGd'])[9]")
	public WebElement frameshape;

	@FindBy(xpath="(//*[name()=\"svg\" and @class='wishlist-icon'])[1]")
	public WebElement AddWishlist;
	
//	@FindBy(xpath="//div[@class='ActionLink--q9i2mm hBIltA'][3]")
//	public WebElement ClickWishlist;
	
	@FindBy(xpath="//div[@class='ProductDetailsContainer--13hincy hTVnrF']")
	public WebElement ClickProduct;
	
	@FindBy(xpath="//button[@id='btn-primary'][1]")
	public WebElement Buynow;
	
	@FindBy(xpath = "//div[@class='Text--173l7i4 zkxId'][2]")
	public static WebElement Totalpayable;
}
	
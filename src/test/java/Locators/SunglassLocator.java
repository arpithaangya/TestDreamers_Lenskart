package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SunglassLocator {
	
	@FindBy(xpath= "//a[@id='lrd5']")
	public WebElement sunglass;
	
	@FindBy(xpath= "/html/body/div[2]/div[2]/main/div[1]/div/div[3]/div/div[1]/div[5]/div/div/div[3]/div[2]/span")
	public WebElement men;
	
	@FindBy(xpath= "//span[@class='CategoryText--jcpke7 gLdVLR'][contains(text(),'CLASSIC EYEGLASSES')]")
	public WebElement classic;
	
	@FindBy(xpath= "//div[@class='Homestyles__HomeWrapper-sc-mjuifw-0']//div[@class='CategoryCarouselstyles__ProductImageCarouselWrapper-sc-rgbt65-0 kBxXSX ga-banner-img-obeserver']")
	public WebElement range;
	
	@FindBy(xpath= "//a[@href='/sunglasses/special/vc-best-sellers.html']//div")
	public WebElement seller;
	
	@FindBy(xpath= "//select[@class='SelectBox--1nxe8z9 eSxoXu']")
	public WebElement sort;
	
	@FindBy(xpath= "//div[@class='ImageTextSection--htigz9 frbuWE']//span[contains(text(),'Half Rim')]")
	public WebElement filter;
	
	@FindBy(xpath= "//a[@href='/vincent-chase-vc-s15869-c2-sunglasses.html']")
	public WebElement glass;
	
	@FindBy(xpath= "//div[@class='AddToCartButtonWrapper--1hg45t hPBoBm']//child::button//following-sibling::button")
	public WebElement power;
	
	@FindBy(xpath= "//div[@class='PackageCardDetails--1rg2aqv iXAJwg']//child::h3//child::div[contains(text(),'Brown Tinted')]")
	public WebElement lenscolor;
	
	@FindBy(xpath= "//button[@class='PackageButton--16tnmu6 fXfipK']")
	public WebElement contbutton;
	
	@FindBy(xpath= "//button[@id='button']")
	public WebElement checkout;
	
	@FindBy(xpath= "//div[@class='CartStyles__HeadingText-sc-14bvp3n-6 bFjeHX']")
	public WebElement bill;
	
	
	
	
	
	
	
	
	

}

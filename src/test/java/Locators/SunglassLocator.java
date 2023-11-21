package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SunglassLocator {
	
	@FindBy(xpath= "//a[@id='lrd5']")
	public WebElement sunglass;
	
	@FindBy(xpath= "//div[@class='Homestyles__HomeWrapper-sc-mjuifw-0']//div[@class='CategoryCarouselstyles__ProductImageCarouselWrapper-sc-rgbt65-0 kBxXSX ga-banner-img-obeserver']")
	public WebElement range;
	
	@FindBy(xpath= "//a[@href='/sunglasses/special/vc-best-sellers.html']//div")
	public WebElement seller;
	
	@FindBy(xpath= "//select[@class='SelectBox--1nxe8z9 eSxoXu']")
	public WebElement sort;
	
	@FindBy(xpath= "//div[@class='ImageTextSection--htigz9 frbuWE']//span[contains(text(),'Half Rim')]")
	public WebElement filter;
	
	@FindBy(xpath= "(//div[@class='ProductContainer--jvh5co geQZLk'])[1]")
	public WebElement glass;
	
	@FindBy(xpath= "//button[@id='btn-primary']")
	public WebElement lens;
	
	@FindBy(xpath= "//div[text()='Single Vision']")
	public WebElement lensselect;
	
	@FindBy(xpath= "//div[text()='AntiGlare Premium']")
	public WebElement premiumlens;
	
	@FindBy(xpath= "//div[text()='Skip Coating']")
	public WebElement coating;
	
	@FindBy(xpath= "//button[@class='PackageButton--16tnmu6 fXfipK']")
	public  WebElement contbutton;
	
	@FindBy(xpath= "//button[@id='button']")
	public  WebElement checkout;
	
	@FindBy(xpath= "//div[@class='BreakUp--1nl0c86 gNLysE']//child::div[@class='Text--v1spdc dCEHEJ']//following-sibling::div")
	public  WebElement bill;
	
	
	
	
	
	
	
	
	

}

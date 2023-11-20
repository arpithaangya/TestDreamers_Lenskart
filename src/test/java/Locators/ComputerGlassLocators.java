package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputerGlassLocators {
	
	@FindBy(xpath = "//a[@id='lrd2']")
	public WebElement computerglasses;
	
	@FindBy(xpath = "//select[@class='SelectBox--1nxe8z9 eSxoXu']")
	public WebElement sortby;
	
	@FindBy(xpath = "(//div[@class='ProductContainer--jvh5co geQZLk'])[3]")
	public WebElement product;
	
	@FindBy(xpath = "//button[@id='btn-primary']")
	public WebElement buynow;
	
	@FindBy(xpath = "(//div[@class='BreakUp--1nl0c86 gNLysE'])[4]")
	public WebElement billdetails;
	
//	@FindBy(xpath = "//h2[text()='Select Lens Type']")
//	public WebElement lenstype;
//	
//	@FindBy(xpath = "//div[@class='LeftSection--109oxdj hNrgrk']")
//	public WebElement subtotal;
	
	@FindBy(xpath = "(//span[@class='Action--5zt8uv cxAKtg'])[1]")
	public WebElement remove;
	
	@FindBy(xpath = "(//div[@class='PopUpConfirm--19l7kh0 cizjfP'])[1]")
	public WebElement yesremove;
	
	@FindBy(xpath = "//div[text()='Your shopping cart is empty!']")
	public WebElement emptycart;
}

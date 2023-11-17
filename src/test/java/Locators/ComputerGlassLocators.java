package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputerGlassLocators {
	
	@FindBy(xpath = "//a[@id='lrd2']")
	public WebElement computerglasses;
	
	@FindBy(xpath = "//select[@class='SelectBox--1nxe8z9 eSxoXu']")
	public WebElement sortby;
	
	@FindBy(xpath = "//img[@src='https://static5.lenskart.com/media/catalog/product/pro/1/thumbnail/628x301/9df78eab33525d08d6e5fb8d27136e95//l/i/blue-block-phone-&-computer-glasses:-red-full-rim-round-lenskart-blu-lb-e14059-c3_lenskart-blu-lb-e14059-c3-eyeglasses_lenskart-blu-lb-e14059-c3-eyeglasses_eyeglasses_g_711623_02_2022.jpg']")
	public WebElement product;
	
	@FindBy(xpath = "//button[@id='btn-primary']")
	public WebElement buynow;
	
	@FindBy(xpath = "//div[text()='Bill Details']")
	public WebElement billdetails;
	
}

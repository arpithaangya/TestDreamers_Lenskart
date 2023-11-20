package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUsLocators {
	
	@FindBy(xpath = "//a[text()='We Are Hiring']")
	public WebElement weAreHiring;
	
	@FindBy(xpath = "(//h4[@class='section-subtitle'])[1]")
	public WebElement weAreHiringPageText;
	
	@FindBy(xpath = "//a[text()='Refer And Earn']")
	public WebElement referAndEarn;
	
	@FindBy(xpath = "//a[text()='About us']")
	public WebElement aboutUs;
	
	@FindBy(xpath = "//p[text()='GREAT QUALITY']")
	public WebElement aboutUsPageText;
	
	@FindBy(xpath = "//a[text()='Lenskart Coupons']")
	public WebElement lenskartCoupons;
	
	@FindBy(xpath = "//div[text()='Dhaakad Hai ft. Surya Kumar Yadav']")
	public WebElement lenskartCouponsPageText;
}
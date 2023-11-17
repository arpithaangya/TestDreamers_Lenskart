package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPageLocators {

	@FindBy(xpath="//div[@class='ActionLink--q9i2mm hBIltA']//child::span[contains(text(),'Sign Up')]")
	public WebElement signup;
	
	@FindBy(xpath="//input[@name='firstName']")
	public WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastName']")
	public WebElement lastName;
	
	@FindBy(xpath="//input[@name='mobile']")
	public WebElement mobile;
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath="//button[@id='remove-button']")
	public WebElement create;
	
	@FindBy(xpath="(//div[text()='Eyeglasses'])[2]")
	public WebElement welcomePageText;
}
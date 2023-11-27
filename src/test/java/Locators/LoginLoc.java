package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLoc {
		
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div[3]/div[2]/span[1]")
	public WebElement signin;
	
	@FindBy(name="emailOrPhone")
	public WebElement email;
	
	@FindBy(id="remove-button") public WebElement login;
	
	@FindBy(xpath="//input[@placeholder=\"Enter Password\"]")public WebElement password;
	
	@FindBy(xpath="(//*[@id=\"header\"]//div[@class='ActionLink--pfnxg2 eKBPua'])[2]")public WebElement profile;
	
	@FindBy(xpath="//*[@id=\"sign-in-form\"]/div/div[2]/div[4]/button")public WebElement forgot;
	
	@FindBy(xpath="//input[@class=\"FieldInput--13ohxtd cogzOy\"]") WebElement email1;
	@FindBy(id="remove-button") WebElement link;


	
	@FindBy(xpath="//a[text()='Logout']")
	public WebElement logout;
	
	@FindBy(xpath="//button[text()='Forgot password?']") public WebElement forgotpwd;
	
	@FindBy(xpath="//div[@class=\"ForgotPasswordOuter--83yk0 dFINRo\"]//child::input") public WebElement linkemail;
	
	@FindBy(xpath="//div[@class=\"ForgotPasswordOuter--83yk0 dFINRo\"]//child::button") public WebElement linksend;
	
	
	@FindBy(id="wzrk-cancel") public WebElement no;

	
	@FindBy(xpath="//div[@class=\"SubText--14ikyk4 iUbtcV\"]") public WebElement linkassert;
	
	
	@FindBy(xpath="//a[@href='https://www.facebook.com/Lenskartindia']") public WebElement facebook2;
	
	@FindBy(xpath="//a[@href='https://instagram.com/lenskart/']") public WebElement instagram;
	
	@FindBy(xpath="//a[@href='https://twitter.com/lenskartME']") public WebElement twitter;
	@FindBy(xpath = "//div[@class='wzrk-alert wiz-show-animate']") public WebElement popup;
}

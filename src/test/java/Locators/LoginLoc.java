package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLoc {
		
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div[3]/div[2]/span[1]")
	public WebElement signin;
	@FindBy(id="wzrk-confirm") 	public WebElement alertsign;
	
	@FindBy(name="emailOrPhone")
	public WebElement email;
	
	@FindBy(id="remove-button") public WebElement login;
	
	@FindBy(xpath="//input[@placeholder=\"Enter Password\"]")public WebElement password;
	
	@FindBy(xpath="(//div[@class=\"ActionLink--q9i2mm hBIltA\"])[2]")public WebElement profile;
	
	@FindBy(xpath="//*[@id=\"sign-in-form\"]/div/div[2]/div[4]/button")public WebElement forgot;
	
	@FindBy(xpath="//div/div/div/div/div/div[2]/div[1]/input") WebElement email1;
	@FindBy(id="remove-button") WebElement link;
	
	@FindBy(xpath="//*[@id=\"sign-in-form\"]/div/div[2]/div[2]/div[2]")
	public WebElement error;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div[3]/div[2]")
	public WebElement profilename;
	
	@FindBy(xpath="//a[text()='Logout']")
	public WebElement logout;
	
	@FindBy(xpath="//button[text()='Forgot password?']") public WebElement forgotpwd;
	
	@FindBy(xpath="//*[@id=\"next\"]/div[2]/div/div/div/div/div/div[2]/div[1]/input") public WebElement linkemail;
	@FindBy(id="remove-button") public WebElement linksend;
	
	
	@FindBy(id="wzrk-cancel") public WebElement no;
//	@FindBy(xpath="//div[@class=\"SubText--1ad6igv gwDPxG\"]") public WebElement linkassert;
	
	@FindBy(xpath="//*[@id=\"next\"]/div[2]/div/div/div/div/div/div[2]/div[2]") public WebElement linkassert;
	
	
	@FindBy(xpath="//a[@href='https://www.facebook.com/Lenskartindia']") public WebElement facebook2;
	
	@FindBy(xpath="//a[@href='https://instagram.com/lenskart/']") public WebElement instagram;
	
	@FindBy(xpath="//a[@href='https://twitter.com/lenskartME']") public WebElement twitter;
	@FindBy(xpath = "//div[@class='wzrk-alert wiz-show-animate']") public WebElement popup;
}

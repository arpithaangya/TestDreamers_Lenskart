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
	@FindBy(id="//*[@id=\"sign-in-form\"]/div/div[2]/div[3]/div[1]/input")public WebElement password;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div[3]/div[2]")public WebElement profile;
	@FindBy(xpath="//*[@id=\"sign-in-form\"]/div/div[2]/div[4]/button")public WebElement forgot;
	
	@FindBy(xpath="//div/div/div/div/div/div[2]/div[1]/input") WebElement email1;
	@FindBy(id="remove-button") WebElement link;
	
}

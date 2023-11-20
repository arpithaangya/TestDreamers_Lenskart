package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountLocator {
	
	@FindBy(xpath="//button[@id='wzrk-cancel']")
	public WebElement pop;
	
	@FindBy(xpath="(//span[@class='SpanButton--1uyszi7 Ycqhf'])[1]")
	 WebElement signin;
	
	@FindBy(name="emailOrPhone")
	 WebElement email;
	
	@FindBy(id="remove-button")
	public WebElement clickNext;
	
	@FindBy(xpath="//input[@type='password']")
	 WebElement password;
	
	
	

}

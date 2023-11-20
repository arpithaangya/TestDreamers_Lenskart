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
	
//	@FindBy(xpath="(//div[@class='ActionLink--q9i2mm hBIltA'])[2]")
//	public WebElement profile;
	
	
	
	@FindBy(xpath="//a[@href='/customer/account']")
	public WebElement myorder;
	
	@FindBy(xpath="(//a[@href='/customer/prescriptions/'])[1]")
	public WebElement account;
	
	@FindBy(xpath="//div[@class='login-panel']")
	public WebElement profile;
	
	@FindBy(xpath="(//a[@href='/customer/account/storecredit/'])[2]")
	public WebElement store;
	
	@FindBy(xpath="(//a[@href='/customer/account/edit/'])[2]")
	public WebElement accinfo;
	
	@FindBy(xpath="//input[@name='firstName']")
	public WebElement valuecheck;
	
	@FindBy(xpath="//button[@class='btn btn-success fs12 uppercase text-color-white font-bold']")
	public WebElement outlog;
	
	
	
	
	
	
	

	
	
	
	

}

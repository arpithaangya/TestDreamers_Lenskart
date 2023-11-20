package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchLocator {
	
	@FindBy(xpath= "//input[@class='SearchInputField--115tvnp iVNhmM']")
	public WebElement search;
	@FindBy(xpath= "//input[@name='Square']")
	public WebElement frameshape;
	
	@FindBy(xpath= "//input[@name='Wide']")
	public WebElement framesize;
	
	@FindBy(xpath= "//input[@name='Half Rim']")
	public WebElement frametype;
	
	@FindBy(xpath= "//select[@class='SelectBox--1nxe8z9 eSxoXu']")
	public WebElement searchsort;
	
	@FindBy(xpath= "//a[@href='/john-jacobs-jj-e13553-c5-eyeglasses.html']")
	public WebElement product;
	
	@FindBy(xpath= "//button[@id='btn-primary']")
	public WebElement lens;
	
	
	
	
	

}

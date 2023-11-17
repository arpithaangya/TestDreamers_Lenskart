package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KidsLoc {
		
	@FindBy(xpath="//*[@id=\"lrd11\"]") public WebElement Kids;
	
	@FindBy(xpath="(//a[@class=\"KidsCard--1qau3jo lerxIJ getGaData\"])[3]") public WebElement Sunglass;
	@FindBy(xpath="(//div[@class=\"ImageContainer--1o9gw5f hUliud\"])[1]") public WebElement select;
	
	
}

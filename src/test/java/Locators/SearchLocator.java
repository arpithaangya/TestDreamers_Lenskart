package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchLocator {
	
	@FindBy(xpath= "//input[@class='SearchInputField--115tvnp iVNhmM']")
	WebElement search;

}

package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KidsLoc {
		
	@FindBy(xpath="//*[@id=\"lrd11\"]") public WebElement Kids;
	
	@FindBy(xpath="(//img[@class=\"KidsImage--1dlkyfr loCRbV\"])[3]") public WebElement Sunglass;

	
	@FindBy(xpath="//h1[@class=\"Title--1mf9vro hPTYyn\"]") public WebElement head;
	
	@FindBy(xpath="//select[@class=\"SelectBox--j2i0rr LrSTC\"]") public WebElement sort;
	@FindBy(xpath="//div[@class=\"ListingStyles__RowWrapper-sc-hgixc8-0 iFGuaA\"]//div[@id=\"211378\"]") public WebElement select;
	@FindBy(xpath="(//img[@class=\"ProductImage--xka74 HxzMC\"])[1]") public WebElement imageone;
}

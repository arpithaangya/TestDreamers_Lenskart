package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KidsLoc {
		
	@FindBy(xpath="//*[@id=\"lrd11\"]") public WebElement Kids;
	
	@FindBy(xpath="(//a[@class=\"KidsCard--1qau3jo lerxIJ getGaData\"])[3]") public WebElement Sunglass;

	
	@FindBy(xpath="//h1[@class=\"Title--1mf9vro hPTYyn\"]") public WebElement head;
	
	@FindBy(xpath="(//select[@class=\"SelectBox--1nxe8z9 frwJLe\"])[1]") public WebElement sort;
	@FindBy(xpath="(//a[@class=\"AnchorWrapper--1smmibb iioefz\"])[1]") public WebElement select;
	@FindBy(xpath="(//img[@class=\"ProductImage--xka74 HxzMC\"])[1]") public WebElement imageone;
}

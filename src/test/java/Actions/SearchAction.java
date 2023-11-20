package Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Locators.SearchLocator;
import Utility.HelperClass;

public class SearchAction {
	static SearchLocator searchlocator = null;
	static Actions act = new Actions(HelperClass.getDriver());
	static JavascriptExecutor js = ((JavascriptExecutor) HelperClass.getDriver()); 

	public SearchAction() {
		this.searchlocator = new SearchLocator();
		PageFactory.initElements(HelperClass.getDriver(), searchlocator);
	}

	public static void setSearch(String product) {
		searchlocator.search.sendKeys(product);
	}

	public void entbutton() throws AWTException {
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void frameshape() {
		act.moveToElement(searchlocator.frameshape).click().build().perform();
		
	}

	public static void framesize() {
		act.moveToElement(searchlocator.framesize).click().build().perform();
		
	}

	public static void frametype() {
		act.moveToElement(searchlocator.frametype).click().build().perform();
	}

	

	public static void searchsort() {
		Select select = new Select(searchlocator.searchsort);
		select.selectByIndex(2);
	}

	public static void product() {
		searchlocator.product.click();
	}

	public static void lens() {
		searchlocator.lens.click();
	}
	
	public static void lensselect() {
		searchlocator.lensselect.click();
	}
	
	public static void premiumlens() {
		searchlocator.premiumlens.click();
	}
	
	public static void coating() {
		searchlocator.coating.click();
	}
	
	public void cont() {
		searchlocator.cont.click();
	}
	
	public  void outcheck() {
		searchlocator.outcheck.click();
	}
	
	public  void asbill() {
		Assert.assertEquals(searchlocator.asbill.getText(), "Bill Details");
	}
	

}

package Actions;

import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Locators.ComputerGlassLocators;
import Utility.HelperClass;

public class ComputerGlassActions {
	ComputerGlassLocators computerGlassLocators = null;
	String parentWindow= HelperClass.getDriver().getWindowHandle();
	
	public ComputerGlassActions() {
		this.computerGlassLocators = new ComputerGlassLocators();
		
		PageFactory.initElements(HelperClass.getDriver(),computerGlassLocators);
	}
	public void clickcomputerglasses() {
		computerGlassLocators.computerglasses.click();
	}
	public void clicksortby() {
		//computerGlassLocators.sortby.click();
		Select select = new Select(computerGlassLocators.sortby);
		select.selectByIndex(5);
	}
	public void clickproduct() {
		computerGlassLocators.product.click();
		Set<String> allWindows = HelperClass.getDriver().getWindowHandles();
		for(String curWindow : allWindows){
			HelperClass.getDriver().switchTo().window(curWindow);
		}
	}
	public void clickbuynow() {
		computerGlassLocators.buynow.click();
	}
	public String getbilldetails() {
		return computerGlassLocators.billdetails.getText();
	}
//	public void computer() {
//		
//	}
}

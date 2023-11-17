package Actions;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Locators.AboutUsLocators;
import Utility.HelperClass;

public class AboutUsActions {
	AboutUsLocators aboutUsLocators = null;
	String parentWindow= HelperClass.getDriver().getWindowHandle();
	
	public AboutUsActions() {
		this.aboutUsLocators = new AboutUsLocators();
		
		PageFactory.initElements(HelperClass.getDriver(),aboutUsLocators);
	}
	public void clickweAreHiring() {
		aboutUsLocators.weAreHiring.click();
		Set<String> allWindows = HelperClass.getDriver().getWindowHandles();
		for(String curWindow : allWindows){
			HelperClass.getDriver().switchTo().window(curWindow);
		}
	}
	public String getweAreHiringPageText() {
		return aboutUsLocators.weAreHiringPageText.getText();
	}
	public void clickreferAndEarn() {
		HelperClass.getDriver().switchTo().window(parentWindow);
		aboutUsLocators.referAndEarn.click();
		Set<String> allWindows = HelperClass.getDriver().getWindowHandles();
		for(String curWindow : allWindows){
			HelperClass.getDriver().switchTo().window(curWindow);
		}
	}
	public void clickaboutUs() {
		HelperClass.getDriver().switchTo().window(parentWindow);
		aboutUsLocators.aboutUs.click();
		Set<String> allWindows = HelperClass.getDriver().getWindowHandles();
		for(String curWindow : allWindows){
			HelperClass.getDriver().switchTo().window(curWindow);
		}
	}
	public String getaboutUsPageText() {
		return aboutUsLocators.aboutUsPageText.getText();
	}
	public void clicklenskartCoupons() {
		HelperClass.getDriver().switchTo().window(parentWindow);
		aboutUsLocators.lenskartCoupons.click();
		Set<String> allWindows = HelperClass.getDriver().getWindowHandles();
		for(String curWindow : allWindows){
			HelperClass.getDriver().switchTo().window(curWindow);
		}
	}
	public String getlenskartCouponsPageText() {
		return aboutUsLocators.lenskartCouponsPageText.getText();
	}
}

package Actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Locators.SearchLocator;
import Locators.SunglassLocator;
import Utility.HelperClass;

public class SunglassAction {
	SunglassLocator sunglassloc = null;
	Actions act = new Actions(HelperClass.getDriver());
	public SunglassAction() {
		this.sunglassloc= new SunglassLocator();
		PageFactory.initElements(HelperClass.getDriver(), sunglassloc);
	}
	
	public void sunglass() {
		act.moveToElement(sunglassloc.sunglass).click().build().perform();
	}
	
	public void range() {
		
	}
	
	public void seller() {
		//sunglassloc.seller.click();
	}
	
	public void sort() {
		Select select = new Select(sunglassloc.sort);
		select.selectByIndex(2);
		
	}
	public void filter() {
		sunglassloc.filter.click();
	}
	
	public void glass() {
		sunglassloc.glass.click();
	}
	
	public void lens() {
		sunglassloc.lens.click();
	}
	
	public void lenselect() {
		sunglassloc.lensselect.click();
	}
	
	public void lenscolor() {
		sunglassloc.premiumlens.click();
	}
	
	public void coating() {
		sunglassloc.coating.click();
	}
	public void contbutton() {
		sunglassloc.contbutton.click();
	}
	
	public void ckeckout() {
		sunglassloc.checkout.click();
	}
	
	public void bill() {
		String price =sunglassloc.bill.getText();
		Assert.assertEquals(sunglassloc.bill.getText(), price);
	}
	

}

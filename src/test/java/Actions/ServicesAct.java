package Actions;

import java.util.Set;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Locators.ServicesLoc;
import Utility.HelperClass;

public class ServicesAct {
	ServicesLoc ServicesLocators = null;
	Actions  action = new Actions(HelperClass.getDriver());
	public String str;
	public ServicesAct() {
			
	this.ServicesLocators = new ServicesLoc();
	   PageFactory.initElements(HelperClass.getDriver(),ServicesLocators);
    }
    public void Storelocator() {
    	str = HelperClass.getDriver().getWindowHandle();
       ServicesLocators.Storelocator.click();
       Set<String> allWindows = HelperClass.getDriver().getWindowHandles();
		for (String curWindow : allWindows) {
			HelperClass.getDriver().switchTo().window(curWindow);
		}
    }
    public void Search() {
	   ServicesLocators.Search.click();
	   ServicesLocators.Search.sendKeys("Chennai");
    }
    public void Buyingguide() {
    	HelperClass.getDriver().switchTo().window(str);
    	ServicesLocators.Buyingguide.click();
    	Set<String> allWindows = HelperClass.getDriver().getWindowHandles();
		for (String curWindow : allWindows) {
			HelperClass.getDriver().switchTo().window(curWindow);
		}
    }
    public void Text() {
       Assert.assertEquals(ServicesLocators.Text.getText(), "your");
    }
    public void Framesize() {
    	 HelperClass.getDriver().switchTo().window(str);
    	 ServicesLocators. Framesize.click();
    	 Set<String> allWindows = HelperClass.getDriver().getWindowHandles();
 		for (String curWindow : allWindows) {
 			HelperClass.getDriver().switchTo().window(curWindow);
 		}
    }
    public void Facesize() {
        Assert.assertEquals(ServicesLocators.Facesize.getText(), "HOW TO KNOW YOUR FACE SIZE?");
        HelperClass.getDriver().switchTo().window(str);
    }
    


}

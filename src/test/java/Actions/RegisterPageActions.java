package Actions;

import org.openqa.selenium.support.PageFactory;

import Locators.RegisterPageLocators;
import Utility.HelperClass;

public class RegisterPageActions {
	RegisterPageLocators registerPageLocators = null;
	String firstName,lastName,mobile,email,password;
	
	public RegisterPageActions() {
		this.registerPageLocators = new RegisterPageLocators();
		
		PageFactory.initElements(HelperClass.getDriver(),registerPageLocators);
	}
	public void clicksignup() {
		if(registerPageLocators.popup.isDisplayed()) {
			registerPageLocators.nothanks.click();
		}
		registerPageLocators.signup.click();
	}
	public void setfirstName(String firstName) {
		registerPageLocators.firstName.sendKeys(firstName);
	}
	public void setlastName(String lastName) {
		registerPageLocators.lastName.sendKeys(lastName);
	}
	public void setmobile(String mobile) {
		registerPageLocators.mobile.sendKeys(mobile);
	}
	public void setemail(String email) {
		registerPageLocators.email.sendKeys(email);
	}
	public void setpassword(String password) {
		registerPageLocators.password.sendKeys(password);
	}
	public void clickcreate() {
		registerPageLocators.create.click();
	}
	public String getWelcomePageText() {
		return registerPageLocators.welcomePageText.getText();
	}
	public void register(String firstName,String lastName,String mobile,String email,String password) {
		this.setfirstName(firstName);
		this.setlastName(lastName);
		this.setmobile(mobile);
		this.setemail(email);
		this.setpassword(password);
	}
}

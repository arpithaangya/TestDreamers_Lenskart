package Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EyeGlassesLoc {
	@FindBy(xpath = "//a[@id='lrd1']")
	public WebElement eyeglasses;
	
<<<<<<< HEAD
//	@FindBy(xpath = "//div[@class='GenderBox--1lhazic cFsEaE']//child::span[text()='Women']")
//	public WebElement women;
//	
//	@FindBy(xpath = "//span[text()='PREMIUM EYEGLASSES']")
//	public WebElement premiumnEyeglasses ;
//	
=======
>>>>>>> 8cecd09de1e1bd3c6baaa969425d01bd9602e91d
	@FindBy(xpath = "//*[@id=\"next\"]/div[2]/div/div[1]/div[2]/div/div/div[3]/a/div")
	public WebElement Viewrange;
	
	@FindBy(xpath = "//select[@class='SelectBox--1nxe8z9 eSxoXu']")
	public WebElement sortby;
	
	@FindBy(xpath = "//div[@class='ImageTextSection--htigz9 frbuWE']//child::span[contains(text(),'Full Rim')]")
	public WebElement frametype;
}
	
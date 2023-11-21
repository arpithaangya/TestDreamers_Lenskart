package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchLocator {
	
	@FindBy(xpath= "//input[@class='SearchInputField--115tvnp iVNhmM']")
	public WebElement search;
	@FindBy(xpath= "//input[@name='Square']")
	public WebElement frameshape;
	
	@FindBy(xpath= "//input[@name='Wide']")
	public WebElement framesize;
	
	@FindBy(xpath= "//input[@name='Half Rim']")
	public WebElement frametype;
	
	@FindBy(xpath= "//select[@class='SelectBox--1nxe8z9 eSxoXu']")
	public WebElement searchsort;



	//@FindBy(xpath= "//a[@href='/john-jacobs-jj-e13553-c5-eyeglasses.html']")
<<<<<<< HEAD

	


=======
=======
>>>>>>> de7150bb296cb19b445d889bde7e5e4bc7f70ddb

	//@FindBy(xpath= "(//div[@class='ProductContainer--jvh5co geQZLk'])[1]")


<<<<<<< HEAD
>>>>>>> 691e2b04321874d781a60ed60670c038f6603ad6


		
//	@FindBy(xpath= "(//div[@class='ProductContainer--jvh5co geQZLk'])[1]")

<<<<<<< HEAD

	@FindBy(xpath= "(//div[@class='ProductContainer--jvh5co geQZLk'])[1]")


=======

	//@FindBy(xpath= "(//div[@class='ProductContainer--jvh5co geQZLk'])[1]")



=======
>>>>>>> de7150bb296cb19b445d889bde7e5e4bc7f70ddb
>>>>>>> 691e2b04321874d781a60ed60670c038f6603ad6
	public WebElement product;
	
	@FindBy(xpath= "//button[@id='btn-primary']")
	public WebElement lens;
	
	@FindBy(xpath= "//div[text()='Single Vision']")
	public WebElement lensselect;
	
	@FindBy(xpath= "//div[text()='AntiGlare Premium']")
	public WebElement premiumlens;
	
	@FindBy(xpath= "//div[text()='Skip Coating']")
	public WebElement coating;
	
	@FindBy(xpath= "//div[@class='Text--b3mxso dWjjQS btnContinue']")
	public WebElement cont;
	
	@FindBy(xpath= "//button[@id='button']")
	public WebElement outcheck;
	
	@FindBy(xpath= "//div[@class='BreakUp--1nl0c86 gNLysE']//child::div[@class='Text--v1spdc dCEHEJ']//following-sibling::div")
	public  WebElement asbill;
	

	
	
	
	
	

}

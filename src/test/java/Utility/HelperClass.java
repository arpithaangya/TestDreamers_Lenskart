package Utility;


import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.internal.ClassHelper;

public class HelperClass {
	
	private static WebDriver driver;
	private static WebDriverWait wait;
	private static HelperClass helperClass;
	
	public final static int TIMEOUT =10;
	
	HelperClass(){
		driver = new EdgeDriver();
		wait = new WebDriverWait(driver,Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
	}
	
	public static void openPage(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void SetUpDriver() {
		
		if(helperClass == null) {
			helperClass = new HelperClass();
		}
	}
	
	public static void tearDown() {
		if(driver!= null) {
			driver.close();
			driver.quit();
		}
		
		helperClass = null;
	}

	
	
}
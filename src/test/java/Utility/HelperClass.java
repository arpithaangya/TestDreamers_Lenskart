package Utility;


import java.time.Duration;


import org.openqa.selenium.JavascriptExecutor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Definitions.SearchDefition;

public class HelperClass {
	
	private static WebDriver driver;
	public static WebDriverWait wait;
	private static HelperClass helperClass;
    public static JavascriptExecutor jse ;
	public static Logger log ;

	
	public final static int TIMEOUT =10;
	
	HelperClass(){
		driver = new ChromeDriver();
		jse = (JavascriptExecutor)driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
		log = LogManager.getLogger(SearchDefition.class);
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
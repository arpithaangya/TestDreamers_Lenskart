package Utility;


import java.time.Duration;
import org.apache.logging.log4j.*;

<<<<<<< HEAD
import org.openqa.selenium.JavascriptExecutor;
=======
<<<<<<< HEAD
import org.openqa.selenium.JavascriptExecutor;
=======
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
>>>>>>> ddcb22b0d6198e4620b0941ab58902e8b60ab824
>>>>>>> 8b13bc37926866fdedd285402c2ac9fdd39e83db
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Definitions.SearchDefition;

import Definitions.LoginDef;

public class HelperClass {
	
	private static WebDriver driver;
	public static WebDriverWait wait;
	private static HelperClass helperClass;
<<<<<<< HEAD
	public static Actions action=null;
=======
<<<<<<< HEAD
	public static JavascriptExecutor jse ;
=======
	public static Logger log ;
>>>>>>> ddcb22b0d6198e4620b0941ab58902e8b60ab824
	
>>>>>>> 8b13bc37926866fdedd285402c2ac9fdd39e83db
	public final static int TIMEOUT =10;
	public static org.apache.logging.log4j.Logger log;
	public static JavascriptExecutor jse;
	HelperClass(){
<<<<<<< HEAD
		driver = new ChromeDriver();
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
		action = new Actions(driver);
		jse = (JavascriptExecutor)driver;
		log = LogManager.getLogger(LoginDef.class);
=======
		driver = new EdgeDriver();
		jse = (JavascriptExecutor)driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
		log = LogManager.getLogger(SearchDefition.class);
>>>>>>> 8b13bc37926866fdedd285402c2ac9fdd39e83db
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
			log.info("Driver setUp Successfully");
		}
	}
	
	public static void tearDown() {
		if(driver!= null) {
			driver.close();
			driver.quit();
		log.info("Driver closed Successfully");
		}
		
		helperClass = null;
	}

	
	
}
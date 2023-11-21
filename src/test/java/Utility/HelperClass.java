package Utility;


import java.time.Duration;
import org.apache.logging.log4j.*;

<<<<<<< HEAD

import org.openqa.selenium.JavascriptExecutor;

=======
<<<<<<< HEAD

import org.openqa.selenium.JavascriptExecutor;


>>>>>>> 691e2b04321874d781a60ed60670c038f6603ad6
import org.openqa.selenium.JavascriptExecutor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

<<<<<<< HEAD
=======
=======
import org.openqa.selenium.JavascriptExecutor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
>>>>>>> de7150bb296cb19b445d889bde7e5e4bc7f70ddb
>>>>>>> 691e2b04321874d781a60ed60670c038f6603ad6
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Definitions.SearchDefition;
import Definitions.SunglassDefinition;
import Definitions.LoginDef;

public class HelperClass {
	
	private static WebDriver driver;
	public static WebDriverWait wait;
	private static HelperClass helperClass;

	public static Actions action=null;

	public static JavascriptExecutor jse ;

	public static Logger log ;
<<<<<<< HEAD

	

	public final static int TIMEOUT =10;

	
	HelperClass(){

=======
<<<<<<< HEAD

	public final static int TIMEOUT =10;

	HelperClass(){

=======
	public final static int TIMEOUT =10;
	HelperClass(){
>>>>>>> de7150bb296cb19b445d889bde7e5e4bc7f70ddb
>>>>>>> 691e2b04321874d781a60ed60670c038f6603ad6
		driver = new ChromeDriver();
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
		action = new Actions(driver);
		jse = (JavascriptExecutor)driver;
		log = LogManager.getLogger(LoginDef.class);
<<<<<<< HEAD

		
		jse = (JavascriptExecutor)driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
		log = LogManager.getLogger(SearchDefition.class);
		log = LogManager.getLogger(SunglassDefinition.class);
=======
<<<<<<< HEAD
     

//		driver = new EdgeDriver();
//		jse = (JavascriptExecutor)driver;
//		wait = new WebDriverWait(driver,Duration.ofSeconds(TIMEOUT));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
//		driver.manage().window().maximize();
//		log = LogManager.getLogger(SearchDefition.class);
=======
>>>>>>> de7150bb296cb19b445d889bde7e5e4bc7f70ddb
>>>>>>> 691e2b04321874d781a60ed60670c038f6603ad6

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
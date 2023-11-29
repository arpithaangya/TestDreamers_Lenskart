package Utility;


import java.time.Duration;

import org.apache.logging.log4j.*;


import org.openqa.selenium.JavascriptExecutor;



import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.JavascriptExecutor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Definitions.SearchDefition;
import Definitions.SunglassDefinition;

import Definitions.LoginDef;

public class HelperClass {
	
	private static WebDriver driver;
	public static WebDriverWait wait;
	private static HelperClass helperClass;
    public static JavascriptExecutor jse ;

	public static Logger log ;


	public static Actions action=null;

<<<<<<< HEAD

	



	



=======



>>>>>>> ddb3b16058ab02af7dd7fb7ec82dbf6aaa1ae8f9


	public final static int TIMEOUT =10;
	public HelperClass(){

		driver = new ChromeDriver();
        jse = (JavascriptExecutor)driver;

		

<<<<<<< HEAD
		wait = new WebDriverWait(driver,Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
		action = new Actions(driver);
		jse = (JavascriptExecutor)driver;
		log = LogManager.getLogger(LoginDef.class);
=======

>>>>>>> ddb3b16058ab02af7dd7fb7ec82dbf6aaa1ae8f9


     



		
	
		log = LogManager.getLogger(SearchDefition.class);
		log = LogManager.getLogger(SunglassDefinition.class);

     



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
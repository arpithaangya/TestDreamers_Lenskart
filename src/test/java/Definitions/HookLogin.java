package Definitions;




import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import Utility.HelperClass;
import io.cucumber.java.After;
public class HookLogin {
	@Before
	public static void setUp() {
		HelperClass.SetUpDriver();
	}
	
	@After
	public static void tearDown(Scenario scenario) {
		
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) HelperClass.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot,"image/png",scenario.getName());
		}
		//HelperClass.tearDown();
	}

}

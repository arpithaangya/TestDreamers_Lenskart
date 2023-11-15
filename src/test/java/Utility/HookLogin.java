package Utility;


import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
public class HookLogin {
	@Before
	public static void setUp() {
		HelperClass.SetUpDriver();
	}
	
	@After
	public static void tearDown(Scenario scenario) {
		//HelperClass.tearDown();
	}

}

package Runner;



//import org.testng.annotations.DataProvider;
//
//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
// 
//@RunWith(Cucumber.class)
//
//@CucumberOptions(tags="",features={"src\\test\\resources\\Feature\\search.feature","src\\test\\resources\\Feature\\account.feature","src\\test\\resources\\Feature\\categorysunglass.feature"},glue ="Definitions",plugin= {"json:target/cucumber-report.json"})
//
//
//
//
// 
//
//public class Runner extends AbstractTestNGCucumberTests {
//	
//
//}
//
//
//
//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(plugin = "json:target/cucumber-report.json",features={"src\\test\\resources\\Feature\\search.feature","src\\test\\resources\\Feature\\account.feature","src\\test\\resources\\Feature\\categorysunglass.feature"},
glue="Definitions")
public class Runner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
		}
	

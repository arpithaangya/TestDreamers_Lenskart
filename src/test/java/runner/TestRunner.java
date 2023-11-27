package Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="",features={"src\\test\\resources\\Feature\\FollowUs.feature","src\\test\\resources\\Feature\\ComputerGlass.feature","src\\test\\resources\\Feature\\search.feature","src\\test\\java\\Definitions\\AccountDefinitions.java"},glue ="Definitions",plugin= {"pretty", "html:target/Assessment-reports/Cucumber.html", "junit:target/Assessment-reports/Cucumber.xml", "json:target/Assessment-reports/Cucumber.json","rerun:target/failedrerun.txt"})

public class TestRunner extends AbstractTestNGCucumberTests{
	
//	@Override
//	@DataProvider(parallel = true)
//	public Object[][] scenarios() {
//		return super.scenarios();
//	}
}

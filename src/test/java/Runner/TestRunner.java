package runner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="ValidCredentials",features="C:\\Users\\ashekharangya\\Git Lenskart\\TestDreamers_Lenskart\\src\\test\\resources\\Feature\\Login.feature", glue="LenskartProject.Definitions")
public class TestRunner  extends AbstractTestNGCucumberTests{
	
	
}

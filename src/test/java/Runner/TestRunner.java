package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="",features={"src\\test\\resources\\Feature\\Register.feature","src\\test\\resources\\Feature\\ComputerGlass.feature","src\\test\\resources\\Feature\\AboutUs.feature"},glue ="Definitions",plugin= {"pretty", "html:target/Assessment-reports/Cucumber.html", "junit:target/Assessment-reports/Cucumber.xml", "json:target/Assessment-reports/Cucumber.json","rerun:target/failedrerun.txt"})

public class TestRunner extends AbstractTestNGCucumberTests{

}

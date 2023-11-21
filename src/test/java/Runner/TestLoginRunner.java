package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)

@CucumberOptions(tags="",features={"src\\test\\resources\\Feature\\Login.feature","src\\test\\resources\\Feature\\FollowUs.feature","src\\test\\resources\\Feature\\KidsGlasses.feature"},glue="Definitions",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestLoginRunner {

}

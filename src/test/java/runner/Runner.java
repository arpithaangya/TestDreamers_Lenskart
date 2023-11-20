package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
<<<<<<< HEAD
@CucumberOptions(tags="",features={"src\\test\\resources\\Feature\\search.feature","src\\test\\resources\\Feature\\account.feature","src\\test\\resources\\Feature\\categorysunglass.feature"},glue ="Definitions",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
=======
@CucumberOptions(tags="",features="src\\test\\resources\\Feature\\categorysunglass.feature",glue ="Definitions",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
>>>>>>> 7254c0d1b63f6e63ba6b5732cbe314077a471209

 

public class Runner {

}

package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
<<<<<<< HEAD
//@CucumberOptions(tags="",features="src\\test\\resources\\Feature\\categorysunglass.feature",glue ="Definitions",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
@CucumberOptions(tags="",features="src\\test\\resources\\Feature\\Register.feature",glue ="Definitions",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
=======
@CucumberOptions(tags="",features="src\\test\\resources\\Feature\\Login.feature",glue ="Definitions",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
>>>>>>> 529c7578e128ac74a73738952d7ab0c3d582d6a1

 

public class Runner {

}

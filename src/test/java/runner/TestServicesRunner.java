package Runner;

import org.junit.runner.RunWith;
 
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)

@CucumberOptions(tags="",features="src\\test\\resources\\Feature\\Wishlist.feature",glue="Definitions",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
 

public class TestServicesRunner {

}


//src\\test\\resources\\Feature\\Wishlist.feature
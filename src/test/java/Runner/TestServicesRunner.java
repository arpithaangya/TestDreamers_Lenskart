package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)

@CucumberOptions(tags="",features={"src\\test\\resources\\Feature\\Wishlist.feature","src\\test\\resources\\Feature\\EyeGlasses.feature","src\\test\\resources\\Feature\\Services.feature"},glue="Definitions",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
 
public class TestServicesRunner {
 
}


//src\\test\\resources\\Feature\\Wishlist.feature

//   @CucumberOptions(tags="",features={"src\\test\\resources\\Feature\\Wishlist.feature","src\\test\\resources\\Feature\\EyeGlasses.feature","src\\test\\resources\\Feature\\Services.feature"},glue ="Definitions",plugin= {"json:target/Assessment-reports/Cucumber.json"})
//   
//   public class  TestServicesRunner  extends AbstractTestNGCucumberTests{
//   	@Override
//   	@DataProvider(parallel = true)
//   	public Object[][] scenarios() {
//   		return super.scenarios();
//   	}
//   }
    
package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src\\test\\java\\Uber_Feature\\Ola.feature"},
		glue = {"StepDefinitions"},
		tags = "@All" ,
		plugin = {"pretty"}
		
		)
public class OlaTest {

}

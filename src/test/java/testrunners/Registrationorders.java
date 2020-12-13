package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = {"src\\test\\resources\\Registration.feature"},
		glue = {"step_definition"},
		plugin = {"pretty" ,"json:target/Myreports/reports.json","junit:target/Myreports/reports.xml"
				
		},
		
		monochrome = false,
		dryRun = false
//		strict = true
		

		)
		



public class Registrationorders {

}

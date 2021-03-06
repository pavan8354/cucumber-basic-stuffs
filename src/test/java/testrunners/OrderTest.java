package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = {"src\\test\\java\\Amazon_Feature\\order.feature"},
		glue = {"Step_Definitions","myhooks"},
		tags = "@Smoke or @Regression",
		plugin = {"pretty" ,"json:target/Myreports/reports.json","junit:target/Myreports/reports.xml"
				
		},
		
		monochrome = false,
		dryRun = false
//		strict = true
		

		)
		
public class OrderTest {

}

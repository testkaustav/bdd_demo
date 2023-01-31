package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = {"features"},
		
		glue = {"steps"},
		
		plugin = {"pretty", "json:target/json-report/reports.json"},
		
		//dryRun= false ,
		//Strict =true,
		//name = {"Multiple"}
		 
		monochrome = true,
		
		tags = "@K3"
		
		
		)

public class TestRunnerClass {

}

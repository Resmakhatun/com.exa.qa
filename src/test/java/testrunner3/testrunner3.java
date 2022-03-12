package testrunner3;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class testrunner3 {
	@CucumberOptions(features = {"src/test/resources/features"} , 
			plugin = {"json:target/cucumber.json"},
			glue = "stepdef")

			//tags= {""})
			public class testrunner extends AbstractTestNGCucumberTests {

			}



}

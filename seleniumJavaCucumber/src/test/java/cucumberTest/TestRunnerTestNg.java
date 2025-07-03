package cucumberTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources" },
				 glue = { "com.stepDefinations" }, 
				 plugin = { "pretty",
		"html:target/htmlreport.html" },
				 tags = "@auth and @regression and not @pref")

public class TestRunnerTestNg extends AbstractTestNGCucumberTests{

}
package amazonRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features= {"@target/failedfrom.txt"},
		glue= {"amazonStepDefClass","apphooks"},
		plugin={"pretty","rerun:target/failedfrom.txt"},
		publish=true
)


public class AmazonRunnerClass extends AbstractTestNGCucumberTests
{
	

}

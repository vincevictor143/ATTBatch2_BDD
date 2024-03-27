package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features= {"src\\test\\resources\\AppFeature"},
		glue= {"stepsClass","apphooks"},
		plugin= {"pretty"}
)

public class AmazonRunner extends AbstractTestNGCucumberTests
{
	
}

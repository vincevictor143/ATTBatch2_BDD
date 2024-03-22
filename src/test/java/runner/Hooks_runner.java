package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions 
(
		features= {"src\\test\\resources\\TestFolder\\HooksFeature.feature"},
		glue= {"steps","hooks"},
		plugin= {"pretty"},
		publish=true
)
public class Hooks_runner extends AbstractTestNGCucumberTests 
{

}

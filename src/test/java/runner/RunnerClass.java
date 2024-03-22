package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features= {"src\\test\\resources\\TestFolder\\ScenarioOutlineFeature.feature"},
		glue= {"steps"},
		publish=true,
		plugin= {"pretty"}
)
public class RunnerClass extends AbstractTestNGCucumberTests
{
      
}

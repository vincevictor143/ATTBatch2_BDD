package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features= {"src\\test\\resources\\TestFolder\\CampaignStatus.feature"},
		glue= {"steps","hooks"},
		publish=true,
		plugin= {"pretty"},
		tags="@functional",
		dryRun=true
		
)

public class Tag_Campaign_RunnerClass extends AbstractTestNGCucumberTests
{

}

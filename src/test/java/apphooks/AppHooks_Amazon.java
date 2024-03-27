package apphooks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import qa.DriverFactory;

public class AppHooks_Amazon
{
	 @Before
	 public void launchBrowser() throws IOException
	 {
		 Properties prop=new Properties();
		 String path=System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties";
		 FileInputStream fis=new FileInputStream(path);
		 prop.load(fis);
		 String browsername=prop.getProperty("browsername");
		 DriverFactory df=new DriverFactory();
		 WebDriver driver = df.initBrowser(browsername);
		 driver.manage().window().maximize();
	 }
	 
	 @After(order=2)
	 public void failedScenarioScreenshot(Scenario scenario)
	 {
		 boolean status=scenario.isFailed(); // True 
		 if(status)
		 {
		 String scenarioName=scenario.getName();
		 String name=scenarioName.replaceAll(" ", "");
		 TakesScreenshot ts=(TakesScreenshot)DriverFactory.getDriver();
		 byte[] source=ts.getScreenshotAs(OutputType.BYTES);
		 scenario.attach(source, "image/png", name);
		 }
		 
	 }
	 
	 @After(order=1)
	 public void tearDown()
	 {
		  WebDriver driver = DriverFactory.getDriver();
		  driver.quit();
	 }

}

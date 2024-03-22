package apphooks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
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
		 String browsername=prop.getProperty("browerName");
		 DriverFactory df=new DriverFactory();
		 WebDriver driver = df.initBrowser(browsername);
		 driver.manage().window().maximize();
	 }
	 @After
	 public void tearDown()
	 {
		  WebDriver driver = DriverFactory.getDriver();
		  driver.quit();
	 }

}

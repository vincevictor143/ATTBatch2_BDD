package qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory
{
	  static WebDriver driver;
	  
	  // 1st method of driver object 
	  
	  public  WebDriver initBrowser(String browserName)
	  {
		  if(browserName.equalsIgnoreCase("Chrome"))
		  {
			   driver=new ChromeDriver();
		  }
		  else if(browserName.equalsIgnoreCase("Firefox"))
		  {
			   driver=new FirefoxDriver();
		  }
		  else
		  {
			    driver=new EdgeDriver();
		  }

		  return driver;
		  
	  }
	  
	  public  static WebDriver getDriver()
	  {
		  		return driver;
	  }

}

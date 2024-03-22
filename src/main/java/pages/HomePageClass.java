package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageClass
{
	WebDriver driver;
	
	WebDriverWait wait;
	
	 @FindBy(xpath="//div[@id=\"nav-cart-count-container\"]")
	  private WebElement cartIcon;
	 
	 @FindBy(xpath="//a[@id=\"nav-link-accountList\"]")
	 private WebElement helloSign;
	 
	 @FindBy(xpath="//a[@class=\"nav-action-signin-button\"]/parent::div[@id=\"nav-flyout-ya-signin\"]")
	 private WebElement signButton;
	 
	 @FindBy(xpath="//input[@id=\"ap_email\"]")
	 private WebElement emailField;
	 
	 @FindBy(xpath="//input[@id=\"continue\"]")
	 private WebElement continueButton;
	 
	 @FindBy(xpath="//input[@id=\"ap_password\"]")
	 private WebElement passwordField;
	 
	 @FindBy(xpath="//input[@id=\"signInSubmit\"]")
	 private WebElement finalSignButton;
	 
	 @FindBy(xpath="//li[@class=\"a-carousel-card\"]/ancestor::div[@id=\"gw-desktop-herotator\"]")
	 private WebElement holiCourousel;
	 
	 @FindBy(xpath="//span[@id=\"glow-ingress-line1\"]")
	 private WebElement pincode;
	 
	 // Constructor 
	 
	 public HomePageClass(WebDriver driver)
	 {
		   this.driver=driver;
		   wait=new WebDriverWait(driver,Duration.ofSeconds(100));
	 }
	 
	 public String getTitle()
	 {
		    String title=driver.getTitle();
		    return title;
	 }
	 
	 public boolean verifyCart()
	 {
		  boolean isDisplay=cartIcon.isDisplayed();
		  return isDisplay;
	 }
	 
	 public void gotoSignInPage()
	 {
		   Actions a=new Actions(driver);
		   a.moveToElement(helloSign).perform();
		   signButton.click();
	 }
	 
	 public void enterUsername(String user)
	 {
		 emailField.sendKeys(user);
		 continueButton.click();
	 }
	 
	 public void finalSign(String pwd)
	 {
		 passwordField.sendKeys(pwd);
		 finalSignButton.click();
	 }
	 
	 public void holiSectionDeal()
	 {
		wait.until(ExpectedConditions.visibilityOf(holiCourousel));
		 holiCourousel.click();
	 }
	 
	 public String pinCodeVerify()
	 {
		 String x=pincode.getText();
		 return x;
	 }
	 
	 
	 
	 

}

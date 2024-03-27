package amazonStepDefClass;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageClass;
import qa.DriverFactory;

public class HomePageSteps 
{
	HomePageClass homepage=new HomePageClass(DriverFactory.getDriver());

	@Given("user is at landing page")
	public void user_is_at_landing_page() 
	{
		  WebDriver driver = DriverFactory.getDriver();
		  driver.get("https://www.amazon.in/");
	}

	@Then("page title should contain the {string}")
	public void page_title_should_contain_the(String titleString) throws InterruptedException 
	{
		String title=homepage.getTitle();
		Thread.sleep(3000);
		boolean ispresent=title.contains(titleString);
		Assert.assertTrue(ispresent);
	}

	@Then("Cart icon should get displayed")
	public void cart_icon_should_get_displayed() throws InterruptedException 
	{
			Thread.sleep(3000);
		     boolean isdisplay = homepage.verifyCart();
		     Assert.assertTrue(isdisplay);
	}

	@When("user click on signin button")
	public void user_click_on_signin_button() 
	{
		  homepage.gotoSignInPage();
	}

	@When("user enters the username as {string}")
	public void user_enters_the_username_as(String usr) throws InterruptedException 
	{
		Thread.sleep(3000);
		 homepage.enterUsername(usr);
	}

	@When("user enters the password as {string}")
	public void user_enters_the_password_as(String pwd) throws InterruptedException
	{
		 Thread.sleep(3000);
		  homepage.finalSign(pwd);
	}

	@Then("user should be logged in")
	public void user_should_be_logged_in() 
	{
		   String textValue = homepage.pinCodeVerify();
		   Assert.assertEquals(textValue,"Delivering to Pune 411048");
	}

}

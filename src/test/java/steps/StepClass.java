package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepClass 
{
	@Given("User is at login screen")
	public void user_is_at_login_screen() 
	{
	      System.out.println("Login Screen");
	}

	@When("User click on login button")
	public void user_click_on_login_button() 
	{
		 System.out.println("Click on Login Button");
	}

	@Then("User should be logged in")
	public void user_should_be_logged_in() 
	{
		 System.out.println("User is available at home page");
	}
	
	@Given("User is at Order Page")
	public void user_is_at_order_page() 
	{
	    System.out.println("Order Page Opened ");
	}

	@Then("User should be able to see the order details")
	public void user_should_be_able_to_see_the_order_details() 
	{
	    System.out.println("User can see the details of order");
	}
	
	@Given("User should have chrome browser")
	public void user_should_have_chrome_browser() 
	{
	    System.out.println("Pre-reqquisites step 1");
	}

	@Then("User should launch the browser")
	public void user_should_launch_the_browser() 
	{
		System.out.println("Pre-reqquisites step 2");
	}

	@When("User Enters username {string}")
	public void user_enters_username(String victor) 
	{
	      System.out.println("Username added "+victor);
	}

	@When("User Enter password {int}")
	public void user_enter_password(Integer x) 
	{ 
	     System.out.println("Password added "+x);
	}


}

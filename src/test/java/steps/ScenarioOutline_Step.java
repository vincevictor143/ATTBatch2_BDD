package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutline_Step 
{
	@Given("User should be at login Page")
	public void user_should_be_at_login_page() 
	{
	       System.out.println("Login page");
	}

	@When("User should enter the username {string}")
	public void user_should_enter_the_username(String Username)
	{
		 System.out.println("Enter the username"+Username);
	}

	@When("User should enter the password {string}")
	public void user_should_enter_the_password(String Password) 
	{
		 System.out.println("Enter the password"+Password);
	}

	@When("User should click on the login button")
	public void user_should_click_on_the_login_button() 
	{
		System.out.println("Click on Login button");
	}

	@Then("User should be able to see home page")
	public void user_should_be_able_to_see_home_page()
	{
		System.out.println("user is successfully logged in");
	}
	
	
	@Given("User should be at login Page1")
	public void user_should_be_at_login_page1() 
	{
	     System.out.println("Login1");
	}

	@When("User should enter the username1")
	public void user_should_enter_the_username1() 
	{
		System.out.println("Username1");
	}

	@When("User should enter the password1")
	public void user_should_enter_the_password1() 
	{
		System.out.println("Password1");
	}

	@When("User should click on the login button1")
	public void user_should_click_on_the_login_button1() 
	{
		System.out.println("Login button click1");
	}

	@Then("User should be able to see home page1")
	public void user_should_be_able_to_see_home_page1() 
	{
		System.out.println("success");
	}
	
	@Given("User should launch the browser1")
	public void user_should_launch_the_browser1() 
	{
	    System.out.println("Pre-Condition 1");
	}

	@When("User should have updated browser")
	public void user_should_have_updated_browser()
	{
		 System.out.println("Pre-Condition 2");
	}


}

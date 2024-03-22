package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tags_Campaign_Steps 
{
	@Given("User is campaign page")
	public void user_is_campaign_page()
	{
	      System.out.println("Campaign page opened");
	}

	@When("user click on the create Campaign")
	public void user_click_on_the_create_campaign() 
	{
		System.out.println("Click on create button of campaign");
	}

	@When("User enters the required information")
	public void user_enters_the_required_information() 
	{
		System.out.println("Enter Info");
	}

	@When("User clicks on the save button")
	public void user_clicks_on_the_save_button() 
	{
		System.out.println("Click on Save button");
	}

	@Then("Campaign should get started")
	public void campaign_should_get_started() 
	{
		System.out.println("Campaign Should get created");
	}

	@When("user click on the schedule Campaign")
	public void user_click_on_the_schedule_campaign()
	{
		System.out.println("Click on Schedule");
	}

	@When("User enters the sending information")
	public void user_enters_the_sending_information() 
	{
		System.out.println("Enter the sending info");
	}

	@When("User clicks on the schedule button")
	public void user_clicks_on_the_schedule_button() 
	{
		System.out.println("Click on schedule button");
	}

	@Then("Campaign should get scheduled")
	public void campaign_should_get_scheduled()
	{
		System.out.println("Campaign should scheduled");
	}

	@When("user click on the sent Campaign")
	public void user_click_on_the_sent_campaign() 
	{
		System.out.println("Click on sent Campaign");
	}

	@Then("User should see the sent Campaign")
	public void user_should_see_the_sent_campaign() 
	{
		System.out.println("Success for  sent Campaign");
	}


}

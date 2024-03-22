package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks_Step 
{
	
	@Given("User should be at home page")
	public void user_should_be_at_home_page() 
	{
	     System.out.println("User is at home page of app");
	}

	@When("User clicks on add profile button")
	public void user_clicks_on_add_profile_button() 
	{
		 System.out.println("Click on Profile button");
	}

	@When("User uploads the image")
	public void user_uploads_the_image() 
	{
		System.out.println("Upload Image");
	}

	@Then("User profile should get added")
	public void user_profile_should_get_added() 
	{
		System.out.println("Profile Uploaded");
	}

	@When("User clicks on edit option")
	public void user_clicks_on_edit_option()
   {
		System.out.println("Click on Edit  button");
	}

	@When("Upload the Image")
	public void upload_the_image()
	{
		System.out.println("Upload image for editing");
	}

	@Then("Profile should get update")
	public void profile_should_get_update() 
	{
		System.out.println("profile should get updated ");
	}

	@When("User clicks on delete profile button")
	public void user_clicks_on_delete_profile_button() 
	{
		System.out.println("Delete Button");
	}

	@Then("Profile should get deleted")
	public void profile_should_get_deleted() 
	{
		System.out.println("Image got deleted ");
	}

}

package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import io.cucumber.datatable.DataTable;

public class DataTable_Step 
{
	@Given("User should be at Sign up page")
	public void user_should_be_at_sign_up_page() 
	{
	    System.out.println("Signup Page");
	}

	@When("User should click on the Signup button")
	public void user_should_click_on_the_signup_button() 
	{
		 System.out.println("Signup Button");
	}

	@When("User should enter the required below information")
	public void user_should_enter_the_required_below_information(DataTable dataTable)
	{
			 List<List<String>> data = dataTable.asLists(String.class); // 
			 
			 for(List<String> listvalue:data)
			 {
				  System.out.println(listvalue);
			 }
			 
			 List<String> l1=data.get(1); // Second list 
			 String cityName=l1.get(1);
			 
			 System.out.println("CityName: "+cityName);
			 
	}

	@When("User should click on Submit button")
	public void user_should_click_on_submit_button() 
	{
		 System.out.println("Signup Submit button");
	}

	@Then("User registration done successfully")
	public void user_registration_done_successfully()
	{
		 System.out.println("Success !!!!");
	}

}

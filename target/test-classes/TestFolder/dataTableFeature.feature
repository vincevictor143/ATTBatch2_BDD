Feature: Registration Functionality 
Scenario: Verify the Signup functionality
Given User should be at Sign up page 
When User should click on the Signup button 
And User should enter the required below information
|vince|Pune|827372737|Mahrashtra|
|rahul|agra|273772728|UP|
And User should click on Submit button 
Then User registration done successfully
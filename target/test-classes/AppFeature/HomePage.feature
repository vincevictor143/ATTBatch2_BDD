Feature: HomePage Functionality 

Scenario: Validate Title 
Given user is at landing page 
Then page title should contain the "Shopping"

Scenario: Verify the cart icon 
Given user is at landing page
Then Cart icon should get displayed 

Scenario: Login to app 
Given user is at landing page
When user click on signin button 
And user enters the username as "test"
And user enters the password as "welcome1"
Then user should be logged in


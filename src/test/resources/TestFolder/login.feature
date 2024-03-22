Feature: login functionality 
Background: 
  Given User should have chrome browser  
  Then User should launch the browser 
  
Scenario: login with valid credentials 
Given User is at login screen 
When User Enters username "vince"
And User Enter password 12355
And User click on login button 
Then User should be logged in

Scenario: Order functionality
Given User is at Order Page
Then User should be able to see the order details 

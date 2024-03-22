Feature: Login Functionality 

Background:
   Given User should launch the browser1 
   When User should have updated browser

Scenario Outline: Verify the login functionality of application for test data  
Given User should be at login Page
When User should enter the username "<UserName>"
And User should enter the password "<Password>"
And User should click on the login button 
Then User should be able to see home page


Examples:

|UserName|Password|
|Vince|261651|
|Victor|322662|
|John|36632|
|Rincy|61515|

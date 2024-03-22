
Feature: Campaign Functionality 

@functional
Scenario: creation of Campaign 
Given User is campaign page 
When user click on the create Campaign 
And User enters the required information 
And User clicks on the save button 
Then Campaign should get started 

@sanity
Scenario: Scheduling a campaign 
Given User is campaign page 
When user click on the schedule Campaign 
And User enters the sending information 
And User clicks on the schedule button 
Then Campaign should get scheduled 

@regression @functional
Scenario: Sent Campaign 
Given User is campaign page 
When user click on the sent Campaign 
Then User should see the sent Campaign 

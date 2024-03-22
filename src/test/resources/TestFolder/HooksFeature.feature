Feature: Profile functionality
Scenario: Add Profile for user
Given User should be at home page
When User clicks on add profile button 
And User uploads the image 
Then User profile should get added 


Scenario: Update profile for user 
Given User should be at home page 
When User clicks on edit option 
And Upload the Image 
Then Profile should get update 

Scenario: Delete profile for user 
Given User should be at home page
When User clicks on delete profile button 
Then Profile should get deleted 


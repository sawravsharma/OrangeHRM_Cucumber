Feature: Checking login functionality of OrangeHrm
Scenario: Checking login functionality with valid username and password
Given User is on a login page
Then User enters username in username textfield
Then User enters password in password textfield
Then User clicks on login button
Then User is on a home page
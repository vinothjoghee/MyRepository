Feature: Login to facebook

Scenario: Home Page login
Given Landing to the facbook homepage
When user login into application with valid username and password
Then Home Page is displayed 
And Homepage title is displayed

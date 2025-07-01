Feature: Login

Scenario: As a User I want to login in to system

Given I am a User
When I entered valid Username and Password
And I click on submit button
Then I should navigate to login page
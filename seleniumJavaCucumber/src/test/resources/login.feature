Feature: Login

@nonauth
Scenario Outline: As a User I want to login in to system

Given I am a User
When I entered valid "<username>" and "<password>"
And I click on submit button
Then I should navigate to login page

 Examples:
    |  username | password |
    | Admin | admin123 |
#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


Feature: My information

@auth
Scenario: Verify cliking on my info side bar navigating to Personal Details Page
Given I have logged in as Admin
When I click on my info side bar meanu
Then I should navigate to Personal details page

@regression
Scenario: Test Scenario for tags regression
Given
When
Then

@regression @auth
Scenario: Test Scenario for tags  regression auth
Given
When
Then

@regression @pref
Scenario: Test Scenario for tags regression auth pref
Given
When
Then

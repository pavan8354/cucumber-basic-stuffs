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
Feature: User Registration

Scenario: User Registration with different data

Given User is on Registration page

When User wants to fill following details

	|firstname|lastname |email                  |phoneneumber |city        |
	|Pavan    | Gowda   |  pavan235@gmail.com   | 28000       | Bangalore  |
	|Maruthi  | Gowda   |  mar23@gmail.com      | 29000       | Mangalore  |
	 
Then user registration is successfull
	



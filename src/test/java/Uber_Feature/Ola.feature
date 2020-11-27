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
@tag
Feature: Ola booking feature
  I want to use this template for my feature file

  @tag1
  Scenario: user wants to Book the cab in ola
    Given I want to book the "Sedan" Cab in ola
    Then User wants to travel from "Bangalore" to "Mangalore"
    Then Driver rides the Car
    Then Driver ends the journey
    Then User pays the total fare of 1000 INR 
    Then User recieves the cashback of 10000 INR in Wallet
    

  
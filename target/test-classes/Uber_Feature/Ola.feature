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

Feature: Ola booking feature
  I want to use this template for my feature file

@Smoke
  Scenario: user wants to Book the cab in ola
    Given I want to book the "Sedan" Cab in ola
    Then User wants to travel from "Bangalore" to "Mangalore"
    Then Driver rides the Car
    Then Driver ends the journey
    Then User pays the total fare of 1000 INR 
    Then User recieves the cashback of 10000 INR in Wallet
    
@Regression @Smoke
  Scenario: user wants to Book the cab in ola
    Given I want to book the "MINI" Cab in ola
    Then User wants to travel from "Bangalore" to "Mysore"
    Then Driver rides the Car
    Then Driver ends the journey
    Then User pays the total fare of 10000 INR 
    Then User recieves the cashback of 100000 INR in Wallet
 
 @Production   
    Scenario: user wants to Book the cab in ola
    Given I want to book the "MINI" Cab in ola
    Then User wants to travel from "Bangalore" to "Mysore"
    Then Driver rides the Car
    Then Driver ends the journey
    Then User pays the total fare of 5000 INR 
    Then User recieves the cashback of 2500 INR in Wallet
    
    
  
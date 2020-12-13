Feature: User Registration

Scenario: User Registration with different data

Given User is on Registration page

When User wants to fill following details

	|Pavan | Gowda| 28 | pavan235@gmail.com | 28000| Bangalore |
	|Maruthi | Gowda| 29 | mar23@gmail.com | 29000| Mangalore |
	
Then user registration is successfull
	


@Smoke
  Scenario: user wants to Book the cab in ola
    Given I want to book the "Sedan" Cab in ola
    Then User wants to travel from "Bangalore" to "Mangalore"
    Then Driver rides the Car
    Then Driver ends the journey
    Then User pays the total fare of 1000 INR 
    Then User recieves the cashback of 10000 INR in Wallet
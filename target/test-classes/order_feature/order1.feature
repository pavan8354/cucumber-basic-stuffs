Feature: User Registration 

Scenario: User Registration with different data with columns

Given User is on Registration page

When User wants to fill following details with columns

	|firstname|lastname|email|phoneneumber|city|
	|Pavan | Gowda| 28 | pavan235@gmail.com | 28000| Bangalore |
	|Maruthi | Gowda| 29 | mar23@gmail.com | 29000| Mangalore |
	
Then user registration is successfull
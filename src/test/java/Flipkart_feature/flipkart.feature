Feature: Login Feature

Scenario Outline: Login fail - possible condition


Given User is on Application Landing Page
When User clicks on sigin in button
Then User is displayed Login Screen
When User enters <"Username">in username field
And User enters <"Password"> in Password field
And User clicks on sigin button
Then User gets Login fauled error message

	Examples:
		|Username       |Password  |
		|incorrect			|incorrect |
		|incorrect1			|incorrect1|
		|incorrect2			|incorrect2|	
Feature: BillingFeature

Scenario Outline: Billing Amount


Given User is on Billing amount
When User enters Billing Amount <Billingamount>
When user enters tax amount <taxamount>
And user clicks on calculate amount
Then it gives the final amount <finalamount>


	Examples:
		|Billingamount|taxamount|finalamount|
		|1000					|10				|1010				|
		|2000					|10				|2010				|
		|3000					|10.5			|3010.5			|
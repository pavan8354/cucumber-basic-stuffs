package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Search_Steps1 {
	
	
	@Given("I want to book the {string} Cab in ola")
	public void i_want_to_book_the_cab_in_ola(String cartype) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("step1"+"The obtained car type"+cartype);
	}

	@Then("User wants to travel from {string} to {string}")
	public void user_wants_to_travel_from_to(String pickuplocation, String droplocation) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("step2"+"------------>" +pickuplocation +"--------->"+ droplocation);
	}

	@Then("Driver rides the Car")
	public void driver_rides_the_car() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("step3"+"Driver rides the car");
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("step4"+"Driver stops the car");
	}

	@Then("User pays the total fare of (\\d+) INR")
	public void user_pays_the_total_fare_of_inr(Integer price) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("step5"+"User pays an amount of total fare"+price);
	}

	@Then("User recieves the cashback of {int} INR in Wallet")
	public void user_recieves_the_cashback_of_inr_in_wallet(Integer price) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("step6"+"User recieves a cashback in amount of"+price);
	}

	
	// {} - cucmber expressions
	//[] - capture groups
	
	// quantifiers:+ * ?{n}
	
	//([0-9] +) = how many times a character needs to be occured(once or more than once)
	//([0-9]{4}) - 4 times
	//([0-9]*) - zero or more
	//([0-9]?) - zero or once
	
//	short hand characters
//	
//	\d= adds all the details
//	\w = void character
//	\s = wide spaces tabs and end of lines character
//	\D = NON DIGIT NUMBER
	
	//([a-g A-Z 0-9]+)
	
	
	
	
	
	
	
	
	
	
	

}

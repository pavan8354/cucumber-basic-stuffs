package Step_Definitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Billingsteps {
	
double Billingamount;
double taxamount;
double finalamount;

@Given("User is on Billing amount")
public void user_is_on_billing_amount() {
    // Write code here that turns the phrase above into concrete actions
    
}

@When("User enters Billing Amount {int}")
public void user_enters_billing_amount(Integer Billingamount) {
    // Write code here that turns the phrase above into concrete actions
   this.Billingamount = Billingamount;
}

@When("user enters tax amount {int}")
public void user_enters_tax_amount(Integer Billingamount) {
    // Write code here that turns the phrase above into concrete actions
   this.Billingamount = Billingamount;
}

@When("user clicks on calculate amount")
public void user_clicks_on_calculate_amount() {
    // Write code here that turns the phrase above into concrete actions
   
}

@Then("it gives the final amount {int}")
public void it_gives_the_final_amount(Integer Billingamount) {
    // Write code here that turns the phrase above into concrete actions
	  this.finalamount = this.Billingamount + this.taxamount ;
	  
	  Assert.assertTrue(this.finalamount == finalamount);
}

@When("user enters tax amount {double}")
public void user_enters_tax_amount(Double taxamount) {
    // Write code here that turns the phrase above into concrete actions
	  this.taxamount = taxamount;
}

@Then("it gives the final amount {double}")
public void it_gives_the_final_amount(Double finalamount) {
    // Write code here that turns the phrase above into concrete actions
	 this.finalamount = this.Billingamount + this.taxamount ;
	  
	  Assert.assertTrue(this.finalamount == finalamount);
}

	
}

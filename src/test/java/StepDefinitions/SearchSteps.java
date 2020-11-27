package StepDefinitions;

import Amazon_Implementation.product;
import Amazon_Implementation.search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SearchSteps {

product proj;
search sear;
@Given("Search the product in Amazon home page")
public void search_the_product_in_amazon_home_page() {
    // Write code here that turns the phrase above into concrete actions
   System.out.println("Step 1:::::search the product");
}

@When("Search the name {string} with price {int}")
public void search_the_name_with_price(String productname, Integer price) {
    // Write code here that turns the phrase above into concrete actions
   System.out.println("step2::::Enter the product name"+productname+"Enter the price of the product name"+price);
   
   proj = new product(productname ,price);
}

@Then("Search the name {string} verify that it is validated")
public void search_the_name_verify_that_it_is_validated(String productname) {
    // Write code here that turns the phrase above into concrete actions
System.out.println("step 3:::::"+productname+"verify the product name");

sear= new search();
String productnames = sear.displaytheproduct(proj);
System.out.println(productnames);
Assert.assertEquals(proj.getProductname(), productnames);

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

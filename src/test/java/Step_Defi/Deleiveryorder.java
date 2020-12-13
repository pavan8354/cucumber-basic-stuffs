package Step_Defi;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Deleiveryorder {

	@Given("User is on Registration page")
	public void user_is_on_registration_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("User wants to fill following details")
	public void user_wants_to_fill_following_details(DataTable dataTable) {
	    List<Map<String , String>> userList = dataTable.asMaps(String.class , String.class);
	    
//	    System.out.println(userList);
//	    System.out.println(userList.get(1).get("firstname"));
	   
	    for(Map<String , String> e : userList) {
	    	
	    	System.out.println(e.get("firstname"));
	    	System.out.println(e.get("email"));
	    	System.out.println(e.get("phoneneumber"));
	    	System.out.println(e.get("city"));
//	    	System.out.println(e.get("firstname"));
	    }
	}

	@Then("user registration is successfull")
	public void user_registration_is_successfull() {
	    // Write code here that turns the phrase above into concrete actions

	}

	
	
	
}

package Test;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sources_code.Customersteps;

public class customers {

	Customersteps o;
	
	
	
	@Given(": id,name,phone and address")
	public void id_name_phone_and_address() {
		System.out.println("   ");
		o= new Customersteps();
	}

	@When("the customer give id , name , phone and address")
	public void the_customer_give_id_name_phone_and_address() {
	   o.saveinformation_custmer();
	}

	@Then("successfull to save information")
	public void successfull_to_save_information() {
		 assertTrue(o.issavee==true);
	   
	}


	
	@Then("Failed to save information")
	public void failed_to_save_information() {

		 
		 assertTrue(o.issavee==false);
	}

	
}

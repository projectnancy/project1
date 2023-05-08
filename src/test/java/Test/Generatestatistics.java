package Test;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sources_code.Customersteps;

public class Generatestatistics {
	Customersteps c;
	@Given("Total orders in application")
	public void total_orders_in_application() {
		 c= new Customersteps();
	}

	@When("get total number of order , get total Total Paid and get Total Debts.")
	public void get_total_number_of_order_get_total_total_paid_and_get_total_debts() {
	   c.allorder();
	}

	@Then("successfull to Generate statistics")
	public void successfull_to_generate_statistics() {
		assertTrue(c.Generate()==true);
	}
}

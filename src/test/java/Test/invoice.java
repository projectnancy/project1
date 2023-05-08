package Test;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sources_code.InvoiceSteps;
import sources_code.Customersteps;

public class invoice {
	 InvoiceSteps x;
	 Customersteps o;
	
	@Given("delivery, price ,address,items")
	public void delivery_price_address_items() {
	 System.out.println("  ");
	}

	@When("the invoice delivery<{string}> and price<{double}> and address <{string}> and items  <{string}>")
	public void the_invoice_delivery_and_price_and_address_and_items(String string, Double double1, String string2, String string3) {
	  o.ckeckout();
		
	}

	@Then("successfull generate invoice for customer")
	public void successfull_generate_invoice_for_customer() {
		
		assertTrue(x.isgenerate()==true);
	}
	
	
}

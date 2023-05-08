package Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sources_code.Customersteps;
//import sources_code.Customersteps;
import sources_code.InvoiceSteps;

public class discount {
	Customersteps c;
	InvoiceSteps in;
	@Given("total balance from shopping cart")
	public void total_balance_from_shopping_cart() {
		 c= new Customersteps();
		 in=new InvoiceSteps ();
	}

	@When("the total balance from shopping cart greater than {string}  successfull to discount,but if less than fail the discount")
	public void the_total_balance_from_shopping_cart_greater_than_successfull_to_discount_but_if_less_than_fail_the_discount(String string) {
		c.addshopping();
		c.showshopping();
	}

	@Then("successfull to discuont  customers")
	public void successfull_to_discuont_customers() {
		assertTrue(in.getdiscount()==true);
	}

	@Then("fail to discuont  customers")
	public void fail_to_discuont_customers() {
		assertTrue(in.getdiscount()==false);
	}
	
	
}

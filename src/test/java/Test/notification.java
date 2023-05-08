package Test;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sources_code.Customersteps;

import sources_code.Worker;

public class notification {
	Customersteps c;
	Worker w;
	@Given("when order with the status {string}")
	public void when_order_with_the_status(String string) {
	   c=new Customersteps();
	   w=new Worker();
	}

	@When("the worker sends a notification email to the customer")
	public void the_worker_sends_a_notification_email_to_the_customer() {
	   c.sendnotification();
	}

	@Then("the customer should receive the email")
	public void the_customer_should_receive_the_email() {
		assertTrue(Worker.isNotification()==true);

	}
}

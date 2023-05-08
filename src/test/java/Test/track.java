package Test;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sources_code.Customersteps;

import sources_code.Worker;

public class track {
	Customersteps c;
	Worker w;
	@Given("when the user cheack out his order")
	public void when_the_user_cheack_out_his_order() {
	c=new Customersteps()	;
	w=new Worker();
	
	}

	@When("the worker receive the order")
	public void the_worker_receive_the_order() {
	   c.trackorder();
	}

	@Then("in the first situation the order is waiting")
	public void in_the_first_situation_the_order_is_waiting() {
		assertTrue(Worker.isIswaiting()==true);

	}

	@Then("in the second situation the order in treatment")
	public void in_the_second_situation_the_order_in_treatment() {
		assertTrue(Worker.isIntretmant()==true);

	}

	@Then("in the third situation the order completed")
	public void in_the_third_situation_the_order_completed() {
		assertTrue(Worker.isIscompleted()==true);

	}
}

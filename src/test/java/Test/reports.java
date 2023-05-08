package Test;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sources_code.Customersteps;
import sources_code.ReportsSteps;

public class reports {
	Customersteps c;
	ReportsSteps r;
	@Given("total user ,product and order")
	public void total_user_product_and_order() {
		 c= new Customersteps();
		 r=new ReportsSteps();
	}

	@When("get all order,get all user and get all product")
	public void get_all_order_get_all_user_and_get_all_product() {
	   
		c.report();
	}

	@Then("successfull to  generate customized reports about business")
	public void successfull_to_generate_customized_reports_about_business() {
		assertTrue(ReportsSteps.isIsreport()==true);
		
	}

}

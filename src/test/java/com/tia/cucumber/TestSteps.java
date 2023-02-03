package com.tia.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		System.out.println("Given");
	}
	
	@And("some other precondition")
	public void some_other_precondition() {
		System.out.println("Some other Given");
	}
	
	@When("I complete action")
	public void i_complete_action() {
		System.out.println("When");
	}
	
	@And("some other action")
	public void some_other_action() {
		System.out.println("Some other When");
	}
	
//	@And("some other action")
//	public void yet_another_action() {
//		System.out.println("Some other When");
//	}
	
	@Then("I validate the outcomes {string}")
	public void i_validate_the_outcomes(String result) {
		System.out.println("Then parameter = "+result);
	}
	
	@Then("check more outcomes")
	public void check_more_outcomes() {
		System.out.println("Some other Then");
	}
	
}

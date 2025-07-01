package com.stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps {
	@Given("I am a User")
	public void i_am_a_user() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("testing");
	}

	@When("I entered valid Username and Password")
	public void i_entered_valid_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("testing");
	}

	@When("I click on submit button")
	public void i_click_on_submit_button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("testing");
	}

	@Then("I should navigate to login page")
	public void i_should_navigate_to_login_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("testing");
	}
}

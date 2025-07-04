package com.stepDefinations;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.pages.LoginPage;
import com.utility.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps{

	private final WebDriver driver;
	private final LoginPage loginPage;
	ConfigReader cr = new ConfigReader();
	
	public LoginSteps(BaseSteps ctx) {
        this.driver = ctx.getDriver();
        this.loginPage = new LoginPage(driver);
    }

	@Given("I am a User")
	public void i_am_a_user() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user");
	}

//	@When("I entered valid Username and Password")
//	public void i_entered_valid_username_and_password() {
//		loginPage.enterUserNamePassword("Admin", "admin123");
//	}
	
	@When("I entered valid {string} and {string}")
	public void i_entered_valid_username_and_password(String username, String password) {
		loginPage.enterUserNamePassword("Admin", "admin123");
	}

	@When("I click on submit button")
	public void i_click_on_submit_button() {
		loginPage.login();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Then("I should navigate to login page")
	public void i_should_navigate_to_login_page() {
		assertEquals(driver.getCurrentUrl(), cr.getUrlAfterLogin());
		System.out.println("Completed");
	}
}

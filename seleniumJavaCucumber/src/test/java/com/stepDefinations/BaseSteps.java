package com.stepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.pages.LoginPage;
import com.utility.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseSteps {
	ConfigReader cr = new ConfigReader();
	public static WebDriver driver;

	@Before
	public void beforeScenario() {
		System.out.println("This will run before each scenario");

		if (cr.getBrowser().equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			WebDriverManager.chromedriver().setup();
		} else if (cr.getBrowser().equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			WebDriverManager.edgedriver().setup();
		} else {
			driver = new ChromeDriver();
			WebDriverManager.chromedriver().setup();
		}
		driver.get(cr.getUrl());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

	}

	@Before(value = "@auth")
	public void beforeScenario1() {
		LoginPage loginPage = new LoginPage(driver);
		System.out.println("This will run before @auth tag scenario");
		loginPage.enterUserNamePassword("Admin", "admin123");
		loginPage.login();
	}

	@After
	public void afterScenario() {
		System.out.println("This will run after each scenario");
		driver.quit();
	}

	public WebDriver getDriver() {
		return driver;
	}
}

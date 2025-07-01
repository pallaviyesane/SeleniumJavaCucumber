package com.stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseSteps {
	@Before
    public void beforeScenario() {	
        System.out.println("This will run before each scenario");
    }

    @After
    public void afterScenario() {
        System.out.println("This will run after each scenario");
    }
}

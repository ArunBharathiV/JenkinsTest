package com.omrjenkins.stepdefinition;

import com.omrjenkins.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {
	@Before
	public void beforeScen () {
		browserLaunch("CHROME");
			
		driver.get("http://192.168.1.3:8080/register/");
		 implicitWait(5);

	}
	
	@After
	public void afterScenario(Scenario scenario) {
		
		scenario.attach(takeScreenshot(), "image/png", scenario.getName());
		
		quitBrowser();
	}


}

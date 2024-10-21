package com.omrjenkins.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.omrjenkins.baseclass.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JenkinsFormRegister extends BaseClass{
	
	@Given("User is on the form fill page")
	public void userIsOnTheFormFillPage() {
	}
	@When("User enters all the valid informations to register {string},{string} and {string}")
	public void userEntersAllTheValidInformationsToRegisterAnd(String string, String string2, String string3) {
		 driver.findElement(By.id("username")).sendKeys(string);
		 driver.findElement(By.id("email")).sendKeys(string2);
		 driver.findElement(By.id("password")).sendKeys(string3);
		 driver.findElement(By.id("confirmPassword")).sendKeys(string3);
	}
	
	@When("User clicks Login button")
	public void userClicksLoginButton() {
		 driver.findElement(By.xpath("//button[text()='Register']")).click();
		 Alert alert = driver.switchTo().alert();
			alert.accept();
	}

	@Then("User should see the {string} message")
	public void userShouldSeeTheMessage(String string) {
				 
		 String regSuccMsg = driver.findElement(By.xpath("//h2[text()='Registration Successful']")).getText();
		 Assert.assertEquals("Verify reg succ msg", string, regSuccMsg);
		
	}

}
package com.jenkinstest.pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.omrjenkins.baseclass.BaseClass;

public class MainClass extends BaseClass{
	public static void main(String[] args) {
		
		 driver.get("http://192.168.1.3:8080/register/");
		 
		 driver.findElement(By.id("username")).sendKeys("ArunBar");
		 driver.findElement(By.id("email")).sendKeys("arunskumar98@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("Ab@r15rx100");
		 driver.findElement(By.id("confirmPassword")).sendKeys("Ab@r15rx100");
		 
		 driver.findElement(By.xpath("//button[text()='Register']")).click();
		 
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
		 
		 String regSuccMsg = driver.findElement(By.xpath("//h2[text()='Registration Successful']")).getText();
		 Assert.assertEquals("Verify reg succ msg", "Registration Successful", regSuccMsg);
		 driver.findElement(By.id("username")).sendKeys("ArunBar");
		 driver.findElement(By.id("username")).sendKeys("ArunBar");
		 
	}
	

}
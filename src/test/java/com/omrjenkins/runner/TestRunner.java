package com.omrjenkins.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrjenkins.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "", plugin = {"pretty","json:target//index1.json", "rerun:src\\test\\resources\\Failed.txt"} ,
dryRun=false, snippets = SnippetType.CAMELCASE, glue = "com\\omrjenkins\\stepdefinition", features = "src\\test\\resources")
public class TestRunner {
	@AfterClass
	public static void afterClass() {
		Reporting.generateJvmReport("C:\\Users\\anith\\eclipse-workspace\\OMRBranchMobileAutomation\\target\\index1.json");
	}
	
}

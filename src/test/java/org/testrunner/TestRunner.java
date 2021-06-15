package org.testrunner;

import org.base.ReportingJVM;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources"},glue = {"org.stepdefinition"},
plugin = {"pretty","json:C:\\Users\\Administrator\\eclipse-workspace\\karthika\\SampleCucumber\\target\\sample.json"})

public class TestRunner {
	@AfterClass
	public static void afterClass() {
		ReportingJVM.generateJVMReport("C:\\Users\\Administrator\\eclipse-workspace\\karthika\\SampleCucumber\\target\\sample.json");

	}

}


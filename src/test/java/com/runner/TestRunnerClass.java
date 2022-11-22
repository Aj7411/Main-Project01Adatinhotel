package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.reports.Reporting;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(//tags="@canelhotel",
		         snippets=SnippetType.CAMELCASE,
			     dryRun = false, 
                 publish = true, 
                 stepNotifications = true, 
                 plugin = { "pretty","json:target\\Output.json" }, 
                 monochrome = true,
                 features = "C:\\Users\\ajith\\eclipse-workspace\\OMRBranchAdactinHotelAutomation\\src\\test\\"
                 			 + "resources\\Features",
                 glue = "com.stepdefinition")

public class TestRunnerClass {

	@AfterClass
	public static void afterClass() {
		Reporting.generateJVMReport("C:\\Users\\ajith\\eclipse-workspace\\OMRBranchAdactinHotelAutomation\\target\\Output.json");
	}
}

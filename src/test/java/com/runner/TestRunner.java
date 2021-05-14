package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",
				 glue= {"com.stepDefinition"},
				 monochrome=true,
				 plugin={"pretty","json:target\\Reports\\Adactin.json"},
				 dryRun=false)


public class TestRunner {
	
	
	@AfterClass
	public static void afterClass() {
		
		JVMReport.generateJVMReport(System.getProperty("user.dir")+"\\target\\Reports\\Adactin.json");
		
	}
}

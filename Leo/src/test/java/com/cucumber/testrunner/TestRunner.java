package com.cucumber.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.baseclass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\cucumber\\feature", glue = "com.cucumber.stepdefinition")

public class TestRunner {
	
	@BeforeClass
	public static void browserLaunch() {
		
		BaseClass.browserLaunch();

	}
	
	@AfterClass
	
	public static void driverQuit() {

	}
	
	
	

}

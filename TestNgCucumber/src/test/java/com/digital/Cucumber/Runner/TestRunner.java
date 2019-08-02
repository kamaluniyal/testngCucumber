package com.digital.Cucumber.Runner;

import org.junit.runner.RunWith;
 
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "classpath:features" },
		glue= {"classpath:com.digital.Cucumber.steps"}, 
		plugin = { "pretty", "json:target/cucumber/cucumber.json" })
public class TestRunner {
	
}

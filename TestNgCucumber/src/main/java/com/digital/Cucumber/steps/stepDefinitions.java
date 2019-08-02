package com.digital.Cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class stepDefinitions  {

	
	@Given("^user launches Google webapp$")
	public void user_launches_Google_webapp() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Resutls are retreived");
	}
 
	@When("^user searches for a \"([^\"]*)\"$")
	public void user_searches_for_a(String arg1) throws Throwable {
		System.out.println("Resutls are retreived");
	}
 
	@And("^click on search button$")
	public void click_on_search_button() throws Throwable {
		System.out.println("Resutls are retreived");
	}
 
	@Then("^results retreived should contain the \"([^\"]*)\" used$")
	public void results_retreived_should_contain_the_used(String resultString) throws Throwable {
		
			System.out.println("Resutls are retreived");
		
	}
	

}

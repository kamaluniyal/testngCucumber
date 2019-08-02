package com.digital.Cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class stepDefinition2 {


@Given("user launches Intranet")
public void user_launches_Intranet() {
	System.out.println("step def 2");
}


@When("user enter text {string} in textbox")
public void user_enter_text_in_textbox(String string) {
	System.out.println("step def 2");
}
	
}

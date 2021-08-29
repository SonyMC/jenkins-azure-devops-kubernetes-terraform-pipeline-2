package com.in28minutes.microservices.currencyexchangeservice.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import com.in28minutes.microservices.currencyexchangeservice.HelloWorld;

public class HelloWorldSteps {

    private HelloWorld helloWorld = new HelloWorld();

    private String name = "";

    private String output = "";

    // matches position just before the first character of the string
    // $ matches position just after the last character of the string
    // . matches a single character. Does not matter what character it is, except
    // newline
    // * matches preceding match zero or more times

    @Given("^A String name (.*)$")
    public void givenInput(String name) {
        this.name = name;
    }

    @When("^sayHello method of HelloWorld.java is called$")
    public void whenBusinessLogicCalled() {
        output = helloWorld.sayHello(name);
    }

    @Then("^It should return (.*)$")
    public void thenCheckOutput(String response) {
        Assert.assertEquals(output, response);
    }

    public static void main(String[] args) {
    }
}

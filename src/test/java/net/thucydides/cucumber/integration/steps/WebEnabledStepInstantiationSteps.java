package net.thucydides.cucumber.integration.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import net.thucydides.cucumber.integration.steps.thucydides.SampleSteps;
import net.thucydides.cucumber.integration.steps.thucydides.SampleWebSteps;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Created by john on 15/07/2014.
 */
public class WebEnabledStepInstantiationSteps {

    @Steps
    SampleWebSteps sampleSteps;

    @Given("I have a Cucumber feature file containing a web-enabled Thucydides @Steps field")
    public void featureFileContainsStepsFields() {
    }

    @Then("the web-enabled step fields should be instantiated")
    public void theStepFieldsShouldBeInstantiated() {
        assertThat(sampleSteps).isNotNull();
    }

}

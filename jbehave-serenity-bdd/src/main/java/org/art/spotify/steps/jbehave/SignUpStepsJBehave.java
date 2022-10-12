package org.art.spotify.steps.jbehave;

import net.thucydides.core.annotations.Steps;
import org.art.spotify.steps.serenity.SignUpSteps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

import static org.junit.Assert.assertTrue;

public class SignUpStepsJBehave {

    @Steps
    SignUpSteps steps;

    @Given("I open signup page")
    public void openPage() {
        steps.openSignUp();
    }

    @When("I set date: $table")
    public void setDate(ExamplesTable table) {
        Map<String, String> date = table.getRow(0);

        steps.setDay(date.get("day"));
        steps.setYear(date.get("year"));
        steps.setMonth(date.get("month"));
    }

    @When("I set day \"$day\"")
    public void setDay(String day) {
        steps.setDay(day);
    }

    @When("I set year \"$year\"")
    public void setYear(String year) {
        steps.setYear(year);
    }

    @When("I set month \"$month\"")
    public void setMonth(String month) {
        steps.setMonth(month);
    }

    @When("I set sex \"$sex\"")
    public void setSex(String sex) {
        steps.setGender(sex);
    }

    @When("I close privacy message")
    public void setSex() {
        steps.closePrivacy();
    }

    @When("I click submit button")
    public void clickSubmit() {
        steps.clickSubmit();
    }

    @Then("I see error")
    public void seeError() {
       assertTrue(steps.findErrors(0));
    }
}
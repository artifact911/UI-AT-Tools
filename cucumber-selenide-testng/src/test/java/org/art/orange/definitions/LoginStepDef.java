package org.art.orange.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.art.orange.actions.HomePageActions;
import org.art.orange.actions.LoginPageActions;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertNotNull;

public class LoginStepDef {

    private final LoginPageActions loginPageActions = new LoginPageActions();
    private final HomePageActions homePageActions = new HomePageActions();

    @Given("User is on HRMLogin page {string}")
    public void user_is_on_hrm_login_page(String string) {
        open(string);
    }

    @When("User enters username as {string} and password as {string}")
    public void user_enters_username_as_and_password_as(String string, String string2) {
        loginPageActions.login(string, string2);
    }

    @Then("User should be able to login sucessfully and new page open")
    public void user_should_be_able_to_login_sucessfully_and_new_page_open() {
        assertNotNull(homePageActions.getHomePageUserName());
    }
}

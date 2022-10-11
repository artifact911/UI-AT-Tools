package org.art.defenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.art.actions.HomePageActions;
import org.art.actions.LoginPageActions;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LoginStepDef {

    private final LoginPageActions loginPageActions = new LoginPageActions();
    private final HomePageActions homePageActions = new HomePageActions();

    @Given("User is on HRMLogin page {string}")
    public void userIsOnHRMLoginPage(String url) {
        open(url);
    }

    @When("User enters username as {string} and password as {string}")
    public void setLoginAndPassword(String login, String password) {
        loginPageActions.login(login, password);
    }

    @Then("User should be able to login sucessfully and new page open")
    public void moveToHomePage() {
        assertNotNull(homePageActions.getHomePageUserName());
    }
}

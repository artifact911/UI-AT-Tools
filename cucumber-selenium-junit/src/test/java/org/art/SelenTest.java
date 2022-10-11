package org.art;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.art.actions.HomePageActions;
import org.art.actions.LoginPageActions;
import org.junit.Test;
import org.junit.runner.RunWith;


import static com.codeborne.selenide.Selenide.open;

public class SelenTest {

    @Test
    public void test() {
//        ChromeDriverManager.getInstance().setup();
//        Configuration.browser = "firefox";
        WebDriverRunner.setWebDriver(FirefoxDriverManager.firefoxdriver().create());

        LoginPageActions loginPageActions = new LoginPageActions();
        HomePageActions homePageActions = new HomePageActions();

        open("https://opensource-demo.orangehrmlive.com/");
        loginPageActions.login("Admin", "admin123");
        homePageActions.getHomePageUserName();
    }

}

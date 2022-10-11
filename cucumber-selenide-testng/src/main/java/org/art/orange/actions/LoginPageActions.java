package org.art.orange.actions;

import com.codeborne.selenide.WebDriverRunner;
import org.art.orange.driver.HelperClass;
import org.art.orange.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;

public class LoginPageActions {

    private final LoginPage loginPage;

    public LoginPageActions() {
        this.loginPage = new LoginPage();
        PageFactory.initElements(HelperClass.getDriver(), loginPage);
    }

    public void login(String name, String password) {
        loginPage.getUserName().sendKeys(name);
        loginPage.getPassword().sendKeys(password);
        loginPage.getLogin().click();
    }

    public String getErrorMessage() {
        return loginPage.getErrorMessage().getText();
    }

    public String getReqNameMessage() {
        return loginPage.getReqNameMessage().getText();
    }
}

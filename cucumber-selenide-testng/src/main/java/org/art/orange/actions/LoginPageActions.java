package org.art.orange.actions;

import com.codeborne.selenide.Condition;
import org.art.orange.pages.LoginPage;

public class LoginPageActions {

    private final LoginPage loginPage = new LoginPage();

    public void login(String name, String password) {
        loginPage.getUserName().shouldBe(Condition.visible).sendKeys(name);
        loginPage.getPassword().shouldBe(Condition.visible).sendKeys(password);
        loginPage.getLogin().shouldBe(Condition.visible).click();
    }

    public String getErrorMessage() {
        return loginPage.getErrorMessage().shouldBe(Condition.visible).getText();
    }

    public String getReqNameMessage() {
        return loginPage.getReqNameMessage().shouldBe(Condition.visible).getText();
    }
}

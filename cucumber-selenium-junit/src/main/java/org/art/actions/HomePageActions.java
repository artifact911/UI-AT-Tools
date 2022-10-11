package org.art.actions;

import com.codeborne.selenide.Condition;
import org.art.pages.HomePage;

public class HomePageActions {

    private final HomePage homePage = new HomePage();

    public String getHomePageUserName() {
        return homePage.getHomePageUserName().shouldBe(Condition.visible).getText();
    }
}

package org.art.orange.actions;

import com.codeborne.selenide.WebDriverRunner;
import org.art.orange.driver.HelperClass;
import org.art.orange.pages.HomePage;
import org.openqa.selenium.support.PageFactory;

public class HomePageActions {

    private final HomePage homePage;

    public HomePageActions() {
        this.homePage = new HomePage();
        PageFactory.initElements(HelperClass.getDriver(), homePage);
    }

    public String getHomePageUserName() {
        return homePage.getHomePageUserName().getText();
    }
}

package org.art.orange.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class LoginPage {

    @FindBy(name="username")
    private WebElement userName;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement login;

    @FindBy(xpath = "//p[text()='Invalid credentials']")
    private WebElement errorMessage;

    @FindBy(xpath = "//span[text()='Required']")
    private WebElement reqNameMessage;
}

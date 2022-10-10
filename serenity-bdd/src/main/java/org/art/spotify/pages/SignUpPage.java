package org.art.spotify.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.util.List;

@DefaultUrl("https://www.spotify.com/by-ru/signup")
public class SignUpPage extends PageObject {

    private final By emailField = By.xpath("//input[@id='email']");
    private final By confirmEmailField = By.xpath("//input[@id='confirm']");
    private final By passwordField = By.xpath("//input[@id='password']");
    private final By nameField = By.xpath("//input[@id='displayname']");
    private final By monthDropDown = By.xpath("//select[@id='month']");
    private final By dayField = By.xpath("//input[@id='day']");
    private final By yearField = By.xpath("//input[@id='year']");
    private final By genders = By.xpath("//input[@name='gender']/..//span[2]");
    private final By shareCheckBox = By.xpath("//input[@id='marketing-opt-checkbox']");
    private final By registerBtn = By.xpath("//button[@type='submit']");
    private final By errorLabel = By.xpath("//div[@aria-label='Значок ошибки']");

    private final By privacyClose = By.xpath("//div[@id='onetrust-close-btn-container']/button[@aria-label='Закрыть']");

    public SignUpPage typeEmail(String email) {
        find(emailField).sendKeys(email);
        return this;
    }

    public SignUpPage typeConfirmEmail(String email) {
        find(confirmEmailField).sendKeys(email);
        return this;
    }

    public SignUpPage typePassword(String password) {
        find(passwordField).sendKeys(password);
        return this;
    }

    public SignUpPage typeName(String name) {
        find(nameField).sendKeys(name);
        return this;
    }

    public SignUpPage setMonth(SignUpPageMonth month) {
        find(monthDropDown).waitUntilClickable().click();
        String monthDropDownOptions = "//select[@id='month']/option[text()='%s']";
        find(By.xpath(String.format(monthDropDownOptions, month.getName()))).waitUntilClickable().click();
        return this;
    }

    public SignUpPage closePrivacy() {
        find(privacyClose).waitUntilVisible().click();
        return this;
    }

    public SignUpPage typeDay(String day) {
        find(dayField).sendKeys(day);
        return this;
    }

    public SignUpPage typeYear(String year) {
        find(yearField).sendKeys(year);
        return this;
    }

    public SignUpPage setAdvCheckBox(boolean isChoose) {
        if (isChoose) {
            find(shareCheckBox).click();
        }
        return this;
    }

    public SignUpPage clickSubmit() {
        find(registerBtn).waitUntilClickable().click();
        return this;
    }

    public List<WebElementFacade> findErrors() {
        return findAll(errorLabel);
    }

    public SignUpPage setSexRadioButton(SignUpPageGender gender) {
       findAll(genders).stream()
              .filter(e -> gender.getName().equals(e.getText()))
              .findFirst().get().click();
        return this;
    }
}

package org.art.spotify.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

@DefaultUrl("https://www.spotify.com/by-ru/signup")
public class SignUpPage extends PageObject {

    private WebDriver driver;

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

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public SignUpPage typeEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public SignUpPage typeConfirmEmail(String email) {
        driver.findElement(confirmEmailField).sendKeys(email);
        return this;
    }

    public SignUpPage typePassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public SignUpPage typeName(String name) {
        driver.findElement(nameField).sendKeys(name);
        return this;
    }

    public SignUpPage setMonth(SignUpPageMonth month) {
        driver.findElement(monthDropDown).click();
        String monthDropDownOptions = "//select[@id='month']/option[text()='%s']";
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath(String.format(monthDropDownOptions, month.getName())))).click();
        return this;
    }

    public SignUpPage typeDay(String day) {
        driver.findElement(dayField).sendKeys(day);
        return this;
    }

    public SignUpPage typeYear(String year) {
        driver.findElement(yearField).sendKeys(year);
        return this;
    }

    public SignUpPage setAdvCheckBox(boolean isChoose) {
        if (isChoose) {
            driver.findElement(shareCheckBox).click();
        }
        return this;
    }

    public SignUpPage clickSubmit() {
        driver.findElement(registerBtn).click();
        return this;
    }

    public List<WebElement> findErrors() {
        return driver.findElements(errorLabel);
    }

    public SignUpPage setSexRadioButton(SignUpPageGender gender) {
        driver.findElements(genders).stream()
              .filter(e -> gender.getName().equals(e.getText()))
              .findFirst().get().click();
        return this;
//        return By.xpath(String.format("//input[@name='gender']/..//span[text()='%s']", gender.getName()));
    }
}

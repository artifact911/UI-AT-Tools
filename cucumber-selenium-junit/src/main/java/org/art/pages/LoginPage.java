package org.art.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class LoginPage {

//    private final WebDriver driver;
//
//    public LoginPage(WebDriver driver) {
//        this.driver = driver;
//    }

//    @FindBy(name="username")
    private final SelenideElement userName = $(By.name("username"));

//    @FindBy(name = "password")
    private SelenideElement password = $(By.name("password"));

//    @FindBy(xpath = "//button[@type='submit']")
    private SelenideElement login = $(By.xpath("//button[@type='submit']"));

//    @FindBy(xpath = "//p[text()='Invalid credentials']")
    private SelenideElement errorMessage = $("//p[text()='Invalid credentials']");

//    @FindBy(xpath = "//span[text()='Required']")
    private SelenideElement reqNameMessage = $(By.xpath("//span[text()='Required']"));
}

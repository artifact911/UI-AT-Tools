package org.art.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class HomePage {

//    @FindBy(xpath = "//p[text()='Paul Collings']")
    private final SelenideElement homePageUserName = $(By.xpath("//p[text()='Paul Collings']"));
}

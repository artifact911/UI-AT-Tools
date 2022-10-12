package org.art.orange.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class HomePage {

//    @FindBy(xpath = "//p[text()='Paul Collings']")
    private final SelenideElement homePageUserName = $(By.xpath("//h6"));
}

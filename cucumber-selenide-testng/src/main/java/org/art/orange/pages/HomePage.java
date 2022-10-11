package org.art.orange.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HomePage {

    @FindBy(xpath = "//p[text()='Paul Collings']")
    private WebElement homePageUserName;

}

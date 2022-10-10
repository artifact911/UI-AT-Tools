package org.art.spotify;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.art.spotify.pages.SignUpPageGender;
import org.art.spotify.pages.SignUpPageMonth;
import org.art.spotify.steps.SignUpSteps;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SerenityRunner.class)
public class SignUpTest {

    @Steps
    SignUpSteps steps;

    @Managed
    WebDriver driver;

    @Test
    @Title("Expected some errors")
    public void checkInvalids() {
        steps.openSignUp();

        steps.setDay("20");
        steps.setYear("1985");
        steps.setMonth(SignUpPageMonth.JANUARY);
        steps.setGender(SignUpPageGender.NO_ANSWER);
        steps.closePrivacy();
        steps.clickSubmit();

        assertTrue(steps.findErrors(0));
    }
}

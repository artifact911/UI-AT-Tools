package org.art.spotify.steps;

import net.thucydides.core.annotations.Step;
import org.art.spotify.pages.SignUpPage;
import org.art.spotify.pages.SignUpPageGender;
import org.art.spotify.pages.SignUpPageMonth;

public class SignUpSteps {

    private SignUpPage page;

    @Step
    public void openSignUp() {
        page.open();
    }

    @Step("Input email {0}")
    public void typeEmail(String email) {
        page.typeEmail(email);
    }

    @Step("Confirm email {0}")
    public void confirmEmail(String email) {
        page.typeConfirmEmail(email);
    }

    @Step("Input password {0}")
    public void inputPassword(String password) {
        page.typePassword(password);
    }

    @Step("Input name {0}")
    public void inputName(String name) {
        page.typeName(name);
    }

    @Step("Set month {0}")
    public void setMonth(SignUpPageMonth month) {
        page.setMonth(month);
    }

    @Step("Set day {0}")
    public void setDay(String day) {
        page.typeDay(day);
    }

    @Step("Set year {0}")
    public void setYear(String year) {
        page.typeYear(year);
    }

    @Step("Set adv checkBox {0}")
    public void setAdvCheckBox(boolean isChoose) {
        page.setAdvCheckBox(isChoose);
    }

    @Step("Set sex radioButton {0}")
    public void setGender(SignUpPageGender gender) {
        page.setSexRadioButton(gender);
    }

    @Step("Click submit")
    public void clickSubmit() {
        page.clickSubmit();
    }

    @Step("Finding errors")
    public boolean findErrors(int expectedErrors) {
        return page.findErrors().size() > expectedErrors;
    }

    @Step("Close privacy")
    public void closePrivacy() {
         page.closePrivacy();
    }
}

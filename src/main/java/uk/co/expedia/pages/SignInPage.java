package uk.co.expedia.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;
import uk.co.expedia.utility.Utility;

/**
 * Created by Jay
 */
public class SignInPage extends Utility {

    By emailAddressField = By.id("gss-signin-email");
    By passwordField = By.id("gss-signin-password");
    By signInBtn = By.id("gss-signin-submit");
    By errorMessage = By.id("gss-signin-incorrect-email-or-password");

    public void enterEmailAddress(String email) {
        Reporter.log("Entering email : " + email + " On email address field : " + emailAddressField.toString() + "<br>");
        sendTextToElement(emailAddressField, email);
    }

    public void enterPassword(String password) {
        Reporter.log("Entering password : " + password + " On password field : " + passwordField.toString() + "<br>");
        sendTextToElement(passwordField, password);
    }

    public void clickOnSignInButton() {
        Reporter.log("Clicking on sign in button : " + signInBtn.toString() + "<br>");
        clickOnElement(signInBtn);
    }

    public String getErrorMessage() {
        Reporter.log("Getting text from error message : " + errorMessage.toString() + "<br>");
        return getTextFromElement(errorMessage);
    }
}

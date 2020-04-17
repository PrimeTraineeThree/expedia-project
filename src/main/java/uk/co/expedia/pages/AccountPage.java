package uk.co.expedia.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;
import uk.co.expedia.utility.Utility;

/**
 * Created by Jay
 */
public class AccountPage extends Utility {

    By signInBtn = By.id("header-account-signin-button");
    By createAccount = By.xpath("//a[@id='header-account-register']//span");

    public void clickOnSignInButton(){
        Reporter.log("Clicking On SignIn Button : "+signInBtn.toString()+ "<br>");
        clickOnElement(signInBtn);
    }

    public void clickOnAccountMenu(){
        Reporter.log("Clicking On create account link : "+createAccount.toString()+ "<br>");

        clickOnElement(createAccount);
    }
}

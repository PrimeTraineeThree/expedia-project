package uk.co.expedia.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.expedia.loadproperty.LoadProperty;
import uk.co.expedia.pages.AccountPage;
import uk.co.expedia.pages.HomePage;
import uk.co.expedia.pages.SignInPage;
import uk.co.expedia.testbase.TestBase;

/**
 * Created by Jay
 */
public class LoginTest extends TestBase {

    HomePage homePage = new HomePage();
    AccountPage accountPage = new AccountPage();
    SignInPage signInPage = new SignInPage();


    @Test(groups = {"Regression", "Sanity"})
    public void verifyErrorMessage() {
        String expectedErrorMessage = "You may have entered an unknown email address or an incorrect password";
        homePage.clickOnAccountMenu();
        accountPage.clickOnSignInButton();
        signInPage.enterEmailAddress(new LoadProperty().getProperty("username"));
        signInPage.enterPassword(new LoadProperty().getProperty("password"));
        signInPage.clickOnSignInButton();
        Assert.assertEquals(expectedErrorMessage, signInPage.getErrorMessage());
    }

    @Test(groups = {"Regression"})
    public void verifyErrorMessageIsWrong() {
        String expectedErrorMessage = "You may have entered an unknown email address or an incorrect password1";
        homePage.clickOnAccountMenu();
        accountPage.clickOnSignInButton();
        signInPage.enterEmailAddress(new LoadProperty().getProperty("username"));
        signInPage.enterPassword(new LoadProperty().getProperty("password"));
        signInPage.clickOnSignInButton();
        Assert.assertEquals(expectedErrorMessage, signInPage.getErrorMessage());
    }
}

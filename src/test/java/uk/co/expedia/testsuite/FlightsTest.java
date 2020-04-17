package uk.co.expedia.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.expedia.pages.FlightsPage;
import uk.co.expedia.pages.HomePage;
import uk.co.expedia.pages.ResultPage;
import uk.co.expedia.testbase.TestBase;

/**
 * Created by Jay
 */
public class FlightsTest extends TestBase {

    HomePage homePage = new HomePage();
    FlightsPage flightsPage = new FlightsPage();
    ResultPage resultPage = new ResultPage();

    @Test(groups = {"Regression", "Sanity"})
    public void verifySearchFlight(){
        homePage.clickOnFlightsTab();
        flightsPage.enterFlyingFrom("London (LHR-Heathrow)");
        flightsPage.enterGoingTo("Mumbai (BOM-Chhatrapati Shivaji Intl.)");
        flightsPage.enterDepartingDate("25/04/2020");
        flightsPage.enterReturningDate("23/05/2020");
        flightsPage.clickOnSearchButton();
        Assert.assertEquals("Select your departure to Mumbai", resultPage.getResultText());
    }

    @Test(groups = {"Regression"})
    public void verifySearchFlightIsNotAvailable(){
        homePage.clickOnFlightsTab();
        flightsPage.enterFlyingFrom("London (LHR-Heathrow)");
        flightsPage.enterGoingTo("Mumbai (BOM-Chhatrapati Shivaji Intl.)");
        flightsPage.enterDepartingDate("25/04/2020");
        flightsPage.enterReturningDate("23/05/2020");
        flightsPage.clickOnSearchButton();
        Assert.assertEquals("Select your departure to Mumbai1", resultPage.getResultText());
    }
}

package uk.co.expedia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Reporter;
import uk.co.expedia.utility.Utility;

/**
 * Created by Jay
 */
public class FlightsPage extends Utility {

    By flyingFrom = By.id("flight-origin-hp-flight");
    By goingTo = By.id("flight-destination-hp-flight");
    By departing = By.id("flight-departing-hp-flight");
    By returning = By.id("flight-returning-hp-flight");
    By searchBtn = By.xpath("//*[@id=\"gcw-flights-form-hp-flight\"]/div[9]/label/button");

    public void enterFlyingFrom(String origin) {
        Reporter.log("Entering flying from : " + origin + " On flying from field : " + flyingFrom.toString() + "<br>");
        sendTextToElement(flyingFrom, origin);
    }

    public void enterGoingTo(String destination) {
        Reporter.log("Entering going to : " + destination + " On going to field : " + goingTo.toString() + "<br>");
        sendTextToElement(goingTo, destination);
    }

    public void enterDepartingDate(String date) {
        Reporter.log("Entering departing date : " + date + " On departing date field : " + departing.toString() + "<br>");
        sendTextToElement(departing, date);
    }

    public void enterReturningDate(String date) {
        Reporter.log("Entering returning date : " + date + " On returning date field : " + returning.toString() + "<br>");
        getElement(returning).sendKeys(Keys.CONTROL, "a");
        getElement(returning).sendKeys(Keys.DELETE);
        sendTextToElement(returning, date);
    }

    public void clickOnSearchButton() {
        Reporter.log("Clicking on search button : " + searchBtn.toString() + "<br>");
        getElement(searchBtn).submit();
    }


}

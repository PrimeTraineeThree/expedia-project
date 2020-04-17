package uk.co.expedia.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;
import uk.co.expedia.utility.Utility;

/**
 * Created by Jay
 */
public class HomePage extends Utility {

    By flightsTab = By.xpath("//button[@id='tab-flight-tab-hp']//span[@class='uitk-icon uitk-icon-flights']");
    By accountLink = By.id("header-account-menu");

    public void clickOnFlightsTab() {
        Reporter.log("Clicking on flights tab : " + flightsTab.toString() + "<br>");
        clickOnElement(flightsTab);
    }

    public void clickOnAccountMenu() {
        Reporter.log("Clicking on account menu : " + accountLink.toString() + "<br>");
        clickOnElement(accountLink);
    }

}

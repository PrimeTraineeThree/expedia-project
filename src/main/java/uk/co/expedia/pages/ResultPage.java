package uk.co.expedia.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;
import uk.co.expedia.utility.Utility;

/**
 * Created by Jay
 */
public class ResultPage extends Utility {

    By resultText = By.xpath("//*[@id=\"titleBar\"]/h1/div/span[1]");

    public String getResultText() {
        Reporter.log("Getting text from : " + resultText.toString() + "<br>");
        return getTextFromElement(resultText);
    }
}

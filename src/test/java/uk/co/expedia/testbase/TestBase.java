package uk.co.expedia.testbase;

import org.openqa.selenium.Point;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.expedia.browserselector.BrowserSelector;
import uk.co.expedia.loadproperty.LoadProperty;
import uk.co.expedia.utility.Utility;

import java.util.concurrent.TimeUnit;

/**
 * Created by Jay
 */
public class TestBase extends Utility {

    BrowserSelector browserSelector = new BrowserSelector();
    String baseUrl = new LoadProperty().getProperty("baseUrl");
    String browser = new LoadProperty().getProperty("browser");

    @BeforeMethod(groups = {"Regression", "Sanity"})
    public void openBrowser(){
        browserSelector.selectBrowser(browser);
        driver.manage().window().setPosition(new Point(-2000, 0));//display into second screen
        driver.manage().window().maximize();
//        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @AfterMethod(groups = {"Regression", "Sanity"})
    public void tearDown(){
        driver.quit();
    }



}

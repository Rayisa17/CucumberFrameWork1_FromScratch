package Steps;

import Pages.Elements;
import Utilities.Driver;
import Utilities.Mylibrary;
import Utilities.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Hooks extends TestBase {

    @Before(order = 1)
    public void setUp() {
        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Before(order = 2)
    public void setUp2() {
        act = new Actions(driver);
        wait = new WebDriverWait(driver, 20);
        e = new Elements();
        mylib = new Mylibrary(driver);
    }


    @Before(order = 3)
    public void logIn() {


        //you can write whatever you want later on!
    }


        @After
    public void EndTask(Scenario result) {

        if (result.isFailed()) {
            //take screenshot from the browser
            TakesScreenshot ss = (TakesScreenshot) Driver.getDriver();
            result.embed(ss.getScreenshotAs(OutputType.BYTES), "image/png");
            //embed: screen shot should be byte file
        }
        Driver.CloseDriver();
    }

}

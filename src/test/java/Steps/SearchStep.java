package Steps;


import Utilities.TestBase;
import cucumber.api.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchStep extends TestBase {

    @When("go to {string} website")
    public void go_to_website(String web) {
        driver.navigate().to(web);
        mylib.sleep(2);
     //   wait.until(ExpectedConditions.visibilityOf(e.GoogleSearch));
    }

    @Then("Enter {string} in search box")
    public void enter_in_search_box(String string) {
        e.GoogleSearch.sendKeys(string + Keys.ENTER);
        mylib.TakeScreenshotsplease(string);
    }

    @When("enter {string} in the new Search box")
    public void enter_in_the_new_Search_box(String string) {
        e.AmazonSearch.sendKeys(string + Keys.ENTER);
    }


    @When("enter {string} in the new search box")
    public void enter_in_the_new_search_box(String string) {
       e.AmazonSearch.click();
        e.AmazonSearch.sendKeys(string + Keys.ENTER);
       mylib.TakeScreenshotsplease(string );
       act.pause(500).perform();

    }

}

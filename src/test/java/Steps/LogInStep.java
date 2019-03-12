package Steps;

import Utilities.TestBase;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class LogInStep extends TestBase {

    @When("go to {string} website.")
    public void go_to_website(String string) {
    driver.navigate().to(string);
    mylib.sleep(2);
    }

    @When("User Enters {string} and {string}")
    public void user_Enters_and(String string, String string2) {


        e.GoogleUserName.sendKeys(string);
        e.getGoogleUserName.click();
      mylib.sleep(5);
        e.GooglePassword.sendKeys(string2);
        e.getGooglePassword.click();
        mylib.sleep(5);
    }

    @Then("title should contain{string}")
    public void title_should_contain(String string) {

    }


}

package Tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",
            tags="@User1",
        glue = "Steps",//glue decide where the cucumber stepdefinitons and annatotions stored
        dryRun = false,
       plugin ={"html:CucumberReports",
               "junit:CucumberReports/JunitReport.xml"}
)

    public class SomeTest {



    }

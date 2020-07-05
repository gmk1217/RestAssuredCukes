package stepDefs;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber","json:target/cucumber-reports/results.json"},
        features = {"src/test/resources/features/"}
        //glue={"src/test/java/stepDefs/"}
                           )
public class CukeApiRunner extends AbstractTestNGCucumberTests {


}

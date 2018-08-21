package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by balajakka on 12/08/2018.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="/Users/balajakka/gmailTest/src/main/java/DryRun",
        glue={"StepDefinitions"}
                )

public class TestRunner{}
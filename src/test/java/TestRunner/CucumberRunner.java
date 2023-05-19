package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

public class CucumberRunner {

    @CucumberOptions(
            features = {"src/test/resources/features"},
            glue = {"StepDefinition"},
            tags = "@smoke",
            monochrome = true,
            dryRun = false,
            plugin = {
                    "pretty",
                    "html:build/reports/features.html"
            })

    @Test
    public class CucumberRunnerTest extends AbstractTestNGCucumberTests{

    }

}
package achieve.com.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "rerun:target/rerun.txt",
                "json:target/cucumberReport.json"
        },
        features = "src/test/resources/features",
        glue = "achieve/com/stepDefinitions",
        dryRun =false,
        tags = "@logo"
)

public class CucumberRunner {

}

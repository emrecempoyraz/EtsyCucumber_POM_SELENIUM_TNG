package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target\\Pcucumber-reports1.html",
        "json:target/json-reports/Pcucumber1.json",
        "junit:target/xml-report/Pcucumber1.xml"},
        features="src/test/resources",
        glue="stepDefinition",
        tags="@parallel1"  ,

        dryRun = false

)

public class ParallelTestRunner1 {


}

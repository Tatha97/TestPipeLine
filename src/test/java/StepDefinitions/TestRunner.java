package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/featureFiles",
glue= {"StepDefinitions"},

plugin = {"pretty","html:target/HTML_report"}
		
		)
public class TestRunner {

}
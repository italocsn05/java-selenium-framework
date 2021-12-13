package testRunner;

import commons.BaseConfig;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"json:target/cucumber-report/cucumber.json"},
        features = {"src/test/resources/features"},
        glue = {"stepDefinitions", "configuration"},
        tags = "@web"
)

public class TestRunner extends BaseConfig {
}

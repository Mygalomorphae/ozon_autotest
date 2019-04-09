package tests;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features",
        glue = "tests",
        tags = "@1",
        strict = true,
        snippets = SnippetType.UNDERSCORE)


public class CucumberRunnerTest {

    public void iphone8Buying() {
        
    }
}


package org.art.orange;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {"src/test/resources/features/LoginPage.feature"},
        glue = {"org/art/orange/definitions/LoginPageDefinitions"})
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

}

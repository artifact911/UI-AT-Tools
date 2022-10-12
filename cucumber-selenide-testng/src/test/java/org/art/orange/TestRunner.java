package org.art.orange;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test(groups = "cucumber")
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports"},
        features = "src/test/resources/features/",
        glue ="definitions/",
        tags="@RunMe")
public class TestRunner extends AbstractTestNGCucumberTests {

//    @Test(groups = "cucumber", description = "Runs Cucumber Features")
//    public void runCuc () throws IOException {
//
//        new TestNGCucumberRunner(getClass());
//    }
}
package org.prog.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.prog.cucumber.steps.CucumberAlloHomeWorkSteps;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

@CucumberOptions(
        features = "src/test/resources/cucumber",
        glue = "org.prog.cucumber.steps",
        plugin = {"pretty",
                "json:target/cucumber-reports/Cucumber.json",
                "html:target/cucumber-report.html"
        }
)
public class CucumberRunnerAlloHW extends AbstractTestNGCucumberTests {

    @BeforeSuite
    public void init() {
        CucumberAlloHomeWorkSteps.driver = new ChromeDriver();
    }

    @AfterSuite
    public void tearDown() {
        CucumberAlloHomeWorkSteps.driver.quit();
    }
}

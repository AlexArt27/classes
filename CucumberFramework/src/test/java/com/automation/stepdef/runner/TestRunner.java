package com.automation.stepdef.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//test/resources/features//login.feature",
        glue = "com.automation.stepdef",
        tags = "@datatable",
        plugin = {"json:target/cucumber.json","html:report/cucumber.html"}



)
public class TestRunner {
}

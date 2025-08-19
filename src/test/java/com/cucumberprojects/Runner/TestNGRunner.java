package com.cucumberprojects.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src\\test\\resources\\Feature",            // Path to feature files
    glue = {"com.cucumberprojects.StepDefinition"}, // Step definitions and hooks
    plugin = {
        "pretty",
        "html:target/cucumber-reports/html",
        "json:target/cucumber-reports/cucumber.json",
        "junit:target/cucumber-reports/cucumber.xml"
    },
    monochrome = true,
    tags = "@SmokeTest"                                   // Optional: run specific tagged scenarios
)
public class TestNGRunner extends AbstractTestNGCucumberTests {
    // You can override methods here for parallel execution if needed
}
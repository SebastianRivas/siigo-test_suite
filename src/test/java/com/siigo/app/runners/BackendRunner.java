package com.siigo.app.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/backend-reports.html"},
        features = "src/test/resources/features/backend",
        glue = "com.siigo.app.stepdefinitions"
)
public class BackendRunner {
}

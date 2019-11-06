package com.janushenderson.automation.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-htmlreport","json:target/cucumber-report.json"},
        features = {"src/test/resources/features"},
        glue={"com.janushenderson.automation.stepdefinitions"},
        tags = {"@Smoke"}
)

public class TestAll {
}

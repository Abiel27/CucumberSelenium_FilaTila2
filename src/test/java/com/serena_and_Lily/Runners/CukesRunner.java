package com.serena_and_Lily.Runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report1.html",
        features ="src/test/resources/features",
        glue = "com/serena_and_Lily/step_definitions",
        dryRun =  false,
        tags = "@zxc"
)
public class CukesRunner {





}

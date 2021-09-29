package com.Cybertek.Runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/tesat/resources/features",
        glue = "com/Cybertek/step_definitions",
        dryRun = false
)
public class CukesRunner {


}

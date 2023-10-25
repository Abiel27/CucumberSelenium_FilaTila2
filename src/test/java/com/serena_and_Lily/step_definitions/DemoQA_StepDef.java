package com.serena_and_Lily.step_definitions;

import com.serena_and_Lily.Page.DemoQA;
import com.serena_and_Lily.Utilities.ConfigurationReader;
import com.serena_and_Lily.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class DemoQA_StepDef {
    DemoQA demoQA = new DemoQA();

    @Given("user is on the demoQA landing page")
    public void user_is_on_the_demo_qa_landing_page() {
        String url = ConfigurationReader.getProperty("demoQA");
        Driver.getDriver().get(url);
        String currentURL = Driver.getDriver().getCurrentUrl();
        System.out.println(currentURL);
    }

    @When("user check the header")
    public void user_check_the_header() {
        String header = demoQA.header.getText();
        System.out.println("Header =" + header);
    }


    @Then("user should see webElements as expected")
    public void user_should_see_web_elements_as_expected() {
        String actualtitle = Driver.getDriver().getTitle();
        String expected = "DEMOQA";
        assertTrue(actualtitle.equals(expected));
        System.out.println("Verify page title :" + actualtitle + " = " + expected);


    }

}

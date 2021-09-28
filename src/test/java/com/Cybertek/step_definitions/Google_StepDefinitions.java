package com.Cybertek.step_definitions;

import com.Cybertek.Page.GoogleSearchPage;
import com.Cybertek.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Google_StepDefinitions {
    @Given("User is on google home page")
    public void user_is_on_google_home_page(){
        Driver.getDriver().get("https://www.google.com/");

        }
    @When("User searches for apple")
    public void user_searches_for_apple() {
        GoogleSearchPage googleSearchPage = new GoogleSearchPage();
        googleSearchPage.searchBar.sendKeys("apple" + Keys.ENTER);


         }
    @Then("User should see apple in the title")
    public void user_should_see_apple_in_the_title() {
        String actualTiltle = Driver.getDriver().getTitle();
        String expectedInTilte = "apple";
        Assert.assertTrue(actualTiltle.contains(expectedInTilte));

         }

}

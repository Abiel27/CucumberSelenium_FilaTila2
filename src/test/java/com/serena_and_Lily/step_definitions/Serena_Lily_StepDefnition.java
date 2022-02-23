package com.serena_and_Lily.step_definitions;

import com.serena_and_Lily.Page.Serena_and_Llily_SearchPage;
import com.serena_and_Lily.Utilities.BrowserUtils;
import com.serena_and_Lily.Utilities.ConfigurationReader;
import com.serena_and_Lily.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertTrue;

public class Serena_Lily_StepDefnition {
    Serena_and_Llily_SearchPage serenaSearch = new Serena_and_Llily_SearchPage();


    @Given("user is on the Serena & Lily landing page")
    public void user_is_on_the_serena_lily_landing_page() {
        String url = ConfigurationReader.getProperty("serena&lily");
        Driver.getDriver().get(url);

    }

    @Then("user should see Serena & Lily title as expected")
    public void user_should_see_serena_lily_title_as_expected() {
        String actualtitle = Driver.getDriver().getTitle();
        String expected = "Serena and Lily | A Fresh Approach to Bedding, Furniture, and Home";

        assertTrue(actualtitle.equals(expected));
    }
    @And("use has entered {string} and sumited")
    public void useHasEnteredAndSumited(String email) {
        BrowserUtils.waits(3);

        serenaSearch.inputEmail.sendKeys(email);
        serenaSearch.sumitButton.submit();
        BrowserUtils.waits(2);
        serenaSearch.shopNowbutton.click();    }

    @When("user searches for {string}")
    public void userSearchesFor(String item) {
        serenaSearch.searchIcon.click();
        BrowserUtils.waits(2);
        serenaSearch.searchForm.sendKeys(item + Keys.ENTER);
    }

    @Then("user should see {string} in the Serena & Lily title")
    public void userShouldSeeInTheSerenaLilyTitle(String str) {
        BrowserUtils.waits(2);
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = str+" | Serena and Lily";

        Assert.assertTrue(actualTitle.contains(expectedTitle));
        System.out.println("actualTitle = " + actualTitle);
    }
    @Then("user sees {string} in the main header")
    public void user_sees_in_the_main_header(String string) {

        String actualHeaderText = serenaSearch.headerTitle.getText();
        String expected = string;
        System.out.println("actualHeaderText = " + actualHeaderText);
        System.out.println("expected = " + expected);


//        //checking the context of the web element
//        Assert.assertTrue(actualHeaderText.equalsIgnoreCase(expected));
//
//        //checking if the web element is displayed or not
//        Assert.assertTrue(serenaSearch.headerTitle.isDisplayed());



    }




}

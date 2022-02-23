package com.serena_and_Lily.step_definitions;

import com.serena_and_Lily.Page.GoogleSearchPage;
import com.serena_and_Lily.Utilities.ConfigurationReader;
import com.serena_and_Lily.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Google_StepDefinitions {
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    @Given("user is on google home page")
    public void user_is_on_google_home_page() {

    String url = ConfigurationReader.getProperty("googleSearch");
        Driver.getDriver().get(url);

    }

    @Then("user should see following list")
    public void user_should_see_following_list(List<String> expectedFooterLinks){

        System.out.println("expectedFooterLinks = " + expectedFooterLinks);

        for (WebElement eachLink   : googleSearchPage.footerLinks) {
            System.out.println("eachLink = " + eachLink.getText());


        }
        int sizeLinks = googleSearchPage.footerLinks.size();
        System.out.println("sizeLinks = " + sizeLinks);


    }


    }




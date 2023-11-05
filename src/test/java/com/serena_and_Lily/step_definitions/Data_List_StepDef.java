package com.serena_and_Lily.step_definitions;

import com.serena_and_Lily.Page.DropDownsPage;
import com.serena_and_Lily.Page.SoloLearn;
import com.serena_and_Lily.Utilities.BrowserUtils;
import com.serena_and_Lily.Utilities.ConfigurationReader;
import com.serena_and_Lily.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Data_List_StepDef {

    SoloLearn soloLogin = new SoloLearn();
    DropDownsPage dropDownsPage = new DropDownsPage();

    @Then("user should see below words displayed")
    public void user_should_see_below_words_displayed(List<String> fruitList) {
        System.out.println("fruitList = " + fruitList.size());
        System.out.println("fruitList = " + fruitList);

        for (String each : fruitList) {
            System.out.println("each = " + each);

        }

    }

    @Given("user is on log in page of soloLearn")
    public void user_is_on_log_in_page_of_solo_learn() {

        String url = ConfigurationReader.getProperty("soloLearn");
        Driver.getDriver().get(url);

        BrowserUtils.waits(2);



        soloLogin.okCuckies.click();


    }

    @When("user enters below info")
    public void user_enters_below_info(Map<String, String> loginInfo) {
        String username = loginInfo.get("username");
        String password = loginInfo.get("password");

        soloLogin.loginToSoloLearn(username, password);

    }

    @Then("user should see title changed to Abiel Menghistu")

    public void user_should_see_title_changed_to_abiel_menghistu() {

        BrowserUtils.titleVerification("Abiel Menghistu");

    }

    @Given("user is on dropdowns page of practice tool")
    public void user_is_on_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");


    }

    @Then("user should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedList) {

        Select monthDropdown = new Select(dropDownsPage.monthDropdown);
            //Methos from framework utility
//        Assert.assertTrue(expectedList.equals(BrowserUtils.getElementText(monthDropdown.getOptions())));


        List<WebElement> monthWebElement = monthDropdown.getOptions();


        List<String> monthAsString = new ArrayList<>();

        for (WebElement each : monthWebElement) {
            monthAsString.add(each.getText());

        }


        //this assertion will compare the size and each element in the list
      //  Assert.assertTrue(expectedList.equals(monthAsString));
        Assert.assertTrue(expectedList.equals(monthAsString));




    }
}



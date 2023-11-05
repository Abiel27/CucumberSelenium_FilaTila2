package com.serena_and_Lily.Utilities;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils  {


    /*
    this method accept List<WebElement> convert it to List<String>
     */
    public static List<String> getElementText(List<WebElement> webElementList){

        //placeholder empty of web elements
        List<String> webElementsAsString = new ArrayList<>();

        //looping through list of web element amd storing into placeholder
        for (WebElement each : webElementList) {
            webElementsAsString.add(each.getText());

        }
        //returning final List<String>
        return webElementsAsString;
        }




    /*
    method to assert title
     */
    public static void titleVerification(String expectedTitle){

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.equals(expectedTitle));

    }


    public static void waits(int second) {
        //

        /*
         *waiting for x seconds without handling exception
         * @param second
         */

        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void acceptIt() {
        try {

            Alert alert = Driver.getDriver().switchTo().alert();
            alert.accept();
        }catch (Exception e) {
            e.printStackTrace();

    }

    }
    public void dismisIT(){
        try {

        Alert alert = Driver.getDriver().switchTo().alert();
        alert.dismiss();

        }catch (Exception e) {
            e.printStackTrace();
    }

}
public static void sendText(By locator, String data) throws Exception {
    try {

        Alert alert = Driver.getDriver().switchTo().alert();
        alert.sendKeys(data);

    } catch (Exception e) {
        e.printStackTrace();
    }
}}
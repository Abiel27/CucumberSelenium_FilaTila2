package com.serena_and_Lily.Page;

import com.serena_and_Lily.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleSearchPage {
    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@name='q']")
    public WebElement searchBar;

    @FindBy(xpath = "//a[@class='pHiOh']")
    public List<WebElement> footerLinks;



}

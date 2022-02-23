package com.serena_and_Lily.Page;

import com.serena_and_Lily.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Serena_and_Llily_SearchPage {

    public Serena_and_Llily_SearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='email-alert-signup-popup-address']")
    public WebElement inputEmail;

    @FindBy(xpath = "//button[@class='signup-popup-button']")
    public WebElement sumitButton;

    @FindBy(id = "shopnow")
    public WebElement shopNowbutton;

    @FindBy(id = "js-search")
    public WebElement searchIcon;
    @FindBy(id = "q")
    public WebElement searchForm;

    @FindBy(xpath = "//img[@class='logoRet']")
    public WebElement headerTitle;



}

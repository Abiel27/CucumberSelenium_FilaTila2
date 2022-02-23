package com.serena_and_Lily.Page;

import com.serena_and_Lily.Utilities.ConfigurationReader;
import com.serena_and_Lily.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SoloLearn {
   public SoloLearn(){
       PageFactory.initElements(Driver.getDriver(),this);
   }
   @FindBy(id="email")
    public WebElement inputUserName;

   @FindBy(id = "password")
    public WebElement inputPassword;

   @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

   @FindBy(id = "CybotCookiebotDialogBodyLevelButtonAccept")
   public WebElement okCuckies;

//login method hard coded, how to create method 1
   public void loginInfoSoloLearn(){
       inputUserName.sendKeys("Abiel Menghistu");
       inputPassword.sendKeys("PageObjectModel@27");
       loginButton.click();
   }

   //overload version to pass the credentials with parameters, method 2
    public void loginToSoloLearn(String username,String password){
       inputUserName.sendKeys(username);
       inputPassword.sendKeys(password);
       loginButton.click();

    }
    //creat login method data from configuration
    public void loginToSoloLearn_Conf(){
       inputUserName.sendKeys((ConfigurationReader.getProperty("soloUser")));
       inputPassword.sendKeys(ConfigurationReader.getProperty("soloPassword"));
       loginButton.click();

    }
}

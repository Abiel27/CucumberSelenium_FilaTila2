package com.serena_and_Lily.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private static WebDriver driver;

    private  Driver(){ }

    public static  WebDriver getDriver(){

        if (driver== null){
            System.out.println("Creating object first time");
            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();
            driver.manage().window().maximize();
            return driver;
        }
        System.out.println("objcet  already exists returning existing one");
        return driver;
    }


}

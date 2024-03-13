package com.herokuapp.theinternet.utils.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver = null;

    public void setDriver(){
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void setup(){
        setDriver();
    }

    @AfterMethod
    public void close(){
        driver.close();
    }
}

package com.herokuapp.theinternet;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositiveTests {

    @Test
    public void loginTest(){
        System.out.println("Test Started");
        // Create driver
        WebDriver driver = new ChromeDriver();
        System.out.println("Browser Started");

        // Open test page
        String url = "http://the-internet.herokuapp.com/login";
        driver.get(url);

        // Maximize window
        driver.manage().window().maximize();

        System.out.println("Page is opened");

        // Enter username
        // Enter password
        // Click login button

        // Verifications
        // New url
        // Log out button is visible
        // Successful login message

        // Close the browser
        driver.close();
        System.out.println("Test is finished");
    }
}

package com.herokuapp.theinternet.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        WebElement usernameInput = driver.findElement(By.id("username"));

        // Enter password
        WebElement passwordInput = driver.findElement(By.name("password"));

        // Click login button
        WebElement loginButton = driver.findElement(By.cssSelector("button.radius"));

        // Verifications
        // New url

        // Log out button is visible
        WebElement logoutButton = driver.findElement(By.className("button secondary radius"));

        // Successful login message
        WebElement successfulLoginMessage = driver.findElement(By.id("flash"));

        // Close the browser
        driver.close();
        System.out.println("Test is finished");
    }
}

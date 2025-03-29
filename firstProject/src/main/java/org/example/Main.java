package org.example;
// integrated WebDriverManager and Selenium into the project through Maven dependencies.

// We copied the necessary XML codes for WebDriverManager and Selenium integration from Maven Repository and
// pasted them into the pom.xml file between the <dependencies> tags.

// The versions of WebDriverManager and Selenium to be integrated should be selected from the latest and most commonly used ones.
// With WebDriverManager, we can easily download and integrate the web browser driver needed for our project

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup(); // Installed ChromeDriver using WebDriverManager
        WebDriver driver = new ChromeDriver(); // Assigned ChromeDriver to the driver variable

        String baseURL = "https:/www.google.com";
        driver.get(baseURL); // Navigates to the specified website

        String expectedData = "Google";
        String actualData = driver.getTitle(); // Retrieves the title of the page
        System.out.println(actualData);

        // Variable names start with lowercase letters, and class names start with uppercase letters

        if (expectedData.equals(actualData)) {
            System.out.println("Test passed.");
        }else{
            System.out.println("Test failed");
        }

        driver.quit();// Closes the driver, removes it from memory, and closes all browser windows

        //driver.close(); // // Closes the currently active tab or browser window
    }
}
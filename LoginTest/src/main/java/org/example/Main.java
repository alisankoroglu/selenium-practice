package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String baseURL = "https://demo.guru99.com/test/login.html";
        driver.get(baseURL);

        // If we right-click on the web element we need and select 'Inspect', it shows us the code for that element.
        // In the opened panel, if we type `#email` in the search bar, it will show elements with the ID "email".

        WebElement email = driver.findElement(By.id("email"));
        WebElement passwd = driver.findElement(By.id("passwd"));

        email.sendKeys("something@something.com");
        //email.clear(); // Clears its content.
        passwd.sendKeys("smthng");

        WebElement botton = driver.findElement(By.id("SubmitLogin"));
        botton.click();

        driver.quit();

    }
}
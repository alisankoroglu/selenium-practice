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

        String baseURL = "https://demo.guru99.com//test/radio.html";
        driver.get(baseURL);

        // Radio Button: The characteristic of radio buttons is that only one can be selected at a time.
        // Multiple radio buttons cannot remain selected simultaneously.

        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
        radio1.click(); // Clicks on the element.
        // radio1.clear(); // removes the tick

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
        radio2.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement radio3 = driver.findElement(By.id("vfb-7-3"));
        radio3.click();

        // Check-Boxes: Checkboxes allow for **different combinations** to be selected.
        // Unlike radio buttons, multiple checkboxes can be selected at the same time.

        WebElement checkBox1 = driver.findElement(By.id("vfb-6-0"));
        checkBox1.click(); // Clicks on the element.
        checkBox1.isSelected(); // Returns whether it is selected or not.

        WebElement checkBox2 = driver.findElement(By.id("vfb-6-1"));
        checkBox2.click();

        WebElement checkBox3 = driver.findElement(By.id("vfb-6-2"));
        checkBox3.click();

        if (checkBox1.isSelected()){
            System.out.println("The checkbox is selected.");
        }else{
            checkBox1.click();
        }

        //driver.quit();

    }
}



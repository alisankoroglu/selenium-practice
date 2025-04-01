package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup(); // Installed ChromeDriver using WebDriverManager
        WebDriver driver = new ChromeDriver();

        // By typing `driver.` and pressing Ctrl + Space, a list of the methods available for `driver` will be displayed.

        driver.getCurrentUrl(); // Returns the URL of the page we navigated to.
        String sourceCode = driver.getPageSource(); // Returns the source code of the page.

        driver.getWindowHandle(); // Returns a specific ID of the current tab.
        driver.getWindowHandles(); // If multiple tabs are open in the browser, it returns their identifiers as an array.

        driver.get("https:/ww.google.com"); // Navigates to the given URL address.
        // If the browser has previously navigated to a URL and we want it to go to a new address afterward, we use **navigate**.
        driver.navigate().to("https:/www.facebook.com");

        driver.navigate().back(); // Goes to the previous page.
        driver.navigate().forward(); // Goes to the next page.
        driver.navigate().refresh(); // Refreshes the page.

        driver.manage().window().fullscreen(); // makes fullscreen the browser window.
        driver.manage().window().maximize();// Maximizes the browser window.

        driver.manage().window().getPosition(); // Returns the position of the opened window.
        driver.manage().window().getSize();// Returns the width and height of the opened page.
        driver.manage().window().minimize(); // Minimizes the page.

        driver.manage().window().setPosition(new Point(10, 10)); // We can specify the position at which the page will open.
        driver.manage().window().setSize(new Dimension(200,300)); // We can specify the size of the page.


        /*
        Implicitly wait means to wait politely.
        For example, wait for a web element, wait up to 10 seconds.
        If the element is not found within that time, then throw an error.
        */

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // After this code is written, it will wait for 10 seconds, and if it still can't find the element after that, it will throw an error.

        //driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
        //driver.manage().timeouts().implicitlyWait(Duration.ofDays(1));


        driver.quit();
    }
}
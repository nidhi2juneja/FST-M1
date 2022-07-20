package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Activity12_1 {
    public static void main(String[] args) {
        // Creating an instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();
        // Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // Open and load below url in the browser
        driver.get("https://www.training-support.net/selenium/iframes");

        // Title
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        // Switch to frame and print the heading of 1st frame
        driver.switchTo().frame(0);
        WebElement heading1 = driver.findElement(By.cssSelector("div.content"));
        System.out.println(heading1.getText());

        // Print the Button Text and color of the button in that frame.
        WebElement button1=driver.findElement(By.id("actionButton"));
        System.out.println(button1.getText());
        System.out.println(button1.getCssValue("background-color"));
        // Click on that button
        button1.click();

        //print the new button text and color
        System.out.println(button1.getText());
        System.out.println(button1.getCssValue("background-color"));

        // Switch to the parent frame
        driver.switchTo().defaultContent();

        // Switch to the second frame
        driver.switchTo().frame(1);

        // print the heading
        WebElement heading2 = driver.findElement(By.cssSelector("div.content"));
        System.out.println(heading2.getText());

        // Print the Button Text and color of the button in that frame.
        WebElement button2 = driver.findElement(By.cssSelector("button"));
        System.out.println(button2.getText());
        System.out.println(button2.getCssValue("background-color"));
        // Click on that button
        button2.click();

        //print the new button text and color
        System.out.println(button2.getText());
        System.out.println(button2.getCssValue("background-color"));

        // Quitting the browser
        driver.quit();
    }
    
}

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

public class Activity12_2 {
    public static void main(String[] args) {
        // Creating an instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();
        // Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // Open and load below url in the browser
        driver.get("https://www.training-support.net/selenium/nested-iframes");

        // printing the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        // Switch to the iframe on the page 
        driver.switchTo().frame(0);
        // Switch to the first iframe in that frame
        driver.switchTo().frame(0);

        // Printing heading in that frame
        WebElement heading1 = driver.findElement(By.cssSelector("div.content"));
        System.out.println(heading1.getText());

        // Switching to the Parent window
        driver.switchTo().defaultContent();
        // Switch to the iframe on the page 
        driver.switchTo().frame(0);
        // Switch to the second iframe in that frame
        driver.switchTo().frame(1);

        // Printing the heading of the frame
        WebElement heading2 = driver.findElement(By.cssSelector("div.content"));
        System.out.println(heading2.getText());

        // Quitting the browser
        driver.quit();
    }
}

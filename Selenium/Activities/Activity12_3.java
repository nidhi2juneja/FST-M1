package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Activity12_3 {
    public static void main(String[] args) {
        // Creating an instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();
        // Creating object of Actions class
        Actions builder = new Actions(driver);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // Open and load below url in the browser
        driver.get("https://www.training-support.net/selenium/popups");

        // Printing the title of the webpage
        System.out.println("Page title is: " + driver.getTitle());

        // Hover on Sign in button and printing the tooltip message
        WebElement signin=driver.findElement(By.xpath("//button[contains(@class, 'orange')]"));
        builder.moveToElement(signin).build().perform();
        String tooltipText = signin.getAttribute("data-tooltip");
        System.out.println("text: " + tooltipText);
        // Click on Sign in button
        signin.click();

        // Enter the credentials - username , password and click on login button
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

        // Printing the message after clicking on login button
        System.out.println("logged in text is: " +driver.findElement(By.id("action-confirmation")).getText());

        // Quitting the browser
        driver.quit();
    }
    
}

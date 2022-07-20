package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_1{

    public static void main(String[] args) throws InterruptedException {
        // Creating an instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();
        // Creating an instance of WebDriverWait class (Explicit wait)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Open and load below url in the browser
        driver.get("https://training-support.net/selenium/dynamic-attributes");

        // Title
        String title=driver.getTitle();
        System.out.println("Title is " +title);

        // Finding the username input fields and typing credential
        driver.findElement(By.xpath("//input[starts-with(@class, 'username')]")).sendKeys("admin");
        // Finding the password input fields and typing credential
        driver.findElement(By.xpath("//input[starts-with(@class, 'password')]")).sendKeys("password");
        // Clicking on the login button
        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
        // Waiting for the login message to appear and printing the message in the output
        String logmsg=driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
        System.out.println("Log Msg: " + logmsg);

        // Closing the browser
        driver.close();

    }
}
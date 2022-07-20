package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_2{

    public static void main(String[] args) throws InterruptedException {
        // Creating an instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Open and load below url in the browser
        driver.get("https://training-support.net/selenium/dynamic-attributes");

        // Title
        String title=driver.getTitle();
        System.out.println("Title is " +title);

        // Finding the input fields of the sign up form and filling the details in the fields
        driver.findElement(By.xpath("//input[contains(@class,'-username')]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[contains(@class, '-password')]")).sendKeys("password");
        driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input")).sendKeys("password");
        driver.findElement(By.xpath("//input[contains(@class, 'email-')]")).sendKeys("bmlaks47@ibm.com");
        // Clicking on Sign up button
        driver.findElement(By.xpath("//button[normalize-space()='Sign Up']")).click();
        // Capturing success message and printing it on the console.
        String succMessage=driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
        System.out.println("Success Message is: " + succMessage);
        // Closing the driver
        driver.close();

    }
}
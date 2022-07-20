package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_2 {
    public static void main(String[] args) {
        // Creating an instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();
        // Creating an instance of WebDriverWait class (Explicit wait)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 
        // Open and load below url in the browser
        driver.get("https://training-support.net/selenium/ajax");

        // Title
        String title=driver.getTitle();
        System.out.println("Title is " +title);
 
        // Finding and clicking on the "Change content" button on the page
        driver.findElement(By.xpath("//button[@class='ui violet button']")).click();
 
        // Waiting for the text to say "HELLO!"
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"),"HELLO!"));
       
       // Printing the message that appears on the page
        String messageToBeAppeared = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(messageToBeAppeared);

        // Waiting for the text to change to contain "I'm late!"
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"),"I'm late!"));

        // Printing the new message on the page
        String newMessage = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(newMessage);
 
        //Closing the browser
        driver.close();
    }
}

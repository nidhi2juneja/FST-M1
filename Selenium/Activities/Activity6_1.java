package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_1 {
    public static void main(String[] args) {
        // Creating an instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();
        // Creating an instance of WebDriverWait class (Explicit wait)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Open and load below url in the browser
        driver.get("https://training-support.net/selenium/dynamic-controls");
 
        // Title
        String title=driver.getTitle();
        System.out.println("Title is " +title);

        // Finding the checkbox
        WebElement checkbox=driver.findElement(By.xpath("//input[@name='toggled']"));
        // Finding the checkbox toggle button
        WebElement toggledCheckbox=driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
        // Clicking on the toggle button
        toggledCheckbox.click();
        // Waiting for the checkbox to be disappeared
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
        // Clicking on the toggle button
        toggledCheckbox.click();
        // Waiting for the checkbox to be appeared
        wait.until(ExpectedConditions.visibilityOf(checkbox));
        // Clicking on the checbox
        checkbox.click();
        // Closing the browser
        driver.close();
    }
    
}

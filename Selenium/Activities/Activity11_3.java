package Activities;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity11_3 {
    public static void main(String[] args) {
        // Creating an instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Open and load below url in the browser
        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        // Title
        String title=driver.getTitle();
        System.out.println("Title is: " +title);

        // Finding button for opening PROMPT alert and clicking on that
        driver.findElement(By.xpath("//button[@id='prompt']")).click();

        // Switching the focus from the main window to the Alert popup and printing the text after getting
        Alert prompt=driver.switchTo().alert();
        System.out.println(prompt.getText());

        // Using sendKeys() method to type in "Yes, you are!"
        prompt.sendKeys("Yes, you are!");

        // Accept the alert with alert.accept() method
        prompt.accept();

        // Closing the browser
        driver.close();
       
    }
    
}

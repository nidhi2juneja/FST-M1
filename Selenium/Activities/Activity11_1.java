package Activities;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity11_1 {
    public static void main(String[] args) {

        // Creating an instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Open and load below url in the browser
        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        // Title
        String title=driver.getTitle();
        System.out.println("Title is: " +title);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Finding button for opening alert and clicking on that
        driver.findElement(By.xpath("//button[@id='simple']")).click();

        // Switching the focus from the main window to the Alert popup and geting the text 
        Alert alert_Simple =driver.switchTo().alert();
        System.out.println(alert_Simple.getText());

        // Closing the alert popup with ok button clicking (alert.accept())
        simpleAlert.accept();

        // Closing the browser
        driver.close();
    }
    
}

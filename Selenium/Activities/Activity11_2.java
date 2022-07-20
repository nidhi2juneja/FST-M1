package Activities;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity11_2 {
    public static void main(String[] args) {
        // Creating an instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Open and load below url in the browser
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        
        // Title
        String title=driver.getTitle();
        System.out.println("Title is: " +title);

        // Finding button for opening confirm popup and clicking on that
        driver.findElement(By.xpath("//button[@id='confirm']")).click();

        // Switching the focus from the main window to the Alert popup and printing the text after getting
        Alert confirmation=driver.switchTo().alert();
        System.out.println(confirmation.getText());

        // Close the alert popup with alert.accept(). Clicking on OK button
        confirmation.accept();

        // Close the alert popup with alert.dismiss(). Clicking on Cancel button
        confirmation.dismiss();

        // Closing the browser
        driver.close();

    }
    
}

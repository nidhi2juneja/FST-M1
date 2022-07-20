package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity10_3 {
    public static void main(String[] args) {
        // Creating an instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Open and load below url in the browser
        driver.get("https://training-support.net/selenium/drag-drop");

        // Getting title
        String title=driver.getTitle();
        System.out.println("Title is: " + title);
        
        // Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Finding the ball , draggable element and dropzone
        WebElement ball=driver.findElement(By.id("draggable"));
        WebElement dropzone1=driver.findElement(By.id("draggable"));
        WebElement dropzone2=driver.findElement(By.id("dropzone2"));

        Actions actions = new Actions(driver);
        // dragging from ball and dropping to dropzone
        actions.dragAndDrop(ball,dropzone1).build().perform();

        wait.until(ExpectedConditions.attributeToBeNotEmpty(dropzone1, "background-color"));
        System.out.println("DROPZONE 1 DROPPED!");

        actions.dragAndDrop(ball,dropzone2).build().perform();

        wait.until(ExpectedConditions.attributeToBeNotEmpty(dropzone2, "background-color"));
        System.out.println("DROPZONE 2 DROPPED!");
        // Closing the browser
        driver.close();
    
    }
    
}

package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Activity11_4 {
    public static void main(String[] args) {
        // Creating an instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();
        // Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // Open and load below url in the browser
        driver.get("https://www.training-support.net/selenium/tab-opener");
        
        // Title
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        // Getting Handle of parent window
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window handle is : " + parentWindow);

        // Find and click on the button for opening a new tab
        driver.findElement(By.linkText("Click Me!")).click();
        
        // Waiting for the new tab to open
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        // Printing all of the handles
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("All window handles are: " + allWindowHandles);

        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        System.out.println("Current window handle: " + driver.getWindowHandle());
        wait.until(ExpectedConditions.titleIs("Newtab"));
        System.out.println("New Tab Title is: " + driver.getTitle());
        String newTabText = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("New tab heading is: " + newTabText);
        driver.findElement(By.linkText("Open Another One!")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        allWindowHandles = driver.getWindowHandles();
        System.out.println("All window handles: " + allWindowHandles);
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        System.out.println("New tab handle: " + driver.getWindowHandle());
        wait.until(ExpectedConditions.titleIs("Newtab2"));
        System.out.println("New Tab Title is: " + driver.getTitle());
        newTabText = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("New tab heading is: " + newTabText);

        // Quitting all of the windows opened using quit() method
        driver.quit();
    }
    
}

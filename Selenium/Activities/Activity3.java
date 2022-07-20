package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Activity3 {
    public static void main(String[] args) throws InterruptedException {
        // Creating an instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();
    
        // Open and load below url in the browser
        driver.get("https://www.training-support.net/selenium/simple-form");
        
        // Getting the title and print the title
        String title = driver.getTitle();
        System.out.println("Title of the page is: " + title);
        
        //Finding the input fields (firstname , lastname, email) and enter values for that
        driver.findElement(By.id("firstName")).sendKeys("Nidhi");
        driver.findElement(By.id("lastName")).sendKeys("Juneja");
        driver.findElement(By.id("email")).sendKeys("abcdg@xyz.com");
        driver.findElement(By.id("number")).sendKeys("9999999999");
        
        //Clicking on Submit button
        driver.findElement(By.xpath("//input[@value='submit']")).click();
    
        // Clicking on alert ok button for the alert popup
        Alert alert = driver.switchTo().alert();
        Thread.sleep(5000);
        alert.accept();
       
        //Close the browser
        driver.close();
    }
}

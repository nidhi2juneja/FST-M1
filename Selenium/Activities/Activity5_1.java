package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {
    public static void main(String[] args) {
        // Creating an instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();
 
        // Open and load below url in the browser
        driver.get("https://training-support.net/selenium/dynamic-controls");
        
        System.out.println(driver.getTitle());
        
        //Finding the checkbox and verifying if it is displayed
        WebElement checkboxInput = driver.findElement(By.xpath("//input[@name='toggled']"));
        System.out.println("Checkbox displayed status initially: " + checkboxInput.isDisplayed());
 
        // Clicking on the checkbox
        driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
 
        System.out.println("Checkbox displayed status after removal is: " +checkbox.isDisplayed());
        
        // Closing the browser
        driver.close();
 
    }
}

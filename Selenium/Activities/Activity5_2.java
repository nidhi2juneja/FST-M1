package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {
    public static void main(String[] args) throws InterruptedException{
         // Creating an instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();
 
        // Open and load below url in the browser
        driver.get("https://training-support.net/selenium/dynamic-controls");
        // Title
        String title=driver.getTitle();
        System.out.println("Title is " +title);
        // Selected status of checkbox
        WebElement checkboxSel=driver.findElement(By.xpath("//input[@name='toggled']"));
        System.out.println("Selected status of checkbox is: " +checkboxSel.isSelected());

        // Clicking on checkbox
        driver.findElement(By.xpath("//input[@name='toggled']")).click();
        // Selected status of checkbox again after clicking
        System.out.println("Selected status of checkbox again after clicking is: " +checkboxSelection.isSelected());
        
        Thread.sleep(5000);
        // Closing the browser
        driver.close();
    }
}

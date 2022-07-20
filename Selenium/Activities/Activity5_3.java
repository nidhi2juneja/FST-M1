package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
    public static void main(String[] args) {
        // Creating an instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();
        // Open and load below url in the browser
        driver.get("https://training-support.net/selenium/dynamic-controls");

        // Title
        String title = driver.getTitle();
        System.out.println("Title is " + title);

        // Finding the inputbox
        WebElement inputbox = driver.findElement(By.xpath("//input[@name='toggled']"));
        // Printing the status of the inputbox
        System.out.println("Status of the input box is: " + inputbox.isEnabled());
        // Clicking on the Enable Input button
        driver.findElement(By.xpath("//button[@id='toggleInput']")).click();
        // Printing the status of the inputbox after removal
        System.out.println("Status of the input box after removal is: " + inputbox.isEnabled());
        // Closing the browser
        driver.close();

    }

}

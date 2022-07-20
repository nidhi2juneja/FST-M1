package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main(String[] args) throws InterruptedException {
        // Creating an instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Open and load below url in the browser
        driver.get("https://www.training-support.net/selenium/simple-form");

        // Getting the title and print the title
        String title = driver.getTitle();
        System.out.println("Title is: " + title);

        // Finding the webelements with xpath and sending text using sendKeys()
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Nidhi");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Juneja");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcde@xyz.com");
        driver.findElement(By.xpath("//input[@id='number']")).sendKeys("9999999999");
        driver.findElement(By.xpath("//div[@class='field']//textarea")).sendKeys("sample");
        // Clicking on Submit button
        driver.findElement(By.xpath("//input[@value='submit']")).click();
        // Clicking on alert ok button for the alert popup
        Alert alert = driver.switchTo().alert();
        Thread.sleep(5000);
        alert.accept();
        // Closing the browser
        driver.close();
    }

}

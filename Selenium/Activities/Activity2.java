package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) throws InterruptedException {
         // Creating an instance of the FirefoxDriver
         WebDriver driver = new FirefoxDriver();
         // Open and load below url in the browser
         driver.get("https://www.training-support.net");
         // Getting the title and print the title
         String title = driver.getTitle();
         System.out.println("Title is: " + title);
         // Using findElement() method with id, className, linkText, cssSelector and printing the text using getText() method
         WebElement idLocator = driver.findElement(By.id("about-link"));
         System.out.println("Text using id locator: " + idLocator.getText());

         WebElement classLocator = driver.findElement(By.className("huge"));
         System.out.println("Text using class locator: " + classLocator.getText());

         WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
         System.out.println("Text using linkTextLocator: " + linkTextLocator.getText());

         WebElement cssLocator = driver.findElement(By.linkText(".green"));
         System.out.println("Text using cssLocator: " + cssLocator.getText());

         Thread.sleep(3000);

         // Close the browser
         driver.close();
    }
    
}

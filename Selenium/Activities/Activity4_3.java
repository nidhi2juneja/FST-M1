package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
    public static void main(String[] args) {
        // Creating an instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Open and load below url in the browser
        driver.get("https://www.training-support.net/selenium/target-practice");

        // Getting the title and print the title
        String title = driver.getTitle();
        System.out.println("Title is: " + title);

        //Finding the third header and getting the text
        String thirdHeaderText = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
        System.out.println("The third header text is: " + thirdHeaderText);
 
        //Finding the fifth header and get its colour
        String fifthHeaderColour = driver.findElement(By.xpath("//h5[@class='ui green header']")).getCssValue("color");
        System.out.println("The fith header's colour is: " + fifthHeaderColour);
 
        //Finding the violet button and printing its classes
        String violetButton=driver.findElement(By.xpath("//button[@class='ui violet button']")).getAttribute("class");
        System.out.println("The violet button's classer are: " + violetButton);
 
        //Finding the grey button with Absolute XPath and printing text
        String greyButton = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/button[2]")).getText();
        System.out.println("The grey button's text is: " + greyButton);
 
        //Closing the browser
        driver.close();
 
    }
    
}

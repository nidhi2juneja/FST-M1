package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity10_1 {
    public static void main(String[] args) {
        // Creating an instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Open and load below url in the browser
        driver.get("https://www.training-support.net/selenium/input-events");

        // Creating an object of Actions class
        Actions actBuilder = new Actions(driver);

        // Getting the title of the page using driver.getTitle() and printing
        String title=driver.getTitle();
        System.out.println("Title of the page is: " + title);

        // Performing the left click and printing the value of the side in the front.
        WebElement cubeEle=driver.findElement(By.id("wrapD3Cube"));
        // Left click
        actBuilder.click(cubeEle);
        WebElement valueToBeClicked=driver.findElement(By.className("active"));
        System.out.println(valueToBeClicked.getText());

        // Performing the double click on an element to show a random side and printing the number
        actBuilder.contextClick(cubeEle);
        WebElement valueToBeRightClicked=driver.findElement(By.className("active"));
        System.out.println(valueToBeRightClicked.getText());

        // Right click and print the value shown on the front of the cube.
        actBuilder.contextClick(cubeEle).perform();
        WebElement valueToBeDoubleClicked=driver.findElement(By.className("active"));
        System.out.println(valueToBeDoubleClicked.getText());

        // Closing the browser
        driver.close();

    }
    
}

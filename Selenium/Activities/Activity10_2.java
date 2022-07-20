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

public class Activity10_2 {
    public static void main(String[] args) {

        // Creating an instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Open and load below url in the browser
        driver.get("https://www.training-support.net/selenium/input-events");
        
        // Title
        String title=driver.getTitle();
        System.out.println("Title is: "+ title);

        // Creating an object of the Actions class
        Actions actions = new Actions(driver);
        // Pressing the key of the first name in caps
        WebElement keyToBePressed=driver.findElement(By.id("keyPressed"));
        Action keyFirstName=actions.sendKeys("N").build();
        keyFirstName.perform();
        // Printing the value of the key pressed
        System.out.println("Text of the pressed key is: " + keyToBePressed.getText());

        // Pressing CTRL+a and the CTRL+c to copy all of the text and paste the text in a text editor

        Action keysAcSeq=actions.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build();
        keysAcSeq.perform();

        System.out.println("Pressed key is: " + keyToBePressed.getText());
        // Closing the browser
        driver.close();
    }
    
}

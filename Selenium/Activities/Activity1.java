package Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) {
        // Creating an instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();
        // Open and load below url in the browser
        driver.get("https://www.training-support.net");
        // Close the browser
        driver.close();
    }
    
}

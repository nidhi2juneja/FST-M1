package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity1 {

    WebDriver driver;

        @BeforeMethod
        public void setUpDriver() {
           //Create a new instance of the Firefox driver
           driver = new FirefoxDriver();
           //Open browser
           driver.get("https://www.training-support.net");
        }
        @Test
        public void homepage() {
            // Checking the title
            String title = driver.getTitle();
            // Printing the title of the page
            System.out.println("Title of the page is: " + title);
            // Assertions for verifying the page title
            Assert.assertEquals(title, "Training Support");

            // Clicking on the link
            driver.findElement(By.id("about-link")).click();
            // Finding the new page title
            String pagetitle = driver.getTitle();
            // Assertions for verifying the page title
            Assert.assertEquals(pagetitle, "About Training Support");
        }

        @AfterMethod
        public void closeBrowserD(){
            // Closing the browser
            driver.quit();
    }
}
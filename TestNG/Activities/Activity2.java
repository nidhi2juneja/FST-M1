package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Activity2 {

    WebDriver driver;

    @BeforeClass
    public void setUpDriver() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        //Open browser
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @Test(priority = 0)
    public void firstHomePage() {
        // Getting the title
        String title = driver.getTitle();
        // Asserting the title with actual and expected
        Assert.assertEquals(title, "Target Practice");
    }

    @Test(priority = 1)
    public void findBlackButton() {
        // Searching for the black button with findElement method
        WebElement button = driver.findElement(By.xpath("//button[@class='ui black button']"));
        // Asserting
        Assert.assertEquals(button.getText(), "black");
    }

    @Test(priority = 2, enabled = false)
    public void skippingTest() {
        driver.findElement(By.xpath("//button[@class='ui black button']")).click();

    }

    @Test(priority = 3)
    public void test4() {
            throw new SkipException("Skipping the test");

    }

    @AfterClass
    public void closeBrowserD() {
        driver.quit();
    }
}
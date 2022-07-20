package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Activity3{

    WebDriver driver;

    @BeforeClass
    public void setUpDriver() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        //Open browser
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @Test
    public void loginPageTest() {
        // Find the username and entering username in that using sendKeys() method
        driver.findElement(By.id("username")).sendKeys("admin");
        // Find the password and entering password in that using sendKeys() method
        driver.findElement(By.id("password")).sendKeys("password");
        // Clicking on login button
        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
        // Getting login message and asserting actual message with expected
        String loginConfirmation=driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginConfirmation,"Welcome Back, admin");

    }

    @AfterClass
    public void closeBrowserTest() {
        driver.quit();
    }
}
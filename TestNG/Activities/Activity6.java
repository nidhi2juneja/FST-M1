package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Activity6{

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @Test
    @Parameters({ "sUsername", "sPassword" })
    public void loginpage(String sUsername, String sPassword) {
       WebElement username= driver.findElement(By.id("username"));
       WebElement password=driver.findElement(By.id("password"));
       username.sendKeys(sUsername);
       password.sendKeys(sPassword);
        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
        String loginConfirmation=driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginConfirmation,"Welcome Back, admin");

    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}
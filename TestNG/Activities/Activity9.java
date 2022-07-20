package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Activity9{

    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new FirefoxDriver();
        Reporter.log("Start test");
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        Reporter.log("Opened browser and move to title");
        Reporter.log("Title is: " +driver.getTitle());
    }

    @BeforeMethod
    public void beforeMethod(){
        driver.switchTo().defaultContent();
        Reporter.log("Switch to alerts");
    }

    @Test(priority = 0)
    public void simpleAlertTestCase() {
        driver.findElement(By.id("simple")).click();
        Alert simpleAlert = driver.switchTo().alert();
        Reporter.log("Found the simple alert");
        String simpleAlertText=simpleAlert.getText();
        Reporter.log(" Simple Alert text is: " + simpleAlertText + " |");
        simpleAlert.accept();
        Reporter.log("Accepted the alert");
        Assert.assertEquals(simpleAlertText,"This is a JavaScript Alert!");

    }
    @Test(priority = 1)
    public void promptAlertTestCase() {
        driver.findElement(By.id("prompt")).click();
        Alert promptAlert = driver.switchTo().alert();
        Reporter.log("Found the simple alert");
        String promptAlertText=promptAlert.getText();
        Reporter.log(" Simple Alert text is: " + promptAlertText + " |");
        promptAlert.sendKeys("Ok");
        Reporter.log("Sending acceptance to prompt");
        Assert.assertEquals(promptAlertText,"This is a JavaScript Prompt!");

    }
    @Test(priority = 2)
    public void confirmAlertTestCase() {
        driver.findElement(By.id("confirm")).click();
        Alert confirmAlert = driver.switchTo().alert();
        Reporter.log("Found the simple alert");
        String confirmAlertText=confirmAlert.getText();
        Reporter.log(" Simple Alert text is: " + confirmAlertText + " |");
        confirmAlert.dismiss();
        Reporter.log("Cancelled the alert");
        Assert.assertEquals(confirmAlertText,"This is a JavaScript Confirmation!");

    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
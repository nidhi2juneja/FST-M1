package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity5{

    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @Test (groups = {"HeaderTests", "ButtonTests"})
    public void titlePage() {
        // Finding the page title and verifying the actual vs expected title
        String title=driver.getTitle();
        Assert.assertEquals(title,"Target Practice");
    }
    @Test (dependsOnMethods = {"titlePage"},groups = { "HeaderTests"})
    public void headerTest1() {
        // Finding the third header and verifying the actual vs expected header
        String thirdHeader = driver.findElement(By.id("third-header")).getText();
        Assert.assertEquals(thirdHeader,"Third header");
    }
    @Test (dependsOnMethods = {"titlePage"},groups = { "HeaderTests"})
    public void headerTest2() {
        // Finding the colour of the fifth header and asserting
        WebElement fifthHeader = driver.findElement(By.cssSelector("h3#fifth-header"));
        Assert.assertEquals(fifthHeader.getCssValue("color"),"rgb(251, 189, 8)");
    }

    @Test (dependsOnMethods = {"titlePage"},groups = {"ButtonTests"})
    public void buttonTest1() {
        // Finding the button with olive class and asserting the text (Actual vs expected)
        String button1 = driver.findElement(By.cssSelector("button.olive")).getText();
        Assert.assertEquals(button1,"Olive");
    }
    @Test(dependsOnMethods = {"titlePage"},groups = {"ButtonTests"})
    public void buttonTest2() {
        // Finding and asserting the colour of the first button 
        WebElement button2 = driver.findElement(By.cssSelector("button.brown"));
        Assert.assertEquals(button2.getCssValue("color"),"rgb(255, 255, 255)");
    }

    @AfterClass(alwaysRun = true)
    public void closeBrowser() {
        // Closing the browser
        driver.close();
    }
}
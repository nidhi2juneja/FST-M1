package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity1 {

    WebDriver driver;
    
    @BeforeClass
    public void setup() {
        driver = new FirefoxDriver();
        driver.get("‘http://alchemy.hguy.co/orangehrm");
    }
    @Test
    public void getTitleOfWebPage() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "OrangeHRM");
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
    
}

package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity2 {

    WebDriver driver;
    
    @BeforeClass
    public void setup() {
        driver = new FirefoxDriver();
        driver.get("‘http://alchemy.hguy.co/orangehrm");
    }
    @Test
    public void gettingURLOfHeaderImage() {
        String getURLOfNewTab = driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com/']")).getAttribute("href");
        System.out.println("URL of the Header is: " + getURLOfNewTab);
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
    
}

package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity6 {

    WebDriver driver;
    
    @BeforeClass
    public void setup() {
        driver = new FirefoxDriver();
        driver.get("‘http://alchemy.hguy.co/orangehrm");
    }
    @Test
    public void loggingToTheSite() {
        String userName = driver.findElement(By.id("txtUsername"));
        String password = driver.findElement(By.id("txtPassword"));
        userName.sendKeys("orange");
        password.sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();
        WebElement directoryElement = driver.findElement(By.id("menu_directory_viewDirectory"));
        if(directoryElement.isVisible() & directoryElement.isClickable()){
            directoryElement.click();
        }
        WebElement directoryEleHeading = driver.findElement(By.xpath("//h1[text()='Search Directory']"));
        Assert.assertEquals(directoryEleHeading.getText(), "Search Directory");
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
    
}

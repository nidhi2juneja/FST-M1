package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity7 {

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
        driver.findElement(By.id("menu_pim_viewMyDetails"));
        driver.findElement(By.xpath("//*[@id='sidenav']//*[text()='Qualifications']")).click();
        driver.findElement(By.xpath("#addWorkExperience")).click();
        driver.findElement(By.id("experience_employer")).sendKeys("abcd");
        driver.findElement(By.id("experience_jobtitle")).sendKeys("xyz");
        driver.findElement(By.id("btnWorkExpSave")).click();
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
    
}

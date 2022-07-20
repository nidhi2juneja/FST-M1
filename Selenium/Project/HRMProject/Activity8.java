package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity8 {

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
        driver.findElement(By.xpath("//span[text()='Apply Leave']")).click();
        WebElement selectLeaveType = driver.findElement(By.xpath("//select[@id='applyleave_txtLeaveType']"));
        Select se = new Select(selectLeaveType);
        se.selectByValue("1");
        driver.findElement(By.xpath("//input[@id='applyleave_txtFromDate']")).sendKeys("2022-07-18");
        driver.findElement(By.xpath("//input[@id='applyleave_txtToDate']")).sendKeys("2022-07-18");
        driver.findElement(By.xpath("//input[@id='applyBtn']")).click();

        driver.findElement(By.xpath("//*[text()='My Leave']")).click();
        driver.findElement(By.xpath("//input[@id='calFromDate']")).sendKeys("2022-07-18");
        driver.findElement(By.xpath("//input[@id='calToDate']")).sendKeys("2022-07-18");
        System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Pending Approval')]")).isVisible());
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
    
}

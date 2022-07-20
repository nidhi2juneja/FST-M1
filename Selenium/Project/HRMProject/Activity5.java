package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity5 {

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
        driver.findElement(By.id("#menu_pim_viewMyDetails")).click();
        driver.findElement(By.xpath("//input[@value='Edit']")).click();
        driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("Nidhi");
        driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("Juneja");
        driver.findElement(By.id("personal_optGender_2")).click();
        WebElement nationalityDropdown = driver.findElement(By.id("personal_cmbNation"));
        Select se = new Select(nationalityDropdown);
        se.selectByValue("82");
        driver.findElement(By.xpath("//input[@id='personal_DOB']")).sendKeys("1991-09-10");
        driver.findElement(By.xpath("//input[@id='btnSave']")).click();
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
    
}

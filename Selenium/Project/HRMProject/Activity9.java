package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity9 {

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
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        driver.findElement(By.xpath("//a[text()='Emergency Contacts']")).click();
        WebElement firstRowColumns = driver.findElement(By.xpath("(//table[@id='emgcontact_list']//tbody//tr)[1]"));
        WebElement secondRowColumns = driver.findElement(By.xpath("(//table[@id='emgcontact_list']//tbody//tr)[2]"));
        WebElement thirdRowColumns = driver.findElement(By.xpath("(//table[@id='emgcontact_list']//tbody//tr)[3]"));

        System.out.println(firstRowColumns);
        System.out.println(secondRowColumns);
        System.out.println(thirdRowColumns);
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
    
}

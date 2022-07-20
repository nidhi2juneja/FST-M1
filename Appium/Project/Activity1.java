package Project;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Activity1 {
    AndroidDriver driver;
    WebDriverWait wait;


    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options=new UiAutomator2Options();
        options.setDeviceName("Redmi Note 7 Pro");
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.apps.tasks");
        options.setAppActivity(".ui.TaskListsActivity");
        options.noReset();

        URL serverURL=new URL("http://localhost:4723/wd/hub");
        driver=new AndroidDriver(serverURL,options);
    }

    @Test
    public void tasks() throws InterruptedException {
        driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Create new task\"]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[contains (@resource-id,'com.google.android.apps.tasks:id/add_task_title')]")).sendKeys("Complete Activity with Google Tasks");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Create new task\"]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[contains (@resource-id,'com.google.android.apps.tasks:id/add_task_title')]")).sendKeys("Complete Activity with Google Keep");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Create new task\"]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[contains (@resource-id,'com.google.android.apps.tasks:id/add_task_title')]")).sendKeys("Complete the second Activity Google Keep");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();

        List<WebElement> tasks=driver.findElements(AppiumBy.xpath("//android.widget.TextView[contains (@resource-id,'com.google.android.apps.tasks:id/task_name')]"));
        String task1=tasks.get(0).getText();
        Assert.assertEquals(task1,"Complete the second Activity Google Keep");
        String task2=tasks.get(1).getText();
        Assert.assertEquals(task2,"Complete Activity with Google Keep");
        String task3=tasks.get(2).getText();
        Assert.assertEquals(task3,"Complete Activity with Google Tasks");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
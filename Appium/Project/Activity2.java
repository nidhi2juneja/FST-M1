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

public class Activity2 {
    AndroidDriver driver;
    WebDriverWait wait;


    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options=new UiAutomator2Options();
        options.setDeviceName("Redmi Note 7 Pro");
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.keep");
        options.setAppActivity(".activities.BrowseActivity");
        options.noReset();

        URL serverURL=new URL("http://localhost:4723/wd/hub");
        driver=new AndroidDriver(serverURL,options);
        wait=new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    @Test
    public void notes() throws InterruptedException {
        driver.findElement(AppiumBy.id("com.google.android.keep:id/new_note_button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[contains (@resource-id,'com.google.android.keep:id/editable_title')]")).sendKeys("FST_Appium_Project");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(AppiumBy.id("com.google.android.keep:id/edit_note_text")).sendKeys("Waits,ScrollableInfo");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]\n")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//androidx.cardview.widget.CardView[contains (@resource-id,'com.google.android.keep:id/browse_text_note')]")));

        List <WebElement> notes=driver.findElements(AppiumBy.xpath("//android.widget.TextView[contains (@resource-id,'com.google.android.keep:id/index_note_title')]"));
        String expectedNotes=notes.get(0).getText();
        System.out.println(expectedNotes);

        WebElement notestitle=driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains (@resource-id , 'com.google.android.keep:id/index_note_title')]"));
        String actualNotes=notestitle.getText();
        Assert.assertEquals(actualNotes,expectedNotes);




    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
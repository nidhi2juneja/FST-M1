package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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


public class Activity4    {
    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options=new UiAutomator2Options();
        options.setDeviceName("Redmi Note 7 Pro");
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.contacts");
        options.setAppActivity(".activities.TwelveKeyDialer");
        options.noReset();

        URL serverURL=new URL("http://localhost:4723/wd/hub");
        driver=new AndroidDriver(serverURL,options);
    }


    @Test
    public void contact(){
        driver.findElement(AppiumBy.xpath("//android.widget.ImageView[contains (@content-desc, 'Contacts')]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.ImageView[contains (@content-desc, 'Add')]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[contains (@text, 'Name')]")).sendKeys("Aaditya");
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[contains (@text, 'Phone')]")).sendKeys("999148292");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[contains (@content-desc, 'OK')]")).click();

        String contact=driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains (@resource-id, 'com.android.contacts:id/custom_title')]")).getText();
        System.out.println(contact);
        Assert.assertEquals(contact,"Aaditya");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
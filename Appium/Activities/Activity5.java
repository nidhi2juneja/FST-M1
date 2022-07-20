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


public class Activity5    {
    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options=new UiAutomator2Options();
        options.setDeviceName("Redmi Note 7 Pro");
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.mms");
        options.setAppActivity(".ui.MmsTabActivity");
        options.noReset();

        URL serverURL=new URL("http://localhost:4723/wd/hub");
        driver=new AndroidDriver(serverURL,options);
    }


    @Test
    public void sms(){
        driver.findElement(AppiumBy.xpath("//android.widget.ImageView[contains (@resource-id, 'com.android.mms:id/fab')]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.LinearLayout[contains (@resource-id, 'com.android.mms:id/recipients_viewer_linear')]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[contains (@content-desc, 'Recipient: ')]")).sendKeys("7997227825");
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[contains (@text, 'Text message')]")).sendKeys("Hello from Appium");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[contains (@content-desc, 'Send message')]")).click();

        String message=driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains (@text, 'Hello from Appium')]")).getText();
        System.out.println(message);
        Assert.assertEquals(message,"Hello from Appium");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
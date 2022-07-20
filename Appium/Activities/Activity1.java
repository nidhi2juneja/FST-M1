package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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


public class Activity1   {
    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options=new UiAutomator2Options();
        options.setDeviceName("Redmi Note 7 Pro");
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.miui.calculator");
        options.setAppActivity(".cal.CalculatorActivity");
        options.noReset();

        URL serverURL=new URL("http://localhost:4723/wd/hub");
        driver=new AndroidDriver(serverURL,options);
    }

    @Test
    public void calculation(){
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains (@text, '9')]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.ImageView[contains (@content-desc, 'multiply')]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains (@resource-id, 'com.miui.calculator:id/btn_9_s')]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.ImageView[contains (@content-desc, 'equals')]")).click();
        String result= driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains (@resource-id, 'com.miui.calculator:id/result')]")).getText();
        Assert.assertEquals(result, "= 81");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
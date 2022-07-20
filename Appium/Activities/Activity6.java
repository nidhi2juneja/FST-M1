package Activities;

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
import java.util.List;


public class Activity6   {
    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void images() throws MalformedURLException {
        UiAutomator2Options options=new UiAutomator2Options();
        options.setDeviceName("Redmi Note 7 Pro");
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.noReset();

        URL serverURL=new URL("http://localhost:4723/wd/hub");
        driver=new AndroidDriver(serverURL,options);
        driver.get("https://www.training-support.net/selenium/lazy-loading");
    }


    @Test
    public void sms(){
        List<WebElement> numberOfImages=driver.findElements(AppiumBy.xpath("//android.view.View/android.view.View/android.widget.Image"));
        Assert.assertEquals(numberOfImages.size(),2);
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        driver.findElement(AppiumBy.ByAndroidUIAutomator.androidUIAutomator(UiScrollable + ".scrollTextIntoView(\"helen\")"));
        List<WebElement> numberOfImagesAfterScroll=driver.findElements(AppiumBy.xpath("//android.view.View/android.view.View/android.widget.Image"));
        System.out.println(numberOfImagesAfterScroll.size());
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity2 {
    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options=new UiAutomator2Options();
        options.setDeviceName("Redmi Note 7 Pro");
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.noReset();

        URL serverURL=new URL("http://localhost:4723/wd/hub");
        driver=new AndroidDriver(serverURL,options);
    }

    @Test
    public void checkTitle(){

        driver.get("https://www.training-support.net/");
        String heading=driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains (@text, 'Training Support')]")).getText();
        System.out.println(heading);
        driver.findElement(AppiumBy.xpath("//android.view.View[contains (@content-desc, 'About Us')]")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[contains (@text, 'About Us')]")));
        String locateButton=driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains (@text, 'About Us')]")).getText();
        Assert.assertEquals(heading, "Training Support");
        Assert.assertEquals(locateButton,"About Us");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
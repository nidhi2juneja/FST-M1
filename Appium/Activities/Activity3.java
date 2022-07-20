package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
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


public class Activity3   {
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
    public void add(){
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='5']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.ImageView[contains (@content-desc, 'plus')]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='9']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.ImageView[contains (@content-desc, 'equals')]")).click();
        String addResult= driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='= 14']")).getText();
        System.out.println(addResult);
        Assert.assertEquals(addResult, "= 14");
    }
    @Test
    public void subtract(){
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='1']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='0']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.ImageView[contains (@content-desc, 'minus')]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='5']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.ImageView[contains (@content-desc, 'equals')]")).click();
        String subResult= driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='= 5']")).getText();
        System.out.println(subResult);
        Assert.assertEquals(subResult, "= 5");
    }
    @Test
    public void multiply(){
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='5']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.ImageView[contains (@content-desc, 'multiply')]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='1']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='0']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='0']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.ImageView[contains (@content-desc, 'equals')]")).click();
        String mulResult= driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='= 500']")).getText();
        System.out.println(mulResult);
        Assert.assertEquals(mulResult, "= 500");
    }
    @Test
    public void division(){
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='5']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='0']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.ImageView[contains (@content-desc, 'divide')]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='2']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.ImageView[contains (@content-desc, 'equals')]")).click();
        String divResult= driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='= 25']")).getText();
        System.out.println(divResult);
        Assert.assertEquals(divResult, "= 25");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
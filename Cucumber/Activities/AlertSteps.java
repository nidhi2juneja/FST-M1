package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.internal.Throwables;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertSteps {
    WebDriver driver;
    WebDriverWait wait;
    Alert alert;

    @Given("^User is on the page$")
    public void homePage() throws Throwable {

        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");

    }
    @When("^User clicks the Simple Alert button$")
    public void simpleAlert(){
        driver.findElement(By.id("simple")).click();
    }
    @When("^User clicks the Confirm Alert button$")
    public void confirmAlert(){
        driver.findElement(By.id("confirm")).click();
    }
    @When("^User clicks the Prompt Alert button$")
    public void promptAlert(){
        driver.findElement(By.id("prompt")).click();
    }
    @Then("^Alert opens$")
    public void opensAlert(){
      alert= driver.switchTo().alert();
    }
    @And("^Read the text from it and print it$")
    public void readText(){
        System.out.println("Alert text: " + alert.getText());
    }
    @And("^Write a custom message in it$")
    public void writeText(){
        alert.sendKeys("Hello");
    }
    @And("^Close the alert$")
    public void closeAlert(){
        alert.accept();
    }
    @And("^Close the alert with Cancel$")
    public void closeAlertWithCancel() {
        alert.dismiss();
    }
    @And("^Close the Browser$")
    public void closeBrowser(){
        driver.quit();
    }
}
package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.internal.Throwables;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTestSteps {
    WebDriver driver;
    WebDriverWait wait;

    @Given("^User is on Login Page$")
    public void loginPage() throws Throwable {
        driver=new FirefoxDriver();
        wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://www.training-support.net/selenium/login-form");

    }
    @When("^User enters username and password$")
    public void enterCreds() throws Throwable {
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
    }
    //Activity4

    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void user_enters_and(String username, String password) throws Throwable {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Then("^Read the page title and confirmation message$")
    public void confirmLogin() throws Throwable {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("action-confirmation")));
        String message=driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Title is: " +driver.getTitle());
        System.out.println("Confirmation Message is: " +message);
        if(message.contains("admin")) {
            Assert.assertEquals(message, "Welcome Back, admin");
        } else {
            Assert.assertEquals(message, "Invalid Credentials");
        }
    }

    @And("^Close browser$")
    public void closeBrowser(){
        driver.quit();
    }
}
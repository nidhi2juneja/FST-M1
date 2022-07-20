package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.internal.Throwables;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleSearchSteps extends BaseClass {

    @Given("^User is on Google Page$")
    public void loginPage() throws Throwable {

        driver.get("https://www.google.com");

    }
    @When("^User search for Cheese products and hits ENTER$")
    public void search() throws Throwable {
        driver.findElement(By.name("q")).sendKeys("Cheese", Keys.ENTER);
    }
    @Then("^Results are Displayed to User$")
    public void results() throws Throwable {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("result-stats")));
        String resultCount=driver.findElement(By.id("result-stats")).getText();
        System.out.println("Results count is: " +resultCount);
    }
}
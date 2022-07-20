package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity9_2 {
    public static void main(String[] args) {
        // Creating an instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Open and load below url in the browser
        driver.get("https://training-support.net/selenium/selects");

        // Using findElement() method to find the multi-select options and webElement on the page
        WebElement chooseOptionEle = driver.findElement(By.id("multi-value"));
        WebElement selectMultiEle =driver.findElement(By.id("multi-select"));

        // Create an object of Select class
        Select mulSelectEl = new Select(selectMultiEle);
        
        // Check if the element is a multi-list
        if(mulSelectEl.isMultiple()) {
            // Selecting the 'JavaScript' option using visible text
            mulSelectEl.selectByVisibleText("Javascript");
            // Getting the text of the choosen Option
            System.out.println(chooseOptionEle.getText());
            // Selecting the 'NodeJS' option by value.
            mulSelectEl.selectByValue("node");
            // Getting the text of the choosen Option
            System.out.println(chooseOptionEle.getText());

            // Selecting the 4th, 5th, and the 6th options by index using for loop
            for (int i = 3; i <= 5; i++) {
                mulSelectEl.selectByIndex(i);
                // Getting the text of the choosen Option
                System.out.println(chooseOptionEle.getText());
            }

            // Deselecting the 'NodeJS' option by value and 7th option by index.
            mulSelectEl.deselectByValue("node");
            mulSelectEl.deselectByIndex(6);

            // Getting and printing all selected options one by one
            List<WebElement> dropdownSelectedOptions = mulSelectEl.getAllSelectedOptions();
            for (WebElement dropdownSelectedOption : dropdownSelectedOptions) {
                System.out.println("Dropdown Selected option: " + dropdownSelectedOption.getText());
            }

            // Deselecting all of the dropdown options
            mulSelectEl.deselectAll();
            // Trying to print the selected value text after deselecting
            System.out.println(chooseOptionEle.getText());

            // Closing the browser
            driver.close();
    }
    
}

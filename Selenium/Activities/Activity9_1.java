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

public class Activity9_1 {
    public static void main(String[] args) {
        // Creating an instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Open and load below url in the browser
        driver.get("https://training-support.net/selenium/selects");

        // Using findElement() to find the dropdown WebElement and option to be selected on the page
        WebElement optionToBeChoosen = driver.findElement(By.id("single-value"));
        WebElement dropdownElement=driver.findElement(By.xpath("//select[@id='single-select']"));

        // Creating new Select class object
        Select select=new Select(dropdownElement);
        // Selecting the second option using selectByVisibleText() method
        select.selectByVisibleText("Option 2");
        // Printing the selected dropdown value
        System.out.println(optionToBeChoosen.getText());
        // Selecting the third option using selectByIndex()
        select.selectByIndex(2);
        // Printing the selected dropdown value
        System.out.println(optionToBeChoosen.getText());
        // Selecting the fourth option using selectByValue()
        select.selectByValue("4");
        // Printing the selected dropdown value
        System.out.println(optionToBeChoosen.getText());
        // Getting all of the options in the dropdown element and printing them one by one
        List<WebElement> optionsInDropdown = select.getOptions();
        for(WebElement singleDropdownValue:optionsInDropdown){
            System.out.println(singleDropdownValue.getText());
        }
        // Closing the browser
        driver.close();

    }
    
}

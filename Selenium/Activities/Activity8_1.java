package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity8_1{

    public static void main(String[] args) throws InterruptedException {

        // Creating an instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Open and load below url in the browser
        driver.get("https://training-support.net/selenium/tables");

//         
//         Find and print the cell value at the second row and second column.
//         Close the browser

        // Using findElements() with xpath() to find the number of columns
        List<WebElement> totalColumns = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
        System.out.println("Total number of columns are: " + totalColumns.size());

        // Using findElements() with xpath() to find the number of rows
        List<WebElement> totalRows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
        System.out.println("Total number of rows are: " + totalRows.size());

        // Finding all of the cell values of the third row of the table and printing them
        List<WebElement> row_3rd= driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
        for(WebElement row_value : row_3rd) {
            System.out.println(row_value.getText());
        }
        // Finding the cell value of the second row and second column.
        WebElement seccellValue = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
        System.out.println(seccellValue.getText());

        // Closing the browser
        driver.close();

    }
}
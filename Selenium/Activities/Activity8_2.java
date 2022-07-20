package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity8_2 {
    public static void main(String[] args) {
        // Creating an instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();
 
        // Open and load below url in the browser
        driver.get("https://training-support.net/selenium/tables");
 
        //Using findElements() with xpath to find the no of columns
        List<WebElement> numberOfColumns = driver.findElements(By.xpath("//table[@id='sortableTable']/thead/tr/th"));
        // printing the number of columns
        System.out.println("Total number of columns are: " + numberOfColumns.size());

        //Using findElements() with xpath to find the no of rows
        List<WebElement> numberOfRows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
 
        // printing the number of rows
        System.out.println("Total number of rows are: " + numberOfRows.size());
 
        // Finding the cell value at the second row and second column 
        WebElement cellValue_secR_secC_bef = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        // Printing the cell value at the second row and second column
        System.out.println("Cell value at the second row and second column before sorting: " + cellValue_secR_secC.getText());
 
        //Sorting the table by clicking on the the header of the first column
        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[2]")).click();
 
        //Printing the cell value at the second row and second column again
        WebElement cellValue_secR_secC_aft = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Cell value at the second row and second column after sorting): " + cellValue_secR_secC_aft.getText());
 
        //Printing the cell values of the footer in the table
        WebElement cellValue_footer = driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
        System.out.println("Cell value of the footer in the table: " + cellValue_footer.getText());
 
        //Closing the browser
        driver.close();
}

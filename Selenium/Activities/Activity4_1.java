package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver

public class Activity4_1 {
    public static void main(String[] args) throws InterruptedException {
        // Creating an instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Open and load below url in the browser
        driver.get("https://www.training-support.net");

        // Getting the title and print the title
        String title = driver.getTitle();
        System.out.println("Title of the current page is: " + title);

        // Finding the "About Us" link using findElement() method and click on that
        driver.findElement(By.xpath("//a[@id='about-link']")).click();

        // Printing the title of the new page after clicking on About Us link
        System.out.println("Title of the About Us page is " + driver.getTitle());

        Thread.sleep(3000);
        
        // Close the browser
        driver.close();
    }

}

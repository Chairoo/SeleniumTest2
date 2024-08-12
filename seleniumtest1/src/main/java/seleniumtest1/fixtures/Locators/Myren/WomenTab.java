package seleniumtest1.fixtures.Locators.Myren;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/*****************************************
 * Title: Womens Tab
 * Author: Myren
 * Description: "Locators for Womens Tab"
 *****************************************/

public class WomenTab {

    // Site - https://magento.softwaretestingboard.com/Women.html

    // Sample Code for getting locator*
    public static final String Tops = "Tops";

    // Checking if the element is existing
    public static void main(String[] args) {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("https://magento.softwaretestingboard.com/women.html");

        try {

            By locator = By.linkText(Tops); // Ensure this is correct

            // Wait for the element to be present
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            try {
                WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
                System.out.println("Element exists.");
            } catch (Exception e) {
                System.out.println("Element does not exist.");
            }
        } finally {
            driver.quit();
        }

    }
}

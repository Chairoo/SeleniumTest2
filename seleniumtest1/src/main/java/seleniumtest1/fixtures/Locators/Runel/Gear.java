package seleniumtest1.fixtures.Locators.Runel;

import java.time.Duration;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/*****************************************
 * Title: Mens Tab
 * Author: Ruiel
 * Description: "Locators for Mens Tab"
 *****************************************/

public class Gear {

    // Site - https://magento.softwaretestingboard.com/Gear.html
    // Sample Code for getting locator*
    public static final String link_Bags = "Bags";
    public static final String link_FEquipm = "Fitness Equipment";
    public static final String link_Watches = "Watches";
    public static final String btn_LoosenUp = "//strong[text()='Loosen Up']";
    public static final String btn_HeresToYou = "//strong[text()='Here’s to you!']";
    public static final String btn_ShopBags = "//span[text()='Shop Bags']";
    public static final String btn_ShopEquipment = "//span[text()='Shop Equipment']";
    public static final String btn_ShopWatches = "//span[text()='Shop Watches']";

    // Checking if the element is existing
    public static void main(String[] args) {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("https://magento.softwaretestingboard.com/gear.html");

        try {

            By locator = By.xpath(btn_HeresToYou); // Ensure this is correct

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

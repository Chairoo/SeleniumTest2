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
 * Title: Gear Tab
 * Author: Runel
 * Description: "Locators for Gear Tab"
 *****************************************/

public class Gear {

    // Site - https://magento.softwaretestingboard.com/Gear.html
    // Sample Code for getting locator*
    public static final String link_Bags = "Bags";
    public static final String link_FEquipm = "Fitness Equipment";
    public static final String link_Watches = "Watches";

    public static final String drp_SortBy = "(//select[@id='sorter'])[1]";
    public static final String drp_ShowPage = "(//select[@id='limiter'])[2]";

    public static final String btn_LoosenUp = "//strong[text()='Loosen Up']";
    public static final String btn_HeresToYou = "//strong[text()='Here’s to you!']";
    public static final String btn_ShopBags = "//span[text()='Shop Bags']";
    public static final String btn_ShopEquipment = "//span[text()='Shop Equipment']";
    public static final String btn_ShopWatches = "//span[text()='Shop Watches']";
    public static final String btn_Grid = "(//strong[@title='Grid'])[1]";
    public static final String btn_List = "(//a[@title='List'])[1]";
    public static final String btn_AscDesc = "(//a[@data-role='direction-switcher'])[1]";
    public static final String btn_ActionNext = "(//a[@class='action  next'])[1]";
    public static final String btn_ActionPrev = "(//a[@class='action  previous'])[2]";

    // Locators inside Bag Items
    public static final String Bag_PushItMessenger = "//img[@alt='Push It Messenger Bag']";
    public static final String Bag_OvernightDuffle = "//img[@alt='Overnight Duffle']";
    public static final String Bag_DrivenBackpack = "//img[@alt='Driven Backpack']";

    // Locators inside the Fitness Equipment
    public static final String Ftns_ZingJump = "//img[@alt='Zing Jump Rope']";
    public static final String Ftns_DualHandle = "//img[@alt='Dual Handle Cardio Ball']";
    public static final String Ftns_AffirmWater = "//img[@alt='Affirm Water Bottle ']";

    // Locatos inside the Watches Items
    public static final String Watch_DidiSport = "//img[@alt='Didi Sport Watch']";
    public static final String Watch_Clamber = "//img[@alt='Clamber Watch']";
    public static final String Watch_BoloSport = "//img[@alt='Bolo Sport Watch']";

    // img[@class="product-image-photo"]

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

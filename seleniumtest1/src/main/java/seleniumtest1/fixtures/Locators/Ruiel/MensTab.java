package seleniumtest1.fixtures.Locators.Ruiel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/*****************************************
 * Title: Mens Tab
 * Author: Ruiel
 * Description: "Locators for Mens Tab"
 *****************************************/

public class MensTab {

    // Site - https://magento.softwaretestingboard.com/men.html
    // Sample Code for getting locator*

    //SEARCH
    public static final String txt_Search = "//input[@placeholder='Search entire store here...']";
    public static final String btn_Search = "//button[@title='Search']"; //txt_Search must first have a value to enable the button

    //CART
    public static final String btn_Cart = "//a[@class='action showcart']";
    
    //TOP NAVIGATION
    public static final String btn_WhatsNew = "//span[text()='What's New']";
    //drop-down missing
    public static final String btn_Women = "//a[@id='ui-id-4']";
    public static final String btn_Men = "//a[@id='ui-id-5']";
    public static final String btn_Gear = "//a[@id='ui-id-6']";
    public static final String btn_Training = "//a[@id='ui-id-7']";
    public static final String btn_Sale = "//a[@id='ui-id-8']";

    //ITEMS
    //home
    public static final String btn_Home = "//a[@title='Go to Home Page']";
    
    //SIDE NAVIGATIONS
    public static final String link_Tops = "Tops";
    public static final String link_Bottoms = "Bottoms";
    public static final String link_HoodiesAndSweatshirts = "Hoodies & Sweatshirts";
    public static final String link_Jackets = "Jackets";
    public static final String link_Tees = "Tees";
    public static final String link_Tanks = "Tanks";
    public static final String link_Pants = "Pants";
    public static final String link_Shorts = "Shorts";

    //BODY
    //images
    public static final String btn_Image1 = "//span[text()='Luma’s Performance Fabric collection']";
    public static final String btn_Image2 = "//span[text()='Luma’s Performance Fabric collection']";

    
    // Checking if the element is existing
    public static void main(String[] args) {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("https://magento.softwaretestingboard.com/men.html");

        /* 
        try {

            By locator = By.linkText(link_Tops); // Ensure this is correct

            // Wait for the element to be present
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            try {
                wait.until(ExpectedConditions.presenceOfElementLocated(locator));
                System.out.println("Element exists.");
            } catch (Exception e) {
                System.out.println("Element does not exist.");
            }
        } finally {
            driver.quit();
        }
        */

    }

}

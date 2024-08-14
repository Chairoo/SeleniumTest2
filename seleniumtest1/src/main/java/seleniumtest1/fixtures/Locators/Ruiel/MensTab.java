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
    public static final String btn_Image2 = "//span[text()='Buy 3 Luma tees, get 4 instead']";
    public static final String btn_Image3 = "//strong[text()='Last chance']";
    public static final String btn_Image4 = "//strong[text()='Luma shorts']";
    public static final String btn_Image5 = "//strong[text()='Luma tees']";
    public static final String btn_Image6 = "//strong[text()='Luma hoodies']";

    //HOT SELLERS = HS, Favorites from Luna shoppers
    //Argus All-Weather Tank
    public static final String btn_HS1 = "//a[@title='Argus All-Weather Tank']";
    public static final String btn_HS1_Image = "//img[@alt='Argus All-Weather Tank']";
    public static final String btn_HS1_XS = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[1]/div/div/div[2]/div[1]/div/div[1]";
    public static final String btn_HS1_S = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[1]/div/div/div[2]/div[1]/div/div[2]";
    public static final String btn_HS1_M = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[1]/div/div/div[2]/div[1]/div/div[3]";
    public static final String btn_HS1_L = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[1]/div/div/div[2]/div[1]/div/div[4]";
    public static final String btn_HS1_XL = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[1]/div/div/div[2]/div[1]/div/div[5]";
    public static final String btn_HS1_Color1 = "//*[@id='option-label-color-93-item-52']";
    public static final String btn_HS1_AddtoCart = "//form[@data-product-sku='MT07']";
    public static final String btn_HS1_WishList = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[1]/div/div/div[3]/div/div[2]/a[1]";
    public static final String btn_HS1_Compare = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[1]/div/div/div[3]/div/div[2]/a[2]";

    //Hero Hoodie
    public static final String btn_HS2 = "//a[@title='Hero Hoodie']";
    public static final String btn_HS2_Image = "//img[@alt='Hero Hoodie']";
    public static final String btn_HS2_XS = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[2]/div/div/div[2]/div[1]/div/div[1]";
    public static final String btn_HS2_S = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[2]/div/div/div[2]/div[1]/div/div[2]";
    public static final String btn_HS2_M = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[2]/div/div/div[2]/div[1]/div/div[3]";
    public static final String btn_HS2_L = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[2]/div/div/div[2]/div[1]/div/div[4]";
    public static final String btn_HS2_XL = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[2]/div/div/div[2]/div[1]/div/div[5]";
    public static final String btn_HS2_Color1 = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[2]/div/div/div[2]/div[2]/div/div[1]";
    public static final String btn_HS2_Color2 = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[2]/div/div/div[2]/div[2]/div/div[2]";
    public static final String btn_HS2_Color3 = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[2]/div/div/div[2]/div[2]/div/div[3]";
    public static final String btn_HS2_AddtoCart = "//form[@data-product-sku='MH07']";
    public static final String btn_HS2_WishList = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[2]/div/div/div[3]/div/div[2]/a[1]";
    public static final String btn_HS2_Compare = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[2]/div/div/div[3]/div/div[2]/a[2]";

    //Meteor Workout Short
    public static final String btn_HS3 = "//a[@title='Meteor Workout Short']";
    public static final String btn_HS3_Image = "//img[@alt='Meteor Workout Short']";
    public static final String btn_HS3_32 = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[3]/div/div/div[3]/div[1]/div/div[1]";
    public static final String btn_HS3_33 = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[3]/div/div/div[3]/div[1]/div/div[2]";
    public static final String btn_HS3_34 = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[3]/div/div/div[3]/div[1]/div/div[3]";
    public static final String btn_HS3_36 = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[3]/div/div/div[3]/div[1]/div/div[4]";
    public static final String btn_HS3_Color1 = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[3]/div/div/div[3]/div[2]/div/div[1]";
    public static final String btn_HS3_Color2 = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[3]/div/div/div[3]/div[2]/div/div[2]";
    public static final String btn_HS3_Color3 = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[3]/div/div/div[3]/div[2]/div/div[3]";
    public static final String btn_HS3_AddtoCart = "//form[@data-product-sku='MSH03']";
    public static final String btn_HS3_WishList = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[3]/div/div/div[4]/div/div[2]/a[1]";
    public static final String btn_HS3_Compare = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[3]/div/div/div[4]/div/div[2]/a[2]";
    
    //Geo Insulated Jogging Pant
    public static final String btn_HS4 = "//a[@title='Geo Insulated Jogging Pant']";
    public static final String btn_HS4_Image = "//img[@alt='Geo Insulated Jogging Pant']";
    public static final String btn_HS4_32 = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[4]/div/div/div[3]/div[1]/div/div[1]";
    public static final String btn_HS4_33 = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[4]/div/div/div[3]/div[1]/div/div[2]";
    public static final String btn_HS4_34 = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[4]/div/div/div[3]/div[1]/div/div[3]";
    public static final String btn_HS4_36 = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[4]/div/div/div[3]/div[1]/div/div[4]";
    public static final String btn_HS4_Color1 = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[4]/div/div/div[3]/div[2]/div/div[1]";
    public static final String btn_HS4_Color2 = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[4]/div/div/div[3]/div[2]/div/div[2]";
    public static final String btn_HS4_Color3 = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[4]/div/div/div[3]/div[2]/div/div[3]";
    public static final String btn_HS4_AddtoCart = "//form[@data-product-sku='MP03']";
    public static final String btn_HS4_WishList = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[4]/div/div/div[4]/div/div[2]/a[1]";
    public static final String btn_HS4_Compare = "//*[@id='maincontent']/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[4]/div/div/div[4]/div/div[2]/a[2]";
    
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

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

    //Top
    public static final String logo = "//*[@aria-label='store logo']";
    public static final String search = "//*[@id='search']";
    public static final String cart = "//a[@href='https://magento.softwaretestingboard.com/checkout/cart/']";
    

    //Side Nav
    public static final String link_Tops = "Tops";
    public static final String link_Bottoms = "Bottoms";
    public static final String link_HoodiesSweatshirts = "Hoodies & Sweatshirts";
    public static final String link_Jackets = "Jackets";
    public static final String link_Tees = "Tees";
    public static final String link_BrasTanks = "Bras & Tanks";
    public static final String link_Pants = "Pants";
    public static final String link_Shorts = "Shorts";

    //Photos
    public static final String pic_WomenTees = "//a[@class='block-promo womens-t-shirts']";
    public static final String pic_ShopPants = "//a[@class='block-promo womens-pants']";
    public static final String pic_ShopErinRecommends = "//a[@class='block-promo womens-erin']";
    public static final String pic_LumaShopPants = "//a[@class='block-promo womens-category-pants']";
    public static final String pic_LumaShopShorts = "//a[@class='block-promo womens-category-shorts']";
    public static final String pic_LumaShopNow = "//a[@class='block-promo womens-category-tanks']";

    //Hot Sellers (Photos)
    public static final String pic_hotSeller1 = "//img[@alt='Radiant Tee']";
    public static final String pic_hotSeller2 = "//img[@alt='Breathe-Easy Tank']";
    public static final String pic_hotSeller3 = "//img[@alt='Selene Yoga Hoodie']";
    public static final String pic_hotSeller4 = "//img[@alt='Deirdre Relaxed-Fit Capri']";

    //Hot Sellers (Review)
    public static final String hs1_Review = "//a[@href='https://magento.softwaretestingboard.com/radiant-tee.html#reviews']";
    public static final String hs2_Review = "//a[@href='https://magento.softwaretestingboard.com/breathe-easy-tank.html#reviews']";
    public static final String hs3_Review = "//a[@href='https://magento.softwaretestingboard.com/selene-yoga-hoodie.html#reviews']";


    // Checking if the element is existing
    public static void main(String[] args) {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        
        driver.get("https://magento.softwaretestingboard.com/women.html");

        try {

            By locator = By.linkText(link_Tees); // Ensure this is correct

            // Wait for the element to be present
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            try {
                WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
                System.out.println("Element exists: ");
            } catch (Exception e) {
                System.out.println("Element does not exist.");
            }
        } finally {
            driver.quit();
        }

    }
}

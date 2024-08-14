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

    //Hot Sellers (Buttons)
    public static final String btn_hs_XS1 = "(//*[@id='option-label-size-143-item-166'])[1]";
    public static final String btn_hs_XS2 = "(//*[@id='option-label-size-143-item-166'])[2]";
    public static final String btn_hs_XS3 = "(//*[@id='option-label-size-143-item-166'])[3]";

    public static final String btn_hs_S1 = "(//*[@id='option-label-size-143-item-167'])[1]";
    public static final String btn_hs_S2 = "(//*[@id='option-label-size-143-item-167'])[2]";
    public static final String btn_hs_S3 = "(//*[@id='option-label-size-143-item-167'])[3]";

    public static final String btn_hs_M1 = "(//*[@id='option-label-size-143-item-168'])[1]";
    public static final String btn_hs_M2 = "(//*[@id='option-label-size-143-item-168'])[2]";
    public static final String btn_hs_M3 = "(//*[@id='option-label-size-143-item-168'])[3]";

    public static final String btn_hs_L1 = "(//*[@id='option-label-size-143-item-169'])[1]";
    public static final String btn_hs_L2 = "(//*[@id='option-label-size-143-item-169'])[2]";
    public static final String btn_hs_L3 = "(//*[@id='option-label-size-143-item-169'])[3]";

    public static final String btn_hs_XL1 = "(//*[@id='option-label-size-143-item-170'])[1]";
    public static final String btn_hs_XL2 = "(//*[@id='option-label-size-143-item-170'])[2]";
    public static final String btn_hs_XL3 = "(//*[@id='option-label-size-143-item-170'])[3]";

    public static final String btn_hs28 = "//*[@id='option-label-size-143-item-171']";
    public static final String btn_hs29 = "//*[@id='option-label-size-143-item-172']";

    public static final String btn_AddToCart1 = "(//button[@type='submit' and @title='Add to Cart'])[1]";
    public static final String btn_AddToCart2 = "(//button[@type='submit' and @title='Add to Cart'])[2]";
    public static final String btn_AddToCart3 = "(//button[@type='submit' and @title='Add to Cart'])[3]";
    public static final String btn_AddToCart4 = "(//button[@type='submit' and @title='Add to Cart'])[4]";

    public static final String btn_WishList1 = "(//*[@title='Add to Wish List'])[1]";
    public static final String btn_WishList2 = "(//*[@title='Add to Wish List'])[2]";
    public static final String btn_WishList3 = "(//*[@title='Add to Wish List'])[3]";
    public static final String btn_WishList4 = "(//*[@title='Add to Wish List'])[4]";

    public static final String btn_Compare1 = "(//*[@title='Add to Compare'])[1]";
    public static final String btn_Compare2 = "(//*[@title='Add to Compare'])[2]";
    public static final String btn_Compare3 = "(//*[@title='Add to Compare'])[3]";
    public static final String btn_Compare4 = "(//*[@title='Add to Compare'])[4]";


    // Checking if the element is existing
    public static void main(String[] args) {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        
        driver.get("https://magento.softwaretestingboard.com/women.html");

        try {

            By locator = By.xpath(cart); // Ensure this is correct

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

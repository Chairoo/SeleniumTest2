package seleniumtest1.fixtures.Locators.Runel;

import java.time.Duration;
//import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InsideProduct {

    public static final String ProducName = "//h1";

    public static final String lnk_AddyourReview = "//a[text()='Add Your Review']";
    public static final String lnk_Reviews = "//span[text()='Reviews']";
    public static final String lnk_AddtoWish = "//span[text()='Add to Wish List']";
    public static final String lnk_AddtoCompare = "//span[text()='Add to Compare']";

    public static final String txt_Qty = "//input[@id='qty']";

    public static final String btn_AddtoCart = "//button[@id='product-addtocart-button']";
    public static final String btn_Details = "(//a[@class='data switch'])[1]";
    public static final String btn_MoreInfo = "(//a[@class='data switch'])[2]";
    public static final String btn_Reviews = "(//a[@class='data switch'])[3]";
    public static final String btn_FirstSize = "(//div[@class='swatch-option text'])[1]";
    public static final String btn_FirstColor = "(//div[@class='swatch-option color'])[1]";

    // Inside Review Tab

    // Not sure with Rating hihi
    public static final String btn_1Star = "//label[@id='Rating_1_label']";
    public static final String btn_2Star = "//label[@id='Rating_2_label']";
    public static final String btn_3Star = "//label[@id='Rating_3_label']";
    public static final String btn_4Star = "//label[@id='Rating_4_label']";
    public static final String btn_5Star = "//label[@id='Rating_5_label']";

    public static final String btn_SubmitReview = "//span[text()='Submit Review']";

    public static final String txt_NickName = "//input[@id='nickname_field']";
    public static final String txt_Summary = "//input[@id='summary_field']";
    public static final String txt_Review = "//textarea[@id='review_field']";

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("https://magento.softwaretestingboard.com/push-it-messenger-bag.html#");

        try {

            WebElement Review = driver.findElement(By.xpath(btn_Reviews));

            Actions actions = new Actions(driver);
            actions.moveToElement(Review).click().perform();
            Thread.sleep(4000);
            By locator = By.xpath(btn_SubmitReview); // Ensure this is correct

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

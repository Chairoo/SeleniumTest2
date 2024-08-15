package seleniumtest1.fixtures.Locators.Runel;

import java.time.Duration;
//import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShoppingCart {

    public static final String btn_ShoppingCart = "//a[@class='action showcart active']";
    public static final String btn_ProceedtoCheckout = "//button[text()='Proceed to Checkout']";
    public static final String btn_Next = "(//span[text()='Next'])[1]";

    public static final String txt_FirstName = "(//input[@class='input-text'])[3]";
    public static final String txt_LastName = "(//input[@class='input-text'])[4]";
    public static final String txt_Company = "(//input[@class='input-text'])[5]";
    public static final String txt_StAdd1 = "(//input[@class='input-text'])[6]";
    public static final String txt_StAdd2 = "(//input[@class='input-text'])[7]";
    public static final String txt_StAdd3 = "(//input[@class='input-text'])[8]";
    public static final String txt_City = "(//input[@class='input-text'])[9]";
    public static final String txt_ZipCode = "(//input[@class='input-text'])[11]";
    public static final String txt_PhoneNum = "(//input[@class='input-text'])[12]";

    public static final String drp_State = "(//select[@class='select'])[1]";
    public static final String drp_Country = "(//select[@class='select'])[2]";

    public static final String rdb_Fixed = "(//input[@type='radio'])[1]";
    public static final String rdb_TableRate = "(//input[@type='radio'])[2]";

    public static void main(String[] args) {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("https://magento.softwaretestingboard.com/customer/account/login");

        try {

            By locator = By.xpath(btn_ShoppingCart); // Ensure this is correct

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

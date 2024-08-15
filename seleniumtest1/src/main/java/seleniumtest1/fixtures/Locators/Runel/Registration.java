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

public class Registration {

    public static final String lnk_Register = "(//a[text()='Create an Account'])[1]";

    public static final String txt_FirstName = "//input[@id='firstname']";
    public static final String txt_LastName = "//input[@id='lastname']";
    public static final String txt_EmailAddress = "//input[@id='email_address']";
    public static final String txt_Password = "//input[@id='password']";
    public static final String txt_PasswordConfirm = "//input[@id='password-confirmation']";

    public static final String btn_CreateAnAccount = "(//span[text()='Create an Account'])[1]";

    public static void main(String[] args) {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("https://magento.softwaretestingboard.com/customer/account/create");

        try {

            By locator = By.xpath(txt_FirstName); // Ensure this is correct

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

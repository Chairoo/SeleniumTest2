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

public class Login {

    public static final String lnk_SignIn = "(//li[@class='authorization-link'])[1]";
    public static final String lnk_ForgotPass = "(//span[text()='Forgot Your Password?'])[1]";

    public static final String txt_LoginEmail = "//input[@id='email']";
    public static final String txt_LoginPassword = "(//input[@id='pass'])[1]";

    public static final String btn_Signin = "(//span[text()='Sign In'])[1]";

    public static void main(String[] args) {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("https://magento.softwaretestingboard.com/customer/account/login");

        try {

            By locator = By.xpath(lnk_SignIn); // Ensure this is correct

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

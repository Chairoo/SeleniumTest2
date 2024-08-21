package seleniumtest1.fixtures.PageActions.Runel;

import seleniumtest1.fixtures.Locators.Runel.Registration;
import seleniumtest1.fixtures.Locators.Runel.ShoppingCart;
import seleniumtest1.fixtures.Locators.Runel.Gear;
import seleniumtest1.fixtures.Locators.Runel.InsideProduct;
import seleniumtest1.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.*;
import java.time.Duration;

public class E2ERunel {

    public static String generateRandomEmail(String domain) {
        String uniqueID = UUID.randomUUID().toString().replace("-", "").substring(0, 8);
        return "user" + uniqueID + "@" + domain;
    }

    public static int generateRandom3DigitInteger() {
        Random random = new Random();
        return 100 + random.nextInt(900); // Generates a number between 100 and 999
    }

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        String randomEmail = generateRandomEmail("example.com");
        Actions actions = new Actions(driver);
        // actions.moveToElement().click().perform();

        /***************************
         * Registration Page Action *
         ****************************/

        driver.get("https://magento.softwaretestingboard.com/customer/account/create");

        WebElement firstName = driver.findElement(By.xpath(Registration.txt_FirstName));
        firstName.sendKeys("Test");

        WebElement lasName = driver.findElement(By.xpath(Registration.txt_LastName));
        lasName.sendKeys("User " + generateRandom3DigitInteger());

        WebElement email = driver.findElement(By.xpath(Registration.txt_EmailAddress));
        email.sendKeys(randomEmail);

        WebElement password = driver.findElement(By.xpath(Registration.txt_Password));
        password.sendKeys("Testing123");

        WebElement Cpassword = driver.findElement(By.xpath(Registration.txt_PasswordConfirm));
        Cpassword.sendKeys("Testing123");

        WebElement CreateAnAccount = driver.findElement(By.xpath(Registration.btn_CreateAnAccount));
        CreateAnAccount.click();

        Thread.sleep(3000);

        /*******************************************
         * Gear Page Action (Adding Items to cart) *
         *******************************************/

        // Bags
        driver.get("https://magento.softwaretestingboard.com/Gear.html");

        WebElement bags = driver.findElement(By.xpath(Gear.link_Bags));
        bags.click();

        WebElement DrivenBackpack = driver.findElement(By.xpath(Gear.Bag_DrivenBackpack));
        DrivenBackpack.click();

        WebElement qty = driver.findElement(By.xpath(InsideProduct.txt_Qty));
        qty.clear();
        qty.sendKeys("3");

        WebElement addtoCart = driver.findElement(By.xpath(InsideProduct.btn_AddtoCart));
        addtoCart.click();

        Thread.sleep(3000);

        // Fitness Equipment
        driver.get("https://magento.softwaretestingboard.com/Gear.html");
        WebElement feEquip = driver.findElement(By.xpath(Gear.link_FEquipm));
        feEquip.click();

        WebElement zingJump = driver.findElement(By.xpath(Gear.Ftns_ZingJump));
        actions.moveToElement(zingJump).click().perform();

        WebElement qty2 = driver.findElement(By.xpath(InsideProduct.txt_Qty));
        qty2.clear();
        qty2.sendKeys("2");

        WebElement addtoCart2 = driver.findElement(By.xpath(InsideProduct.btn_AddtoCart));
        addtoCart2.click();

        Thread.sleep(3000);

        // Watches
        driver.get("https://magento.softwaretestingboard.com/Gear.html");
        WebElement watches = driver.findElement(By.xpath(Gear.link_Watches));
        watches.click();

        WebElement clamber = driver.findElement(By.xpath(Gear.Watch_Clamber));
        clamber.click();

        WebElement qty3 = driver.findElement(By.xpath(InsideProduct.txt_Qty));
        qty3.clear();
        qty3.sendKeys("4");

        WebElement addtoCart3 = driver.findElement(By.xpath(InsideProduct.btn_AddtoCart));
        addtoCart3.click();

        Thread.sleep(3000);

        /*****************************
         * Shopping Cart Page Action *
         *****************************/

        WebElement shoppingCart = driver.findElement(By.xpath(ShoppingCart.btn_ShoppingCart));
        shoppingCart.click();

        WebElement proceedtoCheck = driver.findElement(By.xpath(ShoppingCart.btn_ProceedtoCheckout));
        proceedtoCheck.click();

        Thread.sleep(3000);

        // Location
        WebElement stAdd1 = driver.findElement(By.xpath(ShoppingCart.txt_StAdd1));
        stAdd1.sendKeys("Test Address 1");

        WebElement stAdd2 = driver.findElement(By.xpath(ShoppingCart.txt_StAdd2));
        stAdd2.sendKeys("Test Address 2");

        WebElement stAdd3 = driver.findElement(By.xpath(ShoppingCart.txt_StAdd3));
        stAdd3.sendKeys("Test Address 3");

        WebElement company = driver.findElement(By.xpath(ShoppingCart.txt_Company));
        company.sendKeys("Test Company");

        WebElement city = driver.findElement(By.xpath(ShoppingCart.txt_City));
        city.sendKeys("Test City");

        WebElement state = driver.findElement(By.xpath(ShoppingCart.drp_State));
        state.click();
        WebElement stateClick = driver.findElement(By.xpath("//option[@data-title='Alabama']"));
        stateClick.click();

        WebElement zip = driver.findElement(By.xpath(ShoppingCart.txt_ZipCode));
        zip.sendKeys("2230");

        WebElement country = driver.findElement(By.xpath(ShoppingCart.drp_Country));
        country.click();
        WebElement countryClick = driver.findElement(By.xpath("//option[@data-title='United States']"));
        countryClick.click();

        WebElement phoneNumber = driver.findElement(By.xpath(ShoppingCart.txt_PhoneNum));
        phoneNumber.sendKeys("09999999");

        WebElement fixed = driver.findElement(By.xpath(ShoppingCart.rdb_Fixed));
        fixed.click();

        WebElement next = driver.findElement(By.xpath(ShoppingCart.btn_Next));
        next.click();

        Thread.sleep(5000);

        WebElement placeOrder = driver.findElement(By.xpath("//span[text()='Place Order']"));
        placeOrder.click();

        Thread.sleep(5000);

        WebElement thankyoupage = driver.findElement(By.xpath("//span[text()='Thank you for your purchase!']"));

        try {

            By locator = By.xpath("//span[text()='Thank you for your purchase!']"); // Ensure this is correct

            // Wait for the element to be present
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            try {
                WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
                System.out.println("Successful Run");
            } catch (Exception e) {
                System.out.println("Unsuccessful Run");
            }
        } finally {
            driver.quit();
        }
    }
}

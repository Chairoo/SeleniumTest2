package seleniumtest1.fixtures.PageActions.Myren;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;
import seleniumtest1.fixtures.Locators.Myren.WomenTab;
import seleniumtest1.fixtures.Locators.Ruiel.MensTab;
import seleniumtest1.fixtures.Locators.Runel.Gear;
import seleniumtest1.fixtures.Locators.Runel.InsideProduct;
import seleniumtest1.fixtures.Locators.Runel.Login;
import seleniumtest1.fixtures.Locators.Runel.Registration;
import seleniumtest1.fixtures.Locators.Runel.ShoppingCart;

public class E2EMyren {
    // Register > Login > Add items to cart > Pay on Shopping Cart > Check the items
    // purchased

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();

        driver.get("https://magento.softwaretestingboard.com");

        final String drp_SignOut = "//button[span[text()='Change']]";
        final String btn_SignOut = "//a[@href='https://magento.softwaretestingboard.com/customer/account/logout/']";

        //Registration
        String email = "warela5492@albarulo.com";
        String password = "Password123";
    
        /*driver.findElement(By.xpath(Registration.lnk_Register)).click();

        driver.findElement(By.xpath(Registration.txt_FirstName)).sendKeys("Selena");
        driver.findElement(By.xpath(Registration.txt_LastName)).sendKeys("Martis");
        Thread.sleep(2000);

        driver.findElement(By.xpath(Registration.txt_EmailAddress)).sendKeys(email); 
        driver.findElement(By.xpath(Registration.txt_Password)).sendKeys(password); 
        driver.findElement(By.xpath(Registration.txt_PasswordConfirm)).sendKeys(password); 
        Thread.sleep(5000);

        driver.findElement(By.xpath(Registration.btn_CreateAnAccount)).click();*/

        //driver.findElement(By.xpath(drp_SignOut)).click();
        //driver.findElement(By.xpath(btn_SignOut)).click();

        //Signing In
        driver.findElement(By.xpath(Login.lnk_SignIn)).click(); 
        driver.findElement(By.xpath(Login.txt_LoginEmail)).sendKeys(email); 
        driver.findElement(By.xpath(Login.txt_LoginPassword)).sendKeys(password); 
        
        driver.findElement(By.xpath(Login.btn_Signin)).click();
        Thread.sleep(5000);

        //Add Items 
        //Item 1 - Gear Tab 
        driver.findElement(By.xpath(MensTab.btn_Gear)).click();
        driver.findElement(By.linkText(Gear.link_Bags)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Gear.Bag_PushItMessenger)).click();
        driver.findElement(By.xpath(InsideProduct.txt_Qty)).clear();
        driver.findElement(By.xpath(InsideProduct.txt_Qty)).sendKeys("2");

        driver.findElement(By.xpath(InsideProduct.btn_AddtoCart)).click();
        Thread.sleep(2000);

        //Item 2 - Women Tab
        driver.findElement(By.xpath(MensTab.btn_Women)).click();
        driver.findElement(By.xpath(WomenTab.pic_hotSeller3)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@option-label='M']")).click();
        driver.findElement(By.xpath("//div[@id='option-label-color-93-item-57']")).click();

        driver.findElement(By.xpath(InsideProduct.btn_AddtoCart)).click();
        Thread.sleep(2000);

        //Item 3 - Men Tab
        driver.findElement(By.xpath(MensTab.btn_Men)).click();
        driver.findElement(By.xpath(MensTab.btn_HS1_Image)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@option-label='S']")).click();
        driver.findElement(By.xpath("//*[@id='option-label-color-93-item-52']")).click();

        driver.findElement(By.xpath(InsideProduct.btn_AddtoCart)).click();
        Thread.sleep(2000);

        //Shopping Cart - FIRST PART
        //Nag-add ako haha  
        final String btn_ShoppingCart = "//a[@class='action showcart']"; //'action showcart active' sa ShoppingCart
        final String lnk_ViewAndEditCart = "View and Edit Cart"; //wala iteyyy
        final String drp_State = "//option[@data-title='Alabama']"; //ala rin iteeyy

        driver.findElement(By.xpath(btn_ShoppingCart)).click();
        driver.findElement(By.xpath(ShoppingCart.btn_ProceedtoCheckout)).click();
        Thread.sleep(5000);

        //Shipping
        driver.findElement(By.xpath(ShoppingCart.txt_Company)).sendKeys("Company X");
        driver.findElement(By.xpath(ShoppingCart.txt_StAdd1)).sendKeys("Street A");
        driver.findElement(By.xpath(ShoppingCart.txt_StAdd2)).sendKeys("Block 1");
        driver.findElement(By.xpath(ShoppingCart.txt_StAdd3)).sendKeys("Block 2");
        driver.findElement(By.xpath(ShoppingCart.txt_City)).sendKeys("ABC City");
        driver.findElement(By.xpath(ShoppingCart.drp_State)).click();
        driver.findElement(By.xpath(drp_State)).click();
        driver.findElement(By.xpath(ShoppingCart.txt_ZipCode)).sendKeys("12345");
        driver.findElement(By.xpath(ShoppingCart.drp_Country)).click();
        driver.findElement(By.xpath(ShoppingCart.txt_PhoneNum)).sendKeys("01234567890");

        driver.findElement(By.xpath(ShoppingCart.rdb_Fixed)).click();
        Thread.sleep(2000);

        //Balik para ma-edit yung cart
        driver.navigate().back();
        driver.navigate().back();
        Thread.sleep(3000);

        //Edit Item - SECOND PART 
        final String txt_Qty = "//*[@title='Qty']"; 

        driver.findElement(By.xpath(btn_ShoppingCart)).click();
        driver.findElement(By.linkText(lnk_ViewAndEditCart)).click();

        driver.findElement(By.xpath(txt_Qty)).clear();
        driver.findElement(By.xpath(txt_Qty)).sendKeys("5");
        driver.findElement(By.xpath(ShoppingCart.btn_UpdateShop)).click();
        Thread.sleep(5000);

        //Add Discount
        driver.findElement(By.xpath(ShoppingCart.lnk_ApplyDisc)).click();
        driver.findElement(By.xpath(ShoppingCart.txt_CouponCode)).sendKeys("20poff");
        driver.findElement(By.xpath(ShoppingCart.btn_ApplyDiscount)).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath(ShoppingCart.btn_ProceedtoCheckout2)).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath(ShoppingCart.btn_Next)).click();
        
        //Review & Payments
        final String btn_PlaceOrder = "//button[@title='Place Order']";

        //driver.findElement(By.xpath(btn_PlaceOrder)).click();

        System.out.println("---------------- Success! ----------------");
       
        //driver.quit();
        
    }

}

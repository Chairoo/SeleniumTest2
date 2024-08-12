package seleniumtest1;

import java.util.*;

import seleniumtest1.fixtures.Locators.Myren.WomenTab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://magento.softwaretestingboard.com/");
        Thread.sleep(1000);

    }

}

package steve.step_definitions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;
import static java.lang.Integer.parseInt;
import static org.junit.Assert.assertTrue;

public class hcl {
    private static final String CHROME_DRIVER_PATH = "C:\\WebDrivers\\Chrome85\\chromedriver.exe";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);

        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hcl.com/");

        WebElement el;

//        el = driver.findElement(By.xpath(".//a[@href = 'https://hcl.com/leadership/']"));
//        el = driver.findElement(By.xpath(".//a[contains(text(), 'Leadership')]"));
        driver.get("https://hcl.com/leadership/");

        assertTrue(driver.findElement(By.xpath(".//b[contains(text(), 'Founder & Chairman')]")).isDisplayed());

    }
}
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertTrue;

/// this is  aa comment again, again

public class hclStepDefs {
    private static final String CHROME_DRIVER_PATH = "C:\\WebDrivers\\Chrome85\\chromedriver.exe";

    @Then("^print the area of a triangle with (\\d+) and height (\\d+)$")
    public static void printAreaOfTriangle(int width, int height ) throws Throwable {
        System.out.println("Area of Triangle: " + (width* height)/2);
    }

    @Then("^does the Founder and Chairman exist$")
    public static void founderAndChairman() throws Throwable {
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

    @Then("^Screenshots$")
    public static void screenshots(String basePath, DataTable dataTable) throws Throwable {
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
        WebDriver driver = new ChromeDriver();

// Maximize the window
        driver.manage().window().maximize();

// Pass the url
        driver.get("https://www.hcl.com/");

// Take screenshot and store as a file format
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            // now copy the  screenshot to desired location using copyFile //method
            FileUtils.copyFile(src, new File("C:\\Projects\\hcl-test1"));
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }

}

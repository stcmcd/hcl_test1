import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

/// this is  aa comment again, again

public class hclStepDefs {
    private static final String CHROME_DRIVER_PATH = "C:\\WebDrivers\\Chrome85\\chromedriver.exe";

    @Then("^print the area of a triangle with (\\d+) and height (\\d+)$")
    public static void printAreaOfTriangle(int width, int height ) throws Throwable {
        double area = (width* height)/2;
        System.out.println("Area of Triangle: " + area);
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

    @Then("^Screenshote$")
    public static void screenshots(String basePath, DataTable dataTable) throws Throwable {
    }

}

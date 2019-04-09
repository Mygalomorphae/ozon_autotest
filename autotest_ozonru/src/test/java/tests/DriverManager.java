package tests;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    public static ChromeDriver driver;

    @Before
    public static WebDriver setUp() {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver getWebDriver() {
        return driver;
    }
}



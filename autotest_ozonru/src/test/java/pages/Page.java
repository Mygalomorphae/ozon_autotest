package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tests.DriverManager;


public class Page extends DriverManager {

    public WebElement find(By locator) {
        return driver.findElement(locator);
    }
}





package pages;

import org.openqa.selenium.By;
import tests.DriverManager;

import java.util.concurrent.TimeUnit;


public class SearchingResults extends Page {

    By addToCart = By.xpath("//button[@data-test-id=\"tile-buy-button\"]");
    By cart = By.xpath("//div[@data-test-id=\"header-cart\"]");
    By iphone = By.xpath("//div[@data-test-id=\"tile-name\"]");

    public void iphoneIsFound(){
        find(iphone);
    }

    public void addToCart() {
        DriverManager.getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        find(addToCart).click();
    }

    public void moveToCart() {
        DriverManager.getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        find(cart).click();
    }
}

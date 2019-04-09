package pages;

import org.openqa.selenium.By;
import tests.DriverManager;

import java.util.concurrent.TimeUnit;

public class Cart extends Page {

    By deleteFromCart = By.xpath("//button[@data-test-id=\"cart-item-delete-btn\"]");
    By deleteFromCart1 = By.xpath("//button[@data-test-id=\"checkcart-confirm-modal-confirm-button\"]");
    By isIphone = By.xpath("//a[@data-test-id=\"cart-item-title\"]");
    By cartIsEmpty = By.xpath("//h1[@class=\"cart-title\"]");

    public void isIphone() {
        DriverManager.getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        find(isIphone);
    }

    public void deleteFromCart() {
        DriverManager.getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        find(deleteFromCart).click();
    }

    public void deleteFromCart1() {
        DriverManager.getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        find(deleteFromCart1).click();
    }

    public void delete() {
        DriverManager.getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        deleteFromCart();
        DriverManager.getWebDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        deleteFromCart1();
    }

    public void cartIsEmpty() {
        DriverManager.getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        find(cartIsEmpty);
    }

}

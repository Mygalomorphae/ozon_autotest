package pages;

import org.openqa.selenium.By;
import tests.DriverManager;


public class StartPage extends Page {


    String url = "https://www.ozon.ru";
    String iphone8 = "Iphone 8";
    By searchField = By.xpath(("//input[@data-test-id=\"header-search-input\"]"));
    By submit = By.xpath("//button[@data-test-id=\"header-search-go\"]");

    public void openOzon() {
        DriverManager.setUp();
        DriverManager.getWebDriver().get(url);
    }

    public void typeIphone8() {
        find(searchField).sendKeys(iphone8);
    }

    public void submit() {
        find(submit).click();
    }
}
package tests;

import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.Тогда;
import pages.Cart;
import pages.SearchingResults;
import pages.StartPage;

import static org.junit.Assert.assertTrue;

public class Steps {

    StartPage startPage = new StartPage();
    SearchingResults searchingResults = new SearchingResults();
    Cart cart = new Cart();


    @Если("^страница открыта$")
    public void страница_открыта() throws Throwable {
        startPage.openOzon();
    }

    @Тогда("^заголовок страницы \"([^\"]*)\"$")
    public void заголовок_страницы(String arg1) throws Throwable {
        assertTrue(DriverManager.getWebDriver().getTitle().contains("OZON — интернет-магазин"));
    }

    @Если("^в поле для поиска написать \"([^\"]*)\" и нажать \"([^\"]*)\"$")
    public void в_поле_для_поиска_написать_и_нажать(String arg1, String arg2) throws Throwable {
        startPage.typeIphone8();
        startPage.submit();
    }

    @Тогда("^откроется страница с результатами поиска$")
    public void откроется_страница_с_результатами_поиска() throws Throwable {
        assertTrue(DriverManager.getWebDriver().getTitle().contains("OZON"));
    }

    @Если("^на странице результатов поиска присутствует \"([^\"]*)\"$")
    public void на_странице_результатов_поиска_присутствует(String arg1) throws Throwable {
        searchingResults.iphoneIsFound();
    }

    @Тогда("^положить \"([^\"]*)\" в корзину и перейти на страницу корзины$")
    public void положить_в_корзину_и_перейти_на_страницу_корзины(String arg1) throws Throwable {
        searchingResults.addToCart();
        searchingResults.moveToCart();
    }

    @Если("^страница корзины открыта и в ней присутствует \"([^\"]*)\"$")
    public void страница_корзины_открыта_и_в_ней_присутствует(String arg1) throws Throwable {
        assertTrue(DriverManager.getWebDriver().getTitle().equals("OZON.ru - Моя корзина"));
        cart.isIphone();
    }

    @Тогда("^удалить \"([^\"]*)\" из корзины$")
    public void удалить_из_корзины(String arg1) throws Throwable {
        cart.delete();
    }

    @Если("^Находимся на странице \"([^\"]*)\"$")
    public void находимсяНаСтранице(String arg0) throws Throwable {
        assertTrue(DriverManager.getWebDriver().getTitle().equals("OZON.ru - Моя корзина"));
    }

    @Тогда("^на странице присутствует \"([^\"]*)\"$")
    public void на_странице_присутствует(String arg1) throws Throwable {
        cart.cartIsEmpty();
    }


}

import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestMarketBuy extends BaseUITest{

    @Test
    @Description("Тест-кейс №1")
    public  void CheckBasket() throws InterruptedException {
        welcome.ExBTN.click();
        welcome.GiveAccess.click();
        welcome.AccessAdress.click();
        mainPage.CatalogBTN.click();
        catalog.ScrollToName.scrollTo();
        catalog.ScrollToName.click();
        books.FirstBook.scrollTo();
        books.FirstBook.click();
        basket.BasketBTN.click();
        Assert.assertEquals(basket.ChoseBook.getText(),"Герберт Ф. \"Дюна\"");

    }
}

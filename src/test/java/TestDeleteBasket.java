import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestDeleteBasket extends BaseUITest {


    @Test
    @DisplayName("Тест-кейс №2")
    public void DeleteFromBasket() throws InterruptedException {
        Thread.sleep(8000);
        welcome.ExBTN.click();
        welcome.GiveAccess.click();
        welcome.AccessAdress.click();
        mainPage.CatalogBTN.click();
        catalog.ScrollToName.scrollTo();
        Thread.sleep(2000);
        catalog.ScrollToName.click();
        books.FirstBook.scrollTo();
        books.FirstBook.click();
        basket.BasketBTN.click();
        Thread.sleep(2000);
        basket.DeleteBTN.click();
        Assertions.assertEquals(basket.CheckEmptyBasket.getText(),"Корзина пустая");

    }
}
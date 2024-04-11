import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.appium.ScreenObject;
import com.codeborne.selenide.appium.SelenideAppium;
import helper.WebElementActions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.catalog.Basket;
import pages.catalog.Catalog;
import pages.MainPage;
import pages.catalog.books.Books;

public class BaseUITest {

    public static Welcome welcome;
    public static WebElementActions webElementActions;
    public static MainPage mainPage;
    public static Catalog catalog;
    public static Books books;
    public static Basket basket;
    @BeforeClass
    public void start() {
        SelenideAppium.launchApp();
        welcome = ScreenObject.screen(Welcome.class);
        mainPage = ScreenObject.screen(MainPage.class);
        catalog = ScreenObject.screen(Catalog.class);
        books = ScreenObject.screen(Books.class);
        webElementActions = ScreenObject.screen(WebElementActions.class);
        basket = ScreenObject.screen(Basket.class);
    }
    @AfterClass
    public void terminate(){
        SelenideAppium.terminateApp("ru.beru.android");
    }
}
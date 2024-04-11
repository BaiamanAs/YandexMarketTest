package pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MainPage {

    @AndroidFindBy(id = "ru.beru.android:id/nav_catalog")
    public SelenideElement CatalogBTN;
}

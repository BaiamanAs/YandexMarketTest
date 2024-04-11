package pages.catalog.books;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Books {

    @AndroidFindBy(xpath = "(//android.widget.Button[@resource-id=\"ru.beru.android:id/cartButtonProgressButton\"])[1]")
    public SelenideElement FirstBook;
}

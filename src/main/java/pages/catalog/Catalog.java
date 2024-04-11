package pages.catalog;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.annotations.BeforeClass;

public class Catalog {
    @AndroidFindBy(xpath = "//android.widget.GridView[@resource-id=\"ru.beru.android:id/flexsdk_recycler_view_id\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[11]")
    public SelenideElement BooksBTN;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Книги\"]")
    public SelenideElement ScrollToName;
}
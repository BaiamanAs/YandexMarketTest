package pages.catalog;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Basket {


    @AndroidFindBy(id = "ru.beru.android:id/nav_cart")
    public SelenideElement BasketBTN;
    @AndroidFindBy(xpath = "//android.widget.GridView[@resource-id=\"ru.beru.android:id/flexsdk_recycler_view_id\"]/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView")
    public SelenideElement ChoseBook;
    @AndroidFindBy(xpath = "//android.widget.GridView[@resource-id=\"ru.beru.android:id/flexsdk_recycler_view_id\"]/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.ImageView[2]")
    public SelenideElement DeleteBTN;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Корзина пустая\"]")
    public SelenideElement CheckEmptyBasket;
}
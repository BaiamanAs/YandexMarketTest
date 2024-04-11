import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Welcome {



    @AndroidFindBy(id = "ru.beru.android:id/closeButton" )
    public SelenideElement ExBTN;
    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    public SelenideElement GiveAccess;
    @AndroidFindBy(id = "ru.beru.android:id/closeButton")
    public SelenideElement AccessAdress;
}
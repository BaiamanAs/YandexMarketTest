package helper;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.interactions.Pause;

public class WebElementActions {

    public WebElementActions click(SelenideElement element) throws InterruptedException {
        element.shouldBe(Condition.visible).click();
        return this;
    }
    public WebElementActions scroll(SelenideElement element) throws InterruptedException {
        element.scrollTo();
        Thread.sleep(2000);
        return this;
    }
}

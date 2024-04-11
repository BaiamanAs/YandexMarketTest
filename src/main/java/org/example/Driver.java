package org.example;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver implements WebDriverProvider {
    public static   AndroidDriver driver;

    public static URL getURl(){
        try{
            return new URL("http://127.0.0.1:4723/wd/hub");
        }catch (MalformedURLException e){
            throw new RuntimeException(e);
        }
    }
    @NonNull
    @Override
    public WebDriver createDriver(@NonNull Capabilities capabilities) {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("samsung SM-A225F");
        options.setUdid("R58R91RBSJK");
        options.setPlatformName("Android");
        options.setPlatformVersion("13.0");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("ru.beru.android");
        options.setAppActivity("ru.yandex.market.activity.main.MainActivityRebranding");
        // options.setNoReset(true);
        //options.setFullReset(false);
        driver = new AndroidDriver(getURl(), options);
        return driver;
    }}

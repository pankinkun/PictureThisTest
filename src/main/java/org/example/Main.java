package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.Before;
import org.junit.function.ThrowingRunnable;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

public class Main {
    static AppiumDriver driver;

//    @Before
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        HashSet<String> set = new HashSet<>();
        set.add("apple");
        set.add("malus");
        set.add("cherry");
        set.add("prunus");
        set.add("rice");

        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("Android Emulator");
        options.setApp("C:\\Users\\ngngo\\OneDrive - sjsu.edu\\cmpe187\\Project\\apk\\PlantNet Plant Identification_3.19.1_Apkpure.apk");
        options.setPlatformVersion("13");
        options.autoGrantPermissions();
        options.doesNoReset();

//        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//        desiredCapabilities.setCapability("platformName", "Android");
//        desiredCapabilities.setCapability("deviceName", "Android Emulator");
//        desiredCapabilities.setCapability("app", "C:\\Users\\ngngo\\OneDrive - sjsu.edu\\cmpe187\\Project\\apk\\PictureThis-v3.18-PREMIUM.apk");
//        desiredCapabilities.setCapability("platformVersion", "13");
//        desiredCapabilities.setCapability("autoGrantPermissions", true);
//        desiredCapabilities.setCapability("noReset", true);
//        desiredCapabilities.setCapability("appPackage", "cn.danatech.xingseus");
//        desiredCapabilities.setCapability("appActivity", "cn.danatech.xingseus.app.MainActivity");
//        desiredCapabilities.setCapability("automationName", "UiAutomator2");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

        System.out.println("Setting up");

        Thread.sleep(3000);
        clickElement("//android.widget.TextView[@text=\"Skip\"]");
        Thread.sleep(2000);
        clickElement("//android.widget.TextView[@text=\"Skip\"]");
        Thread.sleep(1000);
//        clickElement("//android.widget.TextView[@text=\"Skip\"]");
//        Thread.sleep(1000);
        clickElement("//android.view.ViewGroup[@content-desc=\"Gallery\"]");
        Thread.sleep(1000);
        clickElement("(//android.widget.ImageView[@resource-id=\"android:id/icon\"])[2]");
        Thread.sleep(1000);
    }

    public static void uploadFirstImage() throws InterruptedException {
        clickElement("//android.widget.TextView[@resource-id=\"cn.danatech.xingseus:id/tv_identify\"]");
        Thread.sleep(1000);
        clickElement("//android.widget.TextView[@resource-id=\"cn.danatech.xingseus:id/tips_memo1000_fragment_btn_done\"]");
        Thread.sleep(1000);
        clickElement("//android.widget.TextView[@resource-id=\"cn.danatech.xingseus:id/tv_album\"]");
        Thread.sleep(1000);
        clickElement("//android.widget.LinearLayout[@content-desc=\"Albums\"]");
        Thread.sleep(1000);
        clickElement("(//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_thumbnail\"])[3]");
        Thread.sleep(1000);
        clickElement("(//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_thumbnail\"])[1]");
        Thread.sleep(1000);
        clickElement("//android.widget.ImageView[@resource-id=\"cn.danatech.xingseus:id/iv_crop\"]");
        Thread.sleep(5000);
    }

    public static void uploadImage(int imageIndex) throws InterruptedException {
        clickElement("//android.widget.TextView[@resource-id=\"cn.danatech.xingseus:id/tv_album\"]");
        Thread.sleep(1000);
        clickElement("//android.widget.LinearLayout[@content-desc=\"Albums\"]");
        Thread.sleep(1000);
        clickElement("(//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_thumbnail\"])[3]");
        Thread.sleep(1000);
        clickElement("(//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_thumbnail\"])[" + imageIndex + "]");
        Thread.sleep(1000);
        clickElement("//android.widget.ImageView[@resource-id=\"cn.danatech.xingseus:id/iv_crop\"]");
        Thread.sleep(5000);
    }

    public static boolean isPlant(String plantName, HashSet<String> set) {
        for (String s : set) {
            if (plantName.toLowerCase().contains(s)) {
                return true;
            }
        }
        return false;
    }

    public static void clickElement(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }
}
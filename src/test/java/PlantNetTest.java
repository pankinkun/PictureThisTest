import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Objects;

import static org.junit.Assert.assertTrue;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PlantNetTest {

    static AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException, InterruptedException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("Android Emulator");
        options.setApp("C:\\Users\\ngngo\\OneDrive - sjsu.edu\\cmpe187\\Project\\apk\\PlantNet Plant Identification_3.19.1_Apkpure.apk");
        options.setPlatformVersion("13");
        options.autoGrantPermissions();
        options.doesNoReset();

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

        startApp();
    }

    // --------- CAMERA ---------

    @Test
    public void testI2_1() throws InterruptedException {
        System.out.println("Test I2.1");
        upload(2, 1,  "bark");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Cassava\"]")).getText();
        verify(plantName, "Apple Plant");
    }

    @Test
    public void testC4_5() throws InterruptedException {
        System.out.println("Test C4.5");
        upload(2, 2, "flower");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Hybrid cherry\"]")).getText();
        verify(plantName, "Cherry Blossom");
    }

    @Test
    public void testC4_6() throws InterruptedException {
        System.out.println("Test C4.6");
        upload(2, 3, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Fragile oat\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    @Test
    public void testC4_8() throws InterruptedException {
        System.out.println("Test C4.8");
        upload(2, 4, "flower");
        String plantName = driver.findElement(By.xpath("///android.widget.TextView[@text=\"Japanese flowering cherry\"]")).getText();
        verify(plantName, "Cherry Blossom");
    }

    @Test
    public void testC4_3() throws InterruptedException {
        System.out.println("Test C4.3");
        upload(2, 5, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Lowland rice\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    @Test
    public void testI2_2() throws InterruptedException {
        System.out.println("Test I2.2");
        upload(2, 6, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Paradise Apple\"]")).getText();
        verify(plantName, "Apple Plant");
    }

    @Test
    public void testI1_3() throws InterruptedException {
        System.out.println("Test I1.3");
        upload(2, 7, "flower");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Sargent's cherry\"]")).getText();
        verify(plantName, "Cherry Blossom");
    }

    @Test
    public void testI2_7() throws InterruptedException {
        System.out.println("Test I2.7");
        upload(2, 8, "flower");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Japanese flowering cherry\"]")).getText();
        verify(plantName, "Cherry Blossom");
    }

    @Test
    public void testC4_12() throws InterruptedException {
        System.out.println("Test C4.12");
        upload(2, 9, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Lowland rice\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    @Test
    public void testI2_5() throws InterruptedException {
        System.out.println("Test I2.5");
        upload(2, 10,  "bark");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Smyrna Tamarisk\"]")).getText();
        verify(plantName, "Cherry Blossom");
    }

    @Test
    public void testC4_7() throws InterruptedException {
        System.out.println("Test C4.7");
        upload(2, 11, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Paradise Apple\"]")).getText();
        verify(plantName, "Apple Tree");
    }

    @Test
    public void testI2_12() throws InterruptedException {
        System.out.println("Test I2.12");
        upload(2, 12, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Paradise Apple\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    @Test
    public void testI1_4() throws InterruptedException {
        System.out.println("Test I1.4");
        upload(2, 13, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Lowland rice\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    @Test
    public void testI2_6() throws InterruptedException {
        System.out.println("Test I2.6");
        upload(2, 14, "bark");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Sargent's cherry\"]")).getText();
        verify(plantName, "Cherry Blossom");
    }

    @Test
    public void testI2_10() throws InterruptedException {
        System.out.println("Test I2.10");
        upload(2, 15, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"African rice\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    // --------- SCREENSHOTS ---------

    @Test
    public void testC2_4() throws InterruptedException {
        System.out.println("Test C2.4");
        upload(4, 1, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Chinese Pearleaf Crabapple\"]")).getText();
        verify(plantName, "Apple Plant");
    }

    @Test
    public void testC2_2() throws InterruptedException {
        System.out.println("Test C2.2");
        upload(4, 2, "flower");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Sargent's cherry\"]")).getText();
        verify(plantName, "Cherry Blossom");
    }

    @Test
    public void testC2_1() throws InterruptedException {
        System.out.println("Test C2.1");
        upload(4, 3, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Sargent's cherry\"]")).getText();
        verify(plantName, "Apple Tree");
    }

    @Test
    public void testC2_3() throws InterruptedException {
        System.out.println("Test C2.3");
        upload(4, 4, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Lowland rice\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    @Test
    public void testC2_5() throws InterruptedException {
        System.out.println("Test C2.5");
        upload(4, 5, "flower");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Spring cherry\"]")).getText();
        verify(plantName, "Cherry Blossom");
    }

    @Test
    public void testC1_1() throws InterruptedException {
        System.out.println("Test C1.1");
        upload(4, 6, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Siberian crab apple\"]")).getText();
        verify(plantName, "Apple Tree");
    }

    @Test
    public void testC2_6() throws InterruptedException {
        System.out.println("Test C2.6");
        upload(4, 7, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"African rice\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    @Test
    public void testI3_6() throws InterruptedException {
        System.out.println("Test I3.6");
        upload(4, 8, "bark");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Sour cherry\"]")).getText();
        verify(plantName, "Cherry Blossom");
    }

    @Test
    public void test1() throws InterruptedException {
        System.out.println("Test 1");
        upload(4, 9, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Paradise Apple\"]")).getText();
        verify(plantName, "Apple Tree");
    }

    @Test
    public void testC4_4() throws InterruptedException {
        System.out.println("Test C4.4");
        upload(4, 10, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Siberian crab apple\"]")).getText();
        verify(plantName, "Apple Tree");
    }

    @Test
    public void testC3_1() throws InterruptedException {
        System.out.println("Test C3.1");
        upload(4, 11, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Paradise Apple\"]")).getText();
        verify(plantName, "Apple Tree");
    }

    @Test
    public void testC4_2() throws InterruptedException {
        System.out.println("Test C4.2");
        upload(4, 12, "flower");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Spring cherry\"]")).getText();
        verify(plantName, "Cherry Blossom");
    }

    @Test
    public void testI1_1() throws InterruptedException {
        System.out.println("Test I1.1");
        upload(4, 13, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Not a plant.\"]")).getText();
        verify(plantName, "Not a plant");
    }

    @Test
    public void testI2_11() throws InterruptedException {
        System.out.println("Test I2.11");
        upload(4, 14, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Cock's-foot\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    @Test
    public void testI2_4() throws InterruptedException {
        System.out.println("Test I2.4");
        upload(4, 15, "bark");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Japanese Crab Apple\"]")).getText();
        verify(plantName, "Apple Tree");
    }

    // --------- DOWNLOADS ---------

    @Test
    public void testC4_1() throws InterruptedException {
        System.out.println("Test C4.1");
        upload(5, 1, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Crab apple\"]")).getText();
        verify(plantName, "Apple Tree");
    }

    @Test
    public void testI1_2() throws InterruptedException {
        System.out.println("Test I1.2");
        upload(5, 2, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Paradise Apple\"]")).getText();
        verify(plantName, "Apple Tree");
    }

    @Test
    public void testI3_1() throws InterruptedException {
        System.out.println("Test I3.1");
        upload(5, 3, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Chinese bush cherry\"]")).getText();
        verify(plantName, "Apple Tree");
    }

    @Test
    public void testC4_10() throws InterruptedException {
        System.out.println("Test C4.10");
        upload(5, 4, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Paradise Apple\"]")).getText();
        verify(plantName, "Apple Tree");
    }

    @Test
    public void testC4_9() throws InterruptedException {
        System.out.println("Test C4.9");
        upload(5, 5, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Lowland rice\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    @Test
    public void test2() throws InterruptedException {
        System.out.println("Test 2");
        upload(5, 6, "flower");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Japanese flowering cherry\"]")).getText();
        verify(plantName, "Cherry Blossom");
    }

    @Test
    public void testC3_2() throws InterruptedException {
        System.out.println("Test C3.2");
        upload(5, 7, "flower");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Spring cherry\"]")).getText();
        verify(plantName, "Cherry Blossom");
    }

    @Test
    public void testC3_3() throws InterruptedException {
        System.out.println("Test C3.3");
        upload(5, 8, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Lowland rice\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    @Test
    public void test3() throws InterruptedException {
        System.out.println("Test 3");
        upload(5, 9, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"African rice\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    @Test
    public void testI3_5() throws InterruptedException {
        System.out.println("Test I3.5");
        upload(5, 10, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Wild Cherry\"]")).getText();
        verify(plantName, "Cherry Blossom");
    }

    @Test
    public void testI3_4() throws InterruptedException {
        System.out.println("Test I3.4");
        upload(5, 11, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Bird Cherry\"]")).getText();
        verify(plantName, "Cherry Blossom");
    }

    @Test
    public void testI3_8() throws InterruptedException {
        System.out.println("Test I3.8");
        upload(5, 12, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Lowland rice\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    @Test
    public void testI3_9() throws InterruptedException {
        System.out.println("Test I3.9");
        upload(5, 13, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Lowland rice\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    @Test
    public void testI3_7() throws InterruptedException {
        System.out.println("Test I3.7");
        upload(5, 14, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Lowland rice\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    @Test
    public void testC1_3() throws InterruptedException {
        System.out.println("Test C1.3");
        upload(5, 15, "leaf");
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Lowland rice\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    // ------- HELPER METHODS -------
    public void clickElement(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    public void upload(int album, int image, String type) throws InterruptedException {
        Thread.sleep(1000);
        clickElement("(//android.widget.ImageView[@resource-id=\"com.sec.android.gallery3d:id/thumbnail\"])["+album+"]");
        Thread.sleep(1000);
        clickElement("(//android.widget.FrameLayout[@resource-id=\"com.sec.android.gallery3d:id/deco_view_layout\"])["+image+"]");
        Thread.sleep(2000);
        clickElement("//android.view.ViewGroup[@content-desc='" + type + "']/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView");
        Thread.sleep(7000);
    }


    public void startApp() throws InterruptedException {
        Thread.sleep(3000);
        clickElement("//android.widget.TextView[@text=\"Skip\"]");
        Thread.sleep(6000);
        clickElement("//android.widget.TextView[@text=\"Skip\"]");
        Thread.sleep(1000);
        clickElement("//android.view.ViewGroup[@content-desc=\"Gallery\"]");
        Thread.sleep(1000);
        clickElement("(//android.widget.ImageView[@resource-id=\"android:id/icon\"])[2]");
        Thread.sleep(1000);
    }


    public boolean isPlant(String plantName) {
        HashSet<String> set = new HashSet<>();
        set.add("apple");
        set.add("malus");
        set.add("cherry");
        set.add("prunus");
        set.add("rice");
        set.add("sakura");

        for (String s : set) {
            if (plantName.toLowerCase().contains(s)) {
                return true;
            }
        }
        return false;
    }

    public void verify(String actual, String expected) {
        System.out.println("ACTUAL: " + actual);
        System.out.println("EXPECTED: " + expected);

        boolean result = isPlant(actual);

        if (Objects.equals(expected, "Not a plant") && !isPlant(actual)) {
            result = true;
        }

        if (result) {
            System.out.println("PASSED\n");
        } else {
            System.out.println("FAILED\n");
        }

        assertTrue(result);
    }


}




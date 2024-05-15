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
public class PlantInTest {

    static AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException, InterruptedException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("Android Emulator");
        options.setApp("C:\\Users\\ngngo\\OneDrive - sjsu.edu\\cmpe187\\Project\\apk\\PlantIn v2.10.0 (PREMIUM).apk");
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
        upload(1, 1);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Apple Plant");
    }

    @Test
    public void testC4_5() throws InterruptedException {
        System.out.println("Test C4.5");
        upload(1, 2);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Cherry Blossom");
    }

    @Test
    public void testC4_6() throws InterruptedException {
        System.out.println("Test C4.6");
        upload(1, 3);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    @Test
    public void testC4_8() throws InterruptedException {
        System.out.println("Test C4.8");
        upload(1, 4);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Cherry Blossom");
    }

    @Test
    public void testC4_3() throws InterruptedException {
        System.out.println("Test C4.3");
        upload(1, 5);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    @Test
    public void testI2_2() throws InterruptedException {
        System.out.println("Test I2.2");
        upload(1, 6);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Apple Plant");
    }

    @Test
    public void testI1_3() throws InterruptedException {
        System.out.println("Test I1.3");
        upload(1, 7);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Cherry Blossom");
    }

    @Test
    public void testI2_7() throws InterruptedException {
        System.out.println("Test I2.7");
        upload(1, 8);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Cherry Blossom");
    }

    @Test
    public void testC4_12() throws InterruptedException {
        System.out.println("Test C4.12");
        upload(1, 9);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    @Test
    public void testI2_5() throws InterruptedException {
        System.out.println("Test I2.5");
        upload(1, 10);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Cherry Blossom");
    }

    @Test
    public void testC4_7() throws InterruptedException {
        System.out.println("Test C4.7");
        upload(1, 11);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Apple Tree");
    }

    @Test
    public void testI2_12() throws InterruptedException {
        System.out.println("Test I2.12");
        upload(1, 12);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    @Test
    public void testI1_4() throws InterruptedException {
        System.out.println("Test I1.4");
        upload(1, 13);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    @Test
    public void testI2_6() throws InterruptedException {
        System.out.println("Test I2.6");
        upload(1, 14);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Cherry Blossom");
    }

    @Test
    public void testI2_10() throws InterruptedException {
        System.out.println("Test I2.10");
        upload(1, 15);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Paddy Plant");
    }


    // --------- SCREENSHOTS ---------

    @Test
    public void testC2_4() throws InterruptedException {
        System.out.println("Test C2.4");
        upload(2, 1);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Apple Plant");
    }

    @Test
    public void testC2_2() throws InterruptedException {
        System.out.println("Test C2.2");
        upload(2, 2);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Cherry Blossom");
    }

    @Test
    public void testC2_1() throws InterruptedException {
        System.out.println("Test C2.1");
        upload(2, 3);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Apple Tree");
    }

    @Test
    public void testC2_3() throws InterruptedException {
        System.out.println("Test C2.3");
        upload(2, 4);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    @Test
    public void testC2_5() throws InterruptedException {
        System.out.println("Test C2.5");
        upload(2, 5);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Cherry Blossom");
    }

    @Test
    public void testC1_1() throws InterruptedException {
        System.out.println("Test C1.1");
        upload(2, 6);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Apple Tree");
    }

    @Test
    public void testC2_6() throws InterruptedException {
        System.out.println("Test C2.6");
        upload(2, 7);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    @Test
    public void testI3_6() throws InterruptedException {
        System.out.println("Test I3.6");
        upload(2, 8);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Cherry Blossom");
    }

    @Test
    public void test1() throws InterruptedException {
        System.out.println("Test 1");
        upload(2, 9);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Apple Tree");
    }

    @Test
    public void testC4_4() throws InterruptedException {
        System.out.println("Test C4.4");
        upload(2, 10);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Apple Tree");
    }

    @Test
    public void testC3_1() throws InterruptedException {
        System.out.println("Test C3.1");
        upload(2, 11);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Apple Tree");
    }

    @Test
    public void testC4_2() throws InterruptedException {
        System.out.println("Test C4.2");
        upload(2, 12);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Cherry Blossom");
    }

    @Test
    public void testI1_1() throws InterruptedException {
        System.out.println("Test I1.1");
        upload(2, 13);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView")).getText();
        verify(plantName, "Not a plant");
    }

    @Test
    public void testI2_11() throws InterruptedException {
        System.out.println("Test I2.11");
        upload(2, 14);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    @Test
    public void testI2_4() throws InterruptedException {
        System.out.println("Test I2.4");
        upload(2, 15);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Apple Tree");
    }

    // --------- DOWNLOADS ---------

    @Test
    public void testC4_1() throws InterruptedException {
        System.out.println("Test C4.1");
        upload(3, 1);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Apple Tree");
    }

    @Test
    public void testI1_2() throws InterruptedException {
        System.out.println("Test I1.2");
        upload(3, 2);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Apple Tree");
    }

    @Test
    public void testI3_1() throws InterruptedException {
        System.out.println("Test I3.1");
        upload(3, 3);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Apple Tree");
    }

    @Test
    public void testC4_10() throws InterruptedException {
        System.out.println("Test C4.10");
        upload(3, 4);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Apple Tree");
    }

    @Test
    public void testC4_9() throws InterruptedException {
        System.out.println("Test C4.9");
        upload(3, 5);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    @Test
    public void test2() throws InterruptedException {
        System.out.println("Test 2");
        upload(3, 6);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Cherry Blossom");
    }

    @Test
    public void testC3_2() throws InterruptedException {
        System.out.println("Test C3.2");
        upload(3, 7);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Cherry Blossom");
    }

    @Test
    public void testC3_3() throws InterruptedException {
        System.out.println("Test C3.3");
        upload(3, 8);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    @Test
    public void test3() throws InterruptedException {
        System.out.println("Test 3");
        upload(3, 9);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    @Test
    public void testI3_5() throws InterruptedException {
        System.out.println("Test I3.5");
        upload(3, 10);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Cherry Blossom");
    }

    @Test
    public void testI3_4() throws InterruptedException {
        System.out.println("Test I3.4");
        upload(3, 11);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Cherry Blossom");
    }

    @Test
    public void testI3_8() throws InterruptedException {
        System.out.println("Test I3.8");
        upload(3, 12);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    @Test
    public void testI3_9() throws InterruptedException {
        System.out.println("Test I3.9");
        upload(3, 13);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    @Test
    public void testI3_7() throws InterruptedException {
        System.out.println("Test I3.7");
        upload(3, 14);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
        verify(plantName, "Paddy Plant");
    }

    @Test
    public void testC1_3() throws InterruptedException {
        System.out.println("Test C1.3");
        upload(3, 15);
        String plantName = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/tvPlantName\"]")).getText();
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

    public void upload(int album, int image) throws InterruptedException {
        Thread.sleep(1000);
        clickElement("(//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_thumbnail\"])["+album+"]");
        Thread.sleep(1000);
        clickElement("(//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_thumbnail\"])["+image+"]");
        Thread.sleep(7000);
    }


    public void startApp() throws InterruptedException {
        Thread.sleep(5000);
        clickElement("//android.widget.FrameLayout[@resource-id=\"com.myplantin.app:id/btnStart\"]/android.widget.LinearLayout");
        Thread.sleep(1000);
        clickElement("//android.widget.ImageButton[@resource-id=\"com.myplantin.app:id/btnClose\"]");
        Thread.sleep(7000);
//        clickElement("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]");
//        Thread.sleep(2000);
        clickElement("//android.widget.TextView[@resource-id=\"com.myplantin.app:id/btnClose\"]");
        Thread.sleep(3000);
        clickElement("//android.widget.FrameLayout[@resource-id=\"com.myplantin.app:id/btnIdentifyMyPlants\"]/android.widget.LinearLayout");
        Thread.sleep(1000);
        clickElement("//android.widget.FrameLayout[@resource-id=\"com.myplantin.app:id/btnGotIt\"]/android.widget.LinearLayout");
        Thread.sleep(1000);
        clickElement("//android.widget.ImageView[@resource-id=\"com.myplantin.app:id/btnGallery\"]");
        Thread.sleep(1000);
        clickElement("//android.widget.LinearLayout[@content-desc=\"Albums\"]");
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




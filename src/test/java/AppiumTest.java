import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.URL;

    class AppiumTest {
    static AppiumDriver<MobileElement> driver;



    public static void main(String args[]) throws Exception {
        calculator();
    }

    @Test
    public static void calculator() throws Exception {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel XL");
        cap.setCapability(MobileCapabilityType.UDID, "HT74M0206727" );
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
        cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\PentaPru\\Downloads\\PrinterControl-googlestore-debug-develop_daily_2020-07-23_08-07-46_8.0.178.apk");



            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            AppiumDriver<MobileElement> driver = new AppiumDriver<MobileElement>(url, cap);
            MobileElement mo = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView"));
    }




}





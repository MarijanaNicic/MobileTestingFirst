import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class HowToHandleSwitches extends SetCapability{

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability("appPackage", "com.android.settings");
        dc.setCapability("appActivity", "com.android.settings.Settings$WirelessSettings");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);

        Thread.sleep(2000);

        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout").click();

        Thread.sleep(2000);

        WebElement onOff = driver.findElementById("com.android.settings:id/switch_widget");

        Thread.sleep(2000);

        onOff.click();

        Thread.sleep(3000);

        String text = driver.findElementById("com.android.settings:id/switch_text").getText();
        System.out.println(text);

        Thread.sleep(2000);

        onOff.click();

        text = driver.findElementById("com.android.settings:id/switch_text").getText();
        System.out.println(text);

        Thread.sleep(2000);

        driver.quit();




    }
}

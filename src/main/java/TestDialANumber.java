import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestDialANumber extends SetCapability {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability("appPackage", "com.sonymobile.android.dialer");
        dc.setCapability("appActivity", "com.android.dialer.DialtactsActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);

        Thread.sleep(2000);

        driver.findElementById("com.android.dialer:id/emptyListViewAction").click();

        Thread.sleep(2000);

        WebElement one = driver.findElementById("com.android.dialer:id/one");
        WebElement two = driver.findElementById("com.android.dialer:id/two");
        WebElement three = driver.findElementById("com.android.dialer:id/three");
        WebElement four = driver.findElementById("com.android.dialer:id/four");
        WebElement five = driver.findElementById("com.android.dialer:id/five");
        WebElement six = driver.findElementById("com.android.dialer:id/six");
        WebElement seven = driver.findElementById("com.android.dialer:id/seven");
        WebElement eight = driver.findElementById("com.android.dialer:id/eight");
        WebElement nine = driver.findElementById("com.android.dialer:id/nine");
        WebElement zero = driver.findElementById("com.android.dialer:id/zero");
        WebElement star = driver.findElementById("com.android.dialer:id/star");
        WebElement pound = driver.findElementById("com.android.dialer:id/pound");

        WebElement dialpad = driver.findElementById("com.android.dialer:id/dialpad_floating_action_button");



        one.click();
        two.click();
        three.click();
        four.click();
        five.click();
        six.click();
        seven.click();
        eight.click();
        nine.click();
        zero.click();
        //star.click();
        //pound.click();

        Thread.sleep(4000);

        dialpad.click();

        Thread.sleep(3000);

        driver.quit();




    }
}

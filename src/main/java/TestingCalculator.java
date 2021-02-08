import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestingCalculator extends SetCapability {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities dc= new DesiredCapabilities();

        dc.setCapability("appPackage","com.android.calculator2");
        dc.setCapability("appActivity","com.android.calculator2.Calculator");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,dc);

        Thread.sleep(2000);

        WebElement five = driver.findElementById("com.android.calculator2:id/digit_5");
        five.click();

        WebElement plus = driver.findElementById("com.android.calculator2:id/op_add");
        plus.click();

        WebElement two = driver.findElementById("com.android.calculator2:id/digit_2");
        two.click();

        WebElement equally = driver.findElementById("com.android.calculator2:id/eq");
        equally.click();

        String result = driver.findElementById("com.android.calculator2:id/result").getText();

        if (result.equals("7"))
        {
            System.out.println("Test Passed...");
        }
        else {
            System.out.println("Test Failed");
        }

        Thread.sleep(3000);

        driver.quit();









    }}

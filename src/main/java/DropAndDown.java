import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DropAndDown {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability("appPackage", "com.mobirix.jigsawking");
        dc.setCapability("appActivity", "com.mobirix.jigsawking.JigsawKingActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);

        Thread.sleep(2000);

        WebElement source = driver.findElementsById("com.mobirix.jigsawking.JigsawKingActivity").get(2);//uzimamo treceg na spisku
        WebElement target = driver.findElementsById("com.mobirix.jigsawking.JigsawKingActivity").get(4);// stavaljmo ga na 5o mesto

        TouchActions action = new TouchActions((MobileDriver)driver);

        //drag and drop

        action.longPress(ElementOption.element(source)).move(ElementOption.element(target)).release().perform();











        driver.quit();



    }
}
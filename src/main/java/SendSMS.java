import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class SendSMS extends SetCapability{


    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability("appPackage", "com.sonyericsson.conversations");
        dc.setCapability("appActivity", "com.sonyericsson.conversations.SendMessageFromCallUiActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement> (url, dc);

        Thread.sleep(3000);

        WebElement sendTo = driver.findElementById("com.sonyericsson.conversations:id/recipient_view");
        sendTo.sendKeys("555555");

        Thread.sleep(3000);

        WebElement typeMessage = driver.findElementById("com.sonyericsson.conversations:id/conversation_edit_text");
        typeMessage.sendKeys("Hello");

        Thread.sleep(3000);

        WebElement send = driver.findElementById("com.sonyericsson.conversations:id/conversation_send_button");
        send.click();

        Thread.sleep(3000);






        driver.quit();



    }
}

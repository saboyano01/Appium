package Saboyano.est;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;


public class MisceallanousAppiumActions {
	

	@Test
	public void WifiSettingsName() throws MalformedURLException {
		 DesiredCapabilities capabilities = new DesiredCapabilities();
	     capabilities.setCapability("deviceName","SaboyanoEmulator");
	     capabilities.setCapability("platformVersion", "10.0");
	     capabilities.setCapability("automationName", "uiautomator2");
	     capabilities.setCapability("app", "C:\\Users\\dell\\git\\repository7\\Appium\\src\\test\\java\\Resources\\General-Store.apk");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),capabilities);
		
		 driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		
//		
//		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
////		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
////		driver.findElement(By.id("android:id/checkbox")).click();
//		DeviceRotation landScape = new DeviceRotation(0, 0, 90);
//		driver.rotate(landScape);
//		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
//		String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
//		Assert.assertEquals(alertTitle,"WiFi settings");
//		driver.setClipboardText("saboyano wifi ");
//		driver.findElement(By.id("android:id/edit")).sendKeys("driver.getClipboardText()");
//		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
//		
//		
		
	}
}
//		
	
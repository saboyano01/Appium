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

public class LongPress extends BaseTest {
	
	@Test
	public void WifiSettingsName() throws MalformedURLException, InterruptedException {
//		 DesiredCapabilities capabilities = new DesiredCapabilities();
//	     capabilities.setCapability("deviceName","SaboyanoEmulator");
//	     capabilities.setCapability("platformVersion", "10.0");
//	     capabilities.setCapability("automationName", "uiautomator2");
//	     capabilities.setCapability("app", "C:\\Users\\dell\\git\\repository7\\Appium\\src\\test\\java\\Resources\\ApiDemos-debug.apk");
//		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),capabilities);
		
		//AndroidDriver driver = eCommerceTestCase1.SetUpEmulator("SaboyanoEmulator", "10.0");
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		WebElement ele= driver.findElement(By.xpath("//android.widget.TextView[@text='People Names]"));
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",
		((RemoteWebElement)ele).getId(),"duration",2000));
	}
	
	
		
	}
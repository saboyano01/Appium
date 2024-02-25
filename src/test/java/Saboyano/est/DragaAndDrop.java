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

public class DragaAndDrop {
	


	@Test
	public void DragAndDrop() throws MalformedURLException, InterruptedException {
		 DesiredCapabilities capabilities = new DesiredCapabilities();
	     capabilities.setCapability("deviceName","SaboyanoEmulator");
	     capabilities.setCapability("platformVersion", "10.0");
	     capabilities.setCapability("automationName", "uiautomator2");
	     capabilities.setCapability("app", "C:\\Users\\dell\\git\\repository7\\Appium\\src\\test\\java\\Resources\\ApiDemos-debug.apk");
		 AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),capabilities);
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
        driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	    WebElement source =	driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		
	 	((JavascriptExecutor) driver).executeScript("mobile: dragGesture",ImmutableMap.of (
			"elementId", ((RemoteWebElement) source).getId(),
				"endX", 619,				
				"endY", 590
				
				));
				
	 	String result  =  driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
	 	Assert.assertEquals(result,"Dropped!");
//		
	
	}
	
	}
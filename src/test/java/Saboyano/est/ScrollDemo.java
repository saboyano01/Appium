package Saboyano.est;
import java.net.MalformedURLException;
import java.net.URL;

import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethods.List;
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

public  class ScrollDemo {
	
      @Test
      

	public void ScrollDemoTest() throws MalformedURLException, InterruptedException{
		 DesiredCapabilities capabilities = new DesiredCapabilities();
	     capabilities.setCapability("deviceName","SaboyanoEmulator");
	     capabilities.setCapability("platformVersion", "10.0");
	     capabilities.setCapability("automationName", "uiautomator2");
	     capabilities.setCapability("app", "C:\\Users\\dell\\git\\repository7\\Appium\\src\\test\\java\\Resources\\ApiDemos-debug.apk");
		 AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),capabilities);
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		
		
		
		
		
		
		

	    }
		
	}



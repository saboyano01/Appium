package Saboyano.est;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class MobileBrowserTest extends MobileBrowserBaseTest2 {
	
	
	@Test 
	public void BrowserTest() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
		driver.findElement(By.cssSelector("a[routerlink='/products']")).click();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)","");
		String text = driver.findElement(By.cssSelector("a[href*='products/3']")).getText();
		Assert.assertEquals(text, "Devops");
	}
	
		

}

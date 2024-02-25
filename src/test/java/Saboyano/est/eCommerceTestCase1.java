package Saboyano.est;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;


public  class eCommerceTestCase1 extends BaseTest {

	
	
	

	@Test
	public void FillForm()  
		{
			//driver.findElement(By.id("nameField")).sendKeys("saboyano");
			driver.hideKeyboard();
			driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
			driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
			driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
			driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
			String toastMessage = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
			Assert.assertEquals(toastMessage,"Please enter your name");
		}
	
	
}
	

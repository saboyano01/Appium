package Saboyano.est;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sun.tools.javac.util.List;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import saboyano21.pageObject.android.FormPage;


public  class TestCaseEcommerce3 extends BaseTest {

	

	@Test
	public void FillForm()  
		{
		
		FormPage formPage = new FormPage(driver);
		formPage.setNameField("Saboyano"); 
		formPage.setGender("female");
		formPage.setCountrySelection("Argentina");
		formPage.submitForm();
//			driver.findElement(By.id("nameField")).sendKeys("saboyano");
//			driver.hideKeyboard();
//			driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
//			driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
//			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
//			driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
//			driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
//			driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
//			driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
//			driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
			//driver.findElement(By.xpath("//android.widget.TextView[@text='ADD TO CART'] [1]")).click();
			//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));		
		
	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/WebElementtle")),"text","Cart"));
	List<WebElement> productPrices  =(List<WebElement>) driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
	int count = productPrices.size();
	double sum = 0;
	
	for (int i =0; i< count; i++) {
		String amountString = productPrices.get(i).getText();
		Double price = Double.parseDouble(amountString.substring(1));
		sum = sum + price;
		
	}
	
	
	String lastPageProduct =driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productName\"]")).getText();
	Assert.assertEquals(lastPageProduct,"Jordan 6 Rings");
		}


}
	

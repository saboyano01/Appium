package Saboyano.est;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;

public class MobileBrowserBaseTest2 {
	
	private static final String MobileCapability = null;
	public AndroidDriver driver;
	@BeforeSuite
	public void TestSetUp() throws MalformedURLException{
		//SetEmulator("SaboyanoEmulator2","9.0");
		SetEmulator("SaboyanoEmulator","10.0");
	}
	

	
	@AfterSuite
	public void TestTearDown() {
		driver.quit();
	}
	
	private void SetEmulator(String emulatorName,String platformVersion) throws MalformedURLException {
		 DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities.setCapability("ignoreHiddenApiPolicyError" , true);
		 capabilities.setCapability("avdLaunchTimeout", 180000); 
	     capabilities.setCapability("platformVersion", platformVersion);
	     capabilities.setCapability("automationName", "uiautomator2");
	     capabilities.setCapability("appium:appWaitDuration", "900000");
	     capabilities.setCapability("appium:appWaitForLaunch", false);
	     capabilities.setCapability("appium:avd", emulatorName);
	     capabilities.setCapability("appium:chromedriverExecutable", "C:\\Users\\dell\\git\\repository7\\Appium\\src\\test\\java\\Resources\\chromedriver.exe");
	     capabilities.setCapability("–session-override",true);
	     capabilities.setCapability("browserName", "Chrome");  
		 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),capabilities);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}



	}
	

		

		



		
	
	
	
 
package stest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	
	
	   WebDriver driver;
		
	   @BeforeTest
		public void setup() throws MalformedURLException
		{
		    DesiredCapabilities caps = new DesiredCapabilities();
		    //caps.setCapability("platform","ANDROID");
		    caps.setCapability(CapabilityType.PLATFORM_NAME,"ANDROID");
		    //caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
		    caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		    caps.setCapability(MobileCapabilityType.DEVICE_NAME,"realme 6i");
		    caps.setCapability(MobileCapabilityType.UDID,"6L99OFQ8WCJV6PBU");
		    caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60);
		    //caps.setCapability(MobileCapabilityType.APP,"");
		    caps.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		    
		    
			URL url = new URL("https://127.0.0.0:4723/wd/hub");
			
			
		    
		    driver = new AppiumDriver<MobileElement>(url,caps);
		    
		    
		    
		}
		
		

		
		public void teardown()
		{
			
		}

	

	
		
	

}

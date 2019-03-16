package com.mobileUtilities_iOS;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class IOSMobileCapabilities {
	 static  IOSDriver<WebElement> launchApp() throws Exception {
		  		DesiredCapabilities dc;
		  		IOSDriver<WebElement> driver = null;	  
	       // if (browserName.toLowerCase().contains("android")) {
	          	dc= new DesiredCapabilities();
	    		//dc.setCapability("deviceName","CNU4399N1B");
	          	dc.setCapability("deviceName","6015abd412ada1ca9e4712755312297b7a288a61");
	    	//	dc.setCapability("platformVersion", "6.0.1");
	    	//	dc.setCapability("platformName","Android");
	    	/*	dc.setCapability("autoWebview", true);
	    		dc.setCapability("appWaitActivity",(String) null);
	    		dc.setCapability("takesScreenshot", true);*/
	    	//	dc.setCapability("appPackage", "com.magma.poc");
	    	//	dc.setCapability("appActivity", "com.template.activity.main.LoginActivity");
	    //		dc.setCapability("appPackage", "com.whatsapp");
	    	//	dc.setCapability("appActivity", "com.whatsapp.Main");
	    		
	    	//	dc.setCapability("appPackage", "com.motionappsworld.magmahdi");
	    	//	dc.setCapability("appActivity", "com.motionappsworld.magmahdi.activity.MainActivity");
	    /*		dc.setCapability("newCommandTimeout", "120000");
	    		dc.setCapability("resetKeyboard", true);
	    		dc.setCapability("unicodeKeyboard", true);*/
	    		driver = new IOSDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
	    		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	            return driver;
	      //  }

	    }
}

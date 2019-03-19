package com.baseClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	public static String browser;
	
/*	BrowserFactory(String name){
		browser=name;
	}*/
	
	 static WebDriver openBrowser(String browserName) {
	        WebDriver driver = null;
	        
	        if (browserName.toLowerCase().contains("firefox")) {
	            
	        	
	        	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")	+ "\\lib\\geckodriver.exe");
	        	driver = new FirefoxDriver();
	            browser="Firefox";
	            System.out.println("browser   :::::::"+browser);
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	           
	            return driver;
	        }
	        
	        if (browserName.toLowerCase().contains("internet")) {
	           
	        //	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")	+ "\\lib\\");
	        	driver = new InternetExplorerDriver();
	            browser="IE";
	            System.out.println("browser   :::::::"+browser);
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	             return driver;
	        }
	        
	        if (browserName.toLowerCase().contains("chrome")) {
	        
	        	
	        	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")	+ "\\lib\\chromedriver.exe");
	            driver = new ChromeDriver();	
	            browser="Google Chrome";
	            System.out.println("browser   :::::::"+browser);
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	            return driver;
	        }

	        return driver;
	    }
	}

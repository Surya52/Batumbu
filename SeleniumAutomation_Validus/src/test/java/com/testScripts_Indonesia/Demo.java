package com.testScripts_Indonesia;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Pictures\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.google.com/");
		d.findElement(By.xpath("//input[@name='q']")).sendKeys("twitter");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List <WebElement>l= d.findElements(By.xpath("//ul[@role='listbox']"));
		System.out.println("numer Of elements"+ l.size());
		for ( WebElement we: l) { 
		    System.out.println(we.getText());
		}
	 
	}
}

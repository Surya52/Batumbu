package com.objectRepository;

import org.openqa.selenium.By;

public class GmailLoginLocators {


	
	
	public By logoutImage=By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[5]/div[1]/a/span");

	public By logout=By.xpath("//a[text()='Sign out']");
	 public By signIN = By.xpath("//a[contains(text(),'Sign In')]");
	    public By emailId = By.xpath("//input[@id='identifierId']");
	    public By emailNext = By.xpath("//span[contains(text(),'Next')]");
	    public By gmailPassword = By.xpath("//input[@name='password']");
	    public By gmailSearch=By.xpath("//input[@aria-label='Search mail']");
	    public By gmailSearchButton = By.xpath("//button[@aria-label='Search Mail']");
	    public By gmailMail = By.xpath("(//span[text()='Sandbox: Verify your identity in Salesforce'])[4]");
	   
  
	
	
}

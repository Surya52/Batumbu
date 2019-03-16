package com.objectRepository;

import org.openqa.selenium.By;

public class HMSLocators {

	/*WebDriver driver;
	public DBSBusinessAccOpening_Loc(WebDriver driver){
		this.driver=driver;
	}
	*/
	public By username=By.xpath("//input[@name='username']");
	public By password=By.xpath("//input[@name='password']");
	public By login=By.xpath("//input[@name='submit']");
	
	public By regristration=By.xpath("//*[@id=\"navigation\"]/li[1]/a");
	public By patientCategory = By.xpath("//select[@name='PATIENT_CAT']");
	public By relation = By.xpath("//select[@name='RELATION']");
	public By title = By.xpath("//select[@name='TITLE']");
	public By motherMaidenName = By.xpath("//input[@name='MOTHER_NAME']");
	public By firstName = By.xpath("//input[@name='PNT_NAME']");
	public By patientIdentifier = By.xpath("//select[@name='PAT_IDENTITY']");
	public By middleName = By.xpath("//input[@name='MIDDLE_NAME']");
	public By lastName = By.xpath("//input[@name='LAST_NAME']");
	public By panVoterId = By.xpath("//input[@name='PAT_IDENTITY_PROOF']");
	public By dob = By.xpath("//input[@name='DOB']");
	public By age = By.xpath("//input[@name='AGE']");
	public By gender = By.xpath("//select[@name='SEX']");
	public By maritialStatus = By.xpath("//select[@name='MTRL_STATUS']");
	public By religion = By.xpath("//select[@name='RELIGION']");
	public By primaryLanguage = By.xpath("//select[@name='PLANGUAGE']");
	public By country = By.xpath("//select[@name='COUNTRY_CODE']");
	public By nationality = By.xpath("//select[@name='NATIONALITY']");
	public By vip = By.xpath("//select[@name='IS_MLC']");
	public By education = By.xpath("//select[@name='EDUCATION']");

	public By occupation = By.xpath("//select[@name='OCCUPATION']");
	public By bloodGroup = By.xpath("//select[@name='BLOOD_GRP_CODE']");

	public By citizenship = By.xpath("//select[@name='CITIZENSHIP']");
	public By seniorCitizenship = By.xpath("//select[@name='SC_PROOF']");
	public By address = By.xpath("//input[@name='ADDRESS1']");
	public By phone = By.xpath("//input[@name='MOBILE_NO']");
	public By eMail = By.xpath("//input[@name='EMAIL_ID']");	
	public By address2 = By.xpath("//input[@name='ADDRESS2']");
	public By pin = By.xpath("//input[@name='ZIP']");
	public By save = By.xpath("//input[@name='submit']");
	public By upload = By.xpath("//input[@name='image']");


	public By logout=By.xpath("//a[text()='Logout']");
	public By logoutError=By.xpath("//a[text()='LogoutError']");
  
	
	
}

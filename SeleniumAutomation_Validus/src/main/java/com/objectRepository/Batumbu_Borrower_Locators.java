package com.objectRepository;

import org.openqa.selenium.By;

public class Batumbu_Borrower_Locators {

	
	
	 		public By borrower					    = By.xpath("//button[contains(text(),'Wira UKM')]");
			public By emailIDInvestor 				= By.xpath("//input[@id='Email_Id']");
			public By passwordInvestor			    = By.xpath("//input[@id='Password']");
			public By confirmPasswordInvestor 		= By.xpath("//input[@id='ConfirmPassword']");
			public By mobileNumber 					= By.xpath("//input[@id='Mobile_Number']");
			public By TermsCondition 				= By.xpath("(//span[contains(text(),'Kami / Saya mengakui dan setuju untuk terikat dengan ketentuan yang ditetapkan dalam ')])[2]");
			public By Login 						= By.xpath("//button[contains(text(),'Lanjutkan')]");
			
			public By Greetings 					= By.xpath("(//select[@id='Salutation'])");
			
			public By firstName						= By.xpath("(//input[@id='FirstName'])");
		    public By MiddleName				    = By.xpath("(//input[@id='MiddleName'])");
			public By lastname 						= By.xpath("(//input[@id='FamilyName'])");
			public By PassportNumber			    = By.xpath("(//input[@id='NRICNumber'])");
			public By Position 						= By.xpath("//input[@id='CompanyDesignation']");
			public By Aboutbatumbu					= By.xpath("//select[@id='WhereDidYouHearAboutValidus']");
			public By Source 						= By.xpath("//select[@name='source']");
			public By EntityType					= By.xpath("//select[@id='CompanyEntityType']");
			public By NameofUkm						= By.xpath("//input[@id='CompanyName']");
			//public By BusinessSector				= By.xpath("//select[@id='CompanySector']");
			public By EstablishmentNumber			= By.xpath("//input[@id='establishmentDeedNumber']");
			public By DeedNumber					= By.xpath("//input[@id='CompanyRegistrationNumber']");
			
			public By DateOfDeed					= By.xpath("//input[@id='deedOfEstablishment']");
			public By NoOfManagement				= By.xpath("//select[@id='no_of_directors']");
			
			public By NameOfmanagement1				= By.xpath("(//input[@id='managementName'])[1]");
			public By ManagementPosition1			= By.xpath("(//input[@name='position[]'])[1]");
			public By servesince1					= By.xpath("(//input[@name='servingSince[]'])[1]");
			
			public By NameOfmanagement2				= By.xpath("(//input[@id='managementName'])[2]");
			public By ManagementPosition2			= By.xpath("(//input[@name='position[]'])[2]");
			public By servesince2					= By.xpath("(//input[@name='servingSince[]'])[2]");
			
			public By NoOfShareholders 				= By.xpath("//select[@id='no_of_shareholders']");
			
			public By Shareholder1					= By.xpath("(//input[@id='shareholderName'])[1]");
			public By Percentage1					= By.xpath("(//input[@class='ownership'])[1]");
			
			public By Shareholder2					= By.xpath("(//input[@id='shareholderName'])[2]");
			public By Percentage2					= By.xpath("(//input[@class='ownership'])[2]");
			
			public By LicenceNumber 				= By.xpath("(//input[@id='CompanyRegistrationNumber'])[1]");
			public By BusinessSector				= By.xpath("//select[@id='CompanySector']");
			public By BusinessAddress				= By.xpath("//textarea[@id='CompanyAddress']");
			public By SubDistrict					= By.xpath("(//input[@id='districts'])[1]");
			public By CountyTown					= By.xpath("(//input[@id='countyTown'])[1]");
			public By Province						= By.xpath("(//input[@id='Province'])[1]");
			public By ComapnyPostalCode				= By.xpath("(//input[@id='CompanyPostalCode'])[1]");
			public By HomeAddress					= By.xpath("//textarea[@id='homeaddress']");
			public By EmergencyContact				= By.xpath("(//input[@id='emergencycontact'])[1]");
			
			
			public By AlternateGreeting				= By.xpath("//select[@id='SecondarySalutation']");
			public By Firstname1				    = By.xpath("(//input[@id='SecondaryFirstName'])");
			public By MiddleName2					= By.xpath("(//input[@id='SecondaryMiddleName'])");
			public By LastName2						= By.xpath("(//input[@id='SecondaryFamilyName'])");
			public By PassportNumber2				= By.xpath("(//input[@id='SecondaryNRICNumber'])");
			public By Designation2 					= By.xpath("(//input[@id='SecondaryDesignation'])");
			public By Mobilenumber2					= By.xpath("(//input[@id='SecondaryMobileNumber'])");
			public By EmailId2						= By.xpath("(//input[@id='SecondaryEmailAddress'])");
			
			
			public By Upload1						= By.xpath("(//button[contains(text(),'Pilih File')])[1]");
			public By Upload2						= By.xpath("(//button[contains(text(),'Pilih File')])[2]");
			public By Upload3						= By.xpath("(//button[contains(text(),'Pilih File')])[3]");
			public By Upload4						= By.xpath("(//button[contains(text(),'Pilih File')])[4]");
			public By Upload5						= By.xpath("(//button[contains(text(),'Pilih File')])[5]");
			public By Upload6						= By.xpath("(//button[contains(text(),'Pilih File')])[6]");
			public By Upload7						= By.xpath("(//button[contains(text(),'Pilih File')])[7]");
			public By Upload8						= By.xpath("(//button[contains(text(),'Pilih File')])[8]");
			
			public By Agree1						= By.xpath("//label[@for='agree']");
			public By Agree2						= By.xpath("//label[@for='agree2']");
			public By Agree3						= By.xpath("//label[@for='agree4']");
			public By Agree4						= By.xpath("//label[@for='agree1']");
			 
	        public By SUBMIT						= By.xpath("//button[@id='submit']");
	        
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

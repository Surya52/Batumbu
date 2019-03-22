
package com.objectRepository;

import org.openqa.selenium.By;


public class LoanDisbrusal_Process_Locators {

 
	public By LoanApplications		= By.xpath("//span[text()='Loan Applications']");
	public By SMES 					= By.xpath("//span[contains(text(),'SMEs')]");
	public By SearchBox				= By.xpath("//input[@type='search']");
	public By ViewDetails			= By.xpath("//a[text()='View Details']");
	public By PledgeLenderDocs		= By.xpath("//a[contains(text(),'Pledge Lender Deposits')]");
 	public By Application   		= By.xpath("(//a[@class='investordetails_link'])[4]");
	
	
	
	public By BookinOrder			= By.xpath("//button[@id='new_investment_booking_modal_btn']");
	public By InvestmentAmount		= By.xpath("//input[@id='investment_amount']");
	public By InvestmentSubmit		= By.xpath("//button[@id='add_new_investment_booking_submit_btn']");
	public By VACheckBox			= By.xpath("//input[@id='VACheckStatuscheckbox']");
	public By PledgeSubmit			= By.xpath("//button[@id='PledgeFormSubmitButton']");
	public By PledgeConfirmButton	= By.xpath("//button[@id='PledgeDepositModalButton']");
  	public By PledgeView2			= By.xpath("(//a[text()='View Details'])[2]");
	public By LogOut				= By.xpath("//span[text()='Logout']");
	
	public By ReadytoDisbrusal		= By.xpath("//a[@onclick='LoaderShow()']");
	public By DisbrusalLoan			= By.xpath("//a[text()='Disbursal Loan ']");
	
	
	public By PlatForm				= By.xpath("//a[text()=' PLATFORM']");
	public By CurrentLoanOffer		= By.xpath("//a[@href='https://platform.batumbu.id/index.php/investor/all_live_facilities']");
	public By Table					= By.xpath("//table[@id='myTable']");
	
	
	
	
			
	
	
	
	
	
	
	
}

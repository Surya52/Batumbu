package com.objectRepository;

import org.openqa.selenium.By;

public class Batumbu_Investor_IndividualForeignCitizens_Loc {


public By  individualforeigncitizens =By.xpath("//label[contains(text(),'Perseorangan warga negara asing')]");

public By Greetings =By.xpath("(//select[@id='Salutation'])[6]");
 public By  NRICPassportNumber2 = By.xpath("(//input[@id='NRICNumber'])[10]");
 public By  firstName2 = By.xpath("(//input[@id='FirstName'])[6]");
public By  MiddleName = By.xpath("(//input[@id='MiddleName'])[6]");
public By  lastname = By.xpath("(//input[@id='FamilyName'])[6]");
 public By  companyAddress2 = By.xpath("(//input[@id='Address'])[2]");
 public By Contry =By.xpath("(//select[@id='Nationality'])[5]");
public By  postalCode2 = By.xpath("(//input[@id='PostalCode'])[2]");
 public By  Networthprevious =By.xpath("(//input[@name='net_worth_previous_year'])[6]");
public By  NetwothCurrentyear =By.xpath("(//input[@name='net_worth_current_year'])[6]");
	public By  Source =By.xpath("//select[@id='sixthsource']");
	

	 public By Upload1 =By.xpath("(//button[contains(text(),'Pilih file')])[36]");
	  public By Upload2 =By.xpath("(//button[contains(text(),'Pilih file')])[37]");
	  public By Upload3 =By.xpath("(//button[contains(text(),'Pilih file')])[38]");
	  public By Upload4 =By.xpath("(//button[contains(text(),'Pilih file')])[39]");
	
	  
	  public By Agree1  =By.xpath("//label[@for='agree60']");
	  public By Agree2  =By.xpath("//label[@for='agree61']");
	  public By Agree3  =By.xpath("//label[@for='agree62']");
	  public By Agree4  =By.xpath("//label[@for='agree63']");
	  public By Agree5  =By.xpath("//label[@for='Esignagree6']");
	  public By Agree6  =By.xpath("//label[@for='agree64']");
	  
	  

	  public By FBSubmit =By.xpath("(//button[contains(text(),'Kirim')])[position()=6]");
	
	  public By AccountOwner = By.xpath("//input[@name='NameAsPerBank']");
		public By BankName = By.xpath("//input[@id='BankName']");
		public By AccountNumber = By.xpath("//input[@id='BankAccountNumber']");
		public By BranchCode = By.xpath("//input[@id='BranchCode']");
	 	
		public By submitbank = By.xpath("//button[@id='Bankdetailssubmitbutton']");
	 	
	  //***********************************************************//
		  public By validusMainpageLogin = By.xpath("//a[contains(text(),'Login')]");
			public By validusCreateanAccount = By.xpath("//a[@class='create-acc']");
			public By validusInvestor = By.xpath("//button[contains(text(),'Penyedia Dana')]");
			public By validusSME =By.xpath("//button[text()='Wira UKM']");
			public By emailIDInvestor = By.xpath("//input[@id='Email_Id']");
			 public By passwordInvestor = By.xpath("//input[@id='Password']");
			 public By confirmPasswordInvestor = By.xpath("//input[@id='ConfirmPassword']");
			 public By mobileNumber = By.xpath("//input[@id='Mobile_Number']");
			    public By investorLoginTermsandCondition = By.xpath("(//span[@id='ibc'])[1]");
			    public By investorContinue = By.xpath("//button[@type='submit']");
			    public By otpContent = By.xpath("//label[@class='active']");
				public By username = By.xpath("//input[@id='username']");
				public By password = By.xpath("//input[@id='password']");
				public By login = By.xpath("//button[contains(text(),'Masuk')]");
			
			  public By Saleslogin = By.xpath("//input[@value='Log In to Sandbox']");
			///*************************_________________
				
				    public By signIN = By.xpath("//a[contains(text(),'Sign in')]");
				    public By emailId = By.xpath("//input[@id='identifierId']");
				    public By emailNext = By.xpath("//span[contains(text(),'Next')]");
				    public By gmailPassword = By.xpath("//input[@name='password']");
				    public By gmailSearch=By.xpath("//input[@aria-label='Search mail']");
				    public By gmailSearchButton = By.xpath("//button[@aria-label='Search Mail']");
				    public By gmailMail = By.xpath("(//span[text()='Sandbox: Verify your identity in Salesforce'])[4]");
				    public By gmailDelete = By.xpath("//div[@class='T-I J-J5-Ji nX T-I-ax7 T-I-Js-Gs  W6eDmd']");
					
				    public By UnregisteredUser = By.xpath("//a[contains(text(),'Unregistered Users')]");
				    public By FirstApplication = By.xpath("(//th[@class=' dataCell  '])[1]");
				     public By continueInvestor = By.xpath("//a[@value='Submit']");
				    public By Mailverification = By.xpath("//div[@id='00NN00000039a62_ileinner']");
				    	
				     
				 
				    public By Maildidtext= By.xpath("//div[@id='00NN0000003stuf_ileinner']");
				    public By mailtext2 =By.xpath("//td[@id='00NN0000003stuf_ilecell']");
				    public By  UnRegisterText =By.xpath("//table[@class='list']");
				    public By LoginKiPlatform		=By.xpath("//a[text()='login ke Platform Batumbu.']");
					
	  
	  
	  
	  //***********************************************
				    
					public By ApplicationList =By.xpath("//table[@class='list']");
					public By Applications =By.xpath("//a[@title='Applications Tab']");
					public By ApplicationNumber =By.xpath("(//th[@class=' dataCell  '])[2]");
					public By ApproveApplication=By.xpath("//a[text()=' Approve Applications']");
					public By Upload =By.xpath("//input[@value='Upload']");
					public By ChoooseFile =By.xpath("//input[@id='j_id0:wizId:j_id3:j_id59:j_id60:j_id61:j_id62']");
					public By Approve =By.xpath("//input[@value='Approve']");
					
	//********************************************************************************************8
					
					public By account = By.xpath("(//a[contains(text(),'Accounts')])");
				    public By salesSearch =By.xpath("//input[@id='phSearchInput']");
				    public By SAlesSearchButton	=By.xpath("//input[@id='phSearchButton']");
				    
					public By paymentMode = By.xpath("//input[@tabindex='3']");
				    public By investorFundTransaction = By.xpath("(//span[contains(text(),'Investor Fund Transaction')])[1]");
				    public By newFundTransaction = By.xpath("//td[@class='pbButton']/following::input[@title='New Investor Fund Transaction']");
				    public By Amounttransaction = By.xpath("//input[@tabindex='4']");
				    public By insuredLoanAmount = By.xpath("(//input[@type='checkbox'])[4]");
				    public By savefund = By.xpath("(//input[@name='save'])[1]");
				    public By fundsavailable = By.xpath("//div[@title='Available Funds for Investing']");
				    public By allLivefacilities = By.xpath("//a[contains(text(),' Penawaran Pinjaman saat ini')]");
				    public By platform = By.xpath("//a[@id='tog-menu-a']"); 
					
	  
	  //******************************----------------------------******************************
				    
				    public By AdminMail = By.xpath("//input[@placeholder='Email']");
				    public By AdminPassword =By.xpath("//input[@placeholder='Password']");
				    public By AdminLogin   =By.xpath("//button[contains(text(),'Login')]");
				    
				    public By Lenders =By.xpath("(//li[@class='active'])[1]");
				    public By LendeSearch  =By.xpath("//input[@type='search']");
				    public By ViewDetailsLender  =By.xpath("//a[contains(text(),'View Details')]");
				    public By Application   = By.xpath("(//a[@class='investordetails_link'])[4]");
				    public By LenderDocumentslist =By.xpath("//button[@id='view_more_docs_btn']");
				    public By VerifyDocuments     = By.xpath("//a[@name='VerifyDocuments']");
				    public By ChooseFilelender     =By.xpath("//input[@id='ApprovalDocument']");
				    public By SubmitLender    =By.xpath("//button[@id='application_document_submit_btn']");
				    public By ApproveLender 		=By.xpath("//button[@class='btn btn-success btn-flat ApproveRejectButton']");
				    public By InitiateTransaction	=By.xpath("//*[text()='Initiate Transaction']"); 
				    
				    public By TransactionAmount 		=By.xpath("//input[@name='transactionamount']");
				    public By TransactionTYPE   		=By.xpath("//select[@name='transactiontype']");
				    public By SubmitTransaction   =By.xpath("//button[@type='submit']");
				 
				    public By LenderfFundTransaction   =By.xpath("//*[contains(text(),'Lender Fund Transactions')]");
				    public By LFTtext				=By.xpath("//tr[@class='odd'][1]");
				   
				    public By TransactionId         =By.xpath("//input[@name='InitiateTransactionId']");
				    public By AmountTransaction		=By.xpath("//input[@name='transactionamount']");
				    public By TypeOfTransaction		= By.xpath("//select[@name='transactiontype']");
				    public By LenderPaymentMode			= By.xpath("//select[@name='paymentmode']");
				    public By SubmitLenderFund		= By.xpath("//button[contains(text(),'Submit')]");
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
				    
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	




}


package com.objectRepository;

import org.openqa.selenium.By;

public class Foreign_Legal_Entity_Locators {
 
	
	
	public By ComapanyName =By.xpath("(//input[@id='CompanyName'])[4]");
	public By Greetings =By.xpath("(//select[@id='Salutation'])[4]");
	
	public By DeedNumber =By.xpath("(//input[@id='CompanyRegistrationNumber'])[3]");
	
	public By firstName2 = By.xpath("(//input[@id='FirstName'])[4]");
    public By MiddleName = By.xpath("(//input[@id='MiddleName'])[4]");
	public By lastname = By.xpath("(//input[@id='FamilyName'])[4]");
	public By companyAddress2 = By.xpath("(//input[@id='CompanyAddress'])[3]");
	
	
	public By DateooDeed= By.xpath("(//input[@class='DeedOfEstablishment'])[4]");
	
	public By industryDescription = By.xpath("//input[@id='IndustryDescription1']");
	 public By postalCode2 = By.xpath("(//input[@id='CompanyZipCode'])[3]");
	 public By IdNumber				= By.xpath("(//input[@id='NRICNumber'])[6]");
	 public By SimNumber			= By.xpath("(//input[@id='SIMNumber'])[3]");
	 public By PassPortNUm			= By.xpath("(//input[@id='PassportNumber'])[3]");
	 public By NRICPassportNumber2 = By.xpath("(//input[@id='NRICNumber'])[6]");
	 
	 public By Nationality2 = By.xpath("(//select[@id='Nationality'])[4]");
	 
	  public By primaryConatctNo2 = By.xpath("(//input[@id='PrimaryContactNumber'])[3]");
	  
	  public By designationInv2 = By.xpath("(//input[@id='Designation'])[4]");
	  
	  public By SICCCode = By.xpath("(//select[@id='SICCCode'])[4]");
	  public By Networthprevious =By.xpath("(//input[@name='net_worth_previous_year'])[4]");
	  public By NetwothCurrentyear =By.xpath("(//input[@name='net_worth_current_year'])[4]");
	  public By Source =By.xpath("//select[@id='fourthsource']");
	  
	  
	  public By AddMangement =By.xpath("(//select[@id='no_of_directors'])[4]");  
	  public By ManagementName =By.xpath("(//input[@name='managementName[]'])[4]");
	  public By DeptMangement =By.xpath("(//input[@name='director_position[]'])[4]");
	  public By ServeSinceDate =By.xpath("(//input[@class='director_servingSince'])[4]");
	  public By MangementPassport =By.xpath("(//input[@name='director_passport_no[]'])[4]");
	  public By IDManagement1		=By.xpath("(//input[@name='director_ktp_no[]'])[4]");
	  public By SimNumber1			=By.xpath("(//input[@name='director_sim_no[]'])[4]");
	  public By ManagementCitizenship =By.xpath("(//select[@name='director_citizenship[]'])[4]");
	  public By MangementContact =By.xpath("(//input[@name='director_contact_no[]'])[4]");
	  public By NO_Of_Shareholders= By.xpath("(//select[@id='no_of_shareholders'])[4]");
	
	  public By ShareholderName =By.xpath("(//input[@name='shareholderName[]'])[4]");
	  public By ShareholderPercentage  =By.xpath("(//input[@name='shareholder_ownership[]'])[4]");
	  public By ShareholderPassport =By.xpath("(//input[@name='shareholder_passport_no[]'])[4]");
	  public By IDShareHolder1		= By.xpath("(//input[@name='shareholder_ktp_no[]'])[4]");
	  public By SIMNumberShare1		= By.xpath("(//input[@name='shareholder_sim_no[]'])[4]");
	  
	  public By ShareholderCitizenShip =By.xpath("(//select[@name='shareholder_citizenship[]'])[4]");
	  public By Sharecontact =By.xpath("(//input[@name='shareholder_contact_no[]'])[4]");
	
	  public By Upload1 =By.xpath("(//button[contains(text(),'Pilih file')])[23]");
	  public By Upload2 =By.xpath("(//button[contains(text(),'Pilih file')])[24]");
	  public By Upload3 =By.xpath("(//button[contains(text(),'Pilih file')])[25]");
	  public By Upload4 =By.xpath("(//button[contains(text(),'Pilih file')])[26]");
	  public By Upload5 =By.xpath("(//button[contains(text(),'Pilih file')])[27]"); 
	  public By Upload6 =By.xpath("(//button[contains(text(),'Pilih file')])[28]");
	  public By upload7	=By.xpath("(//button[contains(text(),'Pilih file')])[29]");
	  
	  
	  public By Agree1  =By.xpath("//label[@for='agree40']");
	  public By Agree2  =By.xpath("//label[@for='agree41']");
	  public By Agree3  =By.xpath("//label[@for='agree42']");
	  public By Agree4  =By.xpath("//label[@for='agree43']");
	  public By Agree5  =By.xpath("//label[@for='Esignagree4']");
	  public By Agree6  =By.xpath("//label[@for='agree44']");
	  
	  public By FBSubmit =By.xpath("(//button[contains(text(),'Kirim')])[position()=4]");
	
	
	//***************-----------------******************************
	  public By Saleslogin = By.xpath("//input[@value='Log In to Sandbox']");
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

		     public By  checkbox1 =By.xpath("//a[contains(text(),'Syarat dan Ketentuan Pembiayaan Fasilitas')]");
		     public By checkbox2 =By.xpath("//input[@class='Secondcheckbox']");
		public By checksubmit =By.xpath("//button[contains(text(),'Setuju')]");
		public By captcha =By.xpath("//div[@class='recaptcha-checkbox-checkmark']");
		public By KIRIM= By.xpath("//button[contains(text(),'KIRIM')]");
//**********************-------------------------------------------****************************
		   
	 	public By pinjamnHomepage = By.xpath("//a[contains(text(),'Login')]");
		public By resetPasswordPinajaman = By.xpath("//a[contains(text(),' Atur ulang sekarang.')]");
		public By resetPassword = By.xpath("//a[contains(text(),' Reset now.')]");
		public By resetEmailaddress = By.xpath("//input[@id = 'EMAIL_ID']");
		public By resetPasswordsubmitButton = By.xpath("//button[@type='submit']");
		public By resetpasswordfinal = By.xpath("//input[@id='Password']");
		public By resetConfirmPasswordFinal = By.xpath("//input[@id='ConfirmPassword']");
		public By resetpasswordbuttonfinal = By.xpath("//button[@type='submit']");
		public By username = By.xpath("//input[@id='username']");
		public By password = By.xpath("//input[@id='password']");
		public By login = By.xpath("//input[@value='Log In to Sandbox']");
	    public By Userlogin =By.xpath("//button[contains(text(),'Masuk')]");
	
	///*************************_________________
		
		 public By signIN = By.xpath("//a[contains(text(),'Sign In')]");
		    public By emailId = By.xpath("//input[@id='identifierId']");
		    public By emailNext = By.xpath("//span[contains(text(),'Next')]");
		    public By gmailPassword = By.xpath("//input[@name='password']");
		    public By gmailSearch=By.xpath("//input[@aria-label='Search mail']");
		    public By gmailSearchButton = By.xpath("//button[@aria-label='Search Mail']");
		    public By gmailMail = By.xpath("(//span[text()='Sandbox: Verify your identity in Salesforce'])[4]");
		    public By gmailDelete = By.xpath("//div[@class='T-I J-J5-Ji nX T-I-ax7 T-I-Js-Gs  W6eDmd']");
			
		    public By UnregisteredUser = By.xpath("//a[contains(text(),'Unregistered Users')]");
		    public By UnregisteredUserslist = By.xpath("//table[@class='list']");
		    public By Maildidtext= By.xpath("//div[@id='00NN0000003stuf_ileinner']");
		    public By mailtext2 =By.xpath("//td[@id='00NN0000003stuf_ilecell']");
		    
		    public By FirstApplication = By.xpath("(//th[@class=' dataCell  '])[1]");
		    public By  UnRegisterText =By.xpath("//table[@class='list']");
		    public By continueInvestor = By.xpath("//a[@value='Submit']");
		    public By Mailverification = By.xpath("//div[@id='00NN00000039a62_ileinner']");
			public By foreignlegalentity= By.xpath("//label[contains(text(),'Badan hukum asing ')]");
			public By Otp =By.xpath("//div[@id='00NN00000039a68_ileinner']");	
			public By LoginKiPlatform		=By.xpath("//a[text()='login ke Platform Batumbu.']");
			
	
			//****************************************/////////////////////////////
			
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
			    
			 
			
			
			
			
			
			public By ApplicationList =By.xpath("//table[@class='list']");
			public By Applications =By.xpath("//a[@title='Applications Tab']");
			public By ApplicationNumber =By.xpath("(//th[@class=' dataCell  '])[2]");
			public By ApproveApplication=By.xpath("//a[text()=' Approve Applications']");
			public By Upload =By.xpath("//input[@value='Upload']");
			public By ChoooseFile =By.xpath("//input[@id='j_id0:wizId:j_id3:j_id59:j_id60:j_id61:j_id62']");
			public By Approve =By.xpath("//input[@value='Approve']");

			
			public By salesSearch =By.xpath("//input[@id='phSearchInput']");
		    public By SAlesSearchButton	=By.xpath("//input[@id='phSearchButton']");
		    
			public By paymentMode = By.xpath("//input[@tabindex='3']");
		    public By investorFundTransaction = By.xpath("(//span[contains(text(),'Investor Fund Transaction')])[1]");
		    public By newFundTransaction = By.xpath("//td[@class='pbButton']/following::input[@title='New Investor Fund Transaction']");
		    public By Amounttransaction = By.xpath("//input[@tabindex='4']");
		    public By insuredLoanAmount = By.xpath("(//input[@type='checkbox'])[4]");
		    public By savefund = By.xpath("(//input[@name='save'])[1]");
		    
			
			
			
			public By account = By.xpath("(//a[contains(text(),'Accounts')])");
		     public By transactionAmount = By.xpath("//input[@tabindex='4']");
		     public By fundsavailable = By.xpath("//div[@title='Funds available for investing']");

		    
		    public By bank = By.xpath("//a[contains(text(),'Bank')]");
			public By edit = By.xpath("//button[@id='Edit']");
			public By AccountOwner = By.xpath("//select[@name='NameAsPerBank']");
			public By BankName = By.xpath("//input[@id='BankName']");
			public By AccountNumber = By.xpath("//input[@id='BankAccountNumber']");
			public By submitbank = By.xpath("//button[@id='Bankdetailssubmitbutton']");
			public By allLivefacilities = By.xpath("//a[@class='live-facilities']");
			public By Platform			= By.xpath("//a[text()=' PLATFORM']");
			public By CurrentLiveFacilities = By.xpath("//a[text()=' Penawaran Pinjaman saat ini']");
			
			
			public By availableFunds = By.xpath("//div[@title='Funds Available for Investing']"); 
			public By InvestFund		=By.xpath("(//a[text()='Danai'])[1]");
			
			
			public By BranchCode = By.xpath("//input[@id='BranchCode']");
			public By investorstatus = By.xpath("//h3[@class='profile-ban-txt']");
			public By logout = By.xpath("//a[contains(text(),'Logout')]");
			public By platform = By.xpath("//a[@id='tog-menu-a']"); 
			
	
	
	
	
	
	
	
}

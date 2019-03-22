package com.objectRepository;

import org.openqa.selenium.By;

public class ForeignBusiness_Entity_Locators {

 	
			public By  ComapanyName =By.xpath("(//input[@id='CompanyName'])[2]");
			public By  greetings =By.xpath("(//select[@id='Salutation'])[2]");
			public By  DeedNumber =By.xpath("(//input[@id='CompanyRegistrationNumber1'])[1]");
			public By  firstName2 = By.xpath("(//input[@id='FirstName'])[2]");
		    public By  MiddleName = By.xpath("(//input[@id='MiddleName'])[2]");
			public By  lastname = By.xpath("(//input[@id='FamilyName'])[2]");
			public By  companyAddress2 = By.xpath("(//input[@id='CompanyAddress1'])[1]");
			
			public By  DateooDeed= By.xpath("(//input[@class='DeedOfEstablishment'])[2]");
			public By  industryDescription = By.xpath("//input[@id='IndustryDescription1']");
		 	public By  postalCode2 = By.xpath("(//input[@id='CompanyZipCode1'])[1]");
		 	public By  IdnUmber		= By.xpath("(//input[@id='NRICNumber'])[4]");
		 	public By  SimNumber	= By.xpath("(//input[@id='SIMNumber'])[1]");
		 	public By  PassportNumber	 =By.xpath("(//input[@id='PassportNumber'])[1]");
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	public By  NRICPassportNumber2 = By.xpath("(//input[@id='NRICNumber'])[2]");
		 	public By  Nationality2 = By.xpath("(//select[@id='Nationality'])[2]");
		 	public By  primaryConatctNo2 = By.xpath("(//input[@id='PrimaryContactNumber1'])[1]");
		 	public By  designationInv2 = By.xpath("(//input[@id='Designation'])[2]");
		 	public By  SICCCode = By.xpath("(//select[@id='SICCCode'])[2]");
		 	public By  Networthprevious =By.xpath("(//input[@name='net_worth_previous_year'])[2]");
		 	public By  NetwothCurrentyear =By.xpath("(//input[@name='net_worth_current_year'])[2]");
		 	public By  Source =By.xpath("//select[@id='secondsource']");
		 	
		    public By  AddMangement =By.xpath("(//select[@id='no_of_directors'])[2]");  
		    public By  ManagementName =By.xpath("(//input[@name='managementName[]'])[2]");
		    public By  DeptMangement =By.xpath("(//input[@name='director_position[]'])[2]");
		    public By  ServeSinceDate =By.xpath("(//input[@class='director_servingSince'])[2]");
		    public By  IdManagement		= By.xpath("(//input[@name='director_ktp_no[]'])[2]");
		    public By  SimNumManagement	= By.xpath("(//input[@name='director_sim_no[]'])[2]");
		    
		    public By   MangementPassport =By.xpath("(//input[@name='director_passport_no[]'])[2]");
		    public By  ManagementCitizenship =By.xpath("(//select[@name='director_citizenship[]'])[2]");
		    public By  MangementContact =By.xpath("(//input[@name='director_contact_no[]'])[2]");
		    public By  NO_Of_Shareholders= By.xpath("(//select[@id='no_of_shareholders'])[2]");
		
			  public By  ShareholderName =By.xpath("(//input[@name='shareholderName[]'])[2]");
			  public By  ShareholderPercentage  =By.xpath("(//input[@name='shareholder_ownership[]'])[2]");
			  public By  ShareIDNum				= By.xpath("(//input[@name='shareholder_ktp_no[]'])[2]");
			  public By  ShareSimNum			= By.xpath("(//input[@name='shareholder_sim_no[]'])[2]");
			  
			  public By  ShareholderPassport =By.xpath("(//input[@name='shareholder_passport_no[]'])[2]");
			  public By  ShareholderCitizenShip =By.xpath("(//select[@name='shareholder_citizenship[]'])[2]");
			  public By  Sharecontact =By.xpath("(//input[@name='shareholder_contact_no[]'])[2]");
			
			  public By KTP 			=By.xpath("(//button[contains(text(),'Pilih file')])[8]");
			  public By SIM  			=By.xpath("(//button[contains(text(),'Pilih file')])[9]");
			  public By FrontPassport   =By.xpath("(//button[contains(text(),'Pilih file')])[10]");
			  public By RearPassport   =By.xpath("(//button[contains(text(),'Pilih file')])[11]");
			  public By Certificateofestablishment =By.xpath("(//button[contains(text(),'Pilih file')])[12]"); 
			  public By DeedofEstablishment    =By.xpath("(//button[contains(text(),'Pilih file')])[13]");
			  public By NPWPBoardofDirectors	 =By.xpath("(//button[contains(text(),'Pilih file')])[14]");
			  public By OtherFiles =By.xpath("(//button[contains(text(),'Pilih file')])[15]");
			  
			  public By Agree1  =By.xpath("//label[@for='agree20']");
			  public By Agree2  =By.xpath("//label[@for='agree21']");
			  public By Agree3  =By.xpath("//label[@for='agree22']");
			  public By Agree4  =By.xpath("//label[@for='agree23']");
			  public By Agree5  =By.xpath("//label[@for='Esignagree2']");
			  public By Agree6  =By.xpath("//label[@for='agree24']");
			  
			  public By FBSubmit =By.xpath("(//button[contains(text(),'Kirim')])[position()=2]");
		
	
	
	//***************-----------------******************************
	  
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
		public By login = By.xpath("//button[contains(text(),'Masuk')]");
	
	  public By Saleslogin = By.xpath("//input[@value='Log In to Sandbox']");
	///*************************_________________
		
		    public By signIN = By.xpath("//a[contains(text(),'Sign In')]");
		    public By emailId = By.xpath("//input[@id='identifierId']");
		    public By emailNext = By.xpath("//span[contains(text(),'Next')]");
		    public By gmailPassword = By.xpath("//input[@name='password']");
		    public By gmailSearch=By.xpath("//input[@aria-label='Search mail']");
		    public By gmailSearchButton = By.xpath("//button[@aria-label='Search Mail']");
		    public By gmailMail = By.xpath("(//span[text()='Sandbox: Verify your identity in Salesforce'])[4]");
		    public By gmailDelete = By.xpath("(//div[@class='asa'])[24]");
			
		    public By UnregisteredUser = By.xpath("//a[contains(text(),'Unregistered Users')]");
		    public By FirstApplication = By.xpath("(//th[@class=' dataCell  '])[1]");
		    public By continueInvestor = By.xpath("//a[@value='Submit']");
		    public By Mailverification = By.xpath("//div[@id='00NN00000039a62_ileinner']");
		    public By LoginKiPlatform		=By.xpath("//a[text()='login ke Platform Batumbu.']");
		    public By ForeignBusiness = By.xpath("//label[@for='inlineRadio2']");
			
		    //*************************************************************************
		    public By Maildidtext= By.xpath("//div[@id='00NN0000003stuf_ileinner']");
		    public By mailtext2 =By.xpath("//td[@id='00NN0000003stuf_ilecell']");
		    public By  UnRegisterText =By.xpath("//table[@class='list']");
			   
	
	
	
			public By investorstatus = By.xpath("//h3[@class='profile-ban-txt']");
			public By logout = By.xpath("//a[contains(text(),'Logout')]");
			public By platform = By.xpath("//a[@id='tog-menu-a']"); 
			public By bank = By.xpath("//a[contains(text(),'Bank')]");
			public By edit = By.xpath("//button[@id='Edit']");
			public By AccountOwner = By.xpath("//select[@id='NameAsPerBank']");
			public By BankName = By.xpath("//input[@id='BankName']");
			public By AccountNumber = By.xpath("//input[@id='BankAccountNumber']");
			public By submitbank = By.xpath("//button[@id='Bankdetailssubmitbutton']");
			public By Keluar		= By.xpath("(//a[text()='Keluar'])[1]");
			
			public By allLivefacilities = By.xpath("//a[contains(text(),' Penawaran Pinjaman saat ini')]");
			public By availableFunds = By.xpath("//div[@class='availableFunds']"); 
			public By BranchCode = By.xpath("//input[@id='BranchCode']");
			
			
			
			public By salesSearch =By.xpath("//input[@id='phSearchInput']");
		    public By SAlesSearchButton	=By.xpath("//input[@id='phSearchButton']");
		    
			
			
			public By account = By.xpath("(//a[contains(text(),'Accounts')])");
		    public By paymentMode = By.xpath("//input[@tabindex='3']");
		    public By investorFundTransaction = By.xpath("(//span[contains(text(),'Investor Fund Transaction')])[1]");
		    public By newFundTransaction = By.xpath("//td[@class='pbButton']/following::input[@title='New Investor Fund Transaction']"); public By transactionAmount = By.xpath("//input[@tabindex='4']");
		    public By insuredLoanAmount = By.xpath("(//input[@type='checkbox'])[4]");
		    public By savefund = By.xpath("(//input[@name='save'])[1]");
		    public By fundsavailable = By.xpath("//div[@title='Funds available for investing']");
	

			public By ApplicationList =By.xpath("//table[@class='list']");
			public By Applications =By.xpath("//a[@title='Applications Tab']");
			public By ApplicationNumber =By.xpath("(//th[@class=' dataCell  '])[2]");
			public By ApproveApplication=By.xpath("//a[text()=' Approve Applications']");
			public By Upload =By.xpath("//input[@value='Upload']");
			public By ChoooseFile =By.xpath("//input[@id='j_id0:wizId:j_id3:j_id59:j_id60:j_id61:j_id62']");
			public By Approve =By.xpath("//input[@value='Approve']");


//************************************batumbu Amdin*******************
			
			
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
	
	


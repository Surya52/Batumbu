package com.objectRepository;

import org.openqa.selenium.By;

public class Batumbu_SME_Locators {

	
	   public By validusMainpageLogin = By.xpath("//a[contains(text(),'Login')]");
	   public By validusCreateanAccount = By.xpath("//a[@class='create-acc']");
	   public By validusInvestor = By.xpath("//button[contains(text(),'Penyedia Dana')]");
	   public By validusSME =By.xpath("//button[text()='Wira UKM']");
	   public By emailIDInvestor = By.xpath("//input[@id='Email_Id']");
	   public By passwordInvestor = By.xpath("//input[@id='Password']");
	   public By confirmPasswordInvestor = By.xpath("//input[@id='ConfirmPassword']");
	   public By mobileNumber = By.xpath("//input[@id='Mobile_Number']");
	   public By investorLoginTermsandCondition = By.xpath("(//span[@id=\"ibc\"])[2]");
	   public By investorContinue = By.xpath("//button[@type='submit']");
	   public By otpContent = By.xpath("//label[@class='active']");
	   public By SMEContinue	= By.xpath("//a[@class='continue-register']");
	   
	    public By salesusername = By.xpath("//input[@id='username']");
		public By salespassword = By.xpath("//input[@id='password']");
		public By Saleslogin = By.xpath("//input[@value='Log In to Sandbox']");

		public By emailId = By.xpath("//input[@id='identifierId']");
	    public By emailNext = By.xpath("//span[contains(text(),'Next')]");
	    public By gmailPassword = By.xpath("//input[@name='password']");
	    public By gmailSearch=By.xpath("//input[@aria-label='Search mail']");
	    public By gmailSearchButton = By.xpath("//button[@aria-label='Search Mail']");
	    
	    public By UnregisteredUser = By.xpath("//a[contains(text(),'Unregistered Users')]");
	    public By FirstApplication = By.xpath("(//th[@class=' dataCell  '])[1]");
	    public By  UnRegisterText =By.xpath("//table[@class='list']");
	    public By Mailverification = By.xpath("//div[@id='00NN00000039a62_ileinner']");
	    public By LeaveButtton		= By.xpath("//input[@value='Cancel']/following::input[@value='Leave']");
	    public By LoginKiPlatform	= By.xpath("//a[contains(text(),'login ke Platform Batumbu.')]");
	    
	    //****************************************************************
/*		public By emailIDInvestor 				= By.xpath("//input[@id='Email_Id']");
		public By passwordInvestor			    = By.xpath("//input[@id='Password']");
		public By confirmPasswordInvestor 		= By.xpath("//input[@id='ConfirmPassword']");
		public By mobileNumber 					= By.xpath("//input[@id='Mobile_Number']");
*/		
	    
		public By borrower					    = By.xpath("//button[contains(text(),'Wira UKM')]");
 	    public By TermsCondition 				= By.xpath("(//span[contains(text(),'Kami / Saya mengakui dan setuju untuk terikat dengan ketentuan yang ditetapkan dalam ')])[2]");
		public By Login 						= By.xpath("//button[contains(text(),'Lanjutkan')]");
		
		public By Greetings 					= By.xpath("(//select[@id='Salutation'])");
		
		public By firstName						= By.xpath("(//input[@id='FirstName'])");
	    public By MiddleName				    = By.xpath("(//input[@id='MiddleName'])");
		public By lastname 						= By.xpath("(//input[@id='FamilyName'])");
		public By NRIcNumber			        = By.xpath("(//input[@id='NRICNumber'])");
		public By Position 						= By.xpath("//input[@id='CompanyDesignation']");
		public By SimNuber						= By.xpath("(//input[@id='SIMNumber'])[1]");
		public By PassportNumber				= By.xpath("(//input[@id='PassportNumber'])[1]");
		
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
        

    	public By uploadFile1 = By.xpath("(//button[contains(text(),'Pilih File')])[1]");
    	public By uploadFile2 = By.xpath("(//button[contains(text(),'Pilih File')])[2]");
    	public By uploadFile3 = By.xpath("(//button[contains(text(),'Pilih File')])[3]");
    	public By uploadFile4 = By.xpath("(//button[contains(text(),'Pilih File')])[4]");
    	public By uploadFile5 = By.xpath("(//button[contains(text(),'Pilih File')])[5]");
    	public By uploadFile6 = By.xpath("(//button[contains(text(),'Pilih File')])[6]");
     	public By uploadFile7 = By.xpath("(//button[contains(text(),'Pilih File')])[7]");
    	public By uploadFile8 = By.xpath("(//button[contains(text(),'Pilih File')])[8]");
    	public By uploadFile9 = By.xpath("(//button[contains(text(),'Pilih File')])[9]");
    	public By uploadFile10= By.xpath("(//button[contains(text(),'Pilih File')])[10]");
    	
    	
    	public By agreeSME = By.xpath("//label[@for='agree']");
    	public By agreeSME2= By.xpath("//label[@for='agree2']");
    	public By agreeSME3= By.xpath("//label[@for='agree4']");
    	public By agreeSME4 = By.xpath("//label[@for='agree1']");
    	 public By submit = By.xpath("//button[@id='submit']");
    	
    	public By bankName = By.xpath("//input[@id='BankName']");
    	public By accountNumber = By.xpath("//input[@id='BankAccountNumber']");
    	public By branchCode = By.xpath("//input[@id='BranchCode']");
    	public By next = By.xpath("//button[@id='submit']");
    	
    	
    	public By invoiceFinancing = By.xpath("//label[@for='LoanProductType1']");
    	public By loanamount = By.xpath("//input[@id='LoanAmount']");
    	public By tenureRequired = By.xpath("//select[@id='LoanTenure']");
    	public By noofEmployees = By.xpath("//input[@id='NumOfEmployees']");
    	public By annualRevenuepreviousyear = By.xpath("//input[@id='AnnualRevenuePreviousYear']");
    	public By annualRevenueLatestyear = By.xpath("//input[@id='AnnualRevenueCurrentYear']");
    	public By netProfitLossPreviousyear = By.xpath("//input[@id='NetProfitPreviousYear']");
    	public By netProfitLossLatestyear = By.xpath("//input[@id='NetProfitCurrentYear'] ");
    	
    	public By PersonnelGurrantor1		= By.xpath("//select[@id='NamePG1dropdown']");
    	public By ResidentialStatus1		= By.xpath("//select[@id='ResidentialStatusPG1']");
    	public By PGALastYeraTax1			= By.xpath("//input[@id='TaxIncomePreviousYearPG1']");
    	public By PGCurrentTax1				= By.xpath("//input[@id='TaxIncomeCurrentYearPG1']");
    	
    	public By PersonnelGurrantor2		= By.xpath("//select[@id='NamePG2dropdown']");
    	public By ResidentialStatus2			= By.xpath("//select[@id='ResidentialStatusPG2']");
    	public By PGALastYeraTax2			= By.xpath("//input[@id='TaxIncomePreviousYearPG2']");
    	public By PGCurrentTax2				= By.xpath("//input[@id='TaxIncomeCurrentYearPG2']");
    			
    	
    	public By PersonnelGurrantor3		= By.xpath("//select[@id='NamePG3dropdown']");
    	public By ResidentialStatus3		= By.xpath("//select[@id='ResidentialStatusPG3']");
    	public By PGALastYeraTax3			= By.xpath("//input[@id='TaxIncomePreviousYearPG3']");
    	public By PGCurrentTax3				= By.xpath("//input[@id='TaxIncomeCurrentYearPG3']");
    	
    	
    	
    	public By personalGuarantor1 =By.xpath("//select[@id='NamePG1dropdown']");
    	public By residentialStatus = By.xpath("//select[@id='ResidentialStatusPG1'] ");
    	public By GuarantorAnnualtax =By.xpath("//input[@id='TaxIncomePreviousYearPG1']");
    	public By GuarantorCurrentTax =By.xpath("//input[@id='TaxIncomeCurrentYearPG1']");
    	
    	
    	public By invoiceFinancingUpload1 = By.xpath("(//button[text()='Pilih File'])[1]");
    	public By invoiceFinancingUpload2 = By.xpath("(//button[text()='Pilih File'])[2]");
    	public By invoiceFinancingUpload3 = By.xpath("(//button[text()='Pilih File'])[3]");
    	public By invoiceFinancingUpload4 = By.xpath("(//button[text()='Pilih File'])[4]");
    	public By invoiceFinancingUpload5 = By.xpath("(//button[text()='Pilih File'])[5]");
    	public By invoiceFinancingUpload6 = By.xpath("(//button[text()='Pilih File'])[7]");
    	public By invoiceFinancingUpload7 = By.xpath("(//button[text()='Pilih File'])[1]");
    	 
    	public By InvoiceAgree1			  = By.xpath("//label[@for='agree1']");
    	public By InvoiceAgree2			  = By.xpath("//label[@for='agree2']");
    	public By InvoiceAgree3			  = By.xpath("//label[@for='agree3']");
    	public By InvoiceAgree4			  = By.xpath("//span[text()='Kami / Saya setuju bahwa Batumbu berhak menolak Aplikasi Fasilitas apa pun sesuai dengan ']");
    	public By InvoiceAgree5			  = By.xpath("//label[@for='agree5']");
    	public By SmeFinalSubmit		  = By.xpath("//button[text()='Kirim']");
    	public By masuk 				  = By.xpath("//button[contains(text(),'Masuk')]");
    	public By SMELogOut				  = By.xpath("//a[text()='Keluar']");
    	
    	
    	  	public By AdminMail = By.xpath("//input[@placeholder='Email']");
    	    public By AdminPassword =By.xpath("//input[@placeholder='Password']");
    	    public By AdminLogin   =By.xpath("//button[contains(text(),'Login')]");
    	    public By AdminLogout  = By.xpath("//span[contains(text(),'Logout')]");
    	    
    	    public By SMES =By.xpath("//span[contains(text(),'SMEs')]");
    	    public By SMECREDITRISk	= By.xpath("//span[contains(text(),'SMEs')]");						 //a[@href='https://batumbu.id/BatumbuAdmin/public/BorrowerList']
    	    public By SMECREDITTOPS =By.xpath("//span[contains(text(),'SMEs')]");
    	    public By SMESEarch  =By.xpath("//input[@type='search']");
    	    public By ViewDetailsLender  =By.xpath("//a[contains(text(),'View Details')]");
    	    public By Application   = By.xpath("(//a[@class='investordetails_link'])[4]");
    	    public By LenderDocumentslist =By.xpath("//button[@id='view_more_docs_btn']");
    	    public By VerifyDocuments     = By.xpath("//a[@name='VerifyDocuments']");
    	    public By ChooseFilelender     =By.xpath("//input[@id='ApprovalDocument']");
    	    public By SubmitLender    =By.xpath("//button[@id='application_document_submit_btn']");
    	    public By ApproveLender 		=By.xpath("//button[@class='btn btn-success btn-flat ApproveRejectButton']");
    	  //  public By LoanApplications= By.xpath("//a[@href='https://batumbu.id/BatumbuAdmin/public/LoanApplications']");
    	    public By PromisoryNote			=By.xpath("//input[@id='PromissoryNote']");
    	    public By UploadPromisory			=By.xpath("//button[contains(text(),'Upload')]");
    	    public By PromisoryNoteSubmit		=By.xpath("//button[@id='promissory_note_submit_btn']");
    	    public By ApproveLoan				=By.xpath("//a[contains(text(),'Approve Loan')]");
    	    public By EditLoanApplication		=By.xpath("//button[@id='edit-details-btn']");
    	    public By RateInterestMonthy		=By.xpath("//input[@id='interest_rate_monthly']");
    	    public By InterestType				=By.xpath("//select[@id='interest_type']");
    	    public By Tenureoffered				=By.xpath("//select[@id='tenure_offered_months']");
    	    public By paymentfrequency			=By.xpath("//select[@id='payment_frequency']");
    	    public By invoiceAmount				=By.xpath("//input[@id='invoice_amount']");
    	    public By InvoiceNumber				=By.xpath("//input[@id='Invoice_number']");
    	    public By InvoiceReceiveDate		=By.xpath("//input[@id='invoicereceiveddate_datepicker']");
    	    public By invoiceDueDate			=By.xpath("//input[@id='invoiceduedate_datepicker']");
    	    public By SubmitLoanApplication		=By.xpath("//button[contains(text(),'Save')]");
    	    public By FacilityApproval			=By.xpath("//button[contains(text(),'Facility Approval Document Request')]");
    	    public By ChooseFileFacility		=By.xpath("//input[@id='FacilityDocumentfileInput']");
    	    public By SubmitTomarket			=By.xpath("//button[contains(text(),'Submit Document')]");
    	    public By ApproveToMARKET			=By.xpath("//button[contains(text(),'Approve')]");
    	    public By ListToMarketPlace			=By.xpath("//button[contains(text(),'List To Marketplace')]");
    	    public By LoanApplications			=By.xpath("//span[text()='Loan Applications']");
    	    
    	    
    	    public By LoanDocuments	=	By.xpath("//a[contains(text(),'Loan Documents')]");
    	    public By NoOfDocs      =By.xpath("//select[@name='example1_length']");
    	    
//--------------------------------------Funding SME From Admin Portal-------------------------------------------------------
    	    
    	    public By Platform					= By.xpath("//a[text()=' PLATFORM']");
    	    public By AllLiveFacilities			= By.xpath("//*[text()=' Penawaran Pinjaman saat ini']");
    	
	    
	    
	    
	    
	
	
	
}

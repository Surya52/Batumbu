package com.objectRepository;

import org.openqa.selenium.By;

public class ValidusRegisterAsInvester {

	public By validusMainpageLogin = By.xpath("//a[@href='http://doodlebluemobile.com/validus/validusdev/platform/index.php/home/login']");
	public By pinjamnHomepage = By.xpath("//a[contains(text(),'Login')]");
	public By resetPasswordPinajaman = By.xpath("//a[contains(text(),' Atur ulang sekarang.')]");
	public By resetPassword = By.xpath("//a[contains(text(),' Reset now.')]");
	public By resetEmailaddress = By.xpath("//input[@id = 'EMAIL_ID']");
	public By resetPasswordsubmitButton = By.xpath("//button[@type='submit']");
	public By resetpasswordfinal = By.xpath("//input[@id='Password']");
	public By resetConfirmPasswordFinal = By.xpath("//input[@id='ConfirmPassword']");
	public By resetpasswordbuttonfinal = By.xpath("//button[@type='submit']");
	public By username = By.xpath("//input[@id='Email_Id']");
	public By password = By.xpath("//input[@id='Password']");
	public By login = By.xpath("//button[@id='login']");
	
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
 
	
	
	public By ForeignBusiness = By.xpath("//label[@for='inlineRadio2']");
	public By IndonesianLegalEntity = By.xpath("//font[contains(text(),'Indonesian legal entity ')]");
	public By Foreignlegalentities  = By.xpath("//font[contains(text(),'Foreign legal entities ')]");
	public By IndonesianCitizens  = By.xpath("//font[contains(text(),'Indonesian citizens')]");
	public By IndividulaForeigners =By.xpath("//font[contains(text(),'Individual foreigners')]");
	public By InternationInstitution =By.xpath(" //font[contains(text(),'International institution ')]");
	
	
	
	
	
	
	
	
	
	public By companyName = By.xpath("//input[@id='CompanyName']");
	public By companyName2 = By.xpath("(//input[@id='CompanyName'])[2]");
	public By title = By.xpath("//select[@id='Salutation']");
	public By title2 = By.xpath("(//select[@id='Salutation'])[2]");
	public By title3 = By.xpath("(//select[@id='Salutation'])[3]");
	public By title4 = By.xpath("(//select[@id='Salutation'])[4]");
	public By UENNumber = By.xpath("//input[@id='CompanyRegistrationNumber']");
	public By UENNumber2 = By.xpath("(//input[@id='CompanyRegistrationNumber1'][1])");
	
	public By firstName = By.xpath("//input[@id='FirstName']");
	public By firstName2 = By.xpath("(//input[@id='FirstName'])[2]");
	public By firstName3 = By.xpath("(//input[@id='FirstName'])[3]");
	public By firstName4 = By.xpath("(//input[@id='FirstName'])[4]");
	public By companyAddress = By.xpath("//input[@id='CompanyAddress']");
	public By deedofEstb = By.xpath("(//input[@id='DeedOfEstablishment'])[1]");
	public By deedofEstb2 = By.xpath("(//input[@id='DeedOfEstablishment'])[2]");
	public By primaryContactNo = By.xpath("(//input[@id='PrimaryContactNumber'])[1]");
	public By primaryConatctNo2 = By.xpath("(//input[@id='PrimaryContactNumber1'])[1]");
	public By designationInv = By.xpath("(//input[@id='Designation'])[1]");
	public By designationInv2 = By.xpath("(//input[@id='Designation'])[2]");
	public By companyAddress2 = By.xpath("//input[@id='CompanyAddress1']");
	public By Address = By.xpath("(//input[@id='Address'])[1]");
	public By Address4 = By.xpath("(//input[@id='Address'])[2]");
	
	public By middleName = By.xpath("//input[@id='MiddleName']");
	public By middleName2 = By.xpath("(//input[@id='MiddleName'])[2]");
	public By middleName3 = By.xpath("(//input[@id='MiddleName'])[3]");
	public By middleName4 = By.xpath("(//input[@id='MiddleName'])[4]");
    public By lastName = By.xpath("//input[@id='FamilyName']");
    public By lastName2 = By.xpath("(//input[@id='FamilyName'])[2]");
    public By lastName3 = By.xpath("(//input[@id='FamilyName'])[3]");
    public By lastName4 = By.xpath("(//input[@id='FamilyName'])[4]");
    public By postalCode = By.xpath("//input[@id='CompanyZipCode']");
    public By postalCode2 = By.xpath("//input[@id='CompanyZipCode1']");
    public By postalCode3 = By.xpath("(//input[@id='PostalCode'])[1]");
    public By postalCode4 = By.xpath("(//input[@id='PostalCode'])[2]");
    
    public By NRICPassportNumber = By.xpath("//input[@id='NRICNumber']");
    public By NRICPassportNumber2 = By.xpath("(//input[@id='NRICNumber'])[2]");
    public By NRICPassportNumber3 = By.xpath("(//input[@id='NRICNumber'])[3]");
    public By NRICPassportNumber4 = By.xpath("(//input[@id='NRICNumber'])[4]");
    
    public By industryDescription = By.xpath("//input[@id='IndustryDescription1']");
    
    public By SICCCode = By.xpath("//input[@id='SICCCode']");
    public By Nationality = By.xpath("//select[@id='Nationality']");
    public By Nationality2 = By.xpath("(//select[@id='Nationality'])[2]");
    public By Nationality3 = By.xpath("(//select[@id='Nationality'])[3]");
    public By registrationDate = By.xpath("//input[@id='RegistrationDate']");
    public By registrationDate2 = By.xpath("//input[@id='RegistrationDate1']");
    
    
    public By primaryContactNumber = By.xpath("//input[@id='PrimaryContactNumber']");
    public By primaryContactNumber2 = By.xpath("//input[@id='PrimaryContactNumber1']");
    
    public By designation = By.xpath("//input[@id='Designation']");
    public By designation2 = By.xpath("(//input[@id='Designation'])[2]");
    public By NRICPassportFront1 = By.xpath("//*[@id='Singapore']/div[3]/div/div[1]/div/div/button");
    public By NRICPassportFront2 = By.xpath("//*[@id='Foreign']/div[4]/div/div[1]/div/div/button");
    public By NRICPassportFront3 = By.xpath("//*[@id='Individual']/div[3]/div/div[1]/div/div/button");
    public By NRICPassportFront4 = By.xpath("//*[@id='Experienced']/div[3]/div/div[1]/div/div/button");
  
  
    public By NRICPassportBack = By.xpath("//*[@id='Singapore']/div[3]/div/div[2]/div/div/button");
    public By NRICPassportBack2 = By.xpath("//*[@id='Foreign']/div[4]/div/div[2]/div/div/button");
    public By NRICPassportBack3 = By.xpath("//*[@id='Individual']/div[3]/div/div[2]/div/div/button");
    public By NRICPassportBack4 = By.xpath("//*[@id='Experienced']/div[3]/div/div[2]/div/div/button");
  
    public By certificateofIncorporation = By.xpath("//*[@id='Foreign']/div[4]/div/div[3]/div/div/button");
  
    public By proofofResidence = By.xpath("//*[@id='Singapore']/div[3]/div/div[3]/div/div/button");
    public By proofofResidence2	 = By.xpath("//*[@id='Foreign']/div[4]/div/div[5]/div/div/button");
    public By proofofResidence3	 = By.xpath("//*[@id='Individual']/div[3]/div/div[3]/div/div/button");
    public By proofofResidence4	 = By.xpath("//*[@id='Experienced']/div[3]/div/div[3]/div/div/button");
    public By STWCMand = By.xpath("//*[@id='WSBorrowerUploaddoc']/div/div/div/div[1]/div[4]/div/div/button");
 
 
    public By memoandArticles = By.xpath("//*[@id='Singapore']/div[3]/div/div[4]/div/div/button");
    public By memoandArticles2 = By.xpath("//*[@id='Foreign']/div[4]/div/div[4]/div/div/button");
 
    public By acraBizfile = By.xpath("//*[@id='Singapore']/div[3]/div/div[5]/div/div/button");
    public By optionalFile = By.xpath("//*[@id='Singapore']/div[3]/div/div[6]/div/div/button");
    public By optionalFile2 = By.xpath("//*[@id='Foreign']/div[4]/div/div[6]/div/div/button");
    public By optionalFile3 = By.xpath("//*[@id='Individual']/div[3]/div/div[4]/div/div/button");
    public By optionalFile4 = By.xpath("//*[@id='Experienced']/div[3]/div/div[4]/div/div/button");
  
  
    public By agree = By.xpath("//label[@for='agree10']");
    public By agree2 = By.xpath("//label[@for='agree1']");
    public By agree3 = By.xpath("//label[@for='agree9']");
    public By agree4 = By.xpath("//label[@for='agree4']");
    public By acknowledge = By.xpath("//label[@for='agree11']");
    public By acknowledge2 = By.xpath("//label[@for='agree2']");
    public By acknowledge3 = By.xpath("//label[@for='agree7']");
    public By acknowledge4 = By.xpath("//label[@for='agree5']");
    public By termsandCondition = By.xpath("//label[@for='agree12']");
    public By termsandCondition2 = By.xpath("//label[@for='agree3']");
    public By termsandCondition3 = By.xpath("//label[@for='agree8']");
    public By termsandCondition4 = By.xpath("//label[@for='agree6']");
    public By registerUs = By.xpath("//label[@for='agree_13']");
    public By registerUs2 = By.xpath("//label[@for='agree_7']");
    public By registerUs3 = By.xpath("//label[@for='agree_9']");
    public By registerUs4 = By.xpath("//label[@for='agree_14']");
    public By save = By.xpath("//button[@id='save']");
    public By submit = By.xpath("//button[@id='submit']");
    public By submit2 = By.xpath("//button[@id='submit2']");
    public By submit3 = By.xpath("//button[@id='submit3']");
    public By submit4 = By.xpath("//button[@id='submit4']");
    public By smeMessage = By.xpath("//h2[@class='heading-tQ']");
    public By applicationreviewmessage = By.xpath("//h3[@class='profile-ban-txt']");
	public By successmsg = By.xpath("/html/body/div[9]/div[2]/div[1]/h3");
	
	
	/****************************SME**********************/
	
	public By entityType = By.xpath("//select[@id='CompanyEntityType']");
	public By companySector = By.xpath("//select[@id='CompanySector']");
	public By SMECompanyAddress = By.xpath("//textarea[@id='CompanyAddress']");
	public By district = By.xpath("//input[@id='districts']");
	public By countyTown = By.xpath("//input[@id='countyTown']");
	public By provinvce =  By.xpath("//input[@id='Province']");
	public By SMECompanyPostalCode = By.xpath("//input[@id='CompanyPostalCode']");
	public By SMEDesignation = By.xpath("//input[@id='CompanyDesignation']");
	public By aboutValidus = By.xpath("//select[@id='WhereDidYouHearAboutValidus']");
	
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
	
	public By NRICfrontBack = By.xpath("//*[@id='WSBorrowerApplicationDetails']/div/div[1]/div/div/button");
	public By passportSME = By.xpath("//*[@id='WSBorrowerApplicationDetails']/div/div[2]/div/div/button");
	public By ACRAbizfileSME = By.xpath("//*[@id='WSBorrowerApplicationDetails']/div/div[2]/div/div/button");
	public By MemorandumfileSME = By.xpath("//*[@id='WSBorrowerApplicationDetails']/div/div[4]/div/div/button");
	public By addressProofSME = By.xpath("//*[@id='WSBorrowerApplicationDetails']/div/div[5]/div/div/button");
	public By optionalfileSME = By.xpath("//*[@id='WSBorrowerApplicationDetails']/div/div[6]/div/div/button");
	public By accountOwner = By.xpath("//input[@id='NameAsPerBank']");
	public By bankName = By.xpath("//input[@id='BankName']");
	public By accountNumber = By.xpath("//input[@id='BankAccountNumber']");
	public By branchCode = By.xpath("//input[@id='BranchCode']");
	public By next = By.xpath("//button[@id='submit']");
	
	
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
    
    
	//**********************************
	
    public By salesSearch =By.xpath("//input[@id='phSearchInput']");
    public By SAlesSearchButton	=By.xpath("//input[@id='phSearchButton']");
    
	public By paymentMode = By.xpath("//input[@tabindex='3']");
    public By investorFundTransaction = By.xpath("(//span[contains(text(),'Investor Fund Transaction')])[1]");
    public By newFundTransaction = By.xpath("//td[@class='pbButton']/following::input[@title='New Investor Fund Transaction']");
    public By Amounttransaction = By.xpath("//input[@tabindex='4']");
    public By insuredLoanAmount = By.xpath("(//input[@type='checkbox'])[4]");
    public By savefund = By.xpath("(//input[@name='save'])[1]");
    public By fundsavailable = By.xpath("//div[@title='Available Funds for Investing']");
     
	
	
	
	//*************************INVOICE FINANCING****************************//
	
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
	
	
	public By cbsFileforAllDirectors = By.xpath("//*[@id='savenewallproducts']/div[1]/div[14]/div/div/div/div[1]/div[3]/div/div/button");
	public By fileCbsSME = By.xpath("//*[@id=\"savenewallproducts\"]/div[1]/div[14]/div/div/div/div[1]/div[3]/div/div/button");
	public By cbsfileforallpersonalguarantor = By.xpath("//*[@id='savenewallproducts']/div[1]/div[14]/div/div/div/div[1]/div[4]/div/div/button");
	public By bankstatementforlast6months = By.xpath("//*[@id='savenewallproducts']/div[1]/div[14]/div/div/div/div[1]/div[5]/div/div/button");
	public By fivefileupload = By.xpath("//*[@id=\"savenewallproducts\"]/div[1]/div[14]/div/div/div/div[1]/div[6]/div/div/button");
	public By sixfileUpload = By.xpath("//*[@id=\"savenewallproducts\"]/div[1]/div[14]/div/div/div/div[1]/div[7]/div/div/button");
	public By sevenfileUpload = By.xpath("//*[@id=\"savenewallproducts\"]/div[1]/div[14]/div/div/div/div[1]/div[8]/div/div/button");
	public By eightFileUpload = By.xpath("//*[@id=\"savenewallproducts\"]/div[1]/div[14]/div/div/div/div[1]/div[9]/div/div/button");
	public By nineFileUpload = By.xpath("//*[@id=\"savenewallproducts\"]/div[1]/div[14]/div/div/div/div[1]/div[10]/div/div/button");
	public By tenFileUplaod = By.xpath("//*[@id=\"savenewallproducts\"]/div[1]/div[14]/div/div/div/div[3]/div/div/button");
	public By elevenFileUpload = By.xpath("//*[@id=\"savenewallproducts\"]/div[1]/div[14]/div/div/div/div[4]/div/div/button");
	public By incometaxassessment = By.xpath("//*[@id='savenewallproducts']/div[1]/div[14]/div/div/div/div[1]/div[7]/div/div/button");
	public By incometaxassessmentdirectors = By.xpath("//*[@id=\"savenewallproducts\"]/div[1]/div[14]/div/div/div/div[1]/div[8]/div/div/button");
	public By incometaxassessmentpersonalGuarantors = By.xpath("//*[@id=\"savenewallproducts\"]/div[1]/div[14]/div/div/div/div[1]/div[9]/div/div/button");
	public By accountreceivablelast12months = By.xpath("//*[@id=\"savenewallproducts\"]/div[1]/div[14]/div/div/div/div[1]/div[10]/div/div/button");
	public By lastFinancialstatements = By.xpath("//*[@id=\"savenewallproducts\"]/div[1]/div[14]/div/div/div/div[3]/div/div/button");
	public By yeartodatemanagement = By.xpath("//*[@id=\"savenewallproducts\"]/div[1]/div[14]/div/div/div/div[4]/div/div/button");
	public By optionalfilesSME1 = By.xpath("//*[@id='savenewallproducts']/div[1]/div[14]/div/div/div/div[3]/div/div/button");
	public By certifiedtrueExtracts = By.xpath("//*[@id='savenewallproducts']/div[1]/div[14]/div/div/div/div[4]/div/div/button");
	public By confirmAccountprofile = By.xpath("//label[@for='agree1']");
	public By agreetobond = By.xpath("//label[@for='agree2']");
	public By disclosureinformation = By.xpath("//label[@for='agree3']");
	public By righttorejectafamily = By.xpath("//*[@id='savenewallproducts']/div[2]/div/ul/li[4]/label/span");
	public By accuracyandAuthentication = By.xpath("//*[@id=\"savenewallproducts\"]/div[2]/div/ul/li[5]/label/span");
	public By confirmthestatements = By.xpath("//*[@id='savenewallproducts']/div[2]/div/ul/li[6]/label/span");
	public By productSubmit = By.xpath("//button[@id='submit']");
	
	
	
	//*********************Invoice Financing(Corporate Vendor Financing)**********************//
	
	public By invoicefinancingcvf = By.xpath("//label[@for='LoanProductType3']");
	public By corporate = By.xpath("//select[@id='allpartnerslist']");
	public By requestamount = By.xpath("//input[@id='expectedcreditlimit']");
	public By tenureRequired2 = By.xpath("//select[@id='cvd_loan_tenure']");
	public By last1yearfinancialStatements = By.xpath("//*[@id='savenewallproducts']/div[1]/div[2]/div[3]/div/div/div/div[1]/div/div/button");
	public By sixMonthsbankstatement = By.xpath("//*[@id='savenewallproducts']/div[1]/div[2]/div[3]/div/div/div/div[2]/div/div/button");
	public By CBSforalldirectors = By.xpath("//*[@id='savenewallproducts']/div[1]/div[2]/div[3]/div/div/div/div[3]/div/div/button");
	public By noticeofAssesments = By.xpath("//*[@id='savenewallproducts']/div[1]/div[2]/div[3]/div/div/div/div[4]/div/div/button");
	public By sixmonthsaccounts = By.xpath("//*[@id='savenewallproducts']/div[1]/div[2]/div[3]/div/div/div/div[5]/div/div/button");
	public By boardofDirectors = By.xpath("//*[@id='savenewallproducts']/div[1]/div[2]/div[3]/div/div/div/div[6]/div/div/button");
	public By annualtaxableIncomepreviousyear = By.xpath("//input[@id='TaxIncomePreviousYearPG1']");
	public By annualtaxableIncomelatestyear = By.xpath("//input[@id='TaxIncomeCurrentYearPG1']");
	
	
	//******************************Working Capital Financing**************************************//
	
	public By workingcapitalFinancing = By.xpath("//label[@for='LoanProductType2']");
	public By cbsfileforalldirectors3 = By.xpath("//*[@id='savenewallproducts']/div[1]/div[14]/div/div/div/div[1]/div[2]/div/div/button");
	public By cbsfileforallpersonalguarantor3 = By.xpath("//*[@id='savenewallproducts']/div[1]/div[14]/div/div/div/div[1]/div[3]/div/div/button");
	public By bankstatementforlast6months3 = By.xpath("//*[@id='savenewallproducts']/div[1]/div[14]/div/div/div/div[1]/div[4]/div/div/button");
	public By incometaxassessment3 = By.xpath("//*[@id='savenewallproducts']/div[1]/div[14]/div/div/div/div[1]/div[5]/div/div/button");
	public By incometaxassessmentdirectors3 = By.xpath("//*[@id='savenewallproducts']/div[1]/div[14]/div/div/div/div[1]/div[6]/div/div/button");
	public By incometaxassessmentpersonalGuarantors3 = By.xpath("//*[@id='savenewallproducts']/div[1]/div[14]/div/div/div/div[1]/div[7]/div/div/button");
	public By accountreceivablelast12months3 = By.xpath("//*[@id='savenewallproducts']/div[1]/div[14]/div/div/div/div[1]/div[8]/div/div/button");
	public By lastFinancialstatements3 = By.xpath("//*[@id='savenewallproducts']/div[1]/div[14]/div/div/div/div[1]/div[9]/div/div/button");
	public By yeartodatemanagement3 = By.xpath("//*[@id='savenewallproducts']/div[1]/div[14]/div/div/div/div[1]/div[10]/div/div/button");
	public By optionalfilesSME3 = By.xpath("//*[@id='savenewallproducts']/div[1]/div[14]/div/div/div/div[3]/div/div/button");
	public By certifiedtrueExtracts3 = By.xpath("//*[@id='savenewallproducts']/div[1]/div[14]/div/div/div/div[4]/div/div/button");
	
	
	//*********************************Working Capital Financing(SIngle Payment)*************************//
	
	public By workingcapitalFinancingsinglepayment = By.xpath("//label[@for='LoanProductType4']");
	public By workContractDocument = By.xpath("//*[@id='purchaseorderdocument']/div[1]/div/div/button");
	public By workProgress = By.xpath("//*[@id='purchaseorderdocument']/div[2]/div/div/button");
	
	
	//******************************Invoice financing(Card Facility)**************************************//
	
	public By invoiceFinancingCardFacility = By.xpath("//label[@for='LoanProductType5']");
	public By invoiceDebtor = By.xpath("//*[@id='savenewallproducts']/div[1]/div[14]/div/div/div/div[2]/div/div/button");
	public By optionalfilesSME4 = By.xpath("//*[@id='savenewallproducts']/div[1]/div[14]/div/div/div/div[3]/div/div/button");
	public By certifiedtrueExtracts4 = By.xpath("//*[@id='savenewallproducts']/div[1]/div[14]/div/div/div/div[4]/div/div/button");
	
	
	
	//******************************************Investor Status***********************************************//
	
	public By investorstatus = By.xpath("//h3[@class='profile-ban-txt']");
	public By logout = By.xpath("//a[contains(text(),'Logout')]");
	public By platform = By.xpath("//a[@id='tog-menu-a']"); 
	public By bank = By.xpath("//a[contains(text(),'Bank')]");
	public By edit = By.xpath("//button[@id='Edit']");
	public By AccountOwner = By.xpath("//input[@id='NameAsPerBank']");
	public By BankName = By.xpath("//input[@id='BankName']");
	public By AccountNumber = By.xpath("//input[@id='BankAccountNumber']");
	public By submitbank = By.xpath("//button[@id='Bankdetailssubmitbutton']");
	public By allLivefacilities = By.xpath("//a[@href='http://batumbu.com/pinjaman_bahasa_enkripsi/platform/index.php/investor/all_live_facilities']");
	public By availableFunds = By.xpath("//div[@class='availableFunds']"); 
	public By BranchCode = By.xpath("//input[@id='BranchCode']");
}

 
package com.objectRepository;

import org.openqa.selenium.By;

public class ValidusSmoke_Loc {

	
	
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

	     public By  checkbox1 =By.xpath("//a[contains(text(),'Syarat dan Ketentuan Pembiayaan Fasilitas')]");
	     public By checkbox2 =By.xpath("//input[@class='Secondcheckbox']");
	public By checksubmit =By.xpath("//button[contains(text(),'Setuju')]");
	public By captcha =By.xpath("//div[@class='recaptcha-checkbox-checkmark']");
	public By KIRIM= By.xpath("//button[contains(text(),'KIRIM')]");
	public By ForeignBusiness=By.xpath("//label[contains(text(),'Badan usaha asing')]");
	
	public By FBcompanyName2 = By.xpath("(//input[@id='CompanyName'])[2]");
	public By FBtitle2 = By.xpath("(//select[@id='Salutation'])[2]");
	public By FBUENNumber2 = By.xpath("(//input[@id='CompanyRegistrationNumber1'][1])");
	public By FbfirstName2 = By.xpath("(//input[@id='FirstName'])[2]");
	public By FBMiddleName = By.xpath("(//input[@id='MiddleName'])[2]");
	public By FBlastname = By.xpath("(//input[@id='FamilyName'])[2]");
	public By FbcompanyAddress2 = By.xpath("//input[@id='CompanyAddress1']");
	public By FbDateooDeed= By.xpath("(//input[@class='DeedOfEstablishment'])[2]");
	 public By FbindustryDescription = By.xpath("//input[@id='IndustryDescription1']");
	 public By FbpostalCode2 = By.xpath("//input[@id='CompanyZipCode1']");
	  public By FbNRICPassportNumber2 = By.xpath("(//input[@id='NRICNumber'])[2]");
	  public By FbNationality2 = By.xpath("(//select[@id='Nationality'])[2]");
	  public By FbprimaryConatctNo2 = By.xpath("(//input[@id='PrimaryContactNumber1'])[1]");
	  public By FbdesignationInv2 = By.xpath("(//input[@id='Designation'])[2]");
	  public By FbSICCCode = By.xpath("(//select[@id='SICCCode'])[2]");
	  public By FbNetworthprevious =By.xpath("(//input[@name='net_worth_previous_year'])[2]");
	  public By FbNetwothCurrentyear =By.xpath("(//input[@name='net_worth_current_year'])[2]");
	  public By FbSource =By.xpath("//select[@id='secondsource']");
	  
	  public By FbAddMangement =By.xpath("(//select[@id='no_of_directors'])[2]");  
	  public By FbManagementName =By.xpath("(//input[@name='managementName[]'])[2]");
	  public By FBDeptMangement =By.xpath("(//input[@name='director_position[]'])[2]");
	  public By FBServeSinceDate =By.xpath("(//input[@class='director_servingSince'])[2]");
	  public By FbMangementPassport =By.xpath("(//input[@name='director_passport_no[]'])[2]");
	  public By DirectorCitizenship1 =By.xpath("(//input[@name='director_citizenship[]'])[2]");
	  public By FBManagementCitizenship =By.xpath("(//input[@name='shareholder_citizenship[]'])[2]");
	  public By FbMangementContact =By.xpath("(//input[@name='director_contact_no[]'])[2]");
	  public By FBNO_Of_Shareholders= By.xpath("(//select[@id='no_of_shareholders'])[2]");
	
	  public By FbShareholderName =By.xpath("(//input[@name='shareholderName[]'])[2]");
	  public By FBShareholderPercentage  =By.xpath("(//input[@name='shareholder_ownership[]'])[2]");
	  public By FbShareholderPassport =By.xpath("(//input[@name='shareholder_passport_no[]'])[2]");
	  public By FbShareholderCitizenShip =By.xpath("(//input[@name='shareholder_citizenship[]'])[2]");
	  public By FbSharecontact =By.xpath("(//input[@name='shareholder_contact_no[]'])[2]");
	
	  public By Upload1 =By.xpath("(//button[contains(text(),'Pilih file')])[6]");
	  public By Upload2 =By.xpath("(//button[contains(text(),'Pilih file')])[7]");
	  public By Upload3 =By.xpath("(//button[contains(text(),'Pilih file')])[8]");
	  public By Upload4 =By.xpath("(//button[contains(text(),'Pilih file')])[9]");
	  public By Upload5 =By.xpath("(//button[contains(text(),'Pilih file')])[10]");
	  public By Upload6 =By.xpath("(//button[contains(text(),'Pilih file')])[11]");
	  
	  public By Agree1  =By.xpath("//label[@for='agree20']");
	  public By Agree2  =By.xpath("//label[@for='agree21']");
	  public By Agree3  =By.xpath("//label[@for='agree22']");
	  public By Agree4  =By.xpath("//label[@for='agree23']");
	  public By Agree5  =By.xpath("//label[@for='Esignagree2']");
	  public By Agree6  =By.xpath("//label[@for='agree24']");
	  
	  public By FBSubmit =By.xpath("(//button[contains(text(),'Kirim')])[position()=2]");
	
	 public By otpscreenInvestor = By.xpath("//input[@id='otpEntered']");
    public By otpContinue = By.xpath("//a[@class='continue-register']");
    public By otpResend = By.id("resendOTP");
    public By otpConfirmationMessage = By.xpath("//h2[@class='heading-tQ']");
    public By emailConfirmationMessage = By.xpath("//a[contains(text(),'login into validus')]");
    public By logOut = By.xpath("//a[contains(text(),'Logout')]");
    public By details = By.xpath("//h3[@class='profile-ban-txt']");
    public By bank = By.xpath("//a[contains(text(),'Bank')]");
    public By accountHolderName= By.xpath("//input[@id='NameAsPerBank']");
    public By bankName = By.xpath("//input[@id='BankName']");
    public By accountName = By.xpath("//input[@id='BankAccountNumber']");
    public By branchCode = By.xpath("//input[@id='BranchCode']");	
    public By edit = By.xpath("//button[@id='Edit']");
    public By save = By.xpath("//button[@id='Save']");
    public By platform = By.xpath("//a[contains(text(),'PLATFORM')]");
    public By allLivefacilities = By.xpath("//a[contains(text(),' All Live Facilities')]");
    public By availableFunds = By.xpath("//div[@class='availableFunds']");
    
    public By otpMessage = By.xpath("//input[@id='ip_otp']");
    public By otpSubmit = By.xpath("//button[@type='submit']");
    public By emailId = By.xpath("//input[@id='identifierId']");
    public By emailNext = By.xpath("//span[contains(text(),'Next')]");
    public By gmailPassword = By.xpath("//input[@name='password']");
    public By gmailSearch=By.xpath("//input[@aria-label='Search mail']");
    public By gmailSearchButton = By.xpath("//button[@aria-label='Search Mail']");
    public By gmailMail = By.xpath("(//span[text()='Sandbox: Verify your identity in Salesforce'])[4]");
    public By gmailDelete = By.xpath("//div[@class='T-I J-J5-Ji nX T-I-ax7 T-I-Js-Gs  W6eDmd']");
	public By saisaUsername = By.xpath("//input[@id='ctl00_MPH_txtUserName']");
	public By saisaPassword = By.xpath("//input[@id='ctl00_MPH_txtPassword']");
    public By mailLogin = By.xpath("//a[@id='btnLogin']");
    public By lastButton = By.xpath("//img[@class='last']");
    
    
    public By loginVikasNahata = By.xpath("//input[@title='Login']");
    public By secondSearch = By.xpath("//input[@id='secondSearchButton']");
    public By investorSearch = By.xpath("//input[@id='phSearchInput']");
    public By investorSearchButton = By.xpath("//input[@id='phSearchButton']");
    public By UnregisteredUser = By.xpath("//a[contains(text(),'Unregistered Users')]");
    public By FirstApplication = By.xpath("(//th[@class=' dataCell  '])[1]");
    public By  UnRegisterText =By.xpath("//table[@class='list']");
    public By Mailverification = By.xpath("//div[@id='00NN00000039a62_ileinner']");
    public By otpinvestor = By.xpath("//input[@id='otpEntered']");
    public By continueInvestor = By.xpath("//a[@value='Submit']");
    
    
    public By salesforceApplications = By.xpath("//div[@id='genesis__Applications__c']");
    public By recordlist = By.xpath("//table[@class='list']");
    public By promissoryNote = By.xpath("//input[@id='j_id0:j_id119:j_id120:j_id121:j_id122:j_id138:j_id139:j_id140']");
    public By promissoryNoteUpload = By.xpath("//input[@id='j_id0:j_id119:j_id120:j_id121:j_id122:j_id138:j_id139:upldbtn1']");
    public By acra_Biz_file = By.xpath("//input[@id='j_id0:wizId:j_id4:j_id113:j_id114:j_id116:j_id117']");
  
//-------------------------------------------------------------------------------    		

}

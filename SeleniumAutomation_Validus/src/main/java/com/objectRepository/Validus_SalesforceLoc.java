package com.objectRepository;

import org.openqa.selenium.By;

public class Validus_SalesforceLoc {

	
	public By ApplicationList =By.xpath("//table[@class='list']");
	public By Applications =By.xpath("//a[@title='Applications Tab']");
	public By ApplicationNumber =By.xpath("(//th[@class=' dataCell  '])[2]");
	public By ApproveApplication=By.xpath("//a[text()=' Approve Applications']");
	public By Upload =By.xpath("//input[@value='Upload']");
	public By ChoooseFile =By.xpath("//input[@id='j_id0:wizId:j_id3:j_id59:j_id60:j_id61:j_id62']");
	public By Approve =By.xpath("//input[@value='Approve']");
	
	
	public By username = By.xpath("//input[@id='username']");
	public By password = By.xpath("//input[@id='password']");
	public By login = By.xpath("//input[@id='Login']");
	 public By Saleslogin = By.xpath("//input[@value='Log In to Sandbox']");

	public By unregisteredUsers = By.xpath("//a[contains(text(),'Unregistered Users')]");
    public By go = By.xpath("//input[@name='go']");
    
    public By signIN = By.xpath("//a[contains(text(),'Sign In')]");
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
    
    public By otpinvestor = By.xpath("//input[@id='otpEntered']");
    public By continueInvestor = By.xpath("//a[@value='Submit']");
    
    public By home = By.xpath("//a[@title='Home Tab']");
    public By searchText = By.xpath("//input[@title='Search...']");
    
    public By searchButton = By.xpath("//input[@id='phSearchButton']");
    public By vikasNahata = By.xpath("//a[contains(text(),'Vikas Nahata')]");
    public By dropDown = By.xpath("//a[@id='moderatorMutton']");
    public By userDetails = By.xpath("//a[@id='USER_DETAIL']");
    public By loginVikasNahata = By.xpath("//input[@title='Login']");
    public By secondSearch = By.xpath("//input[@id='secondSearchButton']");
    public By investorSearch = By.xpath("//input[@id='phSearchInput']");
    public By investorSearchButton = By.xpath("//input[@id='phSearchButton']");
    public By UnregisteredUser = By.xpath("//a[contains(text(),'Unregistered Users')]");
    public By FirstApplication = By.xpath("(//th[@class=' dataCell  '])[1]");
    public By  UnRegisterText =By.xpath("//table[@class='list']");
    public By Mailverification = By.xpath("//div[@id='00NN00000039a62_ileinner']");
    
    
    public By salesforceApplications = By.xpath("//div[@id='genesis__Applications__c']");
    public By recordlist = By.xpath("//table[@class='list']");
    public By promissoryNote = By.xpath("//input[@id='j_id0:j_id119:j_id120:j_id121:j_id122:j_id138:j_id139:j_id140']");
    public By promissoryNoteUpload = By.xpath("//input[@id='j_id0:j_id119:j_id120:j_id121:j_id122:j_id138:j_id139:upldbtn1']");
    public By acra_Biz_file = By.xpath("//input[@id='j_id0:wizId:j_id4:j_id113:j_id114:j_id116:j_id117']");
    public By acra_Biz_fileUpload = By.xpath("//input[@id='j_id0:wizId:j_id4:j_id113:j_id114:j_id116:upldbtn1']");
    public By financialDocuments = By.xpath("//input[@id='j_id0:wizId:j_id4:j_id113:j_id127:j_id129:j_id130']");
    public By financialDocumentsUpload = By.xpath("//input[@id='j_id0:wizId:j_id4:j_id113:j_id127:j_id129:upldbtn2']");
    public By paymentRating = By.xpath("//input[@id='j_id0:wizId:j_id4:j_id113:j_id140:j_id142:j_id143']");
    public By paymentRatingUpload = By.xpath("//input[@id='j_id0:wizId:j_id4:j_id113:j_id140:j_id142:upldbtn3']");
    public By noticeRedirect = By.xpath("//input[@id='j_id0:wizId:j_id4:j_id113:j_id153:j_id155:j_id156']");
    public By noticeRedirectUpload = By.xpath("//input[@id='j_id0:wizId:j_id4:j_id113:j_id153:j_id155:upldbtn5']");
    public By securityDeed = By.xpath("//input[@id='j_id0:wizId:j_id4:j_id113:j_id166:j_id168:j_id169']");
    public By securityDeedUpload = By.xpath("//input[@id='j_id0:wizId:j_id4:j_id113:j_id166:j_id168:upldbtn6']");
    public By facilityRequest = By.xpath("//input[@id='j_id0:wizId:j_id4:j_id199:j_id226:j_id227:0:j_id233']");
    public By facilityRequesttoInvestors = By.xpath("//input[@name='j_id0:wizId:j_id4:j_id199:j_id215']");
    
    public By applications = By.xpath("//a[@class='brandPrimaryFgr']");
    public By application = By.xpath("//a[@title='Applications Tab']");
    public By listApplication = By.xpath("//div[@class='listRelatedObject Custom27Block']");
    public By investorDocument = By.xpath("//a[contains(text(),'Investor Documents')]");
    public By investorapplication = By.xpath("(//span[contains(text(),'2')])[4]");
    public By Investordocument = By.xpath("(//span[@class='label'])[2]");
    public By approveApplications = By.xpath("(//span[contains(text(),'4')])[2]");
  //  public By approveApplications = By.xpath("//*[@id='j_id0:wizId:j_id3']/div[1]/div[4]/a");
    public By chooseFile = By.xpath("//input[@name='j_id0:wizId:j_id3:j_id59:j_id60:j_id61:j_id62:inputFile:file']");
    public By file = By.xpath("//input[@name='j_id0:wizId:j_id3:j_id59:j_id60:j_id61:upldbtn1']");
    public By approveInvestor = By.xpath("//input[@id='j_id0:wizId:j_id3:j_id72:approveBtn']");
    public By rejectInvestor = By.xpath("//input[@name='j_id0:wizId:j_id3:j_id72:rejectBtn']");
    public By statusInvestor = By.xpath("//span[@style='text-align:center']");
 
    public By choosefile = By.xpath("//input[@id='j_id0:wizId:j_id3:j_id59:j_id60:j_id61:j_id62']");
    public By logout = By.xpath("//a[@href='http://batumbu.com/pinjaman_bahasa_enkripsi/platform/index.php/home/logout']");
    public By account = By.xpath("(//a[contains(text(),'Accounts')])");
    public By paymentMode = By.xpath("//input[@tabindex='3']");
    public By investorFundTransaction = By.xpath("(//span[contains(text(),'Investor Fund Transaction')])[1]");
    public By newFundTransaction = By.xpath("(//td[@class='pbButton'])[5]");
    public By transactionAmount = By.xpath("//input[@tabindex='4']");
    public By insuredLoanAmount = By.xpath("//input[@id='00N0K00000JEILD']");
    public By savefund = By.xpath("(//input[@name='save'])[1]");
    public By fundsavailable = By.xpath("//div[@title='Funds available for investing']");
}


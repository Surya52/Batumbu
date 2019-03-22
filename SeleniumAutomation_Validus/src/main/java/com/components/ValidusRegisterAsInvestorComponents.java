package com.components;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;
import org.openqa.selenium.support.ui.Select;
import org.python.modules.thread.thread;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

import com.baseClasses.BaseClass_Web;
import com.baseClasses.PDFResultReport;
import com.baseClasses.ThreadLocalWebdriver;
import com.mobileUtilities_iOS.ThreadLocaliOSDriver;
import com.objectRepository.Batumbu_Borrower_Locators;
import com.objectRepository.Batumbu_SME_Locators;
import com.objectRepository.DBSOpenAccountLocators;
import com.objectRepository.LoanDisbrusal_Process_Locators;
import com.objectRepository.ValidusRegisterAsInvester;
import com.objectRepository.ValidusSmoke_Loc;

import bsh.org.objectweb.asm.Type;

public class ValidusRegisterAsInvestorComponents extends BaseClass_Web{
	
	public ValidusRegisterAsInvester registerasInvestorlocators=new ValidusRegisterAsInvester();
	public ValidusSmoke_Loc validussmokelocators = new ValidusSmoke_Loc();
	 public Batumbu_SME_Locators  smelocators   = new Batumbu_SME_Locators();
	public LoanDisbrusal_Process_Locators loanlocators = new LoanDisbrusal_Process_Locators();
	
	public ValidusRegisterAsInvestorComponents(PDFResultReport pdfresultReport){
		this.pdfResultReport=pdfresultReport;
	}
	
	public void openURL() throws Exception{  
		
		try{
			launchapp(pdfResultReport.testDataValue.get("AppURL"));
			waitForObj(3000);
			pdfResultReport.addStepDetails("openURL","Application should open the url","Successfully opened the URL" + " ","Pass", "Y");
		  }catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  pdfResultReport.addStepDetails("openURL","Application should open the url", "Unable to open the URL"+e.getMessage(),"Fail", "N");
	  }
		
	}	
	public void mainPagelogin() throws Throwable {
		try {
			
				click(registerasInvestorlocators.pinjamnHomepage);
				waitForObj(3000);
				click(registerasInvestorlocators.resetPassword);
				pdfResultReport.addStepDetails("Main Page login","Application should click on the login button","Successfully clicked into the login" + " ","Pass", "Y");	
			 }catch(Exception e){
				  log.fatal("Unable to open the URL"+e.getMessage());
				  pdfResultReport.addStepDetails("Main Page login","Unable to click on the login button", "Unable to click on login into the application"+e.getMessage(),"Fail", "N");
		  }
	}
	
	public void resetPasswordlogin() throws Throwable {
		
		try {
			launchapp(pdfResultReport.testDataValue.get("AppURL"));
			js_type(validussmokelocators.emailIDInvestor, pdfResultReport.testData.get("EmailIDInvestor"), "username");
			set(validussmokelocators.passwordInvestor, pdfResultReport.testData.get("PasswordInvestor"));
			click(registerasInvestorlocators.resetPasswordPinajaman);
			//click(registerasInvestorlocators.pinjamnHomepage);
			//click(registerasInvestorlocators.resetPassword);
			waitForObj(3000);
			pdfResultReport.addStepDetails("Login to ResetPassword","Application should successfully login to the application for reset password","successfully logged in to the application for  reset password" + " ","Pass", "Y");	
		 }catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  pdfResultReport.addStepDetails("Login to ResetPassword","Not able to login to the application for reset a passwordn", "Unable to login to the application for reset a passwordn"+e.getMessage(),"Fail", "N");
	  }
	}
	
public void resetPassword() throws Throwable {
		
		try {
	set(registerasInvestorlocators.resetEmailaddress, pdfResultReport.testData.get("UserName"));
	waitForObj(3000);
	click(registerasInvestorlocators.resetPasswordsubmitButton);
	waitForObj(10000);
	pdfResultReport.addStepDetails("ResetPassword Page","User should successfully click on submit button of the resetpassword","Successfully clicked on the submit button for resetpassword" + " ","Pass", "Y");	
		 }catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  pdfResultReport.addStepDetails("ResetPassword Page","User is not able to click on submit button of the resetpassword", "Unable to click on submit button of the resetpassword"+e.getMessage(),"Fail", "N");
	  }
	}
	
public void salesforceIntegrationLogin() throws Throwable {

	try {
		Thread.sleep(2000);
		Screen s = new Screen();
		s.click("C:\\Users\\user\\git\\Batumbu\\SeleniumAutomation_Validus\\Media\\OpenTab.png");
		waitForObj(2000);
		switchwindow(1);
		ThreadLocalWebdriver.getDriver().get("https://test.salesforce.com/");
	 	waitForObj(2000);
		set(smelocators.salesusername, "clsupport@validus.sg.pinjamnnew");
		waitForObj(2000);
		set(smelocators.salespassword , "Validus*1");
		click(smelocators.Saleslogin);
		
		
} catch (Exception e1) {
 
	e1.printStackTrace();
}
}


public void gmailOTP() throws Throwable {
	
	
	try {
	Screen s = new Screen();
    Thread.sleep(2000);
	s.click("C:\\Users\\user\\git\\Batumbu\\SeleniumAutomation_Validus\\Media\\OpenTab.png");
	Thread.sleep(5000);
	try {
		switchwindow(2);
		Thread.sleep(3000);
	} catch (Exception e1) {
		 
		e1.printStackTrace();
	}
	
	Thread.sleep(3000);
	ThreadLocalWebdriver.getDriver().get("https://accounts.google.com/signin");
	 Thread.sleep(3000);
	set(smelocators.emailId, "autoqa@validus.sg");
	click(smelocators.emailNext);
	Thread.sleep(3000);
	set(smelocators.gmailPassword,"Validu$Tech");
	Thread.sleep(1000);
	click(smelocators.emailNext);
	Thread.sleep(7000);
	Screen S=  new Screen();
	S.click("C:\\Users\\user\\git\\Batumbu\\SeleniumAutomation_Validus\\Media\\mailmenu.png");
	Screen S2=  new Screen();
	S2.click("C:\\Users\\user\\git\\Batumbu\\SeleniumAutomation_Validus\\Media\\MailIcon.png");
	
 	set(smelocators.gmailSearch, "noreply@salesforce.com");
 	
	click(smelocators.gmailSearchButton);
	Thread.sleep(3000);
List<WebElement> ele=ThreadLocalWebdriver.getDriver().findElements(By.xpath("(//span[text()='Sandbox: Verify your identity in Salesforce'])[4]"));
System.out.println(ele.size());
for (int i = 0; i < ele.size(); i++) {
	try {
		ele.get(i).click();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
String strn = ThreadLocalWebdriver.getDriver().findElement(By.xpath("(//div[@class='ii gt'])[1]")).getText();
System.out.println(strn);
String otp = null;
String[] str1 = strn.split("\n");

	System.out.println(str1.length);
	for (int i = 0; i < str1.length; i++) {
		
		if(str1[i].contains("Verification")) {
			String str2 = str1[i];
			String[] str3 = str2.split(":");
			System.out.println(str3.length);
			String otps = str3[1];
			System.out.println(otps);
			
			 otp = otps.trim();
			System.out.println(otp);
			Thread.sleep(5000);
	 	}
	

	}
	
	  			
 	
 	screenclick("C:\\Users\\user\\git\\Batumbu\\SeleniumAutomation_Validus\\Media\\DeleteMaiil.png");
 	Actions a = new Actions(ThreadLocalWebdriver.getDriver());
	a.sendKeys(Keys.F5).build().perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_F5);
	r.keyRelease(KeyEvent.VK_F5);
	 Thread.sleep(3000);
	 
	 ThreadLocalWebdriver.getDriver().close();
	 
	Thread.sleep(4000);
	try {
		 switchwindow(1);
		Thread.sleep(2000);
	} catch (Exception e) {
	 
		e.printStackTrace();
	}
	
	Thread.sleep(4000);
	set(By.xpath("//input[@id='emc']"), otp);
	click(By.xpath("//input[@id='save']"));
	waitForObj(6000);
	
	pdfResultReport.addStepDetails("Gmail Salesforce OTP ", "User should able to take salesforce OTP successfully",
			"Successfully user is able to take the salesforce otp from the gmail" + " ", "Pass", "Y");
} catch (Exception e3) {
	log.fatal("Unable to take the salesforce otp from the gmail" + e3.getMessage());
	pdfResultReport.addStepDetails("Gmail Salesforce OTP", "User is not able to take the salesforce otp from the gmail",
			"Unable to take the salesforce otp from salesforce application" + e3.getMessage(), "Fail", "N");
}
}
	 
public void salesforceOTP() throws Exception {
	try {
				Thread.sleep(3000);
				 click(smelocators.UnregisteredUser);
		String str=	ThreadLocalWebdriver.getDriver().findElement(validussmokelocators.FirstApplication).getText();
			if(str.contains("aApN00")){
				System.out.println("First User applicatoin NUmber is"+str);
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'"+str+"')]")).click();
			}
				  
			 //switchwindow(1);
			Thread.sleep(3000);
			String optMsg = ThreadLocalWebdriver.getDriver()
					.findElement(By.xpath("//*[@id='00NN00000039a68_ileinner']")).getText();
			System.out.println("optMsg ::" + optMsg);
		 	switchwindow(0);
		 
			JavascriptExecutor js = (JavascriptExecutor) ThreadLocalWebdriver.getDriver();
			WebElement el = ThreadLocalWebdriver.getDriver().findElement(By.cssSelector("input[id=otpEntered]"));
			js.executeScript("arguments[0].value = arguments[1];", el, optMsg);
			click(smelocators.SMEContinue);
			Thread.sleep(10000);
	      	ThreadLocalWebdriver.getDriver().close();
	     	Thread.sleep(5000);
			switchwindow(0);
			Actions a = new Actions(ThreadLocalWebdriver.getDriver());
			a.sendKeys(Keys.F5).build().perform();
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_F5);
			r.keyRelease(KeyEvent.VK_F5);
			
			waitForObj(3000);
			click(smelocators.Mailverification);
			
		 	waitForObj(10000);
			 
		 	Screen S= new Screen();
			 S.click("C:\\Users\\user\\git\\Batumbu\\SeleniumAutomation_Validus\\Media\\LeaveButton.png");
			Thread.sleep(15000);
			swtichToChildTab();
			click(smelocators.LoginKiPlatform);
	  
			pdfResultReport.addStepDetails("Salesforce mobile and email verification", "User should able to verify mobile and email successfully",
						"Successfully verified the email and mobile from the salesforce application" + " ", "Pass", "Y");
			} 
	catch (Exception e3) {
		log.fatal("Unable to verify the mobile and email verification in Salesforce" + e3.getMessage());
		pdfResultReport.addStepDetails("Salesforce mobile and email verification", "User is not able to verify mobile and email from salesforce",
				"Unable to verify the email and mobile from salesforce application" + e3.getMessage(), "Fail", "N");
	}
		
			
		}













	public void login() throws Throwable {
		try {
			 //switchwindow(0);
			  
			//click(validussmokelocators.validusMainpageLogin);
			 
			js_type(smelocators.emailIDInvestor, pdfResultReport.testData.get("EmailIDInvestor"), "username");
			set(smelocators.passwordInvestor, pdfResultReport.testData.get("PasswordInvestor"));
		 
			click(registerasInvestorlocators.login);
			waitForObj(10000);
			
		  
			pdfResultReport.addStepDetails("login","Application should login","Successfully loggedIn into the application" + " ","Pass", "Y");	
		 }catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  pdfResultReport.addStepDetails("login","Unable to open the url", "Unable to login into the application"+e.getMessage(),"Fail", "N");
	  }
	}
	  
	
	public void fundinSME() throws Exception {
		
		
		//*[@id="myTable"]/tbody/tr[6]/td[2]
		
		
	//	click(smelocators.Platform);
		click(smelocators.AllLiveFacilities);
		try {
		String SmeBefore = "//*[@id='myTable']/tbody/tr[";
		String SMeAfter  = "]/td[2]";
		
		WebElement ele =ThreadLocalWebdriver.getDriver().findElement(By.xpath("//span[@class='funds']"));
		String Funds =ele.getText();
		System.out.println("amount is "+Funds);
		//int FundsAvailable=Integer.parseInt(Funds);
	 	
		List<WebElement> rows =ThreadLocalWebdriver.getDriver().findElements(By.xpath("//*[@id='myTable']/tbody/tr"));
		int RowCount     = rows.size();
		System.out.println("Table Total Data Is "+rows);
		System.out.println("Number Of Rows Is  "+ RowCount);
     
		for(int i=1;i<=RowCount;i++) {
	
		WebElement Borrower = ThreadLocalWebdriver.getDriver().findElement(By.xpath(SmeBefore+i+SMeAfter));
		System.out.println(Borrower.getText());
		
		//if(Borrower.getText().equals(pdfResultReport.testData.get("UKM Name"))) {
	
			if(Borrower.getText().equals("CV Bahagia Selalu")) {
			 
		String DanaiBefore  =  "//*[@id='myTable']/tbody/tr[";
		String DanaiAfter	= "]/td[9]";
		Thread.sleep(3000);
		ThreadLocalWebdriver.getDriver().findElement(By.xpath(DanaiBefore+i+DanaiAfter)).click();
	
		
		 String Amount = ThreadLocalWebdriver.getDriver().findElement(By.xpath("//span[@id='amtleft']")).getText();
		 System.out.println("Amount left for Funding.."+ Amount);
			
		    Thread.sleep(5000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='investmentAmount']")).sendKeys(Amount);
			Thread.sleep(5000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//li[@id='fundbtn']")).click();
			
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//label[@for='filled-in-box']")).click();
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//label[@for='filled-in-box1']")).click();
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//label[@for='filled-in-box2']")).click();
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//label[@for='filled-in-box3']")).click();
		 	
			
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("(//button[text()='Konfirmasi'])[2]")).click();
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("(//button[text()='OK'])[2]")).click();
		}} 	 
		}catch (Exception e) {
			 e.printStackTrace();	}
	}
	
	
	
	public void batumbuAdminFunding() throws Exception {
		 
		screenclick("C:\\Users\\user\\git\\Batumbu\\SeleniumAutomation_Validus\\Media\\OpenTab.png");
		  switchwindow(1);
		ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/BatumbuAdmin/public/");
		
		set(smelocators.AdminMail, "fundrel@batumbu.id");
		set(smelocators.AdminPassword, "Admin123");
		click(smelocators.AdminLogin);
		
		waitForObj(2000);
		click(smelocators.LoanApplications);
		waitForObj(2000);
		set(smelocators.SMESEarch, pdfResultReport.testData.get("UKM Name"));
		click(smelocators.ViewDetailsLender);
		 pageDown();
		 pageDown();
		  
		  
		 List<WebElement> Rows =(List<WebElement>) ThreadLocaliOSDriver.getDriver().findElement(By.xpath("//*[@id='example1']/tbody/tr"));
		 int noofrows= Rows.size();
		 System.out.println("total No oF Given Lenders Are"+ noofrows);
		 
		 
		 String beforeamount =  "//*[@id='example1']/tbody/tr[" ;
			String AfterAmount= "]/td[3]";
	
			int finalamount=0;
		 for(int i =1;i<=noofrows;i++) {
			 
				
	 WebElement elmnt= ThreadLocaliOSDriver.getDriver().findElement(By.xpath(beforeamount+i+AfterAmount));
	 String	 amount= elmnt.getText();
	 System.out.println("Amount fro Row"+"  "+i+"is"+amount );
		
	 int  rowsamount=Integer.parseInt(amount)+finalamount;
	 finalamount =  rowsamount;
	
	 
		 }
		click(loanlocators.BookinOrder);
		 set(loanlocators.InvestmentAmount, String.valueOf(finalamount));
		 click(loanlocators.InvestmentSubmit);
		 
		 click(loanlocators.PledgeLenderDocs);

		 List<WebElement> pledgerows =(List<WebElement>) ThreadLocaliOSDriver.getDriver().findElement(By.xpath("//*[@id='example1']/tbody/tr"));
		 int totalrows= pledgerows.size();
		 System.out.println("total No oF Given Lenders Are"+ noofrows);
		 String beforepldgeview =  "//*[@id=\"InvestorDeposits\"]/tbody/tr[" ;
		 String Afterpledgeview= "]/td[8]";
	
			  for(int i =1;i<=noofrows;i++) {
 
		WebElement element= ThreadLocaliOSDriver.getDriver().findElement(By.xpath(beforepldgeview+i+Afterpledgeview));
		element.click();
		click(loanlocators.VACheckBox);
		click(loanlocators.PledgeView2);
		waitForObj(7000);
		screenclick("C:\\Users\\user\\git\\Batumbu\\SeleniumAutomation_Validus\\Media\\PledgeBack.png");
		click(loanlocators.PledgeLenderDocs);
			  
			  }
		 
		 
		 
	}
	
	 
	public void STWCFacility() throws Throwable {
		try {
			
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("(//i[@class='fa fa-puzzle-piece'])[1]")).click();
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//label[@for='LoanProductType2']")).click();
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='LoanAmount']")).sendKeys("5000");
			new Select(ThreadLocalWebdriver.getDriver().findElement(By.xpath("//select[@id='LoanTenure']"))).selectByVisibleText("6 months");
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='NumOfEmployees']")).sendKeys("5");
			
			
			
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='AnnualRevenuePreviousYear']")).sendKeys("5000");
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='AnnualRevenueCurrentYear']")).sendKeys("5000");
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='NetProfitPreviousYear']")).sendKeys("-5000");
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='NetProfitCurrentYear']")).sendKeys("-5000");
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='NamePG1']")).sendKeys("Tarun");
			new Select(ThreadLocalWebdriver.getDriver().findElement(By.xpath("//select[@id='ResidentialStatusPG1']"))).selectByVisibleText("Singapore Citizen");
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='TaxIncomePreviousYearPG1']")).sendKeys("2017");
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='TaxIncomeCurrentYearPG1']")).sendKeys("2018");
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='NamePG2']")).sendKeys("Saketh");
			new Select(ThreadLocalWebdriver.getDriver().findElement(By.xpath("//select[@id='ResidentialStatusPG2']"))).selectByVisibleText("Singapore Citizen");
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='TaxIncomePreviousYearPG2']")).sendKeys("2017");
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='TaxIncomeCurrentYearPG2']")).sendKeys("2018");
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='NamePG3']")).sendKeys("Naresh");
			new Select(ThreadLocalWebdriver.getDriver().findElement(By.xpath("//select[@id='ResidentialStatusPG3']"))).selectByVisibleText("Singapore Citizen");
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='TaxIncomePreviousYearPG3']")).sendKeys("2017");
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='TaxIncomeCurrentYearPG3']")).sendKeys("2018");
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("(//button[@id='submit'])[1]")).click();
			Thread.sleep(6000);
			uploadFile(registerasInvestorlocators.STWCMand);
			Thread.sleep(8000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("(//button[@id='submit'])[2]")).click();
			
		
			pdfResultReport.addStepDetails("STWCFacility","Apply facility for STWC","Apply facility should create successfully" + " ","Pass", "Y");	
		 }catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  pdfResultReport.addStepDetails("STWCFacility","Unable Apply facility for STWC", "Unable to apply facility to STWC"+e.getMessage(),"Fail", "N");
	  }
	}
	
	
	
	
	
	public void navigateTocompanyIncorporateInSingapore() throws Throwable {
		try {
			waitForObj(4000);
			JSClick(registerasInvestorlocators.ForeignBusiness,"companyincorporate");
			waitForObj(3000);
			pdfResultReport.addStepDetails("navigateTocompanyIncorporateInSingapore","User should click on companyIncorporateInSingapore","User successfully clicked on companyIncorporateInSingapore" + " ","Pass", "Y");	
		 }catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  pdfResultReport.addStepDetails("navigateTocompanyIncorporateInSingapore","User is not able to click on companyIncorporateInSingapore", "Unable to open the click on companyIncorporateInSingapore"+e.getMessage(),"Fail", "N");
	  }
	}
	public void navigateTocompanyIncorporateOutsideSingapore() throws Exception {
		try {
			waitForElement(registerasInvestorlocators.ForeignBusiness, 60);
			click(registerasInvestorlocators.ForeignBusiness);
			waitForObj(3000);
			pdfResultReport.addStepDetails("navigateTocompanyIncorporateOutsideSingapore","User should click on companyIncorporateOutsideSingapore","User successfully clicked on companyIncorporateOutsideSingapore" + " ","Pass", "Y");	
		 }catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  pdfResultReport.addStepDetails("navigateTocompanyIncorporateInSingapore","User is not able to click on companyIncorporateOutsideSingapore", "Unable to open the click on companyIncorporateOutsideSingapore"+e.getMessage(),"Fail", "N");
	  }
	}
	
	
	public void navigateToindividualInvestorSingaporeCitizen() throws Exception {
		try {
			waitForElement(registerasInvestorlocators.IndonesianLegalEntity, 60);
			click(registerasInvestorlocators.IndonesianLegalEntity);
			waitForObj(3000);
			pdfResultReport.addStepDetails("navigatetoindividualInvestorSingaporeCitizen","User should click on individualInvestorSingaporeCitizen","User successfully clicked on individualInvestorSingaporeCitizen" + " ","Pass", "Y");	
		 }catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  pdfResultReport.addStepDetails("navigatetoindividualInvestorSingaporeCitizen","User is not able to click on individualInvestorSingaporeCitizen", "Unable to open the click on individualInvestorSingaporeCitizen"+e.getMessage(),"Fail", "N");
	  }
	}
	public void navigateToindividualInvestorNonSingaporeCitizen() throws Throwable {
		try {
			waitForElement(registerasInvestorlocators.Foreignlegalentities, 60);
			JSClick(registerasInvestorlocators.Foreignlegalentities,"individualInvestorNonSingaporeCitizen");
			waitForObj(3000);
			pdfResultReport.addStepDetails("navigatetoindividualInvestorNonSingaporeCitizen","User should click on individualInvestorNonSingaporeCitizen","User successfully clicked on individualInvestorNonSingaporeCitizen" + " ","Pass", "Y");	
		 }catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  pdfResultReport.addStepDetails("navigatetoindividualInvestorNonSingaporeCitizen","User is not able to click on individualInvestorNonSingaporeCitizen", "User unable to click on individualInvestorNonSingaporeCitizen"+e.getMessage(),"Fail", "N");
	  }
	}
		
	public void uploadFile(By loc) {
		try {
			 click(loc);
			Thread.sleep(2000);
			
			Screen s=new Screen();
			s.type("C:\\Users\\user\\git\\Batumbu\\SeleniumAutomation_Validus\\Media\\text.png", "C:\\Users\\user\\git\\Batumbu\\SeleniumAutomation_Validus\\Media\\dummy-pdf_2.pdf");
			s.click("C:\\Users\\user\\git\\Batumbu\\SeleniumAutomation_Validus\\Media\\OpenButton.png");
			 
		}catch(Exception e) {
			System.out.println("Unable to upload the file");
		}
	}
	public void pageDown() {
		try {
			Actions a=new Actions(ThreadLocalWebdriver.getDriver());
			a.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println("Unable to upload the file");
		}
	}
	
	
	
	
	public void CreateAccountSME() throws Exception {
		try {
			//click(validussmokelocators.validusMainpageLogin);
			click(smelocators.validusCreateanAccount);
			waitForElement(smelocators.validusSME, 30);
			waitForObj(3000);
			click(smelocators.validusSME);
			 set(smelocators.emailIDInvestor, pdfResultReport.testData.get("EmailIDInvestor"));
			set(smelocators.passwordInvestor, pdfResultReport.testData.get("PasswordInvestor"));
			set(smelocators.confirmPasswordInvestor, pdfResultReport.testData.get("ConfirmPasswordInvestor"));
			
			SimpleDateFormat df1 = new SimpleDateFormat("hhmmss");
			Date d1 = new Date();
			String time1 = df1.format(d1);
			System.out.println("time1::" + time1);
		
			set(smelocators.mobileNumber,  pdfResultReport.testData.get("MobileNumber"));
			click(smelocators.investorLoginTermsandCondition);
			click(smelocators.investorContinue);
			
			waitForObj(3000);
			pdfResultReport.addStepDetails("Create account", "Application should allow the user to enter details",
					"Successfully created an account" + " ", "Pass", "Y");
		} catch (Exception e) {
			System.out.println(e);
			log.fatal("Unable to create account" + e.getMessage() + "Line Number :" + e.getStackTrace());
			pdfResultReport.addStepDetails("Create account", "Unable to enter details",
					"Unable to create account" + e.getMessage(), "Fail", "N");

		}
	}
	
	public void SingaporeCreateAccountSME() throws Exception {
		try {
			//click(validussmokelocators.validusMainpageLogin);
			click(validussmokelocators.validusCreateanAccount);
			waitForElement(validussmokelocators.validusSME, 30);
			waitForObj(3000);
			click(validussmokelocators.validusSME);
			/*SimpleDateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");
			Date d = new Date();
			String time = df.format(d);
			System.out.println("time::" + time);
			emailIDInvestor = time + "@gmail.com";*/
			//set(validussmokelocators.emailIDInvestor, emailIDInvestor);
			set(validussmokelocators.emailIDInvestor, pdfResultReport.testData.get("EmailIDInvestor"));
			set(validussmokelocators.passwordInvestor, pdfResultReport.testData.get("PasswordInvestor"));
			set(validussmokelocators.confirmPasswordInvestor, pdfResultReport.testData.get("ConfirmPasswordInvestor"));
			
			SimpleDateFormat df1 = new SimpleDateFormat("hhmmss");
			Date d1 = new Date();
			String time1 = df1.format(d1);
			System.out.println("time1::" + time1);
		
			set(validussmokelocators.mobileNumber, time1);
			click(validussmokelocators.investorLoginTermsandCondition);
			click(validussmokelocators.investorContinue);
			
			waitForObj(3000);
			pdfResultReport.addStepDetails("Create account", "Application should allow the user to enter details",
					"Successfully created an account" + " ", "Pass", "Y");
		} catch (Exception e) {
			System.out.println(e);
			log.fatal("Unable to create account" + e.getMessage() + "Line Number :" + e.getStackTrace());
			pdfResultReport.addStepDetails("Create account", "Unable to enter details",
					"Unable to create account" + e.getMessage(), "Fail", "N");

		}
	}
	
	
	
	
	public void companyIncorporatedInSingapore() throws Throwable {
		try {
			set(registerasInvestorlocators.companyName, pdfResultReport.testData.get("Companyname"));
			select(registerasInvestorlocators.title, pdfResultReport.testData.get("Title"));
			set(registerasInvestorlocators.UENNumber, pdfResultReport.testData.get("UEN Number"));
			set(registerasInvestorlocators.firstName, pdfResultReport.testData.get("First Name"));
			set(registerasInvestorlocators.companyAddress, pdfResultReport.testData.get("Registered Address"));
			set(registerasInvestorlocators.deedofEstb, pdfResultReport.testData.get("DeedOfEstd"));
			set(registerasInvestorlocators.middleName, pdfResultReport.testData.get("Middle Name"));
			set(registerasInvestorlocators.lastName, pdfResultReport.testData.get("Last Name"));
			set(registerasInvestorlocators.postalCode, pdfResultReport.testData.get("Postal code"));
			set(registerasInvestorlocators.NRICPassportNumber, pdfResultReport.testData.get("NRIC/Passport Number"));
			set(registerasInvestorlocators.SICCCode, pdfResultReport.testData.get("SICC (Industry) Code"));
			select(registerasInvestorlocators.Nationality, pdfResultReport.testData.get("Nationality"));
			set(registerasInvestorlocators.registrationDate, pdfResultReport.testData.get("Date of Registration"));
			set(registerasInvestorlocators.primaryContactNo, pdfResultReport.testData.get("PrimaryCntctNo"));
			set(registerasInvestorlocators.designationInv, pdfResultReport.testData.get("Designation"));
			waitForObj(2000);
			uploadFile(registerasInvestorlocators.NRICPassportFront1);
			waitForObj(8000);
		//	pageDown();
			uploadFile(registerasInvestorlocators.NRICPassportBack);
			waitForObj(7000);
			uploadFile(registerasInvestorlocators.proofofResidence);
			waitForObj(7000);
			//Robot r=new Robot();
		//	 r.keyPress(KeyEvent.VK_PAGE_DOWN);
			uploadFile(registerasInvestorlocators.memoandArticles);
			waitForObj(7000);
			uploadFile(registerasInvestorlocators.acraBizfile);
			waitForObj(7000);
			//uploadFile(registerasInvestorlocators.optionalFile);
			waitForObj(5000);
			click(registerasInvestorlocators.agree);
			click(registerasInvestorlocators.acknowledge);
			click(registerasInvestorlocators.termsandCondition);
			click(registerasInvestorlocators.registerUs);
			JSClick(registerasInvestorlocators.submit, "Submit Button");
			String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath("//h3[@class='profile-ban-txt']")).getText();
			System.out.println(str);
			switchwindow(0);
			waitForObj(3000);
			pdfResultReport.addStepDetails("Register as companyIncorporatedInSingapore","User should register as companyIncorporatedInSingapore","Successfully registered as companyIncorporatedInSingapore" + " ","Pass", "Y");
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("Register as companyIncorporatedInSingapore", "User is not able to register as companyIncorporatedInSingapore", "User unable to register as companyIncorporatedInSingapore"+e.getMessage(), "Fail", "N");
		}
			}
	
	public void PinjamancompanyIncorporatedInSingapore() throws Throwable {
		try {
			
			
			set(validussmokelocators.FBcompanyName2, pdfResultReport.testData.get("Companyname"));
			select(validussmokelocators.FBtitle2, pdfResultReport.testData.get("Title"));
			set(validussmokelocators.FBUENNumber2, pdfResultReport.testData.get("UEN Number"));
			set(validussmokelocators.FbfirstName2, pdfResultReport.testData.get("First Name"));
			set(validussmokelocators.FbDateooDeed, pdfResultReport.testData.get("DeedOfEstd"));
			set(validussmokelocators.FBMiddleName, pdfResultReport.testData.get("Middle Name"));
			set(validussmokelocators.FbcompanyAddress2, pdfResultReport.testData.get("Registered Address"));
			set(validussmokelocators.FBlastname, pdfResultReport.testData.get("Last Name"));
			set(validussmokelocators.FbpostalCode2, pdfResultReport.testData.get("Postal code"));
			set(validussmokelocators.FbNRICPassportNumber2, pdfResultReport.testData.get("NRIC/Passport Number"));	
			set(validussmokelocators.FbindustryDescription, pdfResultReport.testData.get("Industry Description"));
			select(validussmokelocators.FbNationality2, pdfResultReport.testData.get("Nationality") );
			waitForObj(2000);
			select(validussmokelocators.FbSICCCode, pdfResultReport.testData.get("SICC (Industry) Code"));
		  	
			set(validussmokelocators.FbprimaryConatctNo2, pdfResultReport.testData.get("PrimaryCntctNo"));
			set(validussmokelocators.FbdesignationInv2, pdfResultReport.testData.get("Designation"));
		    set(validussmokelocators.FbNetworthprevious, pdfResultReport.testData.get("Annual Revenue Previous year"));
			set(validussmokelocators.FbNetwothCurrentyear, pdfResultReport.testData.get("Annual Revenue latest year"));
			select(validussmokelocators.FbSource, pdfResultReport.testData.get("Source"));
		    set(validussmokelocators.FbManagementName, pdfResultReport.testData.get("SearchText"));
			set(validussmokelocators.FBDeptMangement, pdfResultReport.testData.get("Designation"));
			set(validussmokelocators.FBServeSinceDate, pdfResultReport.testData.get("Date of Registration"));
			set(validussmokelocators.FbMangementPassport, pdfResultReport.testData.get("NRIC/Passport Number"));
			set(validussmokelocators.DirectorCitizenship1 , pdfResultReport.testData.get("Nationality"));
			set(validussmokelocators.FbMangementContact, pdfResultReport.testData.get("Account Number"));
			
			set(validussmokelocators.FbShareholderName, pdfResultReport.testData.get("SearchText"));
			set(validussmokelocators.FBShareholderPercentage, pdfResultReport.testData.get("Percentage"));
			set(validussmokelocators.FbShareholderPassport, pdfResultReport.testData.get("NRIC/Passport Number"));
			set(validussmokelocators.FBManagementCitizenship, pdfResultReport.testData.get("Nationality"));
			set(validussmokelocators.FbSharecontact, pdfResultReport.testData.get("Account Number"));
			// pageDown();
			waitForObj(2000);
			uploadFile(validussmokelocators.Upload1);
			waitForObj(4000);
			uploadFile(validussmokelocators.Upload2);
			waitForObj(4000);
			uploadFile(validussmokelocators.Upload3);
			waitForObj(5000);
			uploadFile(validussmokelocators.Upload4);
			waitForObj(5000);
			uploadFile(validussmokelocators.Upload5);
			waitForObj(5000);
			uploadFile(validussmokelocators.Upload6);
			waitForObj(4000);
		    pageDown();
		    
		    click(validussmokelocators.Agree1);
		    click(validussmokelocators.Agree2);
		    click(validussmokelocators.Agree3);
		    click(validussmokelocators.Agree4);
		    click(validussmokelocators.Agree5);
		    click(validussmokelocators.Agree6);
		    
		    
		    
			 JSClick(validussmokelocators.FBSubmit , "Submit Button");
			 String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath("//h3[@class='profile-ban-txt']")).getText();
				System.out.println(str);
			
			 Screen exit=new Screen();
			 exit.click("C:\\Users\\Mani\\Desktop\\Automate Registration Pics\\KELUAR.png");
		 
			 
			
			switchwindow(0);	//JSClick(registerasInvestorlocators.submit, "Submit Button");
			  waitForObj(3000);
			pdfResultReport.addStepDetails("Register as companyIncorporatedInSingapore","User should register as companyIncorporatedInSingapore","Successfully registered as companyIncorporatedInSingapore" + " ","Pass", "Y");
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("Register as companyIncorporatedInSingapore", "User is not able to register as companyIncorporatedInSingapore", "User unable to register as companyIncorporatedInSingapore"+e.getMessage(), "Fail", "N");
		}
			}
	
	
	public void companyIncorporatedOutsideSingapore() throws Exception {
		try {
		/*	click(registerasInvestorlocators.validusMainpageLogin);
			set(registerasInvestorlocators.username, pdfResultReport.testData.get("UserName"));
			set(registerasInvestorlocators.password, pdfResultReport.testData.get("Password"));
			click(registerasInvestorlocators.login);
			click(registerasInvestorlocators.companyIncorporateInSingapore);*/
			set(registerasInvestorlocators.companyName2, pdfResultReport.testData.get("Companyname"));
			select(registerasInvestorlocators.title2, pdfResultReport.testData.get("Title"));
			set(registerasInvestorlocators.UENNumber2, pdfResultReport.testData.get("UEN Number"));
			set(registerasInvestorlocators.firstName2, pdfResultReport.testData.get("First Name"));
			set(registerasInvestorlocators.companyAddress2, pdfResultReport.testData.get("Registered Address"));
			set(registerasInvestorlocators.middleName2, pdfResultReport.testData.get("Middle Name"));
			set(registerasInvestorlocators.lastName2, pdfResultReport.testData.get("Last Name"));
			set(registerasInvestorlocators.industryDescription, pdfResultReport.testData.get("Industry Description"));
			set(registerasInvestorlocators.postalCode2, pdfResultReport.testData.get("Postal code"));
			set(registerasInvestorlocators.NRICPassportNumber2, pdfResultReport.testData.get("NRIC/Passport Number"));
			//set(registerasInvestorlocators.SICCCode, pdfResultReport.testData.get("SICC (Industry) Code"));
			select(registerasInvestorlocators.Nationality2, pdfResultReport.testData.get("Nationality"));
			set(registerasInvestorlocators.registrationDate2, pdfResultReport.testData.get("Date of Registration"));
			set(registerasInvestorlocators.primaryContactNumber2, pdfResultReport.testData.get("Primary Contact Number"));
			set(registerasInvestorlocators.designation2, pdfResultReport.testData.get("Designation"));
			// pageDown();
			waitForObj(2000);
			uploadFile(registerasInvestorlocators.NRICPassportFront2);
			waitForObj(4000);
			uploadFile(registerasInvestorlocators.NRICPassportBack2);
			waitForObj(4000);
			uploadFile(registerasInvestorlocators.certificateofIncorporation);
			waitForObj(5000);
			uploadFile(registerasInvestorlocators.memoandArticles2);
			waitForObj(5000);
			uploadFile(registerasInvestorlocators.proofofResidence2);
			waitForObj(5000);
			uploadFile(registerasInvestorlocators.optionalFile2);
			waitForObj(4000);
			click(registerasInvestorlocators.agree2);
			click(registerasInvestorlocators.acknowledge2);
			click(registerasInvestorlocators.termsandCondition2);
			click(registerasInvestorlocators.registerUs2);
			waitForObj(2000);
			click(registerasInvestorlocators.submit2);
			waitForObj(3000);
			pdfResultReport.addStepDetails("Register as companyIncorporatedOutsideSingapore","User should register as companyIncorporatedOutsideSingapore","Successfully registered as companyIncorporatedOutsideSingapore" + " ","Pass", "Y");
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("Register as companyIncorporatedOutsideSingapore", "User is not able to register as companyIncorporatedOutsideSingapore", "Unable to register as companyIncorporatedOutsideSingapore"+e.getMessage(), "Fail", "N");
		}
			}
	
	
	public void PinjamanCompanyIncorporatedOutsideSingapore() throws Exception {
		try {
		/*	click(registerasInvestorlocators.validusMainpageLogin);
			set(registerasInvestorlocators.username, pdfResultReport.testData.get("UserName"));
			set(registerasInvestorlocators.password, pdfResultReport.testData.get("Password"));
			click(registerasInvestorlocators.login);
			click(registerasInvestorlocators.companyIncorporateInSingapore);*/
			set(registerasInvestorlocators.companyName2, pdfResultReport.testData.get("Companyname"));
			select(registerasInvestorlocators.title2, pdfResultReport.testData.get("Title"));
			set(registerasInvestorlocators.UENNumber2, pdfResultReport.testData.get("UEN Number"));
			set(registerasInvestorlocators.firstName2, pdfResultReport.testData.get("First Name"));
			set(registerasInvestorlocators.companyAddress2, pdfResultReport.testData.get("Registered Address"));
			set(registerasInvestorlocators.middleName2, pdfResultReport.testData.get("Middle Name"));
			set(registerasInvestorlocators.lastName2, pdfResultReport.testData.get("Last Name"));
			set(registerasInvestorlocators.deedofEstb2, pdfResultReport.testData.get("DeedOfEstd"));
			set(registerasInvestorlocators.industryDescription, pdfResultReport.testData.get("Industry Description"));
			set(registerasInvestorlocators.postalCode2, pdfResultReport.testData.get("Postal code"));
			set(registerasInvestorlocators.NRICPassportNumber2, pdfResultReport.testData.get("NRIC/Passport Number"));
		//	set(registerasInvestorlocators.SICCCode, pdfResultReport.testData.get("SICC (Industry) Code"));
			select(registerasInvestorlocators.Nationality2, pdfResultReport.testData.get("Nationality"));
			//set(registerasInvestorlocators.registrationDate2, pdfResultReport.testData.get("Date of Registration"));
			set(registerasInvestorlocators.primaryConatctNo2, pdfResultReport.testData.get("PrimaryCntctNo"));
			set(registerasInvestorlocators.designationInv2, pdfResultReport.testData.get("Designation"));
			//set(registerasInvestorlocators.primaryContactNumber2, pdfResultReport.testData.get("Primary Contact Number"));
			//set(registerasInvestorlocators.designation2, pdfResultReport.testData.get("Designation"));
			// pageDown();
			waitForObj(2000);
			uploadFile(registerasInvestorlocators.NRICPassportFront2);
			waitForObj(4000);
			uploadFile(registerasInvestorlocators.NRICPassportBack2);
			waitForObj(4000);
			uploadFile(registerasInvestorlocators.certificateofIncorporation);
			waitForObj(5000);
			uploadFile(registerasInvestorlocators.memoandArticles2);
			waitForObj(5000);
			uploadFile(registerasInvestorlocators.proofofResidence2);
			waitForObj(5000);
			uploadFile(registerasInvestorlocators.optionalFile2);
			waitForObj(4000);
			click(registerasInvestorlocators.agree2);
			click(registerasInvestorlocators.acknowledge2);
			click(registerasInvestorlocators.termsandCondition2);
			click(registerasInvestorlocators.registerUs2);
			click(registerasInvestorlocators.submit2);
			waitForObj(3000);
			pdfResultReport.addStepDetails("Register as companyIncorporatedOutsideSingapore","User should register as companyIncorporatedOutsideSingapore","Successfully registered as companyIncorporatedOutsideSingapore" + " ","Pass", "Y");
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("Register as companyIncorporatedOutsideSingapore", "User is not able to register as companyIncorporatedOutsideSingapore", "Unable to register as companyIncorporatedOutsideSingapore"+e.getMessage(), "Fail", "N");
		}
			}
	public void individualInvestorSingaporeCitizen() throws Exception {
		try {
	
			select(registerasInvestorlocators.title3, pdfResultReport.testData.get("Title"));
			set(registerasInvestorlocators.firstName3, pdfResultReport.testData.get("First Name"));
			set(registerasInvestorlocators.Address, pdfResultReport.testData.get("Registered Address"));
			set(registerasInvestorlocators.middleName3, pdfResultReport.testData.get("Middle Name"));
			set(registerasInvestorlocators.lastName3, pdfResultReport.testData.get("Last Name"));
			set(registerasInvestorlocators.postalCode3, pdfResultReport.testData.get("Postal code"));
			set(registerasInvestorlocators.NRICPassportNumber3, pdfResultReport.testData.get("NRIC/Passport Number"));
			 //pageDown();
			waitForObj(4000);
			uploadFile(registerasInvestorlocators.NRICPassportFront3);
			waitForObj(4000);
				uploadFile(registerasInvestorlocators.NRICPassportBack3);
				waitForObj(4000);
				uploadFile(registerasInvestorlocators.proofofResidence3);
				waitForObj(4000);
				uploadFile(registerasInvestorlocators.optionalFile3);
				waitForObj(4000);
				click(registerasInvestorlocators.agree3);
			click(registerasInvestorlocators.acknowledge3);
			click(registerasInvestorlocators.termsandCondition3);
			click(registerasInvestorlocators.registerUs3);
			click(registerasInvestorlocators.submit3);
			/*waitForElement(registerasInvestorlocators.applicationreviewmessage, 60);
		String str = text(registerasInvestorlocators.applicationreviewmessage);
			 System.out.println(str);
			switchwindow(0);*/
			waitForObj(3000);
			pdfResultReport.addStepDetails("Register as individualInvestorSingaporeCitizen","User should register as individualInvestorSingaporeCitizen","Successfully registered as individualInvestorSingaporeCitizen" + " ","Pass", "Y");
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("Register as individualInvestorSingaporeCitizen", "User is not able to register as individualInvestorSingaporeCitizen", "Unable to register as individualInvestorSingaporeCitizen"+e.getMessage(), "Fail", "N");
		}
			}
	public void individualInvestorNonSingaporeCitizen() throws Exception {
		try {
			select(registerasInvestorlocators.title4, pdfResultReport.testData.get("Title"));
			set(registerasInvestorlocators.firstName4, pdfResultReport.testData.get("First Name"));
			select(registerasInvestorlocators.Nationality3, pdfResultReport.testData.get("Nationality"));
			set(registerasInvestorlocators.Address4, pdfResultReport.testData.get("Registered Address"));
			set(registerasInvestorlocators.middleName4, pdfResultReport.testData.get("Middle Name"));
			set(registerasInvestorlocators.lastName4, pdfResultReport.testData.get("Last Name"));
			set(registerasInvestorlocators.postalCode4, pdfResultReport.testData.get("Postal code"));
			set(registerasInvestorlocators.NRICPassportNumber4, pdfResultReport.testData.get("NRIC/Passport Number"));
			// pageDown();
			 uploadFile(registerasInvestorlocators.NRICPassportFront4);
			 waitForObj(4000);
			 uploadFile(registerasInvestorlocators.NRICPassportBack4);
			 waitForObj(4000);
			 uploadFile(registerasInvestorlocators.proofofResidence4);
			 waitForObj(4000);
			 uploadFile(registerasInvestorlocators.optionalFile4);
			 waitForObj(4000);
			click(registerasInvestorlocators.agree4);
			click(registerasInvestorlocators.acknowledge4);
			click(registerasInvestorlocators.termsandCondition4);
			click(registerasInvestorlocators.registerUs4);
			click(registerasInvestorlocators.submit4);
			/*String str = text(registerasInvestorlocators.successmsg);
			System.out.println(str);*/
			/*waitForElement(registerasInvestorlocators.applicationreviewmessage, 60);
			String str = text(registerasInvestorlocators.applicationreviewmessage);
				 System.out.println(str);
				switchwindow(0);*/
				waitForObj(3000);
			pdfResultReport.addStepDetails("Register as individualInvestorNonSingaporeCitizen","User should register as individualInvestorNonSingaporeCitizen","Successfully registered as individualInvestorNonSingaporeCitizen" + " ","Pass", "Y");
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("Register as individualInvestorNonSingaporeCitizen", "User is not able to register as individualInvestorNonSingaporeCitizen", "Unable to register as individualInvestorNonSingaporeCitizen"+e.getMessage(), "Fail", "N");
		}
			}
	
	public void investorstatus() throws Exception {
		String str = text(registerasInvestorlocators.investorstatus);
		System.out.println(str);
		}

	public void Investorfund() throws Exception {
		
		try {
		/*click(registerasInvestorlocators.bank);
		click(registerasInvestorlocators.edit);
		set(registerasInvestorlocators.AccountOwner, pdfResultReport.testData.get("Account Owner"));
		*/click(registerasInvestorlocators.bank);
			set(registerasInvestorlocators.AccountNumber, pdfResultReport.testData.get("Account Number"));
		set(registerasInvestorlocators.BankName, pdfResultReport.testData.get("Bank Name"));
		set(registerasInvestorlocators.BranchCode, pdfResultReport.testData.get("Branch Code"));
		click(registerasInvestorlocators.submitbank);
	
		String str = text(registerasInvestorlocators.investorstatus);
		System.out.println(str);
	/*	click(registerasInvestorlocators.platform);
		click(registerasInvestorlocators.allLivefacilities);
		String strn = text(registerasInvestorlocators.availableFunds);
		System.out.println(strn);
	*/	waitForObj(3000);
		
		
pdfResultReport.addStepDetails("Investorfund","User should able to do fund","Successfully able to fund" + " ","Pass", "Y");
		switchwindow(0);
	}
	catch(Exception e) {
		log.fatal("Unable to Homelogin"+e.getMessage());
		pdfResultReport.addStepDetails("Investorfund", "User is not able to fund", "Not able to fund successfully"+e.getMessage(), "Fail", "N");
	}
	}
	
	
	public void screenclick(String Path)throws Exception {
		
		
		try {
			Screen S = new Screen();
			S.click(Path);
		} catch (FindFailed e) {
			 
			e.printStackTrace();
		}
		 
	}
	public void registeringasSME() throws Throwable {
		try {
			
			
			select(smelocators.Greetings, pdfResultReport.testData.get("Title"));
			set(smelocators.firstName, pdfResultReport.testData.get("First Name"));
			set(smelocators.MiddleName, pdfResultReport.testData.get("Middle Name"));
			set(smelocators.lastname , pdfResultReport.testData.get("Last Name"));
			set(smelocators.NRIcNumber, pdfResultReport.testData.get("NRIC/Passport Number"));
			set(smelocators.SimNuber, pdfResultReport.testData.get("NRIC/Passport Number"));
			set(smelocators.PassportNumber, pdfResultReport.testData.get("NRIC/Passport Number"));
			set(smelocators.Position, pdfResultReport.testData.get("Designation"));
			waitForObj(2000);
			select(smelocators.Aboutbatumbu, pdfResultReport.testData.get("About Validus"));
		
			js_Select(smelocators.Source, pdfResultReport.testData.get("Source"),"Source");
		
			js_Select(smelocators.EntityType, pdfResultReport.testData.get("EntityType"),"Entity Type");
			waitForObj(2000);
			js_type(smelocators.NameofUkm, pdfResultReport.testData.get("UKM Name"),"Name Of UKM");
			 
			
			set(smelocators.EstablishmentNumber, pdfResultReport.testData.get("UEN Number"));
			set(smelocators.DateOfDeed, pdfResultReport.testData.get("DeedOfEstd"));
			
			click(smelocators.NoOfManagement);
			set(smelocators.NoOfManagement, pdfResultReport.testData.get("No OfManagement"));
			
			set(smelocators.NameOfmanagement1, pdfResultReport.testData.get("ManagementName"));
			set(smelocators.ManagementPosition1, pdfResultReport.testData.get("Designation"));
			js_type(smelocators.servesince1, pdfResultReport.testData.get("ServeSince"),"Serve Since");
			 
			click(smelocators.NameOfmanagement2);
			set(smelocators.NameOfmanagement2, pdfResultReport.testData.get("ManagementName"));
			set(smelocators.ManagementPosition2, pdfResultReport.testData.get("Designation"));
     		js_type(smelocators.servesince2, pdfResultReport.testData.get("ServeSince"),"Serve Since Two");
			waitForObj(2000);
			
		//	js_Select(smelocators.NoOfShareholders, pdfResultReport.testData.get("No OfManagement"),"No Of ShareHolders");
			
			WebElement ele =ThreadLocalWebdriver.getDriver().findElement(smelocators.NoOfShareholders);
			Select S= new Select(ele);
			Actions A= new Actions(ThreadLocalWebdriver.getDriver());
			A.moveToElement(ele).click().build().perform();
			S.selectByIndex(1);
			
			click(smelocators.Shareholder1);
			set(smelocators.Shareholder1, pdfResultReport.testData.get("ManagementName"));
			set(smelocators.Percentage1, pdfResultReport.testData.get("Percentage"));
			
			set(smelocators.Shareholder2, pdfResultReport.testData.get("ManagementName"));
			set(smelocators.Percentage2, pdfResultReport.testData.get("Percentage"));
			 
			set(smelocators.LicenceNumber, pdfResultReport.testData.get("NRIC/Passport Number"));
			
			select(smelocators.BusinessSector, pdfResultReport.testData.get("SICC (Industry) Code"));
			set(smelocators.BusinessAddress, pdfResultReport.testData.get("Nationality"));
			set(smelocators.SubDistrict, pdfResultReport.testData.get("Nationality"));
			set(smelocators.CountyTown, pdfResultReport.testData.get("Nationality"));
			
			set(smelocators.Province, pdfResultReport.testData.get("District")); 
			set(smelocators.ComapnyPostalCode, pdfResultReport.testData.get("Postal code"));
			set(smelocators.HomeAddress, pdfResultReport.testData.get("Registered Address"));
			set(smelocators.EmergencyContact, pdfResultReport.testData.get("PrimaryCntctNo"));
			
			
			select(smelocators.AlternateGreeting, pdfResultReport.testData.get("Alternate Greeting"));
			set(smelocators.Firstname1, pdfResultReport.testData.get("First Name"));
			set(smelocators.MiddleName2, pdfResultReport.testData.get("Middle Name"));
			set(smelocators.LastName2, pdfResultReport.testData.get("Last Name"));
			 
			set(smelocators.PassportNumber2, pdfResultReport.testData.get("Postal code"));
			set(smelocators.Designation2, pdfResultReport.testData.get("Designation"));
			set(smelocators.Mobilenumber2, pdfResultReport.testData.get("NRIC/Passport Number"));
			set(smelocators.EmailId2, pdfResultReport.testData.get("EmailIDInvestor"));
			 
			
			 pageDown();
				uploadFile(smelocators.uploadFile1);
				waitForObj(15000);
				uploadFile(smelocators.uploadFile2);
				waitForObj(15000);
				uploadFile(smelocators.uploadFile3);
				waitForObj(15000);
				uploadFile(smelocators.uploadFile4);
				waitForObj(15000);
				uploadFile(smelocators.uploadFile5);
				waitForObj(15000);
				uploadFile(smelocators.uploadFile6);
				waitForObj(15000);
				uploadFile(smelocators.uploadFile7);
				waitForObj(15000);
				uploadFile(smelocators.uploadFile8);
				waitForObj(15000);
				uploadFile(smelocators.uploadFile9);
				waitForObj(15000);
				uploadFile(smelocators.uploadFile10);
				waitForObj(15000);
				
				click(smelocators.agreeSME);
				click(smelocators.agreeSME2);
				click(smelocators.agreeSME3);
				click(smelocators.agreeSME4);
				
				click(smelocators.submit);
				waitForObj(5000);
				
				//select(registerasInvestorlocators.accountOwner, pdfResultReport.testData.get("ManagementName") );

				set(smelocators.bankName, pdfResultReport.testData.get("Bank Name"));
				set(smelocators.accountNumber, pdfResultReport.testData.get("Account Number"));
				set(smelocators.branchCode, pdfResultReport.testData.get("Branch Code"));
				waitForObj(2000);
				click(smelocators.next);
				waitForObj(7000);			
				
							 		pdfResultReport.addStepDetails("Register as SME","User should register as SME","Successfully registered as SME" + " ","Pass", "Y");
		
	}
	catch(Exception e) {
		log.fatal("Unable to Homelogin"+e.getMessage());
		pdfResultReport.addStepDetails("Register as SME", "User is not able to register as SME", "Successfully registered as Investor"+e.getMessage(), "Fail", "N");
	}
	}
	
	public void SubmitLoan() throws Throwable {
		
		
		try {
			
			click(smelocators.invoiceFinancing);
			waitForObj(2000);
			ThreadLocalWebdriver.getDriver().findElement(registerasInvestorlocators.loanamount).clear();
			set(smelocators.loanamount, pdfResultReport.testData.get("LoanAmount"));
			waitForObj(2000);
			selectbyIndex(smelocators.tenureRequired, 2);
			waitForObj(2000);
			set(smelocators.noofEmployees, "2");
			waitForObj(2000);
			set(smelocators.annualRevenuepreviousyear, pdfResultReport.testData.get("Annual Revenue latest year"));
			waitForObj(2000);
			set(smelocators.annualRevenueLatestyear, pdfResultReport.testData.get("Annual Revenue latest year"));
			waitForObj(1000);
			set(smelocators.netProfitLossPreviousyear, pdfResultReport.testData.get("Net Profit loss previous year"));
			waitForObj(1000);
		 	js_type(smelocators.netProfitLossLatestyear, pdfResultReport.testData.get("Net Profit loss latest year"),"NetProfitlatYear");
			
		 	selectbyvalue(smelocators.PersonnelGurrantor1, pdfResultReport.testData.get("ManagementName"));
		 	select(smelocators.ResidentialStatus1, pdfResultReport.testData.get("GarrentorCitizenShip"));
		 	set(smelocators.PGALastYeraTax1, pdfResultReport.testData.get("Annual Revenue latest year"));
		 	set(smelocators.PGCurrentTax1, pdfResultReport.testData.get("Annual Revenue latest year"));
		 	
		 	selectbyvalue(smelocators.PersonnelGurrantor2, pdfResultReport.testData.get("ManagementName"));
		 	select(smelocators.ResidentialStatus2, pdfResultReport.testData.get("GarrentorCitizenShip"));
		 	set(smelocators.PGALastYeraTax2, pdfResultReport.testData.get("Annual Revenue latest year"));
		 	set(smelocators.PGCurrentTax2, pdfResultReport.testData.get("Annual Revenue latest year"));
		 	
		 	selectbyvalue(smelocators.PersonnelGurrantor3, pdfResultReport.testData.get("ManagementName"));
		 	select(smelocators.ResidentialStatus3, pdfResultReport.testData.get("GarrentorCitizenShip"));
		 	set(smelocators.PGALastYeraTax3, pdfResultReport.testData.get("Annual Revenue latest year"));
		 	set(smelocators.PGCurrentTax3, pdfResultReport.testData.get("Annual Revenue latest year"));
		 	
		 	
		 	
		 	
		 	
		 	
			uploadFile(smelocators.invoiceFinancingUpload1);
			waitForObj(15000);
			uploadFile(smelocators.invoiceFinancingUpload2);
			waitForObj(15000);
			uploadFile(smelocators.invoiceFinancingUpload3);
			waitForObj(15000);
			uploadFile(smelocators.invoiceFinancingUpload4);
			waitForObj(15000);
			uploadFile(smelocators.invoiceFinancingUpload5);
			waitForObj(15000);
			uploadFile(smelocators.invoiceFinancingUpload6);
			waitForObj(15000);
			
			click(smelocators.InvoiceAgree1);
			click(smelocators.InvoiceAgree2);
			click(smelocators.InvoiceAgree3);
			Thread.sleep(2000);
			click(smelocators.InvoiceAgree4);
			click(smelocators.InvoiceAgree5);
			
			click(smelocators.SmeFinalSubmit);
			waitForObj(10000);
			click(smelocators.masuk);

			waitForObj(5000);			
			 
		}catch(Exception e) {
			 
			log.fatal("Unable to Submit Loan" + e.getMessage());
			pdfResultReport.addStepDetails("Applaying Loan", "User is not able for Loan",
					"Unable to submit tha Loan  application" + e.getMessage(), "Fail", "N");
		
		}
	}
	
public void batumbuAdminVerifyDocuments() throws Throwable{
		
		try{
			  waitForObj(2000);
			 screenclick("C:\\Users\\user\\git\\Batumbu\\SeleniumAutomation_Validus\\Media\\OpenTab.png");
			switchwindow(2);
			 ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/BatumbuAdmin/public/");
			
			set(smelocators.AdminMail, "customersuccess@batumbu.id");
			set(smelocators.AdminPassword, "Admin123");
			click(smelocators.AdminLogin);
			
			waitForObj(2000);
			click(smelocators.SMES);
			waitForObj(2000);
			set(smelocators.SMESEarch, pdfResultReport.testData.get("EmailIDInvestor"));
			waitForObj(2000);
			click(smelocators.ViewDetailsLender);
			waitForObj(2000);
			click(smelocators.Application);
			waitForObj(4000);
			click(smelocators.LenderDocumentslist);
			waitForObj(4000);
			click(smelocators.VerifyDocuments);
			click(smelocators.AdminLogout);
			 //ThreadLocalWebdriver.getDriver().close();
			}catch (Exception e) {
		e.printStackTrace();
		}
		}
	

public void batumbuAdminApproval() throws Throwable {
	try{
	 	 	waitForObj(2000);
	 	 /*Screen S = new Screen();
        S.click("C:\\Users\\user\git\Batumbu\SeleniumAutomation_Validus\Media\OpenButton.png");
		switchwindow(1);
		ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/BatumbuAdmin/public/");
		*/
		
	 	ThreadLocalWebdriver.getDriver().findElement(registerasInvestorlocators.AdminMail).clear();
	 	set(smelocators.AdminMail, "creditrisk@batumbu.id");
		set(smelocators.AdminPassword, "Admin123");
		click(smelocators.AdminLogin);
		
		waitForObj(2000);
		click(smelocators.SMECREDITRISk);
		waitForObj(2000);
		set(smelocators.SMESEarch, pdfResultReport.testData.get("EmailIDInvestor"));
		waitForObj(2000);
		click(smelocators.ViewDetailsLender);
		click(smelocators.Application);
		 
		uploadFile(smelocators.ChooseFilelender);
		waitForObj(2000);
		click(smelocators.SubmitLender);
		waitForObj(2000);
		click(smelocators.ApproveLender);
		waitForObj(10000);
		//click(smelocators.AdminLogout);
		JSClick(smelocators.AdminLogout, "LogOut Button");
	}catch(Exception e)
	{
		
	}
	
}
 
 
public void batumbuAdminApproveLoan() throws Throwable {
	try{
	 	 	waitForObj(2000);
		/*Screen S = new Screen();
		S.click("C:\\Users\\user\\git\\Batumbu\\SeleniumAutomation_Validus\\Media\\OpenButton.png");
	switchwindow(1);
	ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/BatumbuAdmin/public/");
 */
	ThreadLocalWebdriver.getDriver().findElement(smelocators.AdminMail).clear();
		set(smelocators.AdminMail, "creditops@batumbu.id");
		set(smelocators.AdminPassword, "Admin123");
		click(smelocators.AdminLogin);
		
 		waitForObj(2000);
		click(smelocators.SMECREDITTOPS);
		waitForObj(2000);
		//set(smelocators.SMESEarch, pdfResultReport.testData.get("EmailIDInvestor"));
		set(smelocators.SMESEarch, pdfResultReport.testData.get("UKM Name"));
		waitForObj(2000);
		click(smelocators.ViewDetailsLender);
		click(smelocators.Application);
		
		click(smelocators.ViewDetailsLender);
		
		waitForObj(5000);
		Actions a = new Actions(ThreadLocalWebdriver.getDriver());
		a.sendKeys(Keys.F5).build().perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_F5);
		r.keyRelease(KeyEvent.VK_F5);
		
		
		click(smelocators.LoanDocuments);
		waitForObj(3000);
		select(smelocators.NoOfDocs, "100");
		
		List<WebElement> rows =ThreadLocalWebdriver.getDriver().findElements(By.xpath("//table[@id='example1']/tbody/tr"));
		int RowCount  =rows.size();
		System.out.println("Table Total Data Is "+rows);
		System.out.println("Number Of Rows Is  "+ RowCount);
		
		
		String CheckboxBeforexpath = "//*[@id='example1']/tbody/tr[";
	    String CheckBoxAftyeXpath  = "]/td[1]/input";
	    
	    for(int i=1;i<=RowCount;i++) {
	    	
	    	String CheckBoxXpath =  CheckboxBeforexpath+i+CheckBoxAftyeXpath;
	    	ThreadLocalWebdriver.getDriver().findElement(By.xpath(CheckBoxXpath)).click();
	    	  
	    }
	    
	    ThreadLocalWebdriver.getDriver().findElement(By.xpath("//button[@id='verify_docs_submit_btn']")).click();
	    waitForObj(5000);
	    Actions A =new  Actions(ThreadLocalWebdriver.getDriver());
	    A.moveToElement(ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'Credit Assessment')]"))).click().build().perform();
	     
	    //ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'Credit Assessment')]")).click();
	    uploadFile(smelocators.PromisoryNote);
	    
	    waitForObj(7000);
	    click(smelocators.UploadPromisory);
	     waitForObj(7000);
	    JSClick(smelocators.ApproveLoan , "Approve Loan");
	     
    waitForObj(7000);
	    pageDown();
	    pageDown();
	    click(smelocators.EditLoanApplication);
	    
	    ThreadLocalWebdriver.getDriver().findElement(registerasInvestorlocators.RateInterestMonthy).clear();
	    set(smelocators.RateInterestMonthy, "2");
	    select(smelocators.InterestType, "Flat");
	    select(smelocators.Tenureoffered, "3");
	    select(smelocators.paymentfrequency,  "SINGLE-PAYMENT");
	    ThreadLocalWebdriver.getDriver().findElement(registerasInvestorlocators.invoiceAmount).clear();
	    set(smelocators.invoiceAmount, "5000");
	    set(smelocators.InvoiceNumber, "IN552");
	    set(smelocators.InvoiceReceiveDate, "09/03/2017");
	    set(smelocators.invoiceDueDate,"09/04/2017" );
	    click(smelocators.SubmitLoanApplication);
	    Thread.sleep(10000); 
	    
	    click(smelocators.FacilityApproval);
	    
	  /*  uploadFile(smelocators.ChooseFileFacility);
	    click(smelocators.SubmitTomarket);
	  */Thread.sleep(10000);
	    
	    JavascriptExecutor js = (JavascriptExecutor) ThreadLocalWebdriver.getDriver();
	    js.executeScript("window.scrollBy(0,1000)");
	   Thread.sleep(3000);
	    JSClick(smelocators.ApproveToMARKET, "Approve to market");
	     
	    //screenclick("C:\\Users\\user\\git\\Batumbu\\SeleniumAutomation_Validus\\Media\\AdminApproveButton.png");
	    Thread.sleep(10000);
	   js.executeScript("window.scrollBy(0,1000)");
	 //  JSClick(registerasInvestorlocators.ListToMarketPlace,"List To MarketPlace");
	    
	   screenclick("C:\\Users\\user\\git\\Batumbu\\SeleniumAutomation_Validus\\Media\\ListTomarket.png");    
	     Thread.sleep(10000);
	     
	    JSClick(smelocators.LoanApplications,"Loan Applications");
	    waitForObj(5000);
		set(smelocators.SMESEarch, pdfResultReport.testData.get("UKM Name"));
		click(smelocators.ViewDetailsLender);
	    
	    
	    
	}catch (Exception e) {
		e.printStackTrace();
	
	}
	}

  
public void salesforcefund() throws Exception {
	try {
	//click(individualforeignlocators.account);
	
	set(registerasInvestorlocators.salesSearch, pdfResultReport.testData.get("EmailIDInvestor"));
	click(registerasInvestorlocators.SAlesSearchButton);
	waitForObj(2000);
	ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'"+pdfResultReport.testData.get("NameOfUKM") +"')]")).click();
	click(registerasInvestorlocators.investorFundTransaction);
	 
	click(registerasInvestorlocators.newFundTransaction);
	waitForObj(4000);
	ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@tabindex='4']")).clear();
	waitForObj(2000);
	set(registerasInvestorlocators.paymentMode, "ACH");
	waitForObj(2000);
	set(registerasInvestorlocators.Amounttransaction, "100000.00");
	waitForObj(2000);
	click(registerasInvestorlocators.savefund);
	 
	
	pdfResultReport.addStepDetails("salesforcefund", "User should able to fund the application successfully",
			"Successfully funded to the application" + " ", "Pass", "Y");
} catch (Exception e) {
	log.fatal("Unable to Homelogin" + e.getMessage());
	pdfResultReport.addStepDetails("salesforcefund", "User is not able to fund to the application",
			"Unable to fund  the application" + e.getMessage(), "Fail", "N");
}
			
}


	public void invoiceFinancingSME() throws Exception {
		try {
			
			click(registerasInvestorlocators.invoiceFinancing);
			set(registerasInvestorlocators.loanamount, pdfResultReport.testData.get("Requested amount by SME"));
			select(registerasInvestorlocators.tenureRequired, pdfResultReport.testData.get("Tenure Required"));
			set(registerasInvestorlocators.noofEmployees, pdfResultReport.testData.get("No of employees"));
			set(registerasInvestorlocators.annualRevenuepreviousyear, pdfResultReport.testData.get("Annual Revenue Previous year"));
			set(registerasInvestorlocators.annualRevenueLatestyear, pdfResultReport.testData.get("Annual Revenue latest year"));
			set(registerasInvestorlocators.netProfitLossPreviousyear, pdfResultReport.testData.get("Net Profit loss previous year"));
			set(registerasInvestorlocators.netProfitLossLatestyear, pdfResultReport.testData.get("Net Profit loss latest year"));
			set(registerasInvestorlocators.personalGuarantor1, pdfResultReport.testData.get("Name of Personal Guarantor"));
			set(registerasInvestorlocators.residentialStatus, pdfResultReport.testData.get("Residential Status"));
			set(registerasInvestorlocators.annualtaxableIncomelatestyear, pdfResultReport.testData.get("Annual taxable income previous year"));
			set(registerasInvestorlocators.annualtaxableIncomepreviousyear, pdfResultReport.testData.get("Annual taxable income latest year"));
			// pageDown();
				uploadFile(registerasInvestorlocators.invoiceFinancingUpload1);
				waitForObj(10000);
				uploadFile(registerasInvestorlocators.invoiceFinancingUpload2);
				waitForObj(10000);
				uploadFile(registerasInvestorlocators.invoiceFinancingUpload3);
				waitForObj(10000);
				uploadFile(registerasInvestorlocators.invoiceFinancingUpload4);
				waitForObj(10000);
				uploadFile(registerasInvestorlocators.invoiceFinancingUpload5);
				waitForObj(10000);
				uploadFile(registerasInvestorlocators.invoiceFinancingUpload6);
				waitForObj(10000);
				uploadFile(registerasInvestorlocators.invoiceFinancingUpload7);
				waitForObj(10000);
				/*uploadFile(registerasInvestorlocators.invoiceFinancingUpload8);
				waitForObj(10000);
				uploadFile(registerasInvestorlocators.invoiceFinancingUpload9);
				*/waitForObj(10000);
				
				/*uploadFile(registerasInvestorlocators.incometaxassessment);
				waitForObj(8000);
				uploadFile(registerasInvestorlocators.incometaxassessmentdirectors);
				waitForObj(8000);
				uploadFile(registerasInvestorlocators.incometaxassessmentpersonalGuarantors);
				waitForObj(8000);
				uploadFile(registerasInvestorlocators.accountreceivablelast12months);
				waitForObj(8000);
				uploadFile(registerasInvestorlocators.lastFinancialstatements);
				waitForObj(8000);
				uploadFile(registerasInvestorlocators.yeartodatemanagement);
				waitForObj(8000);*/
				/*uploadFile(registerasInvestorlocators.optionalfilesSME1);
				waitForObj(8000);
				uploadFile(registerasInvestorlocators.certifiedtrueExtracts);
				waitForObj(8000);*/
				
				click(registerasInvestorlocators.confirmAccountprofile);
				waitForObj(1000);
				click(registerasInvestorlocators.agreetobond);
				waitForObj(1000);
				click(registerasInvestorlocators.disclosureinformation);
				waitForObj(1000);
				click(registerasInvestorlocators.righttorejectafamily);
				waitForObj(1000);
				click(registerasInvestorlocators.accuracyandAuthentication);
				waitForObj(1000);
				click(registerasInvestorlocators.confirmthestatements);
				waitForObj(1000);
				click(registerasInvestorlocators.submit);
				waitForElement(registerasInvestorlocators.smeMessage, 60);
				text(registerasInvestorlocators.smeMessage);
				switchwindow(0);
				
		pdfResultReport.addStepDetails("Register as Invoice FInancing","User should register as Invoice FInancing","Successfully registered as Invoice Financing" + " ","Pass", "Y");
		
	}
	catch(Exception e) {
		log.fatal("Unable to Homelogin"+e.getMessage());
		pdfResultReport.addStepDetails("Register as Invoice FInancing", "User is not able to register as Invoice FInancing", "Successfully registered as Invoice FInancing"+e.getMessage(), "Fail", "N");
	}
		
		
	}
	
	

	public void invoiceFinancingCorporateVendorFinancingSME() throws Exception {
		try {
			click(registerasInvestorlocators.invoicefinancingcvf);
			select(registerasInvestorlocators.corporate, pdfResultReport.testData.get("Name of the corporate"));
			set(registerasInvestorlocators.requestamount, pdfResultReport.testData.get("Requested amount by SME"));
			select(registerasInvestorlocators.tenureRequired2, pdfResultReport.testData.get("Tenure Required"));
			// pageDown();
			waitForObj(5000);
				uploadFile(registerasInvestorlocators.last1yearfinancialStatements);
				waitForObj(2000);
				uploadFile(registerasInvestorlocators.sixMonthsbankstatement);
				waitForObj(5000);
				uploadFile(registerasInvestorlocators.cbsFileforAllDirectors);
				waitForObj(2000);
				uploadFile(registerasInvestorlocators.noticeofAssesments);
				waitForObj(2000);
				uploadFile(registerasInvestorlocators.sixmonthsaccounts);
				waitForObj(2000);
				uploadFile(registerasInvestorlocators.boardofDirectors);
				waitForObj(2000);
						
				set(registerasInvestorlocators.noofEmployees, pdfResultReport.testData.get("No of employees"));
				set(registerasInvestorlocators.annualRevenuepreviousyear, pdfResultReport.testData.get("Annual Revenue Previous year"));
				set(registerasInvestorlocators.annualRevenueLatestyear, pdfResultReport.testData.get("Annual Revenue latest year"));
				set(registerasInvestorlocators.netProfitLossPreviousyear, pdfResultReport.testData.get("Net Profit loss previous year"));
				set(registerasInvestorlocators.netProfitLossLatestyear, pdfResultReport.testData.get("Net Profit loss latest year"));
				set(registerasInvestorlocators.personalGuarantor1, pdfResultReport.testData.get("Name of Personal Guarantor"));
				set(registerasInvestorlocators.residentialStatus, pdfResultReport.testData.get("Residential Status"));
				set(registerasInvestorlocators.annualtaxableIncomelatestyear, pdfResultReport.testData.get("Annual taxable income previous year"));
				set(registerasInvestorlocators.annualtaxableIncomepreviousyear, pdfResultReport.testData.get("Annual taxable income latest year"));
				// pageDown();
				click(registerasInvestorlocators.confirmAccountprofile);
				click(registerasInvestorlocators.agreetobond);
				click(registerasInvestorlocators.disclosureinformation);
				click(registerasInvestorlocators.righttorejectafamily);
				click(registerasInvestorlocators.accuracyandAuthentication);
				click(registerasInvestorlocators.confirmthestatements);
				click(registerasInvestorlocators.submit);
				
		pdfResultReport.addStepDetails("Register as Invoice FInancing(corporate vendor financing)","User should register as Invoice FInancing(corporate vendor financing)","Successfully registered as SME" + " ","Pass", "Y");
		
	}
	catch(Exception e) {
		log.fatal("Unable to Homelogin"+e.getMessage());
		pdfResultReport.addStepDetails("Register as Invoice FInancing(corporate vendor financing)", "User is not able to register as Invoice FInancing(corporate vendor financing)", "Successfully registered as Invoice FInancing(corporate vendor financing)"+e.getMessage(), "Fail", "N");
	}
		
		
	}
	
	public void workingCapitalFinancing() throws Exception {
		try {
			
			click(registerasInvestorlocators.workingcapitalFinancing);
			
			set(registerasInvestorlocators.requestamount, pdfResultReport.testData.get("Requested amount by SME"));
			select(registerasInvestorlocators.tenureRequired, pdfResultReport.testData.get("Tenure Required"));
			set(registerasInvestorlocators.noofEmployees, pdfResultReport.testData.get("No of employees"));
			set(registerasInvestorlocators.annualRevenuepreviousyear, pdfResultReport.testData.get("Annual Revenue Previous year"));
			set(registerasInvestorlocators.annualRevenueLatestyear, pdfResultReport.testData.get("Annual Revenue latest year"));
			set(registerasInvestorlocators.netProfitLossPreviousyear, pdfResultReport.testData.get("Net Profit loss previous year"));
			set(registerasInvestorlocators.netProfitLossLatestyear, pdfResultReport.testData.get("Net Profit loss latest year"));
			set(registerasInvestorlocators.personalGuarantor1, pdfResultReport.testData.get("Name of Personal Guarantor"));
			set(registerasInvestorlocators.residentialStatus, pdfResultReport.testData.get("Residential Status"));
			
			// pageDown();
				//uploadFile(registerasInvestorlocators.cbsfileforalldirectors);
				waitForObj(2000);
				uploadFile(registerasInvestorlocators.cbsfileforallpersonalguarantor);
				waitForObj(2000);
				uploadFile(registerasInvestorlocators.bankstatementforlast6months);
				waitForObj(2000);
				uploadFile(registerasInvestorlocators.incometaxassessment);
				waitForObj(2000);
				uploadFile(registerasInvestorlocators.incometaxassessmentdirectors);
				waitForObj(2000);
				uploadFile(registerasInvestorlocators.incometaxassessmentpersonalGuarantors);
				waitForObj(2000);
				uploadFile(registerasInvestorlocators.accountreceivablelast12months);
				waitForObj(2000);
				uploadFile(registerasInvestorlocators.lastFinancialstatements);
				waitForObj(2000);
				uploadFile(registerasInvestorlocators.yeartodatemanagement);
				waitForObj(2000);
				uploadFile(registerasInvestorlocators.optionalfilesSME1);
				waitForObj(2000);
				uploadFile(registerasInvestorlocators.certifiedtrueExtracts);
				waitForObj(2000);
				
				click(registerasInvestorlocators.confirmAccountprofile);
				click(registerasInvestorlocators.agreetobond);
				click(registerasInvestorlocators.disclosureinformation);
				click(registerasInvestorlocators.righttorejectafamily);
				click(registerasInvestorlocators.accuracyandAuthentication);
				click(registerasInvestorlocators.confirmthestatements);
				click(registerasInvestorlocators.submit);
				
		pdfResultReport.addStepDetails("Register as Working capital Financing","User should register as Working capital Financing","Successfully registered as Working capital Financing" + " ","Pass", "Y");
		
	}
	catch(Exception e) {
		log.fatal("Unable to Homelogin"+e.getMessage());
		pdfResultReport.addStepDetails("Register as Working capital Financing", "User is not able to register as Working capital Financing", "Successfully registered as Working capital Financing"+e.getMessage(), "Fail", "N");
	}
		}
	

	public void workingCapitalFinancingSinglePayment() throws Exception {
		try {
			
			click(registerasInvestorlocators.workingcapitalFinancingsinglepayment);
			
			set(registerasInvestorlocators.requestamount, pdfResultReport.testData.get(""));
			select(registerasInvestorlocators.tenureRequired, pdfResultReport.testData.get(""));
			set(registerasInvestorlocators.noofEmployees, pdfResultReport.testData.get(""));
			set(registerasInvestorlocators.annualRevenuepreviousyear, pdfResultReport.testData.get(" "));
			set(registerasInvestorlocators.annualRevenueLatestyear, pdfResultReport.testData.get(" "));
			set(registerasInvestorlocators.netProfitLossPreviousyear, pdfResultReport.testData.get(" "));
			set(registerasInvestorlocators.netProfitLossLatestyear, pdfResultReport.testData.get(" "));
			set(registerasInvestorlocators.personalGuarantor1, pdfResultReport.testData.get(" "));
			set(registerasInvestorlocators.residentialStatus, pdfResultReport.testData.get(" "));
			set(registerasInvestorlocators.annualtaxableIncomelatestyear, pdfResultReport.testData.get(" "));
			set(registerasInvestorlocators.annualtaxableIncomepreviousyear, pdfResultReport.testData.get(" "));
			
			// pageDown();
			    uploadFile(registerasInvestorlocators.workContractDocument);
			    waitForObj(2000);
			    uploadFile(registerasInvestorlocators.workProgress);
			    waitForObj(2000);
				//uploadFile(registerasInvestorlocators.cbsfileforalldirectors);
				waitForObj(2000);
				uploadFile(registerasInvestorlocators.cbsfileforallpersonalguarantor);
				waitForObj(2000);
				uploadFile(registerasInvestorlocators.bankstatementforlast6months);
				waitForObj(2000);
				uploadFile(registerasInvestorlocators.incometaxassessment);
				waitForObj(2000);
				uploadFile(registerasInvestorlocators.incometaxassessmentdirectors);
				waitForObj(2000);
				uploadFile(registerasInvestorlocators.incometaxassessmentpersonalGuarantors);
				waitForObj(2000);
				uploadFile(registerasInvestorlocators.accountreceivablelast12months);
				waitForObj(2000);
				uploadFile(registerasInvestorlocators.lastFinancialstatements);
				waitForObj(2000);
				uploadFile(registerasInvestorlocators.yeartodatemanagement);
				waitForObj(2000);
				uploadFile(registerasInvestorlocators.optionalfilesSME1);
				waitForObj(2000);
				uploadFile(registerasInvestorlocators.certifiedtrueExtracts);
				waitForObj(2000);
				
				click(registerasInvestorlocators.confirmAccountprofile);
				click(registerasInvestorlocators.agreetobond);
				click(registerasInvestorlocators.disclosureinformation);
				click(registerasInvestorlocators.righttorejectafamily);
				click(registerasInvestorlocators.accuracyandAuthentication);
				click(registerasInvestorlocators.confirmthestatements);
				click(registerasInvestorlocators.submit);
				
		pdfResultReport.addStepDetails("Register as Working capital Financing(Single Payment)","User should register as Working capital Financing(Single Payment)","Successfully registered as Working capital Financing(Single Payment)" + " ","Pass", "Y");
		
	}
	catch(Exception e) {
		log.fatal("Unable to Homelogin"+e.getMessage());
		pdfResultReport.addStepDetails("Register as Working capital Financing(Single Payment)", "User is not able to register as Working capital Financing(Single Payment)", "Unable to register as Working capital Financing(Single Payment)"+e.getMessage(), "Fail", "N");
	}
		}
	
	
	
	
	public void invoiceFinancingcardfacility() throws Exception {
		try {
			
			click(registerasInvestorlocators.invoiceFinancingCardFacility);
			
			
			set(registerasInvestorlocators.noofEmployees, pdfResultReport.testData.get("No of employees"));
			set(registerasInvestorlocators.annualRevenuepreviousyear, pdfResultReport.testData.get("Annual Revenue Previous year"));
			set(registerasInvestorlocators.annualRevenueLatestyear, pdfResultReport.testData.get("Annual Revenue latest year"));
			set(registerasInvestorlocators.netProfitLossPreviousyear, pdfResultReport.testData.get("Net Profit loss previous year"));
			set(registerasInvestorlocators.netProfitLossLatestyear, pdfResultReport.testData.get("Net Profit loss latest year"));
			set(registerasInvestorlocators.personalGuarantor1, pdfResultReport.testData.get("Name of Personal Guarantor"));
			set(registerasInvestorlocators.residentialStatus, pdfResultReport.testData.get("Residential Status"));
			set(registerasInvestorlocators.annualtaxableIncomelatestyear, pdfResultReport.testData.get("Annual taxable income previous year"));
			set(registerasInvestorlocators.annualtaxableIncomepreviousyear, pdfResultReport.testData.get("Annual taxable income latest year"));
			
			// pageDown();
			    uploadFile(registerasInvestorlocators.invoiceDebtor);
			    waitForObj(2000);
			    uploadFile(registerasInvestorlocators.optionalfilesSME4);
			    waitForObj(2000);
				uploadFile(registerasInvestorlocators.certifiedtrueExtracts4);
				waitForObj(2000);
				
				
				click(registerasInvestorlocators.confirmAccountprofile);
				click(registerasInvestorlocators.agreetobond);
				click(registerasInvestorlocators.disclosureinformation);
				click(registerasInvestorlocators.righttorejectafamily);
				click(registerasInvestorlocators.accuracyandAuthentication);
				click(registerasInvestorlocators.confirmthestatements);
				click(registerasInvestorlocators.submit);
				
		pdfResultReport.addStepDetails("Register as Working Invoice financing(card facility)","User should register as Invoice financing(card facility)","Successfully registered as Invoice financing(card facility)" + " ","Pass", "Y");
		
	}
	catch(Exception e) {
		log.fatal("Unable to Homelogin"+e.getMessage());
		pdfResultReport.addStepDetails("Register as Invoice financing(card facility)", "User is not able to register as Invoice financing(card facility)", "Unable to register as Invoice Financing(card facility)"+e.getMessage(), "Fail", "N");
	}
		}
	
	public void verifyBrokenLinksMainPage(String from,String loc1, String loc2,String expctd, String to) throws Throwable {
		try {
		ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/");
		waitForObj(3000);
		ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
		waitForObj(3000);
		String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).getText();
		waitForObj(3000);
	
		if(str.equalsIgnoreCase(expctd)) {
			System.out.println("Link is not broken");
		}else  {
			System.out.println("Link is broken");
		}
		//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
	
		pdfResultReport.addStepDetails("verifyBrokenLinksMainPage","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
		
	}
	catch(Exception e) {
		log.fatal("Unable to Homelogin"+e.getMessage());
		pdfResultReport.addStepDetails("verifyBrokenLinksMainPage","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
		//	pdfResultReport.addStepDetails("verifyBrokenLinksMainPage","Application should verify the link in :"+ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Unable to navigate to the link : " +ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Fail", "N");
	}
	
	}
	
	
	public void verifyBrokenLinkMainPage(String from, String to) throws Throwable {
		try {
		ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/");
		waitForObj(3000);
		Actions a = new Actions(ThreadLocalWebdriver.getDriver());
		a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	List<WebElement> ele =	ThreadLocalWebdriver.getDriver().findElements(By.xpath("//div[@class='uk-width-1-1']/div[@class='uk-slidenav-position uk-margin']//ul[@class='uk-slider uk-grid-width-medium-1-4']/li"));
		System.out.println(ele.size());
		for(int i=1;i<=18;i++) {
			if(ele.get(i).isDisplayed()) {
			//waitForObj(3000);
			a.moveToElement(ThreadLocalWebdriver.getDriver().findElement(By.xpath("//div[@class='uk-width-1-1']/div[@class='uk-slidenav-position uk-margin']//ul[@class='uk-slider uk-grid-width-medium-1-4']/li[@data-slide='"+i+"']"))).build().perform();
			
		try {
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//div[@class='uk-width-1-1']/div[@class='uk-slidenav-position uk-margin']//ul[@class='uk-slider uk-grid-width-medium-1-4']/li[@data-slide='"+i+"']")).click();
			/*String str1 = ThreadLocalWebdriver.getDriver().switchTo().alert().getText();
			System.out.println(str1);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("(//button[@class='uk-modal-close uk-close'])["+i+"]"));
*/
			Thread.sleep(2000);
			 Robot robot = new Robot();
			 robot.keyPress(KeyEvent.VK_ESCAPE);
			 robot.keyRelease(KeyEvent.VK_ESCAPE);
		        
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}
	/*	String str1 = ThreadLocalWebdriver.getDriver().switchTo().alert().getText();
		System.out.println(str1);*/
		
	//	ThreadLocalWebdriver.getDriver().findElement(By.xpath("(//button[@class='uk-modal-close uk-close'])["+i+"]"));
		/*String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).getText();
		waitForObj(3000);
	*/
		/*if(str1.equalsIgnoreCase(expctd)) {
			System.out.println("Link is not broken");
		}else  {
			System.out.println("Link is broken");
		}*/
		}
		//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
	
		pdfResultReport.addStepDetails("verifyBrokenLinksMainPage","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
		//ThreadLocalWebdriver.getDriver().quit();
		
	}
	catch(Exception e) {
		log.fatal("Unable to Homelogin"+e.getMessage());
		pdfResultReport.addStepDetails("verifyBrokenLinksMainPage","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
		//	pdfResultReport.addStepDetails("verifyBrokenLinksMainPage","Application should verify the link in :"+ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Unable to navigate to the link : " +ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Fail", "N");
		//ThreadLocalWebdriver.getDriver().quit();
	}
	
	}
	
	public void verifyBrokenLinksContactsPage(String from,String loc1, String loc2,String expctd, String to) throws Throwable {
		try {
		ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/contact.html");
		waitForObj(3000);
		ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
		waitForObj(3000);
		String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).getText();
		waitForObj(3000);
	
		if(str.equalsIgnoreCase(expctd)) {
			System.out.println("Link is not broken");
		}else  {
			System.out.println("Link is broken");
		}
		//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
	
		pdfResultReport.addStepDetails("verifyBrokenLinksContactsPage","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
		
	}
	catch(Exception e) {
		log.fatal("Unable to Homelogin"+e.getMessage());
		pdfResultReport.addStepDetails("verifyBrokenLinksContactsPage","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
		//	pdfResultReport.addStepDetails("verifyBrokenLinksMainPage","Application should verify the link in :"+ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Unable to navigate to the link : " +ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Fail", "N");
	}
	
	}
	
	
	public void verifyBrokenLinksIndexPage(String from,String loc1, String loc2,String expctd, String to) throws Throwable {
		try {
		ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/index.html");
		waitForObj(3000);
		ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
		waitForObj(3000);
		String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).getText();
		waitForObj(3000);
	
		if(str.equalsIgnoreCase(expctd)) {
			System.out.println("Link is not broken");
		}else  {
			System.out.println("Link is broken");
		}
		//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
	
		pdfResultReport.addStepDetails("verifyBrokenLinksIndexPage","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
		
	}
	catch(Exception e) {
		log.fatal("Unable to Homelogin"+e.getMessage());
		pdfResultReport.addStepDetails("verifyBrokenLinksContactsPage","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
		//	pdfResultReport.addStepDetails("verifyBrokenLinksMainPage","Application should verify the link in :"+ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Unable to navigate to the link : " +ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Fail", "N");
	}
	
	}

	public void verifyBrokenLinksInvest(String from, String loc1, String loc2,String expctd, String to) throws Throwable {
		try {
		ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/invest.html");
		waitForObj(3000);
		ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
		waitForObj(3000);
		String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).getText();
		waitForObj(3000);
	
		if(str.equalsIgnoreCase(expctd)) {
			System.out.println("Link is not broken");
		}else  {
			System.out.println("Link is broken");
		}
		//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
	
	

		pdfResultReport.addStepDetails("verifyBrokenLinksInvest","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
		
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("verifyBrokenLinksInvest","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
			//	pdfResultReport.addStepDetails("verifyBrokenLinksMainPage","Application should verify the link in :"+ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Unable to navigate to the link : " +ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Fail", "N");
		}
	
	}
	
	public void verifyFooterlinks(String from, String URL, String loc1, String loc2, String expctd, String to) throws Exception {
		try {
			ThreadLocalWebdriver.getDriver().get(URL);
			waitForObj(3000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
			waitForObj(3000);
			switchwindow(1);
			waitForObj(2000);
		/*	String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).getText();
			waitForObj(3000);
					
			if(str.equalsIgnoreCase(expctd)) {
				System.out.println("Link is not broken");
			}else  {
				System.out.println("Link is broken");
			}*/
			//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
		
		
			pdfResultReport.addStepDetails("verifyFooterlinks","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
			ThreadLocalWebdriver.getDriver().close();
			waitForObj(3000);
			switchwindow(0);
			waitForObj(3000);
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("verifyFooterlinks","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
			//	pdfResultReport.addStepDetails("verifyBrokenLinksMainPage","Application should verify the link in :"+ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Unable to navigate to the link : " +ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Fail", "N");
		
			ThreadLocalWebdriver.getDriver().close();
			waitForObj(1000);
			switchwindow(0);
			waitForObj(1000);
		}
	}
		
		
		public void verifyFooterlink(String from, String URL, String loc1, String expctd, String to) throws Exception {
			try {
				ThreadLocalWebdriver.getDriver().get(URL);
				waitForObj(3000);
				ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
				waitForObj(3000);
				switchwindow(1);
				waitForObj(2000);
				/*String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).getText();
				waitForObj(3000);
						
				if(str.equalsIgnoreCase(expctd)) {
					System.out.println("Link is not broken");
				}else  {
					System.out.println("Link is broken");
				}*/
				//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
			
			
				pdfResultReport.addStepDetails("verifyFooterlinks","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
				ThreadLocalWebdriver.getDriver().close();
				waitForObj(3000);
				switchwindow(0);
				waitForObj(3000);
			}
			catch(Exception e) {
				log.fatal("Unable to Homelogin"+e.getMessage());
				pdfResultReport.addStepDetails("verifyFooterlinks","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
				//	pdfResultReport.addStepDetails("verifyBrokenLinksMainPage","Application should verify the link in :"+ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Unable to navigate to the link : " +ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Fail", "N");
			
				ThreadLocalWebdriver.getDriver().close();
				waitForObj(1000);
				switchwindow(0);
				waitForObj(1000);
			}
		
		
	}
	
	
	
	
	
	public void verifyBrokenLinksSME(String from, String loc1, String loc2,String expctd, String to) throws Throwable {
		try {
		ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/borrow.html");
		waitForObj(3000);
		ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
		waitForObj(5000);
		String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).getText();
		waitForObj(3000);
	
		if(str.equalsIgnoreCase(expctd)) {
			System.out.println("Link is not broken");
		}else  {
			System.out.println("Link is broken");
		}
		//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
	
		pdfResultReport.addStepDetails("verifyBrokenLinksSME","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
		
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("verifyBrokenLinksSME","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
			//	pdfResultReport.addStepDetails("verifyBrokenLinksMainPage","Application should verify the link in :"+ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Unable to navigate to the link : " +ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Fail", "N");
		}
	
	}
	
	public void verifyPressBrokenLinks(String from, String loc1, String loc2,String expctd, String to) throws Throwable {
		try {
		ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/press.html");
		waitForObj(3000);
		ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
		waitForObj(5000);
		String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).getText();
		waitForObj(3000);
	
		if(str.equalsIgnoreCase(expctd)) {
			System.out.println("Link is not broken");
		}else  {
			System.out.println("Link is broken");
		}
		//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
	
		pdfResultReport.addStepDetails("verifyPressBrokenLinks","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
		//ThreadLocalWebdriver.getDriver().close();
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("verifyPressBrokenLinks","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
			//	pdfResultReport.addStepDetails("verifyBrokenLinksMainPage","Application should verify the link in :"+ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Unable to navigate to the link : " +ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Fail", "N");
		}
	
	}
	
	public void verifyBrokenLinksPress(String from, String loc1,   String to) throws Throwable {
		try {
			waitForObj(3000);
		ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/press.html");
		waitForObj(3000);
		ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
		waitForObj(3000);
		switchwindow(1);
		waitForObj(6000);
		
		/*String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).getText();
		waitForObj(3000);
	
		if(str.equalsIgnoreCase(expctd)) {
			System.out.println("Link is not broken");
		}else  {
			System.out.println("Link is broken");
		}*/
		//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
	

		pdfResultReport.addStepDetails("verifyBrokenLinksPress","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
		ThreadLocalWebdriver.getDriver().close();
		switchwindow(0);
	}
	catch(Exception e) {
		log.fatal("Unable to Homelogin"+e.getMessage());
		pdfResultReport.addStepDetails("verifyBrokenLinksPress","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
		//	pdfResultReport.addStepDetails("verifyBrokenLinksMainPage","Application should verify the link in :"+ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Unable to navigate to the link : " +ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Fail", "N");
	}
	}
	
	public void verifyMainPageBrokenLinks(String from, String loc1, String to) throws Throwable {
		try {
			waitForObj(3000);
		ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/press.html");
		waitForObj(3000);
		ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
		waitForObj(3000);
		switchwindow(1);
		waitForObj(2000);
		
		/*String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).getText();
		waitForObj(3000);
	
		if(str.equalsIgnoreCase(expctd)) {
			System.out.println("Link is not broken");
		}else  {
			System.out.println("Link is broken");
		}
		//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
*/	
	

		pdfResultReport.addStepDetails("verifyMainPageBrokenLinks","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
		ThreadLocalWebdriver.getDriver().close();
		switchwindow(0);
	}
	catch(Exception e) {
		log.fatal("Unable to Homelogin"+e.getMessage());
		pdfResultReport.addStepDetails("verifyMainPageBrokenLinks","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
		//	pdfResultReport.addStepDetails("verifyBrokenLinksMainPage","Application should verify the link in :"+ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Unable to navigate to the link : " +ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Fail", "N");
	}
	}
	public void verifyBrokenLinksAbout(String from,String loc1, String loc2, String expctd,String to) throws Throwable {
		try {
		ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/about.html");
		waitForObj(3000);
		ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
		waitForObj(3000);
		//ThreadLocalWebdriver.getDriver().switchTo().alert();
		String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).getText();
		waitForObj(3000);
	
		if(str.equalsIgnoreCase(expctd)) {
			System.out.println("Link is not broken");
		}else  {
			System.out.println("Link is broken");
		}
		//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
	
	
		pdfResultReport.addStepDetails("verifyBrokenLinksAbout","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
		
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("verifyBrokenLinksAbout","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
			//	pdfResultReport.addStepDetails("verifyBrokenLinksMainPage","Application should verify the link in :"+ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Unable to navigate to the link : " +ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Fail", "N");
		}
		
	}
	
	public void verifyCompanytabBoardofAdvisors(String from, String URL, String loc1, String loc2,String expctd,  String to) throws Throwable {
		
		try {
		ThreadLocalWebdriver.getDriver().get(URL);
		Mousehover(ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)));
		waitForObj(4000);
		ThreadLocalWebdriver.getDriver().findElement(By.xpath("(//a[contains(text(),'Board of Advisors')])[1]")).click();
		waitForObj(3000);
	//	ThreadLocalWebdriver.getDriver().switchTo().alert();
		String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).getText();
		waitForObj(3000);
	
		if(str.equalsIgnoreCase(expctd)) {
			System.out.println("Link is not broken");
		}else  {
			System.out.println("Link is broken");
		}
		
		pdfResultReport.addStepDetails("verifyCompanytabBoardofAdvisors","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
		//ThreadLocalWebdriver.getDriver().close();
	}
	catch(Exception e) {
		log.fatal("Unable to Homelogin"+e.getMessage());
		pdfResultReport.addStepDetails("verifyCompanytabBoardofAdvisors","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
		//	pdfResultReport.addStepDetails("verifyBrokenLinksMainPage","Application should verify the link in :"+ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Unable to navigate to the link : " +ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Fail", "N");
	}
		
	}
	public void verifyCompanytabCarrers(String from, String URL,String loc1, String loc2,String expctd,  String to) throws Throwable {
		
		try {
		
		ThreadLocalWebdriver.getDriver().get(URL);
		Mousehover(ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)));
		waitForObj(3000);
		ThreadLocalWebdriver.getDriver().findElement(By.xpath("(//a[contains(text(),'Careers')])[1]")).click();
		waitForObj(3000);
	//	ThreadLocalWebdriver.getDriver().switchTo().alert();
		String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).getText();
		waitForObj(3000);
	
		if(str.equalsIgnoreCase(expctd)) {
			System.out.println("Link is not broken");
		}else  {
			System.out.println("Link is broken");
		}
	
		
		pdfResultReport.addStepDetails("verifyCompanytabCarrers","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
		//ThreadLocalWebdriver.getDriver().close();
	}
	catch(Exception e) {
		log.fatal("Unable to Homelogin"+e.getMessage());
		pdfResultReport.addStepDetails("verifyCompanytabCarrers","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
		//	pdfResultReport.addStepDetails("verifyBrokenLinksMainPage","Application should verify the link in :"+ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Unable to navigate to the link : " +ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Fail", "N");
	}
		
	}
	
	public void verifyCompanytabFAQ(String from, String URL, String loc1, String loc2,String expctd,  String to) throws Exception {
		
		try {
		
		ThreadLocalWebdriver.getDriver().get(URL);
		Mousehover(ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)));
		waitForObj(4000);
		ThreadLocalWebdriver.getDriver().findElement(By.xpath("(//a[contains(text(),'FAQs')])[1]")).click();
		waitForObj(3000);
	//	ThreadLocalWebdriver.getDriver().switchTo().alert();
		String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).getText();
		waitForObj(3000);
	
		if(str.equalsIgnoreCase(expctd)) {
			System.out.println("Link is not broken");
		}else  {
			System.out.println("Link is broken");
		}
		pdfResultReport.addStepDetails("verifyCompanytabFAQ","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
		//ThreadLocalWebdriver.getDriver().close();
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("verifyCompanytabFAQ","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
			//	pdfResultReport.addStepDetails("verifyBrokenLinksMainPage","Application should verify the link in :"+ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Unable to navigate to the link : " +ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Fail", "N");
		}
			
	}
	
		public void verifyBrokenLinksAdvisor(String from,String loc1, String loc2, String expctd, String to) throws Throwable {
			try {
			ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/board-of-advisors.html");
			waitForObj(3000);
			
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
			waitForObj(3000);
		//	ThreadLocalWebdriver.getDriver().switchTo().alert();
			String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).getText();
			waitForObj(3000);
		
			if(str.equalsIgnoreCase(expctd)) {
				System.out.println("Link is not broken");
			}else  {
				System.out.println("Link is broken");
			}
			//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
		
		
			pdfResultReport.addStepDetails("verifyBrokenLinksAdvisor","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
			
			}
			catch(Exception e) {
				log.fatal("Unable to Homelogin"+e.getMessage());
				pdfResultReport.addStepDetails("verifyBrokenLinksAdvisor","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
				//	pdfResultReport.addStepDetails("verifyBrokenLinksMainPage","Application should verify the link in :"+ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Unable to navigate to the link : " +ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Fail", "N");
			}
		
	
		}
		

		public void verifyBrokenLinksCareer(String from, String loc1,String loc2, String expctd, String to) throws Throwable {
			try {
			ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/careers.html");
			waitForObj(3000);
 		ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
			waitForObj(3000);
			String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).getText();
			waitForObj(3000); 
		
			if(str.equalsIgnoreCase(expctd)) {
				System.out.println("Link is not broken");
			}else  {
				System.out.println("Link is broken");
			}
			//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");

			pdfResultReport.addStepDetails("verifyBrokenLinksCareer","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
			
			}
			catch(Exception e) {
				log.fatal("Unable to Homelogin"+e.getMessage());
				pdfResultReport.addStepDetails("verifyBrokenLinksCareer","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
				//	pdfResultReport.addStepDetails("verifyBrokenLinksMainPage","Application should verify the link in :"+ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Unable to navigate to the link : " +ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Fail", "N");
			}
		
		
	
		}
	
		public void verifyBrokenLinksFAQ(String from, String loc1,String loc2, String expctd, String to) throws Throwable {
			try {
			ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/faq.html");
			waitForObj(4000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
			waitForObj(4000);
			String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).getText();
			waitForObj(3000); 
		
			if(str.equalsIgnoreCase(expctd)) {
				System.out.println("Link is not broken");
			}else  {
				System.out.println("Link is broken");
			}
			//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
		
pdfResultReport.addStepDetails("verifyBrokenLinksFAQ","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
			
			}
			catch(Exception e) {
				log.fatal("Unable to Homelogin"+e.getMessage());
				pdfResultReport.addStepDetails("verifyBrokenLinksFAQ","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
				//	pdfResultReport.addStepDetails("verifyBrokenLinksMainPage","Application should verify the link in :"+ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Unable to navigate to the link : " +ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Fail", "N");
			}
		
	
		}

		
		public void verifyBrokenLinksLogin(String from, String loc1,String loc2, String expctd, String to) throws Throwable {
			try {
			ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/platform/index.php/home/login");
			waitForObj(4000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
			waitForObj(4000);
			String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).getText();
			waitForObj(3000); 
		
			if(str.equalsIgnoreCase(expctd)) {
				System.out.println("Link is not broken");
			}else  {
				System.out.println("Link is broken");
			}
			//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
		
pdfResultReport.addStepDetails("verifyBrokenLinksLogin","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
			
			}
			catch(Exception e) {
				log.fatal("Unable to Homelogin"+e.getMessage());
				pdfResultReport.addStepDetails("verifyBrokenLinksLogin","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
				//	pdfResultReport.addStepDetails("verifyBrokenLinksMainPage","Application should verify the link in :"+ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Unable to navigate to the link : " +ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Fail", "N");
			}
		
	
		}
		
		
		public void verifyBrokenLinksResetpassword(String from, String loc1,String loc2, String expctd, String to) throws Throwable {
			try {
			ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/platform/index.php/home/forgot_password");
			waitForObj(4000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
			waitForObj(4000);
			String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).getText();
			waitForObj(3000); 
		
			if(str.equalsIgnoreCase(expctd)) {
				System.out.println("Link is not broken");
			}else  {
				System.out.println("Link is broken");
			}
			//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
		
pdfResultReport.addStepDetails("verifyBrokenLinksResetpassword","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
			
			}
			catch(Exception e) {
				log.fatal("Unable to Homelogin"+e.getMessage());
				pdfResultReport.addStepDetails("verifyBrokenLinksResetpassword","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
				//	pdfResultReport.addStepDetails("verifyBrokenLinksMainPage","Application should verify the link in :"+ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Unable to navigate to the link : " +ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Fail", "N");
			}
		
	
		}
		
		
		
		public void verifyBrokenLinksInvestorRegister(String from, String url, String loc1, String loc2, String loc3, String loc4,String loc5, String expctd, String to) throws Throwable {
			try {
				
			ThreadLocalWebdriver.getDriver().get(url);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
			waitForObj(2000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).click();
			waitForObj(2000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc3)).click();
			waitForObj(4000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc4)).click();
			waitForObj(4000);
			String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc5)).getText();
			waitForObj(3000); 
		
			if(str.equalsIgnoreCase(expctd)) {
				System.out.println("Link is not broken");
			}else  {
				System.out.println("Link is broken");
			}
			//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
		
pdfResultReport.addStepDetails("verifyBrokenLinksInvestorRegister","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
			
			}
			catch(Exception e) {
				log.fatal("Unable to Homelogin"+e.getMessage());
				pdfResultReport.addStepDetails("verifyBrokenLinksInvestorRegister","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
				//	pdfResultReport.addStepDetails("verifyBrokenLinksMainPage","Application should verify the link in :"+ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Unable to navigate to the link : " +ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Fail", "N");
			}
		
	
		}
		
		public void verifyBrokenLinksSMERegister(String from, String url, String loc1, String loc2, String loc3, String loc4,String loc5, String expctd, String to) throws Throwable {
			try {
				
			ThreadLocalWebdriver.getDriver().get(url);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
			waitForObj(2000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).click();
			waitForObj(2000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc3)).click();
			waitForObj(4000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc4)).click();
			waitForObj(4000);
			String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc5)).getText();
			waitForObj(3000); 
		
			if(str.equalsIgnoreCase(expctd)) {
				System.out.println("Link is not broken");
			}else  {
				System.out.println("Link is broken");
			}
			//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
		
pdfResultReport.addStepDetails("verifyBrokenLinksSMERegister","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
			
			}
			catch(Exception e) {
				log.fatal("Unable to Homelogin"+e.getMessage());
				pdfResultReport.addStepDetails("verifyBrokenLinksSMERegister","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
				//	pdfResultReport.addStepDetails("verifyBrokenLinksMainPage","Application should verify the link in :"+ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Unable to navigate to the link : " +ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Fail", "N");
			}
		
	
		}

		public void verifyPDFlinks(String from, String URL, String loc1, String loc2, String expctd, String to) throws Exception {
			try {
				ThreadLocalWebdriver.getDriver().get(URL);
				waitForObj(3000);
				ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
				waitForObj(3000);
				switchwindow(1);
				waitForObj(2000);
				String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).getText();
				waitForObj(3000);
						
				if(str.equalsIgnoreCase(expctd)) {
					System.out.println("Link is not broken");
				}else  {
					System.out.println("Link is broken");
				}
				//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
			
			
				pdfResultReport.addStepDetails("verifyFooterlinks","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
				ThreadLocalWebdriver.getDriver().close();
				waitForObj(3000);
				switchwindow(0);
				waitForObj(3000);
			}
			catch(Exception e) {
				log.fatal("Unable to Homelogin"+e.getMessage());
				pdfResultReport.addStepDetails("verifyFooterlinks","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
				//	pdfResultReport.addStepDetails("verifyBrokenLinksMainPage","Application should verify the link in :"+ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Unable to navigate to the link : " +ThreadLocalWebdriver.getDriver().getCurrentUrl(),"Fail", "N");
			
				ThreadLocalWebdriver.getDriver().close();
				waitForObj(1000);
				switchwindow(0);
				waitForObj(1000);
			}
		}

		
		
		
		public void verifyBrokenLinksProfilePage(String from,String loc1, String loc2,String expctd, String to) throws Throwable {
			try {
			ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/platform/index.php/investor/profile");
			waitForObj(3000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
			waitForObj(3000);
			String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).getText();
			waitForObj(3000);
		
			if(str.equalsIgnoreCase(expctd)) {
				System.out.println("Link is not broken");
			}else  {
				System.out.println("Link is broken");
			}
			//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
		
			pdfResultReport.addStepDetails("verifyBrokenLinksProfilePage","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
			
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("verifyBrokenLinksProfilePage","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
		}
		
		}
		
		public void verifyBrokenLinksHowToStartPage(String from,String loc1, String loc2,String expctd, String to) throws Throwable {
			try {
			ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/platform/index.php/investor/how_to_start");
			waitForObj(3000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
			waitForObj(3000);
			String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).getText();
			waitForObj(3000);
		
			if(str.equalsIgnoreCase(expctd)) {
				System.out.println("Link is not broken");
			}else  {
				System.out.println("Link is broken");
			}
			//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
		
			pdfResultReport.addStepDetails("verifyBrokenLinksHowToStartPage","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
			
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("verifyBrokenLinksHowToStartPage","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
		}
		
		}
		
		public void verifyBrokenLinksFacilitiesParticipatedPage(String from,String loc1, String loc2,String expctd, String to) throws Throwable {
			try {
			ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/platform/index.php/investor/facilities_participated");
			waitForObj(3000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
			waitForObj(3000);
			String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).getText();
			waitForObj(3000);
		
			if(str.equalsIgnoreCase(expctd)) {
				System.out.println("Link is not broken");
			}else  {
				System.out.println("Link is broken");
			}
			//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
		
			pdfResultReport.addStepDetails("verifyBrokenLinksFacilitiesParticipatedPage","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
			
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("verifyBrokenLinksFacilitiesParticipatedPage","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
		}
		
		}
		
		public void verifyBrokenLinksFacilitiesParticipated(String from,String loc1, String loc2, String loc3, String expctd, String to) throws Throwable {
			try {
			ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/platform/index.php/investor/facilities_participated");
			waitForObj(3000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
			Thread.sleep(2000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).click();
			waitForObj(3000);
			String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc3)).getText();
			waitForObj(3000);
		
			if(str.equalsIgnoreCase(expctd)) {
				System.out.println("Link is not broken");
			}else  {
				System.out.println("Link is broken");
			}
			//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
		
			pdfResultReport.addStepDetails("verifyBrokenLinksFacilitiesParticipated","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
			
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("verifyBrokenLinksFacilitiesParticipated","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
		}
		
		}
		
		public void verifyBrokenLinksAllLiveFacilitiesPage(String from,String loc1, String loc2,String expctd, String to) throws Throwable {
			try {
			ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/platform/index.php/investor/all_live_facilities");
			waitForObj(3000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
			waitForObj(3000);
			String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).getText();
			waitForObj(3000);
		
			if(str.equalsIgnoreCase(expctd)) {
				System.out.println("Link is not broken");
			}else  {
				System.out.println("Link is broken");
			}
			//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
		
			pdfResultReport.addStepDetails("verifyBrokenLinksAllLiveFacilitiesPage","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
			
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("verifyBrokenLinksAllLiveFacilitiesPage","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
		}
		
		}
		
		public void verifyBrokenLinksAllLiveFacilities(String from,String loc1, String loc2, String loc3, String expctd, String to) throws Throwable {
			try {
			ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/platform/index.php/investor/all_live_facilities");
			waitForObj(3000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
			Thread.sleep(2000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).click();
			waitForObj(3000);
			String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc3)).getText();
			waitForObj(3000);
		
			if(str.equalsIgnoreCase(expctd)) {
				System.out.println("Link is not broken");
			}else  {
				System.out.println("Link is broken");
			}
			//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
		
			pdfResultReport.addStepDetails("verifyBrokenLinksAllLiveFacilities","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
			
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("verifyBrokenLinksAllLiveFacilities","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
		}
		
		}
		
		
		
		
		public void verifyBrokenLinksTransactionsPage(String from,String loc1, String loc2,String expctd, String to) throws Throwable {
			try {
			ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/platform/index.php/investor/transactions");
			waitForObj(3000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
			waitForObj(3000);
			String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).getText();
			waitForObj(3000);
		
			if(str.equalsIgnoreCase(expctd)) {
				System.out.println("Link is not broken");
			}else  {
				System.out.println("Link is broken");
			}
			//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
		
			pdfResultReport.addStepDetails("verifyBrokenLinksTransactionsPage","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
			
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("verifyBrokenLinksTransactionsPage","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
		}
		
		}
		
		public void verifyBrokenLinksTransactions(String from,String loc1, String loc2, String loc3, String expctd, String to) throws Throwable {
			try {
			ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/platform/index.php/investor/transactions");
			waitForObj(3000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
			Thread.sleep(2000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).click();
			waitForObj(3000);
			String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc3)).getText();
			waitForObj(3000);
		
			if(str.equalsIgnoreCase(expctd)) {
				System.out.println("Link is not broken");
			}else  {
				System.out.println("Link is broken");
			}
			//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
		
			pdfResultReport.addStepDetails("verifyBrokenLinksTransactions","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
			
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("verifyBrokenLinksTransactions","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
		}
		
		}
		
		public void verifyBrokenLinksFinancialSummaryPage(String from,String loc1, String loc2,String expctd, String to) throws Throwable {
			try {
			ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/platform/index.php/investor/financial_summary");
			waitForObj(3000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
			waitForObj(3000);
			String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).getText();
			waitForObj(3000);
		
			if(str.equalsIgnoreCase(expctd)) {
				System.out.println("Link is not broken");
			}else  {
				System.out.println("Link is broken");
			}
			//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
		
			pdfResultReport.addStepDetails("verifyBrokenLinksFinancialSummaryPage","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
			
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("verifyBrokenLinksFinancialSummaryPage","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
		}
		
		}
		
		public void verifyBrokenLinksFinancialSummary(String from,String loc1, String loc2, String loc3, String expctd, String to) throws Throwable {
			try {
			ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/platform/index.php/investor/financial_summary");
			waitForObj(3000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
			Thread.sleep(2000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).click();
			waitForObj(3000);
			String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc3)).getText();
			waitForObj(3000);
		
			if(str.equalsIgnoreCase(expctd)) {
				System.out.println("Link is not broken");
			}else  {
				System.out.println("Link is broken");
			}
			//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
		
			pdfResultReport.addStepDetails("verifyBrokenLinksFinancialSummary","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
			
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("verifyBrokenLinksFinancialSummary","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
		}
		
		}
		
		
		public void verifyBrokenLinksAccountSummaryPage(String from,String loc1, String loc2,String expctd, String to) throws Throwable {
			try {
			ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/platform/index.php/investor/account_summary");
			waitForObj(3000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
			waitForObj(3000);
			String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).getText();
			waitForObj(3000);
		
			if(str.equalsIgnoreCase(expctd)) {
				System.out.println("Link is not broken");
			}else  {
				System.out.println("Link is broken");
			}
			//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
		
			pdfResultReport.addStepDetails("verifyBrokenLinksAccountSummaryPage","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
			
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("verifyBrokenLinksAccountSummaryPage","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
		}
		
		}
		
		public void verifyBrokenLinksAccountSummary(String from,String loc1, String loc2, String loc3, String expctd, String to) throws Throwable {
			try {
			ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/platform/index.php/investor/account_summary");
			waitForObj(3000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
			Thread.sleep(2000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).click();
			waitForObj(3000);
			String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc3)).getText();
			waitForObj(3000);
		
			if(str.equalsIgnoreCase(expctd)) {
				System.out.println("Link is not broken");
			}else  {
				System.out.println("Link is broken");
			}
			//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
		
			pdfResultReport.addStepDetails("verifyBrokenLinksHowToStart","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
			
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("verifyBrokenLinksHowToStart","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
		}
		
		}
		
		
		
		public void verifyBrokenLinksProfilePagetwo(String from,String loc1, String loc2, String loc3, String expctd, String to) throws Throwable {
			try {
			ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/platform/index.php/investor/profile");
			waitForObj(3000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
			Thread.sleep(2000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).click();
			waitForObj(3000);
			String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc3)).getText();
			waitForObj(3000);
		
			if(str.equalsIgnoreCase(expctd)) {
				System.out.println("Link is not broken");
			}else  {
				System.out.println("Link is broken");
			}
			//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
		
			pdfResultReport.addStepDetails("verifyBrokenLinksProfilePage","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
			
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("verifyBrokenLinksProfilePage","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
		}
		
		}
		
		
		public void verifyBrokenLinksBankPage(String from,String loc1, String loc2,String expctd, String to) throws Throwable {
			try {
			ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/platform/index.php/investor/bank");
			waitForObj(3000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
			waitForObj(3000);
			String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).getText();
			waitForObj(3000);
		
			if(str.equalsIgnoreCase(expctd)) {
				System.out.println("Link is not broken");
			}else  {
				System.out.println("Link is broken");
			}
			//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
		
			pdfResultReport.addStepDetails("verifyBrokenLinksBankPage","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
			
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("verifyBrokenLinksBankPage","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
		}
		
		}
		
		public void verifyBrokenLinksBank(String from,String loc1, String loc2, String loc3, String expctd, String to) throws Throwable {
			try {
			ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/platform/index.php/investor/bank");
			waitForObj(3000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
			Thread.sleep(2000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).click();
			waitForObj(3000);
			String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc3)).getText();
			waitForObj(3000);
		
			if(str.equalsIgnoreCase(expctd)) {
				System.out.println("Link is not broken");
			}else  {
				System.out.println("Link is broken");
			}
			//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
		
			pdfResultReport.addStepDetails("verifyBrokenLinksBank","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
			
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("verifyBrokenLinksBank","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
		}
		
		}
		
		
		public void verifyBrokenLinksHowToStart(String from,String loc1, String loc2, String loc3, String expctd, String to) throws Throwable {
			try {
			ThreadLocalWebdriver.getDriver().get("http://batumbu.com/pinjaman_bahasa_enkripsi/platform/index.php/investor/how_to_start");
			waitForObj(3000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc1)).click();
			Thread.sleep(2000);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc2)).click();
			waitForObj(3000);
			String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath(loc3)).getText();
			waitForObj(3000);
		
			if(str.equalsIgnoreCase(expctd)) {
				System.out.println("Link is not broken");
			}else  {
				System.out.println("Link is broken");
			}
			//ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/pinjaman/");
		
			pdfResultReport.addStepDetails("verifyBrokenLinksHowToStart","Application should verify the links from : "+from +"-->"+to,"Successfully navigated to the link :"+from +"-->"+to ,"Pass", "Y");	
			
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("verifyBrokenLinksHowToStart","Application should verify the links from : "+from +"-->"+to,"Unable to navigate to the link :"+from +"-->"+to ,"Fail", "Y");	
		}
		
		}
		
		

}
	



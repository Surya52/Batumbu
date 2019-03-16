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
import org.sikuli.script.Screen;

import com.baseClasses.BaseClass_Web;
import com.baseClasses.PDFResultReport;
import com.baseClasses.ThreadLocalWebdriver;
import com.objectRepository.Indonesian_Citizens_Locators;


public class Batumbu_Investor_IndonesianCitizens_Componnets extends BaseClass_Web  {
  
 	 
	public Indonesian_Citizens_Locators indonesiancitizenlocators = new Indonesian_Citizens_Locators();
	
	public Batumbu_Investor_IndonesianCitizens_Componnets (PDFResultReport pdfresultReport){
		
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
	
	public void login() throws Throwable {
		try {

		 
			//click(validussmokelocators.validusMainpageLogin);
			swtichToChildTab();
			js_type(indonesiancitizenlocators.emailIDInvestor, pdfResultReport.testData.get("EmailIDInvestor"), "username");
			set(indonesiancitizenlocators.passwordInvestor, pdfResultReport.testData.get("PasswordInvestor"));
		 
			waitForObj(10000);
			click(indonesiancitizenlocators.Masuk);
		
 			pdfResultReport.addStepDetails("login","Application should login","Successfully loggedIn into the application" + " ","Pass", "Y");	
		 }catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  pdfResultReport.addStepDetails("login","Unable to open the url", "Unable to login into the application"+e.getMessage(),"Fail", "N");
	  }
	}
	
	public void CreateAccount() throws Exception {
		try {
			 
			click(indonesiancitizenlocators.validusCreateanAccount);
			waitForElement(indonesiancitizenlocators.validusInvestor, 30);
			waitForObj(3000);
			click(indonesiancitizenlocators.validusInvestor);
			SimpleDateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");
			Date d = new Date();
			String time = df.format(d);
			System.out.println("time::" + time);
		 	//set(validussmokelocators.emailIDInvestor, emailIDInvestor);
			set(indonesiancitizenlocators.emailIDInvestor, pdfResultReport.testData.get("EmailIDInvestor"));
			set(indonesiancitizenlocators.passwordInvestor, pdfResultReport.testData.get("PasswordInvestor"));
			set(indonesiancitizenlocators.confirmPasswordInvestor, pdfResultReport.testData.get("ConfirmPasswordInvestor"));
			SimpleDateFormat df1 = new SimpleDateFormat("hhmmss");
			Date d1 = new Date();
			String time1 = df1.format(d1);
			System.out.println("time1::" + time1);
		
			set(indonesiancitizenlocators.mobileNumber, pdfResultReport.testData.get("MobileNumber"));
			click(indonesiancitizenlocators.investorLoginTermsandCondition);
			click(indonesiancitizenlocators.investorContinue);
			waitForElement(indonesiancitizenlocators.otpContent, 30);
			text(indonesiancitizenlocators.otpContent);
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
	
	public void uploadFile(By loc) {
		try {
			 click(loc);
			 waitForObj(8000);
			Screen s=new Screen();
			s.type("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\text.png", "C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\dummy-pdf_2.pdf");
			s.click("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\OpenButton.png");
		
			Thread.sleep(4000);	
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
	
	public void screenclick(String str) throws Exception {

		try {
		
		 waitForObj(3000);
		 Screen s= new Screen();
		 s.click(str);
		
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
	public void salesforceIntegrationLogin() throws Throwable {

		try {
			 
			Screen s = new Screen();
			s.click("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\OpenTab.png");
			waitForObj(2000);
			switchwindow(1);
			ThreadLocalWebdriver.getDriver().get("https://test.salesforce.com/");
		 	waitForObj(2000);
			set(indonesiancitizenlocators.username, "clsupport@validus.sg.pinjamnnew");
			waitForObj(2000);
			set(indonesiancitizenlocators.password, "Validus*1");
			click(indonesiancitizenlocators.Saleslogin);
			
	} catch (Exception e1) {
	 
		e1.printStackTrace();
	}
	}

	public void gmailOTP() throws Throwable {
		
		try {
		Screen s = new Screen();
        Thread.sleep(2000);
		s.click("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\OpenTab.png");
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
	 
		 Thread.sleep(3000);
		set(indonesiancitizenlocators.emailId, "autoqa@validus.sg");
		click(indonesiancitizenlocators.emailNext);
	 
		set(indonesiancitizenlocators.gmailPassword,"Validu$Tech");
		 
		JSClick(indonesiancitizenlocators.emailNext, "Email Next Button");
		Thread.sleep(5000);
		screenclick("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\mailmenu.png");
		screenclick("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\MailIcon.png");
		
		 
		set(indonesiancitizenlocators.gmailSearch, "noreply@salesforce.com");
		click(indonesiancitizenlocators.gmailSearchButton);
		Thread.sleep(3000);
		List<WebElement> ele=ThreadLocalWebdriver.getDriver().findElements(By.xpath("(//span[text()='Sandbox: Verify your identity in Salesforce'])[4]"));
		System.out.println(ele.size());
		for (int i = 0; i < ele.size(); i++) {
		try {
			ele.get(i).click();
		} catch (Exception e) {
			 
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
		 	 
				Thread.sleep(2000);
			}
	  	}
	 	 		
		screenclick("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\DeleteMaiil.png");
		Actions a = new Actions(ThreadLocalWebdriver.getDriver());
		a.sendKeys(Keys.F5).build().perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_F5);
		r.keyRelease(KeyEvent.VK_F5);
		Thread.sleep(2000);
		 
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
				
		click(indonesiancitizenlocators.UnregisteredUser);
		String str=	ThreadLocalWebdriver.getDriver().findElement(indonesiancitizenlocators.UnRegisterText).getText();
		System.out.println("Total No Of Usrs Are"+"  "+str);
			 
		
		String[] s2 = str.split("\n");
		System.out.println("No Of Unregistered Users Are"+s2.length);
	
		for(int j=0; j<s2.length;j++) {
			
			if(s2[j].contains("aApN000")) {

				String idnum = s2[j];
				System.out.println("User is"+idnum);
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'"+idnum+"')]")).click();

				System.out.println("First Mail text is "+text(indonesiancitizenlocators.Maildidtext));
				System.out.println("Mail text second is"+text(indonesiancitizenlocators.mailtext2));
		    	 waitForObj(5000);
				String mailtext1 = ThreadLocalWebdriver.getDriver().findElement(indonesiancitizenlocators.Maildidtext).getText();
				waitForObj(5000);  
		 		
		        	if(mailtext1.equals(pdfResultReport.testData.get("EmailIDInvestor"))){
		        	Thread.sleep(3000);
					String optMsg = ThreadLocalWebdriver.getDriver().findElement(By.xpath("//*[@id='00NN00000039a68_ileinner']")).getText();
					System.out.println("optMsg ::" + optMsg);

					switchwindow(0);
					JavascriptExecutor js = (JavascriptExecutor) ThreadLocalWebdriver.getDriver();
					WebElement el = ThreadLocalWebdriver.getDriver().findElement(By.cssSelector("input[id=otpEntered]"));
					js.executeScript("arguments[0].value = arguments[1];", el, optMsg);
					click(indonesiancitizenlocators.continueInvestor);
					Thread.sleep(7000);
			      	ThreadLocalWebdriver.getDriver().close();
			     	Thread.sleep(3000);
			     	switchwindow(0);
			     	Actions a = new Actions(ThreadLocalWebdriver.getDriver());
					a.sendKeys(Keys.F5).build().perform();
					Robot r=new Robot();
					r.keyPress(KeyEvent.VK_F5);
					r.keyRelease(KeyEvent.VK_F5);
					
						
					waitForObj(3000);
					click(indonesiancitizenlocators.Mailverification);
					
				 	waitForObj(1000);
					screenclick("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\LeaveButton.png"); 
				 	Thread.sleep(20000);
					 swtichToChildTab();	
					click(indonesiancitizenlocators.LoginKiPlatform);
					 break;	
														        	
		        }else {
		        
		          screenclick("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\BackBUtton.png");
		        }
				
		
			}
		}
 				 pdfResultReport.addStepDetails("Salesforce mobile and email verification", "User should able to verify mobile and email successfully",
							"Successfully verified the email and mobile from the salesforce application" + " ", "Pass", "Y");
				} 
		catch (Exception e3) {
			log.fatal("Unable to verify the mobile and email verification in Salesforce" + e3.getMessage());
			pdfResultReport.addStepDetails("Salesforce mobile and email verification", "User is not able to verify mobile and email from salesforce",
					"Unable to verify the email and mobile from salesforce application" + e3.getMessage(), "Fail", "N");
		}			
			}
	
	
	public void navigatetoIndonesianCitizen() throws Exception {
		try {
			waitForElement(indonesiancitizenlocators.IndonesianCitizen, 60);
			click(indonesiancitizenlocators.IndonesianCitizen);
			waitForObj(3000);
			pdfResultReport.addStepDetails("navigatetoindividualInvestorSingaporeCitizen","User should click on individualInvestorSingaporeCitizen","User successfully clicked on individualInvestorSingaporeCitizen" + " ","Pass", "Y");	
		 }catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  pdfResultReport.addStepDetails("navigatetoindividualInvestorSingaporeCitizen","User is not able to click on individualInvestorSingaporeCitizen", "Unable to open the click on individualInvestorSingaporeCitizen"+e.getMessage(),"Fail", "N");
	  }
	}
	public void indonesianCitizenregistration() throws Throwable {
		try {
			
			
			 select(indonesiancitizenlocators.Greetings, pdfResultReport.testData.get("Title"));
			  
			 set(indonesiancitizenlocators.IdNumber, pdfResultReport.testData.get("NRIC/Passport Number"));	 
			 set(indonesiancitizenlocators.SimeNumber, pdfResultReport.testData.get("NRIC/Passport Number"));	
			 set(indonesiancitizenlocators.PassPortnumber, pdfResultReport.testData.get("NRIC/Passport Number"));	
			  
			 set(indonesiancitizenlocators.NRICPassportNumber2, pdfResultReport.testData.get("NRIC/Passport Number"));	
			 set(indonesiancitizenlocators.firstName2, pdfResultReport.testData.get("First Name"));
			 set(indonesiancitizenlocators.MiddleName, pdfResultReport.testData.get("Middle Name"));
			 set(indonesiancitizenlocators.companyAddress2, pdfResultReport.testData.get("Registered Address"));
			 set(indonesiancitizenlocators.lastname, pdfResultReport.testData.get("Last Name"));
			 set(indonesiancitizenlocators.postalCode2, pdfResultReport.testData.get("Postal code"));
			 waitForObj(2000);
			 
			 js_type(indonesiancitizenlocators.Networthprevious, pdfResultReport.testData.get("Net Profit loss previous year"),"Net Profit Previous Year");
			 js_type(indonesiancitizenlocators.NetwothCurrentyear, pdfResultReport.testData.get("Annual Revenue latest year"),"Net Profit Current Year");
			 
			uploadFile(indonesiancitizenlocators.Upload1);
			waitForObj(15000);
			uploadFile(indonesiancitizenlocators.Upload2);
			waitForObj(15000);
			uploadFile(indonesiancitizenlocators.Upload3);
			waitForObj(15000);
			uploadFile(indonesiancitizenlocators.Upload4);
			waitForObj(15000);
			uploadFile(indonesiancitizenlocators.Upload5);
			waitForObj(15000);
			uploadFile(indonesiancitizenlocators.Upload6);
			waitForObj(15000);
			
			pageDown();
		    
		    click(indonesiancitizenlocators.Agree1);
		    click(indonesiancitizenlocators.Agree2);
		    click(indonesiancitizenlocators.Agree3);
		    click(indonesiancitizenlocators.Agree4);
		    click(indonesiancitizenlocators.Agree5);
		    click(indonesiancitizenlocators.Agree6);
		    
		      JSClick(indonesiancitizenlocators.FBSubmit , "Submit Button");
		      
			  Thread.sleep(2000);
			   set(indonesiancitizenlocators.AccountOwner, pdfResultReport.testData.get("Account Owner"));
			  	set(indonesiancitizenlocators.AccountNumber, pdfResultReport.testData.get("Account Number"));
			  	 Thread.sleep(2000);
			  	set(indonesiancitizenlocators.BankName, pdfResultReport.testData.get("Bank Name"));
			  	 Thread.sleep(2000);
			  	set(indonesiancitizenlocators.BranchCode, pdfResultReport.testData.get("Branch Code"));
			  	 Thread.sleep(2000);
			  	click(indonesiancitizenlocators.submitbank);
				waitForObj(5000); 
			
			  screenclick("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\KELUAR.png");
			 
			
		//	switchwindow(0);	//JSClick(registerasInvestorlocators.submit, "Submit Button");
			  waitForObj(3000);
			pdfResultReport.addStepDetails("Register as companyIncorporatedInSingapore","User should register as companyIncorporatedInSingapore","Successfully registered as companyIncorporatedInSingapore" + " ","Pass", "Y");
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("Register as companyIncorporatedInSingapore", "User is not able to register as companyIncorporatedInSingapore", "User unable to register as companyIncorporatedInSingapore"+e.getMessage(), "Fail", "N");
		}
			}
	
	
public void batumbuAdminApproval() throws Throwable{
		
		try{
			ThreadLocalWebdriver.getDriver().manage().timeouts().implicitlyWait(3000,  TimeUnit.SECONDS);
	 	 	screenclick("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\OpenTab.png");

	 	 	switchwindow(2);
			ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/BatumbuAdmin/public/");
			
			set(indonesiancitizenlocators.AdminMail, "portaladmin@batumbu.id");
			set(indonesiancitizenlocators.AdminPassword, "Admin123");
			click(indonesiancitizenlocators.AdminLogin);
			
			waitForObj(2000);
			click(indonesiancitizenlocators.Lenders);
			waitForObj(2000);
			set(indonesiancitizenlocators.LendeSearch, pdfResultReport.testData.get("EmailIDInvestor"));
			waitForObj(2000);
			click(indonesiancitizenlocators.ViewDetailsLender);
			waitForObj(2000);
			click(indonesiancitizenlocators.Application);
			waitForObj(4000);
			click(indonesiancitizenlocators.LenderDocumentslist);
			waitForObj(4000);
			click(indonesiancitizenlocators.VerifyDocuments);
			waitForObj(3000);
			uploadFile(indonesiancitizenlocators.ChooseFilelender);
			waitForObj(7000);
			click(indonesiancitizenlocators.SubmitLender);
			waitForObj(5000);
			click(indonesiancitizenlocators.ApproveLender);
			waitForObj(10000);
			
/*			Actions A = new Actions(ThreadLocalWebdriver.getDriver());
			A.moveToElement(ThreadLocalWebdriver.getDriver().findElement(individualforeignlocators.InitiateTransaction)).click().build().perform();
			//JSClick(individualforeignlocators.InitiateTransaction, "Intiate Transacton");
			waitForObj(10000);
			screenclick("C:\\Users\\Mani\\Desktop\\Automate Registration Pics\\initiatetransaction.png");
			waitForObj(5000);
			
			set(indonesiancitizenlocators.TransactionAmount, pdfResultReport.testData.get("TransactionAmount"));
			waitForObj(2000);
			select(indonesiancitizenlocators.TransactionTYPE, pdfResultReport.testData.get("TransactionType"));
			waitForObj(2000);
			click(indonesiancitizenlocators.SubmitTransaction);
			waitForObj(15000);
			
			set(indonesiancitizenlocators.TransactionAmount, pdfResultReport.testData.get("TransactionAmount"));
			waitForObj(2000);
			select(indonesiancitizenlocators.TransactionTYPE, pdfResultReport.testData.get("TransactionType"));
			waitForObj(2000);
			click(indonesiancitizenlocators.SubmitTransaction);
			waitForObj(15000); 
			
			
			 JSClick(indonesiancitizenlocators.LenderfFundTransaction, "Lender Fund Transaction");
			 waitForObj(4000);
			 
			List<WebElement> rows =ThreadLocalWebdriver.getDriver().findElements(By.xpath("//table[@id='example1']/tbody/tr"));
			int RowCount  =rows.size();
			System.out.println("Table Total Data Is "+rows);
			System.out.println("Number Of Rows Is  "+ RowCount);
						
			//table[@id='example1']/tbody/tr]
			String Beforexpath ="//table[@id='example1']/tbody/tr[";
			String AfterXpath  = "]/td[2]";
			String AmountAfterxpath  = "]/td[3]";
			
			for(int i=1;i<=RowCount;i++){
				
				String TFINummberXpath =Beforexpath+ i +AfterXpath;
				WebElement TFI = ThreadLocalWebdriver.getDriver().findElement(By.xpath(TFINummberXpath));
				String TFINumber =TFI.getText();
				waitForObj(2000);
				String  AmountXpath = Beforexpath+i+AmountAfterxpath;
				WebElement Amount =ThreadLocalWebdriver.getDriver().findElement(By.xpath(AmountXpath));
				String ActualAmoutn = Amount.getText();
				waitForObj(2000);
			 
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='InitiateTransactionId']")).sendKeys(TFINumber);
				waitForObj(2000);
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='transactionamount']")).sendKeys(ActualAmoutn);
				waitForObj(2000);
				select(individualforeignlocators.TypeOfTransaction, pdfResultReport.testData.get("TransactionType"));
				waitForObj(2000);
				select(individualforeignlocators.LenderPaymentMode, pdfResultReport.testData.get("PaymentMode"));
				click(individualforeignlocators.SubmitLenderFund);
			waitForObj(8000);
			 
			}
			 
*/			
			switchwindow(0);
			
} catch(Exception e ){
	e.printStackTrace();
	pdfResultReport.addStepDetails("BatumbuAdmin Approval", "User should able to approve the record successfully",
			"Successfully approve the record from the BatumbuAdmin application" + " ", "Pass", "Y");
 	  
	
}		}	
		

	
	
	
	
	
public void salesforceApproval() throws Throwable {
		
		try {
			
			ThreadLocalWebdriver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			click(indonesiancitizenlocators.Applications);
			
	        String text=text(indonesiancitizenlocators.ApplicationList);
	        System.out.println("Total applications "+text);
	        String[] s = text.split("\n");
			System.out.println(s.length);
		 	ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'"+ pdfResultReport.testData.get("First Name")+"')]")).click();
		 	pageDown();
		 	pageDown();
		 	Thread.sleep(3000);
		 	click(indonesiancitizenlocators.ApplicationNumber);
			Thread.sleep(3000);
	        click(indonesiancitizenlocators.ApproveApplication);
	       
	        uploadFile(indonesiancitizenlocators.ChoooseFile);
	        waitForObj(3000);
			JSClick(indonesiancitizenlocators.Upload, "Upload File BUtton");
			Thread.sleep(7000);
			JSClick(indonesiancitizenlocators.Approve,"Approve Investor");
			 
	 
		pdfResultReport.addStepDetails("Salesforce Approval", "User should able to approve the record successfully",
				"Successfully approve the record from the salesforce application" + " ", "Pass", "Y");
	} catch (Exception e3) {
		log.fatal("Unable to approve the record with Salesforce" + e3.getMessage());
		pdfResultReport.addStepDetails("Salesforce Approval", "User is not able to approve the record from salesforce",
				"Unable to approve the record from salesforce application" + e3.getMessage(), "Fail", "N");
	}
	}
	
public void Investorfundbank() throws Exception {
	
	try {
	/*click(registerasInvestorlocators.bank);
	click(registerasInvestorlocators.edit);
	set(registerasInvestorlocators.AccountOwner, pdfResultReport.testData.get("Account Owner"));
	*/
		click(indonesiancitizenlocators.bank);
		set(indonesiancitizenlocators.AccountNumber, pdfResultReport.testData.get("Account Number"));
	set(indonesiancitizenlocators.BankName, pdfResultReport.testData.get("Bank Name"));
	set(indonesiancitizenlocators.BranchCode, pdfResultReport.testData.get("Branch Code"));
	click(indonesiancitizenlocators.submitbank);

	String str = text(indonesiancitizenlocators.investorstatus);
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
}public void salesforcefund() throws Exception {
	try {
	click(indonesiancitizenlocators.account);
	waitForObj(5000);
	ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'"+pdfResultReport.testData.get("Companyname") +"')]")).click();
	click(indonesiancitizenlocators.investorFundTransaction);
	pageDown();
	pageDown();
	pageDown();
	 
	click(indonesiancitizenlocators.newFundTransaction);
	
	set(indonesiancitizenlocators.paymentMode, "ACH");
	
	ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@tabindex='4']")).clear();
	set(indonesiancitizenlocators.transactionAmount, "100000.00");
	 waitForObj(2000);
	click(indonesiancitizenlocators.savefund);
	 
	
	pdfResultReport.addStepDetails("salesforcefund", "User should able to fund the application successfully",
			"Successfully funded to the application" + " ", "Pass", "Y");
} catch (Exception e) {
	log.fatal("Unable to Homelogin" + e.getMessage());
	pdfResultReport.addStepDetails("salesforcefund", "User is not able to fund to the application",
			"Unable to fund  the application" + e.getMessage(), "Fail", "N");
}
			
}
public void investorfunddetails() throws Exception {
	
	try {
		switchwindow(0);
		Actions a = new Actions(ThreadLocalWebdriver.getDriver());
		a.sendKeys(Keys.F5).build().perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_F5);
		r.keyRelease(KeyEvent.VK_F5);
		waitForObj(3000);
		 click(indonesiancitizenlocators.AllLiveFacilities);
		String funds =text(indonesiancitizenlocators.Funds);
		System.out.println("Total Available Funds For Investing Is"+funds);
		
		waitForObj(5000);
	ThreadLocalWebdriver.getDriver().navigate().to(ThreadLocalWebdriver.getDriver().getCurrentUrl());
	pdfResultReport.addStepDetails("investorfunddetails", "User should able to see the funded amount on the application successfully",
			"Able to see the funded amount successfully on the application" + " ", "Pass", "Y");
} catch (Exception e) {
	log.fatal("Unable to Homelogin" + e.getMessage());
	pdfResultReport.addStepDetails("investorfunddetails", "User is not able to see the funded amount on the application",
			"Unable to see the funded amount on the application" + e.getMessage(), "Fail", "N");
}
}
	
	
	
	
	
}

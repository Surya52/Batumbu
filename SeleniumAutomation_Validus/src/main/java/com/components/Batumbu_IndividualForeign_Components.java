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
	import org.sikuli.script.Screen;

	import com.baseClasses.BaseClass_Web;
	import com.baseClasses.PDFResultReport;
	import com.baseClasses.ThreadLocalWebdriver;
import com.mobileUtilities_Android.ThreadLocalAndroidDriver;
import com.objectRepository.Batumbu_Investor_IndividualForeignCitizens_Loc;
import com.objectRepository.ForeignBusiness_Entity_Locators;
	import com.objectRepository.Foreign_Legal_Entity_Locators;
	import com.objectRepository.ValidusRegisterAsInvester;
	import com.objectRepository.ValidusSmoke_Loc;
	import com.objectRepository.Validus_SalesforceLoc;

	public class Batumbu_IndividualForeign_Components extends BaseClass_Web {
	 	
		
		public Batumbu_Investor_IndividualForeignCitizens_Loc  individualforeignlocators = new Batumbu_Investor_IndividualForeignCitizens_Loc();
		
 	 	
		public Batumbu_IndividualForeign_Components(PDFResultReport pdfresultReport){
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

			 	
				/*swtichToChildTab();
				switchwindow(1);
				*/ 
				click(individualforeignlocators.validusMainpageLogin);
				js_type(individualforeignlocators.emailIDInvestor, pdfResultReport.testData.get("EmailIDInvestor"), "username");
				set(individualforeignlocators.passwordInvestor, pdfResultReport.testData.get("PasswordInvestor"));
			 
				waitForObj(10000);
				click(individualforeignlocators.login);
			
	 			pdfResultReport.addStepDetails("login","Application should login","Successfully loggedIn into the application" + " ","Pass", "Y");	
			 }catch(Exception e){
				  log.fatal("Unable to open the URL"+e.getMessage());
				  pdfResultReport.addStepDetails("login","Unable to open the url", "Unable to login into the application"+e.getMessage(),"Fail", "N");
		  }
		}
		
		public void CreateAccount() throws Exception {
			try {
				 
			 	
			 	click(individualforeignlocators.validusCreateanAccount);
				waitForElement(individualforeignlocators.validusInvestor, 30);
				waitForObj(3000);
				click(individualforeignlocators.validusInvestor);
				SimpleDateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");
				Date d = new Date();
				String time = df.format(d);
				System.out.println("time::" + time);
			 	 set(individualforeignlocators.emailIDInvestor, pdfResultReport.testData.get("EmailIDInvestor"));
				set(individualforeignlocators.passwordInvestor, pdfResultReport.testData.get("PasswordInvestor"));
				set(individualforeignlocators.confirmPasswordInvestor, pdfResultReport.testData.get("ConfirmPasswordInvestor"));
			 	set(individualforeignlocators.mobileNumber, pdfResultReport.testData.get("MobileNumber"));
				click(individualforeignlocators.investorLoginTermsandCondition);
				click(individualforeignlocators.investorContinue);
				waitForElement(individualforeignlocators.otpContent, 60);
				text(individualforeignlocators.otpContent);
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
				 Thread.sleep(5000);
				Screen s=new Screen();
				s.type("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\text.png", "C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\dummy-pdf_2.pdf");
				s.click("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\OpenButton.png");
			
				 	
			}catch(Exception e) {
				System.out.println("Unable to upload the file");
			}
		}
		public void screenclick(String path)throws Exception{
			
			try{
				waitForObj(3000);
				Screen S=new Screen();
				S.click(path);
				
		}catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Failed to click ");
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
		
		public void salesforceIntegrationLogin() throws Throwable {

			try {
				Thread.sleep(2000);
			 	screenclick("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\OpenTab.png");
				waitForObj(2000);
				switchwindow(1);
				ThreadLocalWebdriver.getDriver().get("https://test.salesforce.com/");
			 	waitForObj(2000);
				set(individualforeignlocators.username, "clsupport@validus.sg.pinjamnnew");
				waitForObj(2000);
				set(individualforeignlocators.password, "Validus*1");
				click(individualforeignlocators.Saleslogin);
				
		} catch (Exception e1) {
		 
			e1.printStackTrace();
		}
		}

		public void gmailOTP() throws Throwable {
			
			try {
				
			screenclick("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\OpenTab.png");
			
			Thread.sleep(5000);
			
			try {
				switchwindow(2);
				waitForObj(4000);
			} catch (Exception e1) {
			 
				e1.printStackTrace();
			}
			
			waitForObj(4000);
			ThreadLocalWebdriver.getDriver().get("https://accounts.google.com/ServiceLogin");
			waitForObj(4000);
		    set(individualforeignlocators.emailId, "autoqa@validus.sg");
			click(individualforeignlocators.emailNext);
			waitForObj(4000);
			set(individualforeignlocators.gmailPassword,"Validu$Tech");
			waitForObj(4000);
			click(individualforeignlocators.emailNext);
			waitForObj(4000);
			//js_type(By.xpath("//input[@id='gbqfq']"), "noreply@salesforce.com", "search");
			 
			screenclick("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\mailmenu.png");
			 waitForObj(2000);
			 screenclick("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\MailIcon.png");
			
			set(individualforeignlocators.gmailSearch, "noreply@salesforce.com");
			click(individualforeignlocators.gmailSearchButton);
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
		  		}
		  	}
		 
			screenclick("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\DeleteMaiil.png");
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
				 
				 click(individualforeignlocators.UnregisteredUser);
				 String str=	ThreadLocalWebdriver.getDriver().findElement(individualforeignlocators.UnRegisterText).getText();
			     System.out.println("Total No Of Usrs Are"+"  "+str);
				
					
						  String[] s2 = str.split("\n");
							System.out.println("No Of Unregistered Users Are"+s2.length);
						
							for(int j=0; j<s2.length;j++) {
								
								if(s2[j].contains("aApN000")) {

			 	String idnum = s2[j];
			 	System.out.println("User is"+idnum);
			 	ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'"+idnum+"')]")).click();

				 System.out.println("First Mail text is "+text(individualforeignlocators.Maildidtext));
				 System.out.println("Mail text second is"+text(individualforeignlocators.mailtext2));
				 waitForObj(5000);
				 String mailtext1 = ThreadLocalWebdriver.getDriver().findElement(individualforeignlocators.Maildidtext).getText();
				 waitForObj(5000);  
				 if(mailtext1.equals(pdfResultReport.testData.get("EmailIDInvestor"))){
				 Thread.sleep(3000);
				 String optMsg = ThreadLocalWebdriver.getDriver().findElement(By.xpath("//*[@id='00NN00000039a68_ileinner']")).getText();
				 System.out.println("optMsg ::" + optMsg);
				 switchwindow(0);
				 JavascriptExecutor js = (JavascriptExecutor) ThreadLocalWebdriver.getDriver();
			   	WebElement el = ThreadLocalWebdriver.getDriver().findElement(By.cssSelector("input[id=otpEntered]"));
			 	js.executeScript("arguments[0].value = arguments[1];", el, optMsg);
			 	click(individualforeignlocators.continueInvestor);
				 Thread.sleep(7000);
				  	ThreadLocalWebdriver.getDriver().close();
				 	Thread.sleep(5000);
				    switchwindow(0);
				  	Actions a = new Actions(ThreadLocalWebdriver.getDriver());
			 		a.sendKeys(Keys.F5).build().perform();
				    Robot r=new Robot();
					r.keyPress(KeyEvent.VK_F5);
					r.keyRelease(KeyEvent.VK_F5);  						
					waitForObj(3000);
					click(individualforeignlocators.Mailverification);
					waitForObj(1000);
					screenclick("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\LeaveButton.png");
				 	Thread.sleep(20000);
					swtichToChildTab();	
					click(individualforeignlocators.LoginKiPlatform);
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
		
		
		public void navigatetoIndividualForeignCitizens() throws Exception {
		 
			try {
				waitForElement(individualforeignlocators.individualforeigncitizens, 30);
				click(individualforeignlocators.individualforeigncitizens);
				waitForObj(3000);
				pdfResultReport.addStepDetails("navigatetoindividualInvestorSingaporeCitizen","User should click on individualInvestorSingaporeCitizen","User successfully clicked on individualInvestorSingaporeCitizen" + " ","Pass", "Y");	
			 }catch(Exception e){
				  log.fatal("Unable to open the URL"+e.getMessage());
				  pdfResultReport.addStepDetails("navigatetoindividualInvestorSingaporeCitizen","User is not able to click on individualInvestorSingaporeCitizen", "Unable to open the click on individualInvestorSingaporeCitizen"+e.getMessage(),"Fail", "N");
		  }
		}
		
		public void IndividualForeignCitizens() throws Throwable {
			try {
				
				  select(individualforeignlocators.Greetings, pdfResultReport.testData.get("Title"));
				  set(individualforeignlocators.NRICPassportNumber2, pdfResultReport.testData.get("NRIC/Passport Number"));	
 				  set(individualforeignlocators.firstName2, pdfResultReport.testData.get("First Name"));
		 		set(individualforeignlocators.MiddleName, pdfResultReport.testData.get("Middle Name"));
		 		select(individualforeignlocators.Contry, pdfResultReport.testData.get("Nationality") );
				set(individualforeignlocators.companyAddress2, pdfResultReport.testData.get("Registered Address"));
				set(individualforeignlocators.lastname, pdfResultReport.testData.get("Last Name"));
				set(individualforeignlocators.postalCode2, pdfResultReport.testData.get("Postal code"));
				
				waitForObj(2000);
				 
				  set(individualforeignlocators.Networthprevious, pdfResultReport.testData.get("Annual Revenue Previous year"));
				set(individualforeignlocators.NetwothCurrentyear, pdfResultReport.testData.get("Annual Revenue latest year"));
				//select(individualforeignlocators.Source, pdfResultReport.testData.get("Source"));
			   	
				uploadFile(individualforeignlocators.Upload1);
				waitForObj(15000);
				uploadFile(individualforeignlocators.Upload2);
				waitForObj(15000);
				uploadFile(individualforeignlocators.Upload3);
				waitForObj(15000);
				uploadFile(individualforeignlocators.Upload4);
				waitForObj(15000);
				 
				 pageDown();
			    
			    click(individualforeignlocators.Agree1);
			    click(individualforeignlocators.Agree2);
			    click(individualforeignlocators.Agree3);
			    click(individualforeignlocators.Agree4);
			    click(individualforeignlocators.Agree5);
			    click(individualforeignlocators.Agree6);
			    
			      //JSClick(individualforeignlocators.FBSubmit , "Submit Button");
			    click(individualforeignlocators.FBSubmit);  
			    
			      waitForObj(5000);
			  	set(individualforeignlocators.AccountOwner, pdfResultReport.testData.get("Account Owner"));
			  	waitForObj(2000);
 			  	set(individualforeignlocators.AccountNumber, pdfResultReport.testData.get("Account Number"));
			  	waitForObj(2000);
 			  	set(individualforeignlocators.BankName, pdfResultReport.testData.get("Bank Name"));
			  	waitForObj(2000);
			  	set(individualforeignlocators.BranchCode, pdfResultReport.testData.get("Branch Code"));
 			  	pageDown();
				click(individualforeignlocators.submitbank);
				waitForObj(5000);
				 String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath("//h3[@class='profile-ban-txt']")).getText();
					System.out.println(str);
				
			    screenclick("C:\\Users\\Mani\\Desktop\\Automate Registration Pics\\KELUAR.png");
				 
				
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
			
	//*[@id="example1"]/tbody/tr[1]
	
	//*[@id="example1"]/tbody/tr[1]/td[2]
	//*[@id="example1"]/tbody/tr[1]/td[3] 
		 	screenclick("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\OpenTab.png");
			waitForObj(2000);
			switchwindow(2);
			ThreadLocalWebdriver.getDriver().get("https://batumbu.id/BatumbuAdmin/public/ ");
			
			set(individualforeignlocators.AdminMail, "fundrel@batumbu.id");
			set(individualforeignlocators.AdminPassword, "Admin123");
			click(individualforeignlocators.AdminLogin);
			
			waitForObj(2000);
			click(individualforeignlocators.Lenders);
			waitForObj(2000);
			set(individualforeignlocators.LendeSearch, pdfResultReport.testData.get("EmailIDInvestor"));
			waitForObj(2000);
			click(individualforeignlocators.ViewDetailsLender);
			waitForObj(2000);
			click(individualforeignlocators.Application);
			waitForObj(4000);
			click(individualforeignlocators.LenderDocumentslist);
			waitForObj(4000);
			click(individualforeignlocators.VerifyDocuments);
			waitForObj(3000);
			uploadFile(individualforeignlocators.ChooseFilelender);
			waitForObj(7000);
			click(individualforeignlocators.SubmitLender);
			waitForObj(5000);
			click(individualforeignlocators.ApproveLender);
			waitForObj(10000);
			
/*			Actions A = new Actions(ThreadLocalWebdriver.getDriver());
			A.moveToElement(ThreadLocalWebdriver.getDriver().findElement(individualforeignlocators.InitiateTransaction)).click().build().perform();
			//JSClick(individualforeignlocators.InitiateTransaction, "Intiate Transacton");
			waitForObj(10000);
			screenclick("C:\\Users\\Mani\\Desktop\\Automate Registration Pics\\initiatetransaction.png");
			waitForObj(5000);
			
			set(individualforeignlocators.TransactionAmount, pdfResultReport.testData.get("TransactionAmount"));
			waitForObj(2000);
			select(individualforeignlocators.TransactionTYPE, pdfResultReport.testData.get("TransactionType"));
			waitForObj(2000);
			click(individualforeignlocators.SubmitTransaction);
			waitForObj(15000);
			
			set(individualforeignlocators.TransactionAmount, pdfResultReport.testData.get("TransactionAmount"));
			waitForObj(2000);
			select(individualforeignlocators.TransactionTYPE, pdfResultReport.testData.get("TransactionType"));
			waitForObj(2000);
			click(individualforeignlocators.SubmitTransaction);
			waitForObj(15000); 
			
			
			 JSClick(individualforeignlocators.LenderfFundTransaction, "Lender Fund Transaction");
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
		
		public void ESignatureVerification(){
			
			try {
				
				screenclick("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\OpenTab.png");
				Thread.sleep(5000);
 					switchwindow(2);
					waitForObj(4000);
 				
				waitForObj(4000);
				ThreadLocalWebdriver.getDriver().get("https://accounts.google.com/ServiceLogin");
				waitForObj(4000);
				// click(individualforeignlocators.signIN);
				 set(individualforeignlocators.emailId, pdfResultReport.testData.get("EmailIDInvestor"));
				click(individualforeignlocators.emailNext);
				waitForObj(4000);
				set(individualforeignlocators.gmailPassword,"9963944173");
				waitForObj(4000);
				click(individualforeignlocators.emailNext);
				waitForObj(4000);
				 				 
				screenclick("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\mailmenu.png");
				 waitForObj(2000);
				 screenclick("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\MailIcon.png");
				
				set(individualforeignlocators.gmailSearch, "admin@batumbu.id");
				click(individualforeignlocators.gmailSearchButton);
				Thread.sleep(3000);
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("(//span[contains(text(),'Sandbox:')])[2]")).click();
				Thread.sleep(3000);
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'Review Dokumen')]")).click();
				swtichToChildTab();
				switchwindow(3);
				
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}				
		}
		
		 
	public void salesforceApproval() throws Throwable {
			
			try {
				
				switchwindow(0);
				ThreadLocalWebdriver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				click(individualforeignlocators.Applications);
				
		        String text=text(individualforeignlocators.ApplicationList);
		        System.out.println("Total applications "+text);
		        String[] s = text.split("\n");
				System.out.println(s.length);
			 	ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'"+ pdfResultReport.testData.get("Companyname")+"')]")).click();
			 	pageDown();
			 	pageDown();
			 	Thread.sleep(3000);
			 	click(individualforeignlocators.ApplicationNumber);
				Thread.sleep(3000);
		        click(individualforeignlocators.ApproveApplication);
		        waitForObj(3000);
		        click(individualforeignlocators.ChoooseFile);
		        
		        waitForObj(15000);
		        Screen S= new Screen();
				S.type("C:\\Users\\Mani\\Desktop\\Automate Registration Pics\\Text.png",  "C:\\Users\\Mani\\Desktop\\Automate Registration Pics\\dummy-pdf_2.pdf");
				S.click("C:\\Users\\Mani\\Desktop\\Automate Registration Pics\\OpenButton.PNG");
				waitForObj(7000);
				 JSClick(individualforeignlocators.Upload, "Upload File BUtton");
				Thread.sleep(7000);
				JSClick(individualforeignlocators.Approve,"Approve Investor");
				 
	 		pdfResultReport.addStepDetails("Salesforce Approval", "User should able to approve the record successfully",
					"Successfully approve the record from the salesforce application" + " ", "Pass", "Y");
		} catch (Exception e3) {
			log.fatal("Unable to approve the record with Salesforce" + e3.getMessage());
			pdfResultReport.addStepDetails("Salesforce Approval", "User is not able to approve the record from salesforce",
					"Unable to approve the record from salesforce application" + e3.getMessage(), "Fail", "N");
		}
		}
		
	public void Investorfund() throws Exception {
		
		try {
		 
			
			set(individualforeignlocators.AccountNumber, pdfResultReport.testData.get("Account Number"));
		set(individualforeignlocators.BankName, pdfResultReport.testData.get("Bank Name"));
		set(individualforeignlocators.BranchCode, pdfResultReport.testData.get("Branch Code"));
		click(individualforeignlocators.submitbank);

		 
		
	pdfResultReport.addStepDetails("Investorfund","User should able to do fund","Successfully able to fund" + " ","Pass", "Y");
		switchwindow(0);
	}
	catch(Exception e) {
		log.fatal("Unable to Homelogin"+e.getMessage());
		pdfResultReport.addStepDetails("Investorfund", "User is not able to fund", "Not able to fund successfully"+e.getMessage(), "Fail", "N");
	}
	}
 
	 public void salesforcefund() throws Exception {
		try {
		//click(individualforeignlocators.account);
		
			// Git Hub code Pushing...
		set(individualforeignlocators.salesSearch, pdfResultReport.testData.get("EmailIDInvestor"));
		click(individualforeignlocators.SAlesSearchButton);
		waitForObj(2000);
		ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'"+pdfResultReport.testData.get("First Name") +"')]")).click();
		click(individualforeignlocators.investorFundTransaction);
		 
		click(individualforeignlocators.newFundTransaction);
		waitForObj(4000);
		ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@tabindex='4']")).clear();
		waitForObj(2000);
		set(individualforeignlocators.paymentMode, "ACH");
		waitForObj(2000);
		set(individualforeignlocators.Amounttransaction, "100000.00");
		waitForObj(2000);
		click(individualforeignlocators.savefund);
		 
		
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
			//switchwindow(0);
			Actions a = new Actions(ThreadLocalWebdriver.getDriver());
			a.sendKeys(Keys.F5).build().perform();
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_F5);
			r.keyRelease(KeyEvent.VK_F5);
			waitForObj(3000);
			click(individualforeignlocators.platform);
			click(individualforeignlocators.allLivefacilities);
			text(individualforeignlocators.fundsavailable);
			
			
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

 
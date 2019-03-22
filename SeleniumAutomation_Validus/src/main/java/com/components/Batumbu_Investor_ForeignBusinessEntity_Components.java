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
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import com.baseClasses.BaseClass_Web;
import com.baseClasses.PDFResultReport;
import com.baseClasses.ThreadLocalWebdriver;
import com.objectRepository.Batumub_International_Institution_Locators;
import com.objectRepository.ForeignBusiness_Entity_Locators;
import com.objectRepository.Foreign_Legal_Entity_Locators;
import com.objectRepository.ValidusRegisterAsInvester;
import com.objectRepository.ValidusSmoke_Loc;
import com.objectRepository.Validus_SalesforceLoc;

public class Batumbu_Investor_ForeignBusinessEntity_Components extends BaseClass_Web{
	
	public ValidusRegisterAsInvester registerasInvestorlocators=new ValidusRegisterAsInvester();
	public ValidusRegisterAsInvestorComponents  registerasinvestor = new ValidusRegisterAsInvestorComponents(pdfResultReport);
    public ForeignBusiness_Entity_Locators foreigbusinessloc   = new  ForeignBusiness_Entity_Locators();
 	public Batumub_International_Institution_Locators institutionLoc= new Batumub_International_Institution_Locators();
	public Batumbu_Investor_ForeignBusinessEntity_Components(PDFResultReport pdfresultReport){
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
			/*swtichToChildTab();
		
			*/
			js_type(foreigbusinessloc.emailIDInvestor, pdfResultReport.testData.get("EmailIDInvestor"), "username");
			set(foreigbusinessloc.passwordInvestor, pdfResultReport.testData.get("PasswordInvestor"));
		 
			waitForObj(10000);
			click(foreigbusinessloc.login);
		
 			pdfResultReport.addStepDetails("login","Application should login","Successfully loggedIn into the application" + " ","Pass", "Y");	
		 }catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  pdfResultReport.addStepDetails("login","Unable to open the url", "Unable to login into the application"+e.getMessage(),"Fail", "N");
	  }
	}
	
	public void CreateAccount() throws Exception {
		try {
			 
			//click(foreigbusinessloc.validusCreateanAccount);
		 
			click(foreigbusinessloc.validusCreateanAccount);
			waitForElement(foreigbusinessloc.validusInvestor, 30);
			waitForObj(3000);
			click(foreigbusinessloc.validusInvestor);
			SimpleDateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");
			Date d = new Date();
			String time = df.format(d);
			System.out.println("time::" + time);
		 	//set(validussmokelocators.emailIDInvestor, emailIDInvestor);
			set(foreigbusinessloc.emailIDInvestor, pdfResultReport.testData.get("EmailIDInvestor"));
			set(foreigbusinessloc.passwordInvestor, pdfResultReport.testData.get("PasswordInvestor"));
			set(foreigbusinessloc.confirmPasswordInvestor, pdfResultReport.testData.get("ConfirmPasswordInvestor"));
			SimpleDateFormat df1 = new SimpleDateFormat("hhmmss");
			Date d1 = new Date();
			String time1 = df1.format(d1);
			System.out.println("time1::" + time1);
		
			set(foreigbusinessloc.mobileNumber, pdfResultReport.testData.get("MobileNumber"));
			click(foreigbusinessloc.investorLoginTermsandCondition);
			click(foreigbusinessloc.investorContinue);
			waitForElement(foreigbusinessloc.otpContent, 30);
			text(foreigbusinessloc.otpContent);
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
			 Thread.sleep(4000);	
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
			Thread.sleep(2000);
			
			screenclick("C:\\Users\\user\\git\\Batumbu\\SeleniumAutomation_Validus\\Media\\OpenTab.png");
			waitForObj(2000);
			switchwindow(1);
			ThreadLocalWebdriver.getDriver().get("https://test.salesforce.com/");
		 	waitForObj(2000);
			set(foreigbusinessloc.username, "clsupport@validus.sg.pinjamnnew");
			waitForObj(2000);
			set(foreigbusinessloc.password, "Validus*1");
			click(foreigbusinessloc.Saleslogin);
			
	} catch (Exception e1) {
	 
		e1.printStackTrace();
	}
	}

	public void gmailOTP() throws Throwable {
		
		try {
		 
			screenclick("C:\\Users\\user\\git\\Batumbu\\SeleniumAutomation_Validus\\Media\\OpenTab.png");
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
		set(foreigbusinessloc.emailId, "autoqa@validus.sg");
		click(foreigbusinessloc.emailNext);
		Thread.sleep(3000);
		set(foreigbusinessloc.gmailPassword,"Validu$Tech");
		Thread.sleep(1000);
		click(foreigbusinessloc.emailNext);
		Thread.sleep(4000);
		
		screenclick("C:\\Users\\user\\git\\Batumbu\\SeleniumAutomation_Validus\\Media\\mailmenu.png");
		screenclick("C:\\Users\\user\\git\\Batumbu\\SeleniumAutomation_Validus\\Media\\MailIcon.png");
		
		set(foreigbusinessloc.gmailSearch, "noreply@salesforce.com");
	 	
		click(foreigbusinessloc.gmailSearchButton);
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
	//	click(salesforcelocators.gmailMail);
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
	 	/*
		ThreadLocalWebdriver.getDriver().get("http://mail.saisasolutions.com");
		set(salesforcelocators.saisaUsername, "nithin.bolishetti@saisasolutions.com");
		set(salesforcelocators.saisaPassword, "Ni9hin@27");
		click(salesforcelocators.mailLogin);
		Thread.sleep(30000);
		switchframe(ThreadLocalWebdriver.getDriver().findElement(By.name("UserEmail")));
		String time = ThreadLocalWebdriver.getDriver()
				.findElement(By.xpath("//*[@id=\"ctl00_Split_GP_MPH_HyperGrid1_0\"]/td[3]/div[1]")).getText();
		System.out.println(time);
		String[] mins = time.split(":");

		click(By.xpath("(//div[@class=\"multiline line1 shrink\"])[1]"));
		// driver.findElement(By.xpath("(//div[@class=\"multiline line1
		// shrink\"])[1]")).click();
		Thread.sleep(5000);
		// driver.switchTo().defaultContent();
		switchframe(ThreadLocalWebdriver.getDriver().findElement(By.id("ctl00_Split_Frame_ContentFrame")));
		String otp = null;
		String str1 = ThreadLocalWebdriver.getDriver()
				.findElement(By.xpath("//*[@id='ctl00_MPH_UpdatePanel2']/pre")).getText();

		// System.out.println(str1);
		String[] s1 = str1.split("\n");
		System.out.println(s1.length);
		for (int i = 0; i < s1.length; i++) {
			if (s1[i].contains("Verification")) {
				String code = s1[i];
				System.out.println(code);
				String[] ec = code.split(":");
				otp = ec[1];
				System.out.println("code ::" + otp);
			}
		}*/
		
	 
		
		screenclick("C:\\Users\\user\\git\\Batumbu\\SeleniumAutomation_Validus\\Media\\DeleteMaiil.png");
		
		Actions a = new Actions(ThreadLocalWebdriver.getDriver());
		a.sendKeys(Keys.F5).build().perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_F5);
		r.keyRelease(KeyEvent.VK_F5);
		Thread.sleep(4000);
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
					click(foreigbusinessloc.UnregisteredUser);
					 String str=	ThreadLocalWebdriver.getDriver().findElement(foreigbusinessloc.UnRegisterText).getText();
				System.out.println("Total No Of Usrs Are"+"  "+str);
				 
				
				   String[] s2 = str.split("\n");
					System.out.println("No Of Unregistered Users Are"+s2.length);
				
					for(int j=0; j<s2.length;j++) {
						
						if(s2[j].contains("aApN000")) {

							String idnum = s2[j];
							System.out.println("User is"+idnum);
							ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'"+idnum+"')]")).click();

							System.out.println("First Mail text is "+text(foreigbusinessloc.Maildidtext));
							System.out.println("Mail text second is"+text(foreigbusinessloc.mailtext2));
					    	 waitForObj(5000);
							String mailtext1 = ThreadLocalWebdriver.getDriver().findElement(foreigbusinessloc.Maildidtext).getText();
							waitForObj(5000);  
					         
							
					        	if(mailtext1.equals(pdfResultReport.testData.get("EmailIDInvestor"))){
					        	Thread.sleep(3000);
								String optMsg = ThreadLocalWebdriver.getDriver().findElement(By.xpath("//*[@id='00NN00000039a68_ileinner']")).getText();
								System.out.println("optMsg ::" + optMsg);

								switchwindow(0);
								JavascriptExecutor js = (JavascriptExecutor) ThreadLocalWebdriver.getDriver();
								WebElement el = ThreadLocalWebdriver.getDriver().findElement(By.cssSelector("input[id=otpEntered]"));
								js.executeScript("arguments[0].value = arguments[1];", el, optMsg);
								click(foreigbusinessloc.continueInvestor);
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
								click(foreigbusinessloc.Mailverification);
								
							 	waitForObj(1000);
								  screenclick("C:\\Users\\user\\git\\Batumbu\\SeleniumAutomation_Validus\\Media\\LeaveButton.png");
								Thread.sleep(20000);
								 swtichToChildTab();	
								click(foreigbusinessloc.LoginKiPlatform);
								 break;	
																	        	
					        }else {
					        
					        screenclick("C:\\Users\\user\\git\\Batumbu\\SeleniumAutomation_Validus\\Media\\BackBUtton.png");
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
	public void navigatetoForeignBUsinessEntity() throws Exception {
		try {
			waitForElement(foreigbusinessloc.ForeignBusiness, 60);
			click(foreigbusinessloc.ForeignBusiness);
			waitForObj(3000);
			pdfResultReport.addStepDetails("navigatetoindividualInvestorSingaporeCitizen","User should click on individualInvestorSingaporeCitizen","User successfully clicked on individualInvestorSingaporeCitizen" + " ","Pass", "Y");	
		 }catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  pdfResultReport.addStepDetails("navigatetoindividualInvestorSingaporeCitizen","User is not able to click on individualInvestorSingaporeCitizen", "Unable to open the click on individualInvestorSingaporeCitizen"+e.getMessage(),"Fail", "N");
	  }
	}
	public void foreignbusinessregistration() throws Throwable {
		try {
			
			
			set(foreigbusinessloc.ComapanyName, pdfResultReport.testData.get("Companyname"));
			select(foreigbusinessloc.greetings, pdfResultReport.testData.get("Title"));
			set(foreigbusinessloc.DeedNumber, pdfResultReport.testData.get("UEN Number"));
			set(foreigbusinessloc.firstName2, pdfResultReport.testData.get("First Name"));
			set(foreigbusinessloc.DateooDeed, pdfResultReport.testData.get("DeedOfEstd"));
			set(foreigbusinessloc.MiddleName, pdfResultReport.testData.get("Middle Name"));
			set(foreigbusinessloc.companyAddress2, pdfResultReport.testData.get("Registered Address"));
			set(foreigbusinessloc.lastname, pdfResultReport.testData.get("Last Name"));
			set(foreigbusinessloc.postalCode2, pdfResultReport.testData.get("Postal code"));
			
			set(foreigbusinessloc.IdnUmber, pdfResultReport.testData.get("NRIC/Passport Number"));
			set(foreigbusinessloc.SimNumber, pdfResultReport.testData.get("NRIC/Passport Number"));
			set(foreigbusinessloc.PassportNumber, pdfResultReport.testData.get("NRIC/Passport Number"));
		
			set(foreigbusinessloc.industryDescription, pdfResultReport.testData.get("Industry Description"));
			
			// set(foreigbusinessloc.NRICPassportNumber2, pdfResultReport.testData.get("NRIC/Passport Number"));	
			
			select(foreigbusinessloc.Nationality2, pdfResultReport.testData.get("Nationality") );
			waitForObj(2000);
			select(foreigbusinessloc.SICCCode, pdfResultReport.testData.get("SICC (Industry) Code"));
		  	
			set(foreigbusinessloc.primaryConatctNo2, pdfResultReport.testData.get("PrimaryCntctNo"));
			set(foreigbusinessloc.designationInv2, pdfResultReport.testData.get("Designation"));
		    
			set(foreigbusinessloc.Networthprevious, pdfResultReport.testData.get("Net Profit loss previous year"));
			set(foreigbusinessloc.NetwothCurrentyear, pdfResultReport.testData.get("Net Profit loss latest year"));
			
			//select(foreigbusinessloc.Source, pdfResultReport.testData.get("Source"));
		    set(foreigbusinessloc.ManagementName, pdfResultReport.testData.get("SearchText"));
			set(foreigbusinessloc.DeptMangement, pdfResultReport.testData.get("Designation"));
			set(foreigbusinessloc.ServeSinceDate, pdfResultReport.testData.get("Date of Registration"));
			set(foreigbusinessloc.IdManagement, pdfResultReport.testData.get("Account Number"));
			set(foreigbusinessloc.SimNumManagement, pdfResultReport.testData.get("Account Number"));
			set(foreigbusinessloc.MangementPassport, pdfResultReport.testData.get("NRIC/Passport Number"));
			select(foreigbusinessloc.ManagementCitizenship , pdfResultReport.testData.get("Nationality"));
			set(foreigbusinessloc.MangementContact, pdfResultReport.testData.get("Account Number"));
			
			set(foreigbusinessloc.ShareholderName, pdfResultReport.testData.get("SearchText"));
			set(foreigbusinessloc.ShareholderPercentage, pdfResultReport.testData.get("Percentage"));
			set(foreigbusinessloc.ShareIDNum, pdfResultReport.testData.get("Account Number"));
			set(foreigbusinessloc.ShareSimNum, pdfResultReport.testData.get("Account Number"));
			set(foreigbusinessloc.ShareholderPassport, pdfResultReport.testData.get("NRIC/Passport Number"));
			select(foreigbusinessloc.ShareholderCitizenShip, pdfResultReport.testData.get("Nationality"));
			set(foreigbusinessloc.Sharecontact, pdfResultReport.testData.get("Account Number"));
		    
			
			
			waitForObj(2000);
		 	
			uploadFile(foreigbusinessloc.KTP);
			waitForObj(10000);
			uploadFile(foreigbusinessloc.SIM);
			waitForObj(10000);
			uploadFile(foreigbusinessloc.FrontPassport);
			waitForObj(10000);
			uploadFile(foreigbusinessloc.RearPassport);
			waitForObj(10000);
			uploadFile(foreigbusinessloc.Certificateofestablishment);
			waitForObj(10000);
			uploadFile(foreigbusinessloc.DeedofEstablishment);
			pageDown();
			waitForObj(10000);
			uploadFile(foreigbusinessloc.NPWPBoardofDirectors);
			waitForObj(10000);
			uploadFile(foreigbusinessloc.OtherFiles);
			waitForObj(10000);
		     
			click(foreigbusinessloc.Agree1);
		    click(foreigbusinessloc.Agree2);
		    click(foreigbusinessloc.Agree3);
		    click(foreigbusinessloc.Agree4);
		    click(foreigbusinessloc.Agree5);
		    click(foreigbusinessloc.Agree6);
		    
		      JSClick(foreigbusinessloc.FBSubmit , "Submit Button");
		      
		      waitForObj(5000);
		  	set(foreigbusinessloc.AccountNumber, pdfResultReport.testData.get("Account Number"));
			set(foreigbusinessloc.BankName, pdfResultReport.testData.get("Bank Name"));
			set(foreigbusinessloc.BranchCode, pdfResultReport.testData.get("Branch Code"));
			click(foreigbusinessloc.submitbank);
			waitForObj(5000);
			 String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath("//h3[@class='profile-ban-txt']")).getText();
				System.out.println(str);
			
			 Screen exit=new Screen();
			 exit.click("C:\\Users\\Mani\\Desktop\\Automate Registration Pics\\KELUAR.png");
		 
			 
			
		//	switchwindow(0);	//JSClick(registerasInvestorlocators.submit, "Submit Button");
			  waitForObj(3000);
			pdfResultReport.addStepDetails("Register as companyIncorporatedInSingapore","User should register as companyIncorporatedInSingapore","Successfully registered as companyIncorporatedInSingapore" + " ","Pass", "Y");
		}
		catch(Exception e) {
			log.fatal("Unable to Homelogin"+e.getMessage());
			pdfResultReport.addStepDetails("Register as companyIncorporatedInSingapore", "User is not able to register as companyIncorporatedInSingapore", "User unable to register as companyIncorporatedInSingapore"+e.getMessage(), "Fail", "N");
		}
			}
	
	
	public void internationalInstitution() throws Throwable {
		
		try {
			
			click(institutionLoc.investortype);
			
			set(institutionLoc.comapanyName, pdfResultReport.testData.get("Companyname"));
			selectbyvalue(institutionLoc.Greetings, pdfResultReport.testData.get("Title"));
			set(institutionLoc.DeedNumber, pdfResultReport.testData.get("UEN Number"));
			set(institutionLoc.DateOfEstablishment, pdfResultReport.testData.get("DeedOfEstd"));
			click(institutionLoc.firstName);
			set(institutionLoc.firstName, pdfResultReport.testData.get("First Name"));
			set(institutionLoc.MiddleName, pdfResultReport.testData.get("Middle Name"));
			set(institutionLoc.lastName, pdfResultReport.testData.get("Last Name"));
			set(institutionLoc.CompanyAddress, pdfResultReport.testData.get("Registered Address"));
			set(institutionLoc.IdcardNumber, pdfResultReport.testData.get("NRIC/Passport Number"));
			set(institutionLoc.SimNumber, pdfResultReport.testData.get("NRIC/Passport Number"));
			set(institutionLoc.PassPortNumber, pdfResultReport.testData.get("NRIC/Passport Number"));
			set(institutionLoc.PostalCode, pdfResultReport.testData.get("Postal code"));
			select(institutionLoc.CitizenShip, pdfResultReport.testData.get("Nationality"));
			select(institutionLoc.FieldOfBusiness, pdfResultReport.testData.get("SICC (Industry) Code"));
			set(institutionLoc.MainContactNumber, pdfResultReport.testData.get("PrimaryCntctNo"));
			set(institutionLoc.Department, pdfResultReport.testData.get("Fdepart"));
			js_type(institutionLoc.NetWorthPreviousYear, pdfResultReport.testData.get("Net Profit loss previous year"),"Net Worth PreviousYear");
			js_type(institutionLoc.NetWorthCurrentYear, pdfResultReport.testData.get("Net Profit loss previous year"),"net Worth Current year");
			
			select(institutionLoc.NoOfmanagement, "2");
			js_type(institutionLoc.ManagementName1, pdfResultReport.testData.get("First Name"),"First management Name ");
			set(institutionLoc.IdcardNUmber1, pdfResultReport.testData.get("SICC (Industry) Code"));
			set(institutionLoc.PositionManagement1, pdfResultReport.testData.get("Designation"));
			js_type(institutionLoc.ServeSince1, pdfResultReport.testData.get("DeedOfEstd"),"Serve Since");
			click(institutionLoc.SimNumManagement1);
			set(institutionLoc.SimNumManagement1, pdfResultReport.testData.get("PrimaryCntctNo"));
			set(institutionLoc.passportnumMangement, pdfResultReport.testData.get("NRIC/Passport Number"));
			select(institutionLoc.CitizenshipMangement1, pdfResultReport.testData.get("Nationality"));
			set(institutionLoc.ContactManegement1, pdfResultReport.testData.get("PrimaryCntctNo"));
			
			js_type(institutionLoc.ManagementName2, pdfResultReport.testData.get("First Name"),"Second mangement Name");
			set(institutionLoc.IdcardNUmber2, pdfResultReport.testData.get("SICC (Industry) Code"));
			set(institutionLoc.PositionManagement1, pdfResultReport.testData.get("Designation"));
			js_type(institutionLoc.ServeSince2, pdfResultReport.testData.get("DeedOfEstd"),"Second Serve Since");
			click(institutionLoc.SimNumManagement2);
			set(institutionLoc.SimNumManagement2, pdfResultReport.testData.get("PrimaryCntctNo"));
			set(institutionLoc.passportnumMangement2, pdfResultReport.testData.get("NRIC/Passport Number"));
			select(institutionLoc.CitizenshipMangement2, pdfResultReport.testData.get("Nationality"));
			set(institutionLoc.ContactManegement2, pdfResultReport.testData.get("PrimaryCntctNo"));
			
			select(institutionLoc.NoOfShareholders, "2");
			
			js_type(institutionLoc.ShareholderName1, pdfResultReport.testData.get("ShareHoldername"),"First Share Holder Name");
			set(institutionLoc.PercentageShare1, pdfResultReport.testData.get("Percentage"));
			js_type(institutionLoc.ShareholderIdNUmber1, pdfResultReport.testData.get("ID NUmber"),"Shareholder Id Number");
			set(institutionLoc.ShareSimeNumber1, pdfResultReport.testData.get("PrimaryCntctNo"));
			set(institutionLoc.SharePassportNumber, pdfResultReport.testData.get("NRIC/Passport Number"));
			select(institutionLoc.ShareCitizenShip1, pdfResultReport.testData.get("Nationality"));
			set(institutionLoc.SahreContact1, pdfResultReport.testData.get("PrimaryCntctNo"));
			
			js_type(institutionLoc.ShareholderName2, pdfResultReport.testData.get("ShareHoldername"),"Second Share Holder name");
			set(institutionLoc.PercentageShare2, pdfResultReport.testData.get("Percentage"));
			js_type(institutionLoc.ShareholderIdNUmber2, pdfResultReport.testData.get("ID NUmber"),"Seconfd Share holder Id Number");
			set(institutionLoc.ShareSimeNumber2, pdfResultReport.testData.get("PrimaryCntctNo"));
			set(institutionLoc.SharePassportNumber2, pdfResultReport.testData.get("NRIC/Passport Number"));
			select(institutionLoc.ShareCitizenShip2, pdfResultReport.testData.get("Nationality"));
			set(institutionLoc.ShareContact2, pdfResultReport.testData.get("PrimaryCntctNo"));
			
			uploadFile(institutionLoc.Uploaffile1);
			waitForObj(15000);
			uploadFile(institutionLoc.Uploaffile2);
			waitForObj(15000);
			uploadFile(institutionLoc.Uploaffile3);
			waitForObj(15000);
			uploadFile(institutionLoc.Uploaffile4);
			waitForObj(15000);
			uploadFile(institutionLoc.Uploaffile5);
			waitForObj(15000);
			uploadFile(institutionLoc.Uploaffile6);
			waitForObj(15000);
			uploadFile(institutionLoc.Uploaffile7);
			waitForObj(10000);
			
			JSClick(institutionLoc.Agree1, "Terms Conditions 1");
			click(institutionLoc.Agree2);
			click(institutionLoc.Agree3);
			click(institutionLoc.Agree4);
			click(institutionLoc.Agree5);
			click(institutionLoc.Agree6);
			
			click(institutionLoc.Kirim);
			
		}catch(Exception e) {
			
			
		}
		
	}
	 
	
public void batumbuAdminApproval() throws Throwable{
		
		try{
			
			
			waitForObj(2000);
			
			
			screenclick("C:\\Users\\user\\git\\Batumbu\\SeleniumAutomation_Validus\\Media\\OpenTab.png");
			switchwindow(1);
			ThreadLocalWebdriver.getDriver().get("http://portal.batumbu.id/BatumbuAdmin/public/");
			
			set(institutionLoc.AdminMail, "portaladmin@batumbu.id");
			set(institutionLoc.AdminPassword, "Admin123");
			click(institutionLoc.AdminLogin);
			
			waitForObj(2000);
			click(institutionLoc.Lenders);
			waitForObj(2000);
			set(institutionLoc.LendeSearch, pdfResultReport.testData.get("EmailIDInvestor"));
			waitForObj(2000);
			click(institutionLoc.ViewDetailsLender);
			waitForObj(2000);
			click(institutionLoc.Application);
			waitForObj(4000);
			click(institutionLoc.LenderDocumentslist);
			waitForObj(4000);
			click(institutionLoc.VerifyDocuments);
			waitForObj(3000);
			uploadFile(institutionLoc.ChooseFilelender);
			waitForObj(7000);
			click(institutionLoc.SubmitLender);
			waitForObj(5000);
			click(institutionLoc.ApproveLender);
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
	  

public void salesforceApproval() throws Throwable {
		
		try {
			
			switchwindow(0);
			ThreadLocalWebdriver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			click(foreigbusinessloc.Applications);
			
	        String text=text(foreigbusinessloc.ApplicationList);
	        System.out.println("Total applications "+text);
	        String[] s = text.split("\n");
			System.out.println(s.length);
		 	ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'"+ pdfResultReport.testData.get("Companyname")+"')]")).click();
		 	pageDown();
		 	pageDown();
		 	Thread.sleep(3000);
		 	click(foreigbusinessloc.ApplicationNumber);
			Thread.sleep(3000);
	        click(foreigbusinessloc.ApproveApplication);
	        waitForObj(3000);
	        click(foreigbusinessloc.ChoooseFile);
	        
	        waitForObj(15000);
	        Screen S= new Screen();
			S.type("C:\\Users\\Mani\\Desktop\\Automate Registration Pics\\Text.png",  "C:\\Users\\Mani\\Desktop\\Automate Registration Pics\\dummy-pdf_2.pdf");
			S.click("C:\\Users\\Mani\\Desktop\\Automate Registration Pics\\OpenButton.PNG");
			waitForObj(7000);
			 JSClick(foreigbusinessloc.Upload, "Upload File BUtton");
			Thread.sleep(7000);
			JSClick(foreigbusinessloc.Approve,"Approve Investor");
			 
			//switchwindow(0);		
			
			/*	Screen c = new Screen();
			c.click("C:\\Users\\Mani\\Desktop\\Automate Registration Pics\\Approveimg.png");
	
			
			Screen upload = new Screen();
			upload.click("C:\\Users\\Mani\\Desktop\\Automate Registration Pics\\CHOOSEFILE.png");
			Thread.sleep(7000);
					
			Screen S= new Screen();
			S.type("C:\\Users\\Mani\\Desktop\\Automate Registration Pics\\Text.png",  "C:\\Users\\Mani\\Desktop\\Automate Registration Pics\\dummy-pdf_2.pdf");
			S.click("C:\\Users\\Mani\\Desktop\\Automate Registration Pics\\OpenButton.PNG");
		Thread.sleep(7000);
			c.click("C:\\Users\\Mani\\Desktop\\Automate Registration Pics\\UPLOAD.png");
			Screen verify = new Screen();
			verify.click("C:\\Users\\Mani\\Desktop\\Automate Registration Pics\\APPROVE.png");*/
	
			/*waitForObj(4000);
		set(salesforcelocators.investorSearch, pdfResultReport.testData.get("EmailIDInvestor"));
		waitForObj(4000);
		click(salesforcelocators.investorSearchButton);
	    String str=	text(salesforcelocators.salesforceApplications);
		System.out.println(str);
		String[] s = str.split("\n");
		System.out.println(s.length);
		for(int i=0;i<s.length;i++) {
			
			if(s[i].contains("APP-000")) {
				String x = s[i];
				System.out.println(x);
				String[] y = x.split(" ");
				String z = y[1];
				System.out.println(z);
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'"+z+"')]")).click();
				
				JSClick(salesforcelocators.Investordocument,"Investor document");
				click(salesforcelocators.investorapplication);
			 
		*/ 
		pdfResultReport.addStepDetails("Salesforce Approval", "User should able to approve the record successfully",
				"Successfully approve the record from the salesforce application" + " ", "Pass", "Y");
	} catch (Exception e3) {
		log.fatal("Unable to approve the record with Salesforce" + e3.getMessage());
		pdfResultReport.addStepDetails("Salesforce Approval", "User is not able to approve the record from salesforce",
				"Unable to approve the record from salesforce application" + e3.getMessage(), "Fail", "N");
	}
	}
	

public void bankDetails() throws Throwable {
	
	try {
	
		/*click(registerasInvestorlocators.bank);
	click(registerasInvestorlocators.edit);
	set(registerasInvestorlocators.AccountOwner, pdfResultReport.testData.get("Account Owner"));
	*/
	switchwindow(1);
	js_Select(foreigbusinessloc.AccountOwner, pdfResultReport.testData.get("ShareHoldername"),"Account Number");
	set(foreigbusinessloc.AccountNumber, pdfResultReport.testData.get("Account Number"));
	set(foreigbusinessloc.BankName, pdfResultReport.testData.get("Bank Name"));
	set(foreigbusinessloc.BranchCode, pdfResultReport.testData.get("Branch Code"));
	click(foreigbusinessloc.submitbank);

	//screenclick("C:\\Users\\user\\git\\Batumbu\\SeleniumAutomation_Validus\\Media\\KELUAR.png");
	 
	 
	
    pdfResultReport.addStepDetails("Investor bank details","User should able to do Enter bank Details","Successfully able to Enter bank Deetails" + " ","Pass", "Y");
	
}
catch(Exception e) {
	log.fatal("Unable to Homelogin"+e.getMessage());
	pdfResultReport.addStepDetails("Investorfund", "User is not able to fund", "Not able to fund successfully"+e.getMessage(), "Fail", "N");
}
}

public void batumbuAdminApprovalforeignbusiness() throws Throwable{
	
	try{
		 
		screenclick("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\OpenTab.png");

 	 	switchwindow(2);
		ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/BatumbuAdmin/public/");
		
		set(foreigbusinessloc.AdminMail, "portaladmin@batumbu.id");
		set(foreigbusinessloc.AdminPassword, "Admin123");
		click(foreigbusinessloc.AdminLogin);
		
		waitForObj(2000);
		click(foreigbusinessloc.Lenders);
		waitForObj(2000);
		set(foreigbusinessloc.LendeSearch, pdfResultReport.testData.get("EmailIDInvestor"));
		waitForObj(2000);
		click(foreigbusinessloc.ViewDetailsLender);
		waitForObj(2000);
		click(foreigbusinessloc.Application);
		waitForObj(4000);
		click(foreigbusinessloc.LenderDocumentslist);
		waitForObj(4000);
		click(foreigbusinessloc.VerifyDocuments);
		waitForObj(3000);
		uploadFile(foreigbusinessloc.ChooseFilelender);
		waitForObj(7000);
		click(foreigbusinessloc.SubmitLender);
		waitForObj(5000);
		click(foreigbusinessloc.ApproveLender);
		waitForObj(10000);
		
/*			Actions A = new Actions(ThreadLocalWebdriver.getDriver());
		A.moveToElement(ThreadLocalWebdriver.getDriver().findElement(individualforeignlocators.InitiateTransaction)).click().build().perform();
		//JSClick(IndonesiaLegalLoc.InitiateTransaction, "Intiate Transacton");
		waitForObj(10000);
		screenclick("C:\\Users\\Mani\\Desktop\\Automate Registration Pics\\initiatetransaction.png");
		waitForObj(5000);
		
		set(IndonesiaLegalLoc.TransactionAmount, pdfResultReport.testData.get("TransactionAmount"));
		waitForObj(2000);
		select(IndonesiaLegalLoc.TransactionTYPE, pdfResultReport.testData.get("TransactionType"));
		waitForObj(2000);
		click(IndonesiaLegalLoc.SubmitTransaction);
		waitForObj(15000);
		
		set(IndonesiaLegalLoc.TransactionAmount, pdfResultReport.testData.get("TransactionAmount"));
		waitForObj(2000);
		select(IndonesiaLegalLoc.TransactionTYPE, pdfResultReport.testData.get("TransactionType"));
		waitForObj(2000);
		click(IndonesiaLegalLoc.SubmitTransaction);
		waitForObj(15000); 
		
		
		 JSClick(IndonesiaLegalLoc.LenderfFundTransaction, "Lender Fund Transaction");
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
			select(IndonesiaLegalLoc.TypeOfTransaction, pdfResultReport.testData.get("TransactionType"));
			waitForObj(2000);
			select(IndonesiaLegalLoc.LenderPaymentMode, pdfResultReport.testData.get("PaymentMode"));
			click(IndonesiaLegalLoc.SubmitLenderFund);
		waitForObj(8000);
		 
		}
		 
*/			
		switchwindow(0);
		
} catch(Exception e ){
e.printStackTrace();
pdfResultReport.addStepDetails("BatumbuAdmin Approval", "User should able to approve the record successfully",
		"Successfully approve the record from the BatumbuAdmin application" + " ", "Pass", "Y");
	  

}		}	
	









public void salesforcefund() throws Exception {
	try {
	 
	set(foreigbusinessloc.salesSearch, pdfResultReport.testData.get("EmailIDInvestor"));
	click(foreigbusinessloc.SAlesSearchButton);
	waitForObj(5000);
	ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'"+pdfResultReport.testData.get("Companyname") +"')]")).click();
	click(foreigbusinessloc.investorFundTransaction);
	click(foreigbusinessloc.newFundTransaction);
	ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@tabindex='4']")).clear();
	set(foreigbusinessloc.transactionAmount, "100000.00");
	set(foreigbusinessloc.paymentMode, "ACH");
	waitForObj(2000);
	click(foreigbusinessloc.savefund);
	 
	
	pdfResultReport.addStepDetails("salesforcefund", "User should able to fund the application successfully",
			"Successfully funded to the application" + " ", "Pass", "Y");
	
	switchwindow(1);
	
} catch (Exception e) {
	log.fatal("Unable to Homelogin" + e.getMessage());
	pdfResultReport.addStepDetails("salesforcefund", "User is not able to fund to the application",
			"Unable to fund  the application" + e.getMessage(), "Fail", "N");
}
			
}
public void investorfunddetails() throws Exception {
	
	try {
		switchwindow(1);
		Actions a = new Actions(ThreadLocalWebdriver.getDriver());
		a.sendKeys(Keys.F5).build().perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_F5);
		r.keyRelease(KeyEvent.VK_F5);
		waitForObj(3000);
		click(foreigbusinessloc.platform);
		click(foreigbusinessloc.allLivefacilities);
		
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

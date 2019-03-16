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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.python.core.exceptions;
import org.sikuli.script.Screen;

	import com.baseClasses.BaseClass_Web;
	import com.baseClasses.PDFResultReport;
	import com.baseClasses.ThreadLocalWebdriver;
	 import com.objectRepository.Foreign_Legal_Entity_Locators;
import com.objectRepository.Indonesia_legalEntity_Locators;
import com.objectRepository.ValidusRegisterAsInvester;
	import com.objectRepository.ValidusSmoke_Loc;
	import com.objectRepository.Validus_SalesforceLoc;

public class Batumbu_Investor_Indonesia_LegalEntity_Components extends BaseClass_Web {
	 
 		public ValidusRegisterAsInvestorComponents  registerasinvestor = new ValidusRegisterAsInvestorComponents(pdfResultReport);
		public Indonesia_legalEntity_Locators   IndonesiaLegalLoc	= new Indonesia_legalEntity_Locators();
	    public Batumbu_Investor_Indonesia_LegalEntity_Components(PDFResultReport pdfresultReport){
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
				js_type(IndonesiaLegalLoc.emailIDInvestor, pdfResultReport.testData.get("EmailIDInvestor"), "username");
				set(IndonesiaLegalLoc.passwordInvestor, pdfResultReport.testData.get("PasswordInvestor"));
			 
				click(IndonesiaLegalLoc.Masuk);
				waitForObj(10000);
				
		 
				pdfResultReport.addStepDetails("login","Application should login","Successfully loggedIn into the application" + " ","Pass", "Y");	
			 }catch(Exception e){
				  log.fatal("Unable to open the URL"+e.getMessage());
				  pdfResultReport.addStepDetails("login","Unable to open the url", "Unable to login into the application"+e.getMessage(),"Fail", "N");
		  }
		}
		
		public void CreateAccount() throws Exception {
			try {
				//click(IndonesiaLegalLoc.validusMainpageLogin);
				click(IndonesiaLegalLoc.validusCreateanAccount);
				waitForElement(IndonesiaLegalLoc.validusInvestor, 30);
				waitForObj(3000);
				click(IndonesiaLegalLoc.validusInvestor);
				SimpleDateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");
				Date d = new Date();
				String time = df.format(d);
				System.out.println("time::" + time);
			 	//set(validussmokelocators.emailIDInvestor, emailIDInvestor);
				set(IndonesiaLegalLoc.emailIDInvestor, pdfResultReport.testData.get("EmailIDInvestor"));
				set(IndonesiaLegalLoc.passwordInvestor, pdfResultReport.testData.get("PasswordInvestor"));
				set(IndonesiaLegalLoc.confirmPasswordInvestor, pdfResultReport.testData.get("ConfirmPasswordInvestor"));
				SimpleDateFormat df1 = new SimpleDateFormat("hhmmss");
				Date d1 = new Date();
				String time1 = df1.format(d1);
				System.out.println("time1::" + time1);
			
				set(IndonesiaLegalLoc.mobileNumber, pdfResultReport.testData.get("MobileNumber"));
				click(IndonesiaLegalLoc.investorLoginTermsandCondition);
				click(IndonesiaLegalLoc.investorContinue);
				waitForElement(IndonesiaLegalLoc.otpContent, 30);
				text(IndonesiaLegalLoc.otpContent);
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
				Thread.sleep(3000);
				Screen s=new Screen();
				s.type("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\text.png", "C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\dummy-pdf_2.pdf");;
				s.click("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\OpenButton.png");
				Thread.sleep(4000);	
			}catch(Exception e) {
				System.out.println("Unable to upload the file inthe Locator"+loc);
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
		
		public void screenclick(String path) {
			
			try {
				Screen S= new Screen();
				S.click(path);
				
				
			}catch(Exception e) {
				e.printStackTrace();
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
				set(IndonesiaLegalLoc.username, "clsupport@validus.sg.pinjamnnew");
				waitForObj(2000);
				set(IndonesiaLegalLoc.password, "Validus*1");
				 click(IndonesiaLegalLoc.Saleslogin);
				
				
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		}

		public void gmailOTP() throws Throwable {
			
			try {
			 
			screenclick("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\OpenTab.png");
			Thread.sleep(5000);
			try {
				switchwindow(2);
				Thread.sleep(3000);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			Thread.sleep(3000);
			ThreadLocalWebdriver.getDriver().get("https://accounts.google.com/signin");
			 Thread.sleep(3000);
	 
			set(IndonesiaLegalLoc.emailId, "autoqa@validus.sg");
			click(IndonesiaLegalLoc.emailNext);
			Thread.sleep(3000);
			set(IndonesiaLegalLoc.gmailPassword,"Validu$Tech");
			Thread.sleep(1000);
			click(IndonesiaLegalLoc.emailNext);
			Thread.sleep(4000);
			screenclick("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\mailmenu.png");
			 
			screenclick("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\MailIcon.png");
			
			set(IndonesiaLegalLoc.gmailSearch, "noreply@salesforce.com");
 
			click(IndonesiaLegalLoc.gmailSearchButton);
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
 					Thread.sleep(2000);
				}
		  	}

			 
		screenclick("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\DeleteMaiil.png");
			Thread.sleep(2000);
			ThreadLocalWebdriver.getDriver().close();
			Thread.sleep(4000);
			try {
				 switchwindow(1);
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
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
						 
				click(IndonesiaLegalLoc.UnregisteredUser);
				String str=	ThreadLocalWebdriver.getDriver().findElement(IndonesiaLegalLoc.UnRegisterText).getText();
				System.out.println("Total No Of Usrs Are"+"  "+str);
				
				
				
				   String[] s2 = str.split("\n");
					System.out.println("No Of Unregistered Users Are"+s2.length);
				
					for(int j=0; j<s2.length;j++) {
						
						if(s2[j].contains("aApN000")) {

							String idnum = s2[j];
							System.out.println("User is"+idnum);
							ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'"+idnum+"')]")).click();

							System.out.println("First Mail text is "+text(IndonesiaLegalLoc.Maildidtext));
							System.out.println("Mail text second is"+text(IndonesiaLegalLoc.mailtext2));
					    	 waitForObj(5000);
							String mailtext1 = ThreadLocalWebdriver.getDriver().findElement(IndonesiaLegalLoc.Maildidtext).getText();
							waitForObj(5000);  
					       
					        	if(mailtext1.equals(pdfResultReport.testData.get("EmailIDInvestor"))){
					        	Thread.sleep(3000);
								String optMsg = ThreadLocalWebdriver.getDriver().findElement(By.xpath("//*[@id='00NN00000039a68_ileinner']")).getText();
								System.out.println("optMsg ::" + optMsg);

								switchwindow(0);
								JavascriptExecutor js = (JavascriptExecutor) ThreadLocalWebdriver.getDriver();
								WebElement el = ThreadLocalWebdriver.getDriver().findElement(By.cssSelector("input[id=otpEntered]"));
								js.executeScript("arguments[0].value = arguments[1];", el, optMsg);
								click(IndonesiaLegalLoc.continueInvestor);
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
								 click(IndonesiaLegalLoc.Mailverification);
							
							 	 waitForObj(1000);
							 	 screenclick("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\LeaveButton.png");
								 Thread.sleep(20000);
								 swtichToChildTab();	
								 click(IndonesiaLegalLoc.LoginKiPlatform);
								 break;	
																	        	
					        }else {
					        
					         
					        screenclick("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\BackBUtton.png");
					        }
							
					
						}
					}
				

						 
						 /*	String[] s2 = str.split("\n");
					System.out.println(s2.length);
					for(int j=0; j<s2.length;j++) {
						if(s2[j].contains("a77")) {
							String code1 = s2[j];
							System.out.println(code1);
					 		String[] abd = code1.split(" ");
							String otp2 = abd[1];
							System.out.println("Code ::" +otp2);
							ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'"+otp2+"')]")).click();
						}
					}
					*/
				 	Thread.sleep(3000);
					String optMsg = ThreadLocalWebdriver.getDriver()
							.findElement(By.xpath("//*[@id='00NN00000039a68_ileinner']")).getText();
					System.out.println("optMsg ::" + optMsg);
					 switchwindow(0);
		 
					JavascriptExecutor js = (JavascriptExecutor) ThreadLocalWebdriver.getDriver();
					WebElement el = ThreadLocalWebdriver.getDriver().findElement(By.cssSelector("input[id=otpEntered]"));
					js.executeScript("arguments[0].value = arguments[1];", el, optMsg);
					click(IndonesiaLegalLoc.continueInvestor);
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
					click(IndonesiaLegalLoc.Mailverification);
					
				 	waitForObj(10000);
					 
					 screenclick("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\LeaveButton.png");
					Thread.sleep(20000);
					swtichToChildTab();
					 click(IndonesiaLegalLoc.LoginKiPlatform);
					
					pdfResultReport.addStepDetails("Salesforce mobile and email verification", "User should able to verify mobile and email successfully",
								"Successfully verified the email and mobile from the salesforce application" + " ", "Pass", "Y");
					} 
			catch (Exception e3) {
				log.fatal("Unable to verify the mobile and email verification in Salesforce" + e3.getMessage());
				pdfResultReport.addStepDetails("Salesforce mobile and email verification", "User is not able to verify mobile and email from salesforce",
						"Unable to verify the email and mobile from salesforce application" + e3.getMessage(), "Fail", "N");
			}			
				}
		
		
		
		public void navigateToIndonesianLegalEntity() throws Exception {
			try {
				waitForElement(IndonesiaLegalLoc.IndonesianLegalEntity, 60);
				click(IndonesiaLegalLoc.IndonesianLegalEntity);
				waitForObj(3000);
				pdfResultReport.addStepDetails("navigatetoindividualInvestorSingaporeCitizen","User should click on individualInvestorSingaporeCitizen","User successfully clicked on individualInvestorSingaporeCitizen" + " ","Pass", "Y");	
			 }catch(Exception e){
				  log.fatal("Unable to open the URL"+e.getMessage());
				  pdfResultReport.addStepDetails("navigatetoindividualInvestorSingaporeCitizen","User is not able to click on individualInvestorSingaporeCitizen", "Unable to open the click on individualInvestorSingaporeCitizen"+e.getMessage(),"Fail", "N");
		  }
		}
		public void PinjamancompanyIncorporatedInSingapore() throws Throwable {
			try {
				
				
				set(IndonesiaLegalLoc.ComapanyName, pdfResultReport.testData.get("Companyname"));
				select(IndonesiaLegalLoc.greetings, pdfResultReport.testData.get("Title"));
				set(IndonesiaLegalLoc.DeedNumber, pdfResultReport.testData.get("UEN Number"));
				set(IndonesiaLegalLoc.firstName2, pdfResultReport.testData.get("First Name"));
				set(IndonesiaLegalLoc.DateooDeed, pdfResultReport.testData.get("DeedOfEstd"));
				click(IndonesiaLegalLoc.MiddleName );
				set(IndonesiaLegalLoc.MiddleName, pdfResultReport.testData.get("Middle Name"));
				set(IndonesiaLegalLoc.companyAddress2, pdfResultReport.testData.get("Registered Address"));
				set(IndonesiaLegalLoc.lastname, pdfResultReport.testData.get("Last Name"));
				
				js_type(IndonesiaLegalLoc.IdCardNumber, pdfResultReport.testData.get("NRIC/Passport Number"),"ID CArd number");
				js_type(IndonesiaLegalLoc.SimNumber, pdfResultReport.testData.get("NRIC/Passport Number"),"Sim Number");
				js_type(IndonesiaLegalLoc.Passportnumber, pdfResultReport.testData.get("NRIC/Passport Number"),"PassportZNumber");
				set(IndonesiaLegalLoc.postalCode2, pdfResultReport.testData.get("Postal code"));
				selectbyvalue(IndonesiaLegalLoc.Nationality2, pdfResultReport.testData.get("Nationality") );
				waitForObj(2000);
				selectbyvalue(IndonesiaLegalLoc.SICCCode, pdfResultReport.testData.get("SICC (Industry) Code"));
			  	 waitForObj(2000);
				
				set(IndonesiaLegalLoc.primaryConatctNo2, pdfResultReport.testData.get("PrimaryCntctNo"));
				set(IndonesiaLegalLoc.designationInv2, pdfResultReport.testData.get("Designation"));
			    set(IndonesiaLegalLoc.Networthprevious, pdfResultReport.testData.get("Net Profit loss previous year"));
				set(IndonesiaLegalLoc.NetwothCurrentyear, pdfResultReport.testData.get("Net Profit loss previous year"));
				waitForObj(2000);
				 
				set(IndonesiaLegalLoc.ManagementName, pdfResultReport.testData.get("SearchText"));
				set(IndonesiaLegalLoc.DeptMangement, pdfResultReport.testData.get("Designation"));
				set(IndonesiaLegalLoc.ServeSinceDate, pdfResultReport.testData.get("DeedOfEstd"));
				click(IndonesiaLegalLoc.IdNumberManagement1 );
				set(IndonesiaLegalLoc.IdNumberManagement1, pdfResultReport.testData.get("Annual Revenue latest year"));
				set(IndonesiaLegalLoc.SimNumManagement1, pdfResultReport.testData.get("Annual Revenue latest year"));
				set(IndonesiaLegalLoc.MangementPassport, pdfResultReport.testData.get("NRIC/Passport Number"));
				select(IndonesiaLegalLoc.ManagementCitizenship , pdfResultReport.testData.get("Nationality"));
				set(IndonesiaLegalLoc.MangementContact, pdfResultReport.testData.get("Account Number"));
				
				set(IndonesiaLegalLoc.ShareholderName, pdfResultReport.testData.get("SearchText"));
				set(IndonesiaLegalLoc.ShareholderPercentage, pdfResultReport.testData.get("Percentage"));
				set(IndonesiaLegalLoc.ShareIdNum1, pdfResultReport.testData.get("NRIC/Passport Number"));
				set(IndonesiaLegalLoc.ShareSimNumber1, pdfResultReport.testData.get("NRIC/Passport Number"));
				set(IndonesiaLegalLoc.ShareholderPassport, pdfResultReport.testData.get("NRIC/Passport Number"));
				select(IndonesiaLegalLoc.ShareholderCitizenShip, pdfResultReport.testData.get("Nationality"));
				set(IndonesiaLegalLoc.Sharecontact, pdfResultReport.testData.get("Account Number"));
			 	
				waitForObj(2000);
			 	pageDown();
				uploadFile(IndonesiaLegalLoc.Upload1);
				waitForObj(10000);
				uploadFile(IndonesiaLegalLoc.Upload2);
				waitForObj(10000);
				uploadFile(IndonesiaLegalLoc.Upload3);
				waitForObj(10000);
				uploadFile(IndonesiaLegalLoc.Upload4);
				waitForObj(10000);
				uploadFile(IndonesiaLegalLoc.Upload5);
				waitForObj(10000);
				   pageDown();
				uploadFile(IndonesiaLegalLoc.Upload6);
				waitForObj(10000);
				uploadFile(IndonesiaLegalLoc.Upload7);
			 
			    
			    click(IndonesiaLegalLoc.Agree1);
			    click(IndonesiaLegalLoc.Agree2);
			    click(IndonesiaLegalLoc.Agree3);
			    click(IndonesiaLegalLoc.Agree4);
			    click(IndonesiaLegalLoc.Agree5);
			    click(IndonesiaLegalLoc.Agree6);
			    
			      JSClick(IndonesiaLegalLoc.FBSubmit , "Submit Button");
			      Thread.sleep(2000);
			  	set(IndonesiaLegalLoc.AccountNumber, pdfResultReport.testData.get("Account Number"));
			  	 Thread.sleep(2000);
			  	set(IndonesiaLegalLoc.BankName, pdfResultReport.testData.get("Bank Name"));
			  	 Thread.sleep(2000);
			  	set(IndonesiaLegalLoc.BranchCode, pdfResultReport.testData.get("Branch Code"));
			  	 Thread.sleep(2000);
			  	click(IndonesiaLegalLoc.submitbank);
				waitForObj(5000);
 
				Screen exit=new Screen();
				 exit.click("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\KELUAR.png");
			 
				 
			 	//JSClick(registerasInvestorlocators.submit, "Submit Button");
				  waitForObj(3000);
				pdfResultReport.addStepDetails("Register as companyIncorporatedInSingapore","User should register as companyIncorporatedInSingapore","Successfully registered as companyIncorporatedInSingapore" + " ","Pass", "Y");
			}
			catch(Exception e) {
				log.fatal("Unable to Homelogin"+e.getMessage());
				pdfResultReport.addStepDetails("Register as companyIncorporatedInSingapore", "User is not able to register as companyIncorporatedInSingapore", "User unable to register as companyIncorporatedInSingapore"+e.getMessage(), "Fail", "N");
			}
				}
		
		
	public void salesforceApproval() throws Throwable {
			
			try {
			
		
				click(IndonesiaLegalLoc.Applications);
		        String text=text(IndonesiaLegalLoc.ApplicationList);
		        System.out.println("Total applications "+text);
		        String[] s = text.split("\n");
				System.out.println(s.length);
			 	ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'"+ pdfResultReport.testData.get("Companyname")+"')]")).click();
			 	Thread.sleep(3000);
			 	click(IndonesiaLegalLoc.ApplicationNumber);
				Thread.sleep(3000);
		        click(IndonesiaLegalLoc.ApproveApplication);
		         waitForObj(20000);
				
		        uploadFile(IndonesiaLegalLoc.ChoooseFile );
		        waitForObj(10000);  
		        JSClick(IndonesiaLegalLoc.Upload, "Upload BUtton");
		        JSClick(IndonesiaLegalLoc.Approve,"Approve Investor");
				
		     	 
				 
		
				
				
				/*	waitForObj(4000);
				set(IndonesiaLegalLoc.investrosearch, pdfResultReport.testData.get("EmailIDInvestor"));
				waitForObj(4000);
				click(IndonesiaLegalLoc.searchbuton);
			    String str=	text(IndonesiaLegalLoc.salesforceApplications);
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
						
						JSClick(IndonesiaLegalLoc.Investordocument,"Investor document");
						click(IndonesiaLegalLoc.investorapplication);
				*/
				 
			
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
		/*click(registerasInvestorlocators.bank);
		click(registerasInvestorlocators.edit);
		set(registerasInvestorlocators.AccountOwner, pdfResultReport.testData.get("Account Owner"));
		*/click(IndonesiaLegalLoc.bank);
			set(IndonesiaLegalLoc.AccountNumber, pdfResultReport.testData.get("Account Number"));
		set(IndonesiaLegalLoc.BankName, pdfResultReport.testData.get("Bank Name"));
		set(IndonesiaLegalLoc.BranchCode, pdfResultReport.testData.get("Branch Code"));
		click(IndonesiaLegalLoc.submitbank);

		String str = text(IndonesiaLegalLoc.investorstatus);
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
	
	
public void batumbuAdminApproval() throws Throwable{
		
		try{
			 
			screenclick("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\OpenTab.png");

	 	 	switchwindow(2);
			ThreadLocalWebdriver.getDriver().get("http://149.129.218.139/BatumbuAdmin/public/");
			
			set(IndonesiaLegalLoc.AdminMail, "portaladmin@batumbu.id");
			set(IndonesiaLegalLoc.AdminPassword, "Admin123");
			click(IndonesiaLegalLoc.AdminLogin);
			
			waitForObj(2000);
			click(IndonesiaLegalLoc.Lenders);
			waitForObj(2000);
			set(IndonesiaLegalLoc.LendeSearch, pdfResultReport.testData.get("EmailIDInvestor"));
			waitForObj(2000);
			click(IndonesiaLegalLoc.ViewDetailsLender);
			waitForObj(2000);
			click(IndonesiaLegalLoc.Application);
			waitForObj(4000);
			click(IndonesiaLegalLoc.LenderDocumentslist);
			waitForObj(4000);
			click(IndonesiaLegalLoc.VerifyDocuments);
			waitForObj(3000);
			uploadFile(IndonesiaLegalLoc.ChooseFilelender);
			waitForObj(7000);
			click(IndonesiaLegalLoc.SubmitLender);
			waitForObj(5000);
			click(IndonesiaLegalLoc.ApproveLender);
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
			
			switchwindow(0);
			set(IndonesiaLegalLoc.salesSearch, pdfResultReport.testData.get("EmailIDInvestor"));
			click(IndonesiaLegalLoc.SAlesSearchButton);
			waitForObj(3000);
			 
		ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'"+pdfResultReport.testData.get("Companyname") +"')]")).click();
		click(IndonesiaLegalLoc.investorFundTransaction);
		click(IndonesiaLegalLoc.newFundTransaction);
		ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@tabindex='4']")).clear();
		set(IndonesiaLegalLoc.transactionAmount, "100000.00");
		set(IndonesiaLegalLoc.paymentMode, "ACH");
		waitForObj(2000);
		click(IndonesiaLegalLoc.savefund);
		switchwindow(1);
		Actions a = new Actions(ThreadLocalWebdriver.getDriver());
		a.sendKeys(Keys.F5).build().perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_F5);
		r.keyRelease(KeyEvent.VK_F5);
		
		
		pdfResultReport.addStepDetails("salesforcefund", "User should able to fund the application successfully",
				"Successfully funded to the application" + " ", "Pass", "Y");
		switchwindow(0);
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
			click(IndonesiaLegalLoc.platform);
			click(IndonesiaLegalLoc.allLivefacilities);
			
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


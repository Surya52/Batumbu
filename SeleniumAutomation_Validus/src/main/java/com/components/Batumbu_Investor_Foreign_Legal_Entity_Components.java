package com.components;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.Select;
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
 import com.objectRepository.Foreign_Legal_Entity_Locators;
import com.objectRepository.ValidusRegisterAsInvester;
import com.objectRepository.ValidusSmoke_Loc;
import com.objectRepository.Validus_SalesforceLoc;
 

public class Batumbu_Investor_Foreign_Legal_Entity_Components extends BaseClass_Web{
	
	public ValidusRegisterAsInvester registerasInvestorlocators=new ValidusRegisterAsInvester();
	public ValidusRegisterAsInvestorComponents  registerasinvestor = new ValidusRegisterAsInvestorComponents(pdfResultReport);
     public 	Foreign_Legal_Entity_Locators   foreignentityloc  =new Foreign_Legal_Entity_Locators( );
	public Batumbu_Investor_Foreign_Legal_Entity_Components(PDFResultReport pdfresultReport){
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
			 
			 //click(foreignentityloc.validusMainpageLogin);
			js_type(foreignentityloc.emailIDInvestor, pdfResultReport.testData.get("EmailIDInvestor"), "username");
			waitForObj(2000);
			
			set(foreignentityloc.passwordInvestor, pdfResultReport.testData.get("PasswordInvestor"));
		 
			click(foreignentityloc.Userlogin);
			waitForObj(10000);
			
	 		pdfResultReport.addStepDetails("login","Application should login","Successfully loggedIn into the application" + " ","Pass", "Y");	
		 }catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  pdfResultReport.addStepDetails("login","Unable to open the url", "Unable to login into the application"+e.getMessage(),"Fail", "N");
	  }
	}
	

	public void login2() throws Throwable {
		try {
			/*Screen login = new Screen();
			login.type("C:\\Users\\Mani\\Desktop\\Automate Registration Pics\\UserName.png", pdfResultReport.testData.get("EmailIDInvestor"));
		    waitForObj(3000);
			login.type("C:\\Users\\Mani\\Desktop\\Automate Registration Pics\\sPAssword.png", pdfResultReport.testData.get("PasswordInvestor"));
			*/
			
		//	swtichToChildTab();	
			//switchwindow(1);
			//click(foreignentityloc.validusMainpageLogin);
			js_type(foreignentityloc.emailIDInvestor, pdfResultReport.testData.get("EmailIDInvestor"), "username");
			set(foreignentityloc.passwordInvestor, pdfResultReport.testData.get("PasswordInvestor"));
		 
			click(foreignentityloc.Userlogin);
			waitForObj(10000);
			
	 		pdfResultReport.addStepDetails("login","Application should login","Successfully loggedIn into the application" + " ","Pass", "Y");	
		 }catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  pdfResultReport.addStepDetails("login","Unable to open the url", "Unable to login into the application"+e.getMessage(),"Fail", "N");
	  }
	}
	
	
	
	public void CreateAccount() throws Exception {
		try {
			
			//click(foreignentityloc.validusMainpageLogin);
			click(foreignentityloc.validusCreateanAccount);
			waitForElement(foreignentityloc.validusInvestor, 30);
			waitForObj(3000);
			click(foreignentityloc.validusInvestor);
			set(foreignentityloc.emailIDInvestor, pdfResultReport.testData.get("EmailIDInvestor"));
			set(foreignentityloc.passwordInvestor, pdfResultReport.testData.get("PasswordInvestor"));
			set(foreignentityloc.confirmPasswordInvestor, pdfResultReport.testData.get("ConfirmPasswordInvestor"));
			SimpleDateFormat df1 = new SimpleDateFormat("hhmmss");
			Date d1 = new Date();
			String time1 = df1.format(d1);
			System.out.println("time1::" + time1);
		
			set(foreignentityloc.mobileNumber, pdfResultReport.testData.get("MobileNumber"));
			click(foreignentityloc.investorLoginTermsandCondition);
			click(foreignentityloc.investorContinue);
			waitForElement(foreignentityloc.otpContent, 60);
			text(foreignentityloc.otpContent);
		    System.out.println(text(foreignentityloc.otpContent));
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
			 Thread.sleep(7000);
			Screen s=new Screen();
			 s.type("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\text.png", "C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\dummy-pdf_2.pdf");
			s.click("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\OpenButton.png");
			Thread.sleep(5000);
		}catch(Exception e) {
			System.out.println("Unable to upload the file");
		}
	}
	
	public void screenclick(String path) {
		  
		try {
			waitForObj(2000);
			Screen S=  new Screen();
			S.click(path);
			
		} catch (FindFailed e) {
			System.out.println("Unable to Upload file");  
			e.printStackTrace();
		}
	}
	public void pageDown() {
		try {
			Actions a=new Actions(ThreadLocalWebdriver.getDriver());
			a.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println("Unable to Move Down To Page");
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
			set(foreignentityloc.username, "clsupport@validus.sg.pinjamnnew");
			waitForObj(2000);
			set(foreignentityloc.password, "Validus*1");
		 	click(foreignentityloc.Saleslogin);
			
			
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
			Thread.sleep(3000);
		} catch (Exception e1) {
			 
			e1.printStackTrace();
		}
		
		Thread.sleep(3000);
		ThreadLocalWebdriver.getDriver().get("https://accounts.google.com/signin");
		 Thread.sleep(3000);
		  	set(foreignentityloc.emailId, "autoqa@validus.sg");
		click(foreignentityloc.emailNext);
		Thread.sleep(3000);
		set(foreignentityloc.gmailPassword,"Validu$Tech");
		Thread.sleep(1000);
		click(foreignentityloc.emailNext);
		Thread.sleep(4000);
		 
		screenclick("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\mailmenu.png");
		 
		screenclick("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\MailIcon.png");
		Thread.sleep(4000);
		 set(foreignentityloc.gmailSearch, "noreply@salesforce.com");
    	click(foreignentityloc.gmailSearchButton);
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
		
		Thread.sleep(2000);
		set(By.xpath("//input[@id='emc']"), otp);
		click(By.xpath("//input[@id='save']"));
		waitForObj(10000);
		

		
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
					 click(foreignentityloc.UnregisteredUser);
					 String str=	ThreadLocalWebdriver.getDriver().findElement(foreignentityloc.UnRegisterText).getText();
				System.out.println("Total No Of Usrs Are"+"  "+str);
					 
					/* if(str.contains("aApN00")){
					System.out.println("First User applicatoin NUmber is"+str);
					ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'"+str+"')]")).click();
				       
				}
				String  optMsg=text(foreignentityloc.Otp);
				
				switchwindow(0);
				JavascriptExecutor js = (JavascriptExecutor) ThreadLocalWebdriver.getDriver();
				WebElement el = ThreadLocalWebdriver.getDriver().findElement(By.cssSelector("input[id=otpEntered]"));
				js.executeScript("arguments[0].value = arguments[1];", el, optMsg);
				click(foreignentityloc.continueInvestor);
				Thread.sleep(7000);
		      	ThreadLocalWebdriver.getDriver().close();
		     	Thread.sleep(5000);
				
			 	*/	
				   String[] s2 = str.split("\n");
					System.out.println("No Of Unregistered Users Are"+s2.length);
				
					for(int j=0; j<s2.length;j++) {
						
						if(s2[j].contains("aApN000")) {

							String idnum = s2[j];
							System.out.println("User is"+idnum);
							ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'"+idnum+"')]")).click();

							System.out.println("First Mail text is "+text(foreignentityloc.Maildidtext));
							System.out.println("Mail text second is"+text(foreignentityloc.mailtext2));
					    	 waitForObj(5000);
							String mailtext1 = ThreadLocalWebdriver.getDriver().findElement(foreignentityloc.Maildidtext).getText();
							waitForObj(5000);  
					        //if(mailtext1==pdfResultReport.testData.get("EmailIDInvestor")){
							
					        	if(mailtext1.equals(pdfResultReport.testData.get("EmailIDInvestor"))){
					        	Thread.sleep(3000);
								String optMsg = ThreadLocalWebdriver.getDriver().findElement(By.xpath("//*[@id='00NN00000039a68_ileinner']")).getText();
								System.out.println("optMsg ::" + optMsg);

								switchwindow(0);
								JavascriptExecutor js = (JavascriptExecutor) ThreadLocalWebdriver.getDriver();
								WebElement el = ThreadLocalWebdriver.getDriver().findElement(By.cssSelector("input[id=otpEntered]"));
								js.executeScript("arguments[0].value = arguments[1];", el, optMsg);
								click(foreignentityloc.continueInvestor);
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
								click(foreignentityloc.Mailverification);
								
							 	waitForObj(1000);
								Screen S= new  Screen();
								 S.click("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\LeaveButton.png");
								Thread.sleep(20000);
								 swtichToChildTab();	
								click(foreignentityloc.LoginKiPlatform);
								 break;	
																	        	
					        }else {
					        
					        Screen back= new Screen();
					        back.click("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\BackBUtton.png");
					        }
							
					
						}
					}
				
				
				 /*
				
						String code1 = s2[j];
						System.out.println(code1);
						
						String[] abd = code1.split(" ");
						String otp2 = abd[1];
						System.out.println("Code ::" +otp2);
						ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'"+otp2+"')]")).click();
					break;
					}
				}
				*//*click(salesforcelocators.unregisteredUsers);
				click(salesforcelocators.go);*/
			//	if (ThreadLocalWebdriver.getDriver().findElement(By.xpath("//img[@class='last']")).isDisplayed()) {
			//		click(salesforcelocators.lastButton);
			//		Thread.sleep(10000);
			//	} else {
			//		System.out.println();
			//	}
				 				/*
				List<WebElement> list = ThreadLocalWebdriver.getDriver()
						.findElements(By.xpath("//*[@class='x-grid3-cell-inner x-grid3-col-Name']/a/span"));
				System.out.println(list.size());
				for (int i = 0; i < list.size(); i++) {
					if(i==2) {
						System.out.println("//*[@id='" + list.get(i).getText() +"']");
						ThreadLocalWebdriver.getDriver()
						.findElement(By.xpath("//*[@id='" + list.get(i).getText() +"']")).click();
					}
					if (i == list.size() - 1) {
						System.out.println(list.get(i).getText());
						System.out.println("//*[@id='" + list.get(i).getText() + "_Name']/a/span");
				
						Actions a = new Actions(ThreadLocalWebdriver.getDriver());
			        	a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
						waitForObj(2000);
						a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
						waitForObj(2000);
						a.sendKeys(Keys.PAGE_DOWN).build().perform();
						Thread.sleep(3000);
						a.moveToElement(ThreadLocalWebdriver.getDriver().findElement(By.xpath("//*[@id='" + list.get(i).getText() + "_Name']/a/span")));
						a.click(ThreadLocalWebdriver.getDriver().findElement(By.xpath("//*[@id='" + list.get(i).getText() + "_Name']/a/span")));
						JavascriptExecutor js = (JavascriptExecutor) ThreadLocalWebdriver.getDriver();
						WebElement el = ThreadLocalWebdriver.getDriver().findElement(By.xpath("//*[@id='" + list.get(i).getText() + "_Name']/a/span"));
						js.executeScript("arguments[0].value = arguments[1];", "click");
						a.moveToElement(ThreadLocalWebdriver.getDriver().findElement(By.xpath("//*[@id='"+list.get(i).getText()+"_Name']/a/span"))).build().perform();
						a.click(ThreadLocalWebdriver.getDriver().findElement(By.xpath("//*[@id='" + list.get(i).getText() + "_Name']/a/span"))).build().perform();
						switchwindow(2);
						//ThreadLocalWebdriver.getDriver().findElement(By.xpath("//*[@id='"+list.get(i).getText()+"_Name']/a/span")).click();
						//a.sendKeys(Keys.ARROW_DOWN).build().perform();
					}
				}
				
				 * try { list.get(list.size()-1).click(); } catch (Exception e) { // TODO
				 * Auto-generated catch block e.printStackTrace(); }
				 */
				/*
				 * Set<String> otpStr=driver.getWindowHandles(); System.out.println(otpStr);
				 * Object[] otpo=otpStr.toArray(); System.out.println(otpo.length);
				 * driver.switchTo().window(otpo[1].toString());
				 */
 
			/*	WebElement otpTxtBox = ThreadLocalWebdriver.getDriver().findElement(salesforcelocators.otpinvestor);
				Actions builder = new Actions(ThreadLocalWebdriver.getDriver());
				Actions seriesOfActions = builder.moveToElement(otpTxtBox).click().sendKeys(otpTxtBox, optMsg);
				seriesOfActions.perform();*/

				/*List<WebElement> lists = ThreadLocalWebdriver.getDriver()
						.findElements(By.xpath("//*[@class='x-grid3-cell-inner x-grid3-col-Name']/a/span"));
				System.out.println(lists.size());
				Actions a = new Actions(ThreadLocalWebdriver.getDriver());
				for (int i = 0; i < lists.size(); i++) {
					if (i == lists.size() - 1) {
						System.out.println(lists.get(i).getText());
						System.out.println("//*[@id='" + lists.get(i).getText() + "_Name']/a/span");
						//Actions a = new Actions(ThreadLocalWebdriver.getDriver());
						a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
						waitForObj(2000);
						a.sendKeys(Keys.ARROW_DOWN).build().perform();
						Thread.sleep(2000);
						ThreadLocalWebdriver.getDriver()
								.findElement(By.xpath("//*[@id='" + list.get(i).getText() + "_Name']/a/span")).click();*/
				  pdfResultReport.addStepDetails("Salesforce mobile and email verification", "User should able to verify mobile and email successfully",
							"Successfully verified the email and mobile from the salesforce application" + " ", "Pass", "Y");
				} 
		catch (Exception e3) {
			
			log.fatal("Unable to verify the mobile and email verification in Salesforce" + e3.getMessage());
			pdfResultReport.addStepDetails("Salesforce mobile and email verification", "User is not able to verify mobile and email from salesforce",
					"Unable to verify the email and mobile from salesforce application" + e3.getMessage(), "Fail", "N");
		}			
			}
	public void navigateToForeignlegalentity() throws Exception {
		try {
			waitForElement(foreignentityloc.foreignlegalentity, 30);
			click(foreignentityloc.foreignlegalentity);
			waitForObj(3000);
			pdfResultReport.addStepDetails("navigatetoindividualInvestorForeignCitizen","User should click on individualInvestorForeignLegalCitizen","User successfully clicked on individualInvestorForeignlegalCitizen" + " ","Pass", "Y");	
		 }catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  pdfResultReport.addStepDetails("navigatetoindividualInvestorForeignCitizen","User is not able to click on individualInvestorForeignLegaCitizen", "Unable to open the click on individualInvestorSingaporeCitizen"+e.getMessage(),"Fail", "N");
	  }
	}
	public void foreignLegalEntityRegistration() throws Throwable {
		try {
			
			
			
			set(foreignentityloc.ComapanyName, pdfResultReport.testData.get("Companyname"));
			select(foreignentityloc.Greetings, pdfResultReport.testData.get("Title"));
			set(foreignentityloc.DeedNumber, pdfResultReport.testData.get("UEN Number"));
			set(foreignentityloc.firstName2, pdfResultReport.testData.get("First Name"));
			set(foreignentityloc.DateooDeed, pdfResultReport.testData.get("DeedOfEstd"));
			click(foreignentityloc.MiddleName);
			set(foreignentityloc.MiddleName, pdfResultReport.testData.get("Middle Name"));
			set(foreignentityloc.companyAddress2, pdfResultReport.testData.get("Registered Address"));
			set(foreignentityloc.lastname, pdfResultReport.testData.get("Last Name"));
			
			set(foreignentityloc.NRICPassportNumber2, pdfResultReport.testData.get("NRIC/Passport Number"));	
			set(foreignentityloc.postalCode2, pdfResultReport.testData.get("Postal code"));
			select(foreignentityloc.Nationality2, pdfResultReport.testData.get("Nationality") );
			select(foreignentityloc.SICCCode, pdfResultReport.testData.get("SICC (Industry) Code"));
		  	 set(foreignentityloc.SimNumber, pdfResultReport.testData.get("Net Profit loss previous year"));
		  	set(foreignentityloc.PassPortNUm, pdfResultReport.testData.get("Net Profit loss previous year"));
		  	 waitForObj(2000);
			
			set(foreignentityloc.primaryConatctNo2, pdfResultReport.testData.get("PrimaryCntctNo"));
			set(foreignentityloc.designationInv2, pdfResultReport.testData.get("Designation"));
		    set(foreignentityloc.Networthprevious, pdfResultReport.testData.get("Net Profit loss previous year"));
			set(foreignentityloc.NetwothCurrentyear, pdfResultReport.testData.get("Net Profit loss previous year"));
		
			 
			set(foreignentityloc.ManagementName, pdfResultReport.testData.get("SearchText"));
			set(foreignentityloc.DeptMangement, pdfResultReport.testData.get("Designation"));
			set(foreignentityloc.ServeSinceDate, pdfResultReport.testData.get("Date of Registration"));
			click(foreignentityloc.MangementPassport);
			set(foreignentityloc.MangementPassport, pdfResultReport.testData.get("NRIC/Passport Number"));
			set(foreignentityloc.IDManagement1, pdfResultReport.testData.get("NRIC/Passport Number"));
			set(foreignentityloc.SimNumber1, pdfResultReport.testData.get("NRIC/Passport Number"));
			selectbyvalue(foreignentityloc.ManagementCitizenship , pdfResultReport.testData.get("Nationality"));
			js_type(foreignentityloc.MangementContact, pdfResultReport.testData.get("Net Profit loss previous year"),"Management Contact Number");
			
			
			js_type(foreignentityloc.ShareholderName, pdfResultReport.testData.get("SearchText"),"Shareholder Name");
			set(foreignentityloc.ShareholderPercentage, pdfResultReport.testData.get("Percentage"));
			set(foreignentityloc.ShareholderPassport, pdfResultReport.testData.get("NRIC/Passport Number"));
			set(foreignentityloc.IDShareHolder1, pdfResultReport.testData.get("Account Number"));
			set(foreignentityloc.SIMNumberShare1, pdfResultReport.testData.get("Account Number"));
			select(foreignentityloc.ShareholderCitizenShip, pdfResultReport.testData.get("Nationality"));
			js_type(foreignentityloc.Sharecontact, pdfResultReport.testData.get("Account Number"),"Share Holder Contact1");
		 
			
			waitForObj(2000);
			uploadFile(foreignentityloc.Upload1);
			waitForObj(15000);
	 
			uploadFile(foreignentityloc.Upload2);
			waitForObj(15000);
			uploadFile(foreignentityloc.Upload3);
			waitForObj(15000);
			uploadFile(foreignentityloc.Upload4);
			waitForObj(15000);
			uploadFile(foreignentityloc.Upload5);
			waitForObj(15000);
			pageDown();
			uploadFile(foreignentityloc.Upload6);
			waitForObj(15000);
			uploadFile(foreignentityloc.upload7);
			waitForObj(15000);
			
		    
		    click(foreignentityloc.Agree1);
		    click(foreignentityloc.Agree2);
		    click(foreignentityloc.Agree3);
		    click(foreignentityloc.Agree4);
		    click(foreignentityloc.Agree5);
		    click(foreignentityloc.Agree6);
		    
		      JSClick(foreignentityloc.FBSubmit , "Submit Button");
		      waitForObj(10000);
	
		    //  select(foreignentityloc.AccountOwner,  pdfResultReport.testData.get("Account Owner"));
	 	   set(foreignentityloc.AccountNumber, pdfResultReport.testData.get("Account Number"));
		  	set(foreignentityloc.BankName, pdfResultReport.testData.get("Bank Name"));
		  	set(foreignentityloc.BranchCode, pdfResultReport.testData.get("Branch Code"));
		  	click(foreignentityloc.submitbank);
		  	 waitForObj(10000);
		 	 
		  	 screenclick("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\KELUAR.png");
  			 
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
			
			set(foreignentityloc.AdminMail, "portaladmin@batumbu.id");
			set(foreignentityloc.AdminPassword, "Admin123");
			click(foreignentityloc.AdminLogin);
			
			waitForObj(2000);
			click(foreignentityloc.Lenders);
			waitForObj(2000);
			set(foreignentityloc.LendeSearch, pdfResultReport.testData.get("EmailIDInvestor"));
			waitForObj(2000);
			click(foreignentityloc.ViewDetailsLender);
			waitForObj(2000);
			click(foreignentityloc.Application);
			waitForObj(4000);
			click(foreignentityloc.LenderDocumentslist);
			waitForObj(4000);
			click(foreignentityloc.VerifyDocuments);
			waitForObj(3000);
			uploadFile(foreignentityloc.ChooseFilelender);
			waitForObj(7000);
			click(foreignentityloc.SubmitLender);
			waitForObj(5000);
			click(foreignentityloc.ApproveLender);
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
			click(foreignentityloc.Applications);
	        String text=text(foreignentityloc.ApplicationList);
	        System.out.println("Total applications "+text);
	        String[] s = text.split("\n");
			System.out.println(s.length);
		 	ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'"+ pdfResultReport.testData.get("Companyname")+"')]")).click();
		 	Thread.sleep(3000);
		 	pageDown();
		 	pageDown();
		 	pageDown();
		 	click(foreignentityloc.ApplicationNumber);
			Thread.sleep(3000);
	        click(foreignentityloc.ApproveApplication);
	        uploadFile(foreignentityloc.ChoooseFile);
	        waitForObj(3000);
	        
			JSClick(foreignentityloc.Upload, "Upload File BUtton");
			Thread.sleep(7000);
			JSClick(foreignentityloc.Approve,"Approve Investor");
			  
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
	
public void Investorfund() throws Exception {
	
	try {
	/*click(registerasInvestorlocators.bank);
	click(registerasInvestorlocators.edit);
	set(registerasInvestorlocators.AccountOwner, pdfResultReport.testData.get("Account Owner"));
	*/click(foreignentityloc.bank);
		set(foreignentityloc.AccountNumber, pdfResultReport.testData.get("Account Number"));
	set(foreignentityloc.BankName, pdfResultReport.testData.get("Bank Name"));
	set(foreignentityloc.BranchCode, pdfResultReport.testData.get("Branch Code"));
	click(foreignentityloc.submitbank);

	String str = text(foreignentityloc.investorstatus);
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

public void salesforcefund() throws Exception {

	try {
		
		switchwindow(0);
		set(foreignentityloc.salesSearch, pdfResultReport.testData.get("EmailIDInvestor"));
		click(foreignentityloc.SAlesSearchButton);
		waitForObj(2000);
		ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'"+pdfResultReport.testData.get("Companyname") +"')]")).click();
		click(foreignentityloc.investorFundTransaction);
		 
		click(foreignentityloc.newFundTransaction);
		waitForObj(4000);
		ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@tabindex='4']")).clear();
		waitForObj(2000);
		set(foreignentityloc.paymentMode, "ACH");
		waitForObj(2000);
		set(foreignentityloc.Amounttransaction, "100000.00");
		waitForObj(2000);
		click(foreignentityloc.savefund);
	 
	
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
		
	 switchwindow(1);
		Actions a = new Actions(ThreadLocalWebdriver.getDriver());
		a.sendKeys(Keys.F5).build().perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_F5);
		r.keyRelease(KeyEvent.VK_F5);
		click(foreignentityloc.Platform);
		click(foreignentityloc.CurrentLiveFacilities);
		text(foreignentityloc.availableFunds);
		click(foreignentityloc.InvestFund);
		
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

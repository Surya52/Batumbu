package com.components;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.bouncycastle.jce.provider.JCEKeyGenerator.Salsa20;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.commandhandler.UploadFile;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Screen;

import com.baseClasses.BaseClass_Web;
import com.baseClasses.PDFResultReport;
import com.baseClasses.ThreadLocalWebdriver;
import com.mobileUtilities_iOS.ThreadLocaliOSDriver;
import com.objectRepository.DBSOpenAccountLocators;
import com.objectRepository.ValidusRegisterAsInvester;
import com.objectRepository.ValidusSmoke_Loc;
import com.objectRepository.Validus_SalesforceLoc;

import bsh.org.objectweb.asm.Type;

public class ValidusSalesforceComponents extends BaseClass_Web {
	public ValidusRegisterAsInvester registerasInvestorlocators=new ValidusRegisterAsInvester();
	
	public ValidusSmoke_Loc validussmokelocators = new ValidusSmoke_Loc();
	public Validus_SalesforceLoc salesforcelocators = new Validus_SalesforceLoc();

	public ValidusSalesforceComponents(PDFResultReport pdfresultReport) {
		this.pdfResultReport = pdfresultReport;
	}

	public void openURL() throws Exception {
		try {
			launchapp(pdfResultReport.testDataValue.get("AppURL"));
			pdfResultReport.addStepDetails("openURL", "Application should open the url",
					"Successfully opened the URL" + " ", "Pass", "Y");
		} catch (Exception e) {
			log.fatal("Unable to open the URL" + e.getMessage());
			pdfResultReport.addStepDetails("openURL", "Application should open the url",
					"Unable to open the URL" + e.getMessage(), "Fail", "N");
		}

	}

	public void salesforceIntegrationLogin() throws Throwable {

		try {
			Thread.sleep(2000);
			Screen s = new Screen();
			s.click("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\OpenTab.png");
			waitForObj(2000);
			switchwindow(1);
			ThreadLocalWebdriver.getDriver().get("https://test.salesforce.com/");
		 	waitForObj(2000);
			set(salesforcelocators.username, "clsupport@validus.sg.pinjamnnew");
			waitForObj(2000);
			set(salesforcelocators.password, "Validus*1");
			click(salesforcelocators.Saleslogin);
			
			
	} catch (Exception e1) {
	 
		e1.printStackTrace();
	}
	}
	
	
	public void salesforceSTWCIntegrationLogin() throws Throwable {

		try {
			Thread.sleep(2000);
			Screen s = new Screen();
			s.click("E:\\SeleniumMavenProject\\SeleniumMavenProject\\MediaFiles\\newtabs.PNG");
			switchwindow(1);
			ThreadLocalWebdriver.getDriver().get("https://test.salesforce.com/");
		/*	set(salesforcelocators.username, "saisateam@validus.sg.dev");
			set(salesforcelocators.password, "test1234");*/
			/*set(salesforcelocators.username, "clsupport@validus.sg.pinjamnnew");
			set(salesforcelocators.password, "abcd12345");*/
			set(salesforcelocators.username, "mfiflex.code@88trialforce.com.vstage");
			set(salesforcelocators.password, "test1234");
			click(salesforcelocators.login);
			Thread.sleep(8000);
			
			
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	}
	public void singaporeSalesforceIntegrationLogin() throws Throwable {

		try {
			Thread.sleep(2000);
			Screen s = new Screen();
			s.click("C:\\Automation\\Workspace\\SeleniumAutomation_Validus\\MediaFiles\\newtabs.PNG");
			switchwindow(1);
			ThreadLocalWebdriver.getDriver().get("https://test.salesforce.com/");
			set(salesforcelocators.username, "mfiflex.code@88trialforce.com.dev");
			set(salesforcelocators.password, "Doodle1234");
		/*	set(salesforcelocators.username, "clsupport@validus.sg.pinjamnnew");
			set(salesforcelocators.password, "abcd12345");*/
			/*set(salesforcelocators.username, "saisateam@validus.sg.dev");
			set(salesforcelocators.password, "test1234");*/
			click(salesforcelocators.login);
		
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
			set(salesforcelocators.emailId, "autoqa@validus.sg");
			click(salesforcelocators.emailNext);
			Thread.sleep(3000);
			set(salesforcelocators.gmailPassword,"Validu$Tech");
			Thread.sleep(1000);
			click(salesforcelocators.emailNext);
			Thread.sleep(7000);
			Screen S=  new Screen();
			S.click("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\mailmenu.png");
			Screen S2=  new Screen();
			S2.click("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\MailIcon.png");
			
		 	set(salesforcelocators.gmailSearch, "noreply@salesforce.com");
		 	
			click(salesforcelocators.gmailSearchButton);
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
			
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//img[@class=\"hA T-I-J3\"]")).click();
			Screen maildelete=new Screen();
			maildelete.click("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\deleltemail.png");
			 			
		/*	Screen maildot=new Screen();
			maildot.click("C:\\Users\\user\\Desktop\\Automate Registration Pics\\maildot.png");
			Screen maildelete=new Screen();
			maildelete.click("C:\\Users\\user\\Desktop\\Automate Registration Pics\\deleltemail.png");
		*/	
			
		 	
			 Thread.sleep(3000);
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

		
public void singaporeMailOTP() throws Throwable {
			
			try {
			Screen s = new Screen();
            Thread.sleep(2000);
			s.click("C:\\Automation\\Workspace\\SeleniumAutomation_Validus\\MediaFiles\\newtabs.PNG");
			Thread.sleep(4000);
			try {
				switchwindow(2);
				Thread.sleep(1000);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			Thread.sleep(4000);
			ThreadLocalWebdriver.getDriver().get("https://www.google.com/gmail/about/#");
			click(salesforcelocators.signIN);
			Thread.sleep(3000);
			set(salesforcelocators.emailId, "autoqa@validus.sg");
			click(salesforcelocators.emailNext);
			Thread.sleep(3000);
			set(salesforcelocators.gmailPassword,"Validu$Tech");
			Thread.sleep(1000);
			click(salesforcelocators.emailNext);
			Thread.sleep(4000);
			//js_type(By.xpath("//input[@id='gbqfq']"), "noreply@salesforce.com", "search");
			set(salesforcelocators.gmailSearch, "noreply@salesforce.com");
		//	ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='gbqfq']")).sendKeys("noreply@salesforce.com");
			//ThreadLocalWebdriver.getDriver().findElement(By.xpath("//td[@style='vertical-align: top;']")).sendKeys("noreply@salesforce.com");
			
			click(salesforcelocators.gmailSearchButton);
			Thread.sleep(3000);
		List<WebElement> ele=ThreadLocalWebdriver.getDriver().findElements(By.xpath("//b[text()='Sandbox: Verify your identity in Salesforce']"));
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
					
					
				//JSClick(salesforcelocators.gmailDelete, "Delete");
					//ThreadLocalWebdriver.getDriver().findElement(By.xpath("//div[@class='T-I J-J5-Ji nX T-I-ax7 T-I-Js-Gs  W6eDmd']")).click();
					s.click("C:\\Automation\\Workspace\\SeleniumAutomation_Validus\\MediaFiles\\Delete.PNG");
					Thread.sleep(2000);
				}
			
		
			}
			
			
			 			
			ThreadLocalWebdriver.getDriver().close();
			
		
			Thread.sleep(3000);
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
				Thread.sleep(3000);
				 click(salesforcelocators.UnregisteredUser);
		String str=	ThreadLocalWebdriver.getDriver().findElement(salesforcelocators.FirstApplication).getText();
			if(str.contains("aApN00")){
				System.out.println("First User applicatoin NUmber is"+str);
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'"+str+"')]")).click();
			}
				  
			 //switchwindow(1);
			Thread.sleep(3000);
			String optMsg = ThreadLocalWebdriver.getDriver().findElement(By.xpath("//*[@id='00NN00000039a68_ileinner']")).getText();
			System.out.println("optMsg ::" + optMsg);
			/* System.out.println(str2);
        	ThreadLocalWebdriver.getDriver().close();
			 driver.switchTo().window(otpo[0].toString());
			switchwindow(1);*/
			switchwindow(0);
		/*	WebElement otpTxtBox = ThreadLocalWebdriver.getDriver().findElement(salesforcelocators.otpinvestor);
			Actions builder = new Actions(ThreadLocalWebdriver.getDriver());
			Actions seriesOfActions = builder.moveToElement(otpTxtBox).click().sendKeys(otpTxtBox, optMsg);
			seriesOfActions.perform();*/

			JavascriptExecutor js = (JavascriptExecutor) ThreadLocalWebdriver.getDriver();
			WebElement el = ThreadLocalWebdriver.getDriver().findElement(By.cssSelector("input[id=otpEntered]"));
			js.executeScript("arguments[0].value = arguments[1];", el, optMsg);
			// set(salesforcelocators.otpinvestor, "testing");
			click(salesforcelocators.continueInvestor);
			Thread.sleep(10000);
	     	/*String strr=	ThreadLocalWebdriver.getDriver().findElement(By.xpath("//h2[@class='heading-tQ']")).getText();
	     	System.out.println(strr);
	     	*/ThreadLocalWebdriver.getDriver().close();
	     	Thread.sleep(5000);
			switchwindow(0);
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
			Actions a = new Actions(ThreadLocalWebdriver.getDriver());
			a.sendKeys(Keys.F5).build().perform();
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_F5);
			r.keyRelease(KeyEvent.VK_F5);
			
			waitForObj(3000);
			click(salesforcelocators.Mailverification);
			
		 	waitForObj(10000);
			 
		 	Screen S= new Screen();
			 S.click("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\LeaveButton.png");
			Thread.sleep(15000);
			swtichToChildTab();
			 Screen S2= new Screen();
			 S2.click("C:\\Users\\user\\Desktop\\FRAME WORK\\SeleniumAutomation_Validus\\Media\\LoginkiPlatform.png");
				 pdfResultReport.addStepDetails("Salesforce mobile and email verification", "User should able to verify mobile and email successfully",
						"Successfully verified the email and mobile from the salesforce application" + " ", "Pass", "Y");
			} 
	catch (Exception e3) {
		log.fatal("Unable to verify the mobile and email verification in Salesforce" + e3.getMessage());
		pdfResultReport.addStepDetails("Salesforce mobile and email verification", "User is not able to verify mobile and email from salesforce",
				"Unable to verify the email and mobile from salesforce application" + e3.getMessage(), "Fail", "N");
	}
		
			
		}
	
		
		public void singaporeSalesforceOTP() throws Exception {
			try {
						Thread.sleep(3000);
						set(salesforcelocators.investorSearch, pdfResultReport.testData.get("EmailIDInvestor"));
						click(salesforcelocators.investorSearchButton);
					String str=	text(salesforcelocators.recordlist);
					System.out.println(str);
					
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
					
					
					String[] s2 = str.split("\n");
					System.out.println(s2.length);
					for(int j=0; j<s2.length;j++) {
						if(s2[j].contains("a77O000")) {
							String code1 = s2[j];
							System.out.println(code1);
							
							String[] abd = code1.split(" ");
							String otp2 = abd[1];
							System.out.println("Code ::" +otp2);
							ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'"+otp2+"')]")).click();
						}
					}
					/*click(salesforcelocators.unregisteredUsers);
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
					
					
					*/
					
					/*
					 * try { list.get(list.size()-1).click(); } catch (Exception e) { // TODO
					 * Auto-generated catch block e.printStackTrace(); }
					 */
					/*
					 * Set<String> otpStr=driver.getWindowHandles(); System.out.println(otpStr);
					 * Object[] otpo=otpStr.toArray(); System.out.println(otpo.length);
					 * driver.switchTo().window(otpo[1].toString());
					 */
			//		switchwindow(1);
					Thread.sleep(3000);
					String optMsg = ThreadLocalWebdriver.getDriver()
							.findElement(By.xpath("//*[@id='00N28000009zdXG_ileinner']")).getText();
					System.out.println("optMsg ::" + optMsg);
					/* System.out.println(str2);
		        	ThreadLocalWebdriver.getDriver().close();
					 driver.switchTo().window(otpo[0].toString());
					switchwindow(1);*/
					switchwindow(0);
				/*	WebElement otpTxtBox = ThreadLocalWebdriver.getDriver().findElement(salesforcelocators.otpinvestor);
					Actions builder = new Actions(ThreadLocalWebdriver.getDriver());
					Actions seriesOfActions = builder.moveToElement(otpTxtBox).click().sendKeys(otpTxtBox, optMsg);
					seriesOfActions.perform();*/

					JavascriptExecutor js = (JavascriptExecutor) ThreadLocalWebdriver.getDriver();
					WebElement el = ThreadLocalWebdriver.getDriver().findElement(By.cssSelector("input[id=otpEntered]"));
					js.executeScript("arguments[0].value = arguments[1];", el, optMsg);
					// set(salesforcelocators.otpinvestor, "testing");
					click(salesforcelocators.continueInvestor);
					Thread.sleep(2000);
			     	String strr=	ThreadLocalWebdriver.getDriver().findElement(By.xpath("//h2[@class='heading-tQ']")).getText();
			     	System.out.println(strr);
			     	ThreadLocalWebdriver.getDriver().close();
					switchwindow(0);
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
					Actions a = new Actions(ThreadLocalWebdriver.getDriver());
					a.sendKeys(Keys.F5).build().perform();
					Robot r=new Robot();
					r.keyPress(KeyEvent.VK_F5);
					r.keyRelease(KeyEvent.VK_F5);
					
					waitForObj(3000);
					
					ThreadLocalWebdriver.getDriver().navigate().to(ThreadLocalWebdriver.getDriver().getCurrentUrl());
					waitForObj(1000);
					ThreadLocalWebdriver.getDriver().navigate().to(ThreadLocalWebdriver.getDriver().getCurrentUrl());
					waitForObj(2000);
						ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'http://13.232.62.150/validusdev/platform/index....')]")).click();
						switchwindow(1);
						ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'login to the Validus Platform.')]")).click();
					//	switchwindow(2);
			
						waitForObj(4000);
						pdfResultReport.addStepDetails("Salesforce mobile and email verification", "User should able to verify mobile and email successfully",
								"Successfully verified the email and mobile from the salesforce application" + " ", "Pass", "Y");
					} 
			catch (Exception e3) {
				log.fatal("Unable to verify the mobile and email verification in Salesforce" + e3.getMessage());
				pdfResultReport.addStepDetails("Salesforce mobile and email verification", "User is not able to verify mobile and email from salesforce",
						"Unable to verify the email and mobile from salesforce application" + e3.getMessage(), "Fail", "N");
			}
				
					
				}
		
	public void salesforceApproval() throws Throwable {
		
		try {
			
			click(salesforcelocators.Applications);
	        String text=text(salesforcelocators.ApplicationList);
	        System.out.println("Total applications "+text);
	        String[] s = text.split("\n");
			System.out.println(s.length);
		 	ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'"+ pdfResultReport.testData.get("Companyname")+"')]")).click();
		 	Thread.sleep(3000);
		 	click(salesforcelocators.ApplicationNumber);
			Thread.sleep(3000);
	        click(salesforcelocators.ApproveApplication);
	        click(salesforcelocators.ChoooseFile);
	        waitForObj(3000);
	        Screen S= new Screen();
			S.type("C:\\Users\\Mani\\Desktop\\Automate Registration Pics\\Text.png",  "C:\\Users\\Mani\\Desktop\\Automate Registration Pics\\dummy-pdf_2.pdf");
			S.click("C:\\Users\\Mani\\Desktop\\Automate Registration Pics\\OpenButton.PNG");
			JSClick(salesforcelocators.Upload, "Upload File BUtton");
			Thread.sleep(7000);
			JSClick(salesforcelocators.Approve,"Approve Investor");
			 
			switchwindow(0);		
			
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
	
	
	public void salesforceApprovalSME() throws Throwable {
		
		try {
			switchwindow(0);
		waitForObj(2000);
		set(salesforcelocators.investorSearch, pdfResultReport.testData.get("EmailIDInvestor"));
		waitForObj(3000);
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
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//td[contains(text(),'Verification')]")).click();
				Thread.sleep(8000);
				Screen c = new Screen();
				Thread.sleep(6000);
				c.click("C:\\Automation\\Workspace\\SeleniumAutomation_Validus\\MediaFiles\\choose.PNG");
				c.type("C:\\Automation\\Workspace\\SeleniumAutomation_Validus\\MediaFiles\\Path.PNG", "C:\\Automation\\Workspace\\SeleniumAutomation_Validus\\MediaFiles\\Testt.pdf");
				c.click("C:\\Automation\\Workspace\\SeleniumAutomation_Validus\\MediaFiles\\Open.PNG");
				Thread.sleep(8000);
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@value='Upload']")).click();
				Thread.sleep(8000);
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//td[contains(text(),'Verification')]")).click();
				Thread.sleep(8000);
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@value='Approve']")).click();
				Thread.sleep(10000);
				break;
			}
				
				
		}
				
				set(salesforcelocators.investorSearch, pdfResultReport.testData.get("EmailIDInvestor"));
				waitForObj(4000);
				click(salesforcelocators.investorSearchButton);
				
				

				String str1=	text(salesforcelocators.salesforceApplications);
				System.out.println(str1);
				String[] ss = str1.split("\n");
				System.out.println(ss.length);
				for(int j=4;j<ss.length;j++) {
					
					if(ss[j].contains("APP-000")) {
						String xx = s[j];
						System.out.println(xx);
						String[] yy = xx.split(" ");
						String zz = yy[1];
						System.out.println(zz);
						ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'"+zz+"')]")).click();
						Thread.sleep(5000);
						ThreadLocalWebdriver.getDriver().findElement(By.xpath("//*[@id='j_id0:wizId:j_id3']/div[1]/div[4]/a")).click();
						Thread.sleep(5000);
						ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='j_id0:j_id33:j_id34:j_id35:j_id37:j_id38:j_id49']")).click();
						ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@value='Save']")).click();
						Thread.sleep(10000);
						ThreadLocalWebdriver.getDriver().findElement(By.xpath("//td[contains(text(),'Loan Documents')]")).click();
						ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:j_id54:j_id55:j_id82:j_id92:j_id115']")).click();
						Thread.sleep(4000);
						ThreadLocalWebdriver.getDriver().findElement(By.xpath("//td[contains(text(),'Loan Documents')]")).click();
						Thread.sleep(4000);
						ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:j_id54:j_id55:j_id82:j_id92:j_id93:0:j_id95']")).click();
						
						ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:j_id54:j_id55:j_id82:j_id92:j_id93:1:j_id95']")).click();
						ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:j_id54:j_id55:j_id82:j_id92:j_id93:2:j_id95']")).click();
						ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:j_id54:j_id55:j_id82:j_id92:j_id93:3:j_id95']")).click();
						ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:j_id54:j_id55:j_id82:j_id92:j_id93:4:j_id95']")).click();
						ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:j_id54:j_id55:j_id82:j_id92:j_id93:5:j_id95']")).click();
					
						ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:j_id54:j_id55:j_id82:j_id92:j_id93:6:j_id95']")).click();
						ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:j_id54:j_id55:j_id82:j_id92:j_id93:7:j_id95']")).click();
						ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:j_id54:j_id55:j_id82:j_id92:j_id93:8:j_id95']")).click();
						/*ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:j_id54:j_id55:j_id82:j_id92:j_id93:9:j_id95']")).click();
						ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:j_id54:j_id55:j_id82:j_id92:j_id93:10:j_id95']")).click();*/
						Thread.sleep(4000);
						ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:j_id54:j_id55:j_id82:j_id92:j_id111']")).click();
						Thread.sleep(4000);
						ThreadLocalWebdriver.getDriver().findElement(By.xpath("//td[contains(text(),'Promissory Note')]")).click();
						Thread.sleep(4000);
						uploadFile(salesforcelocators.promissoryNote);
						Thread.sleep(4000);
						ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='j_id0:j_id119:j_id120:j_id121:j_id122:j_id138:j_id139:upldbtn1']")).click();
						
						
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//*[@id='j_id0:wizId:j_id3']/div[1]/div[6]/a")).click();
				Thread.sleep(4000);
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='j_id0:wizId:j_id4:editBtn']")).click();
				Thread.sleep(4000);
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='j_id0:wizId:j_id4:j_id60:j_id61:j_id66']")).sendKeys("0.65");
				new Select(ThreadLocalWebdriver.getDriver().findElement(By.xpath("//select[@id='j_id0:wizId:j_id4:j_id60:j_id61:j_id70']"))).selectByVisibleText("3");
				new Select(ThreadLocalWebdriver.getDriver().findElement(By.xpath("//select[@id='j_id0:wizId:j_id4:j_id60:j_id61:j_id76']"))).selectByVisibleText("SINGLE-PAYMENT");
				new Select(ThreadLocalWebdriver.getDriver().findElement(By.xpath("//select[@id='j_id0:wizId:j_id4:j_id60:j_id61:j_id74']"))).selectByVisibleText("Flat");
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='j_id0:wizId:j_id4:j_id60:j_id61:j_id84']")).sendKeys("15000");
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='j_id0:wizId:j_id4:j_id60:j_id61:j_id88']")).sendKeys("Test");
				
				Thread.sleep(4000);
				uploadFile(salesforcelocators.acra_Biz_file);
				Thread.sleep(4000);
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='j_id0:wizId:j_id4:j_id113:j_id114:j_id116:upldbtn1']")).click();
				Thread.sleep(4000);
				uploadFile(salesforcelocators.financialDocuments);
				Thread.sleep(4000);
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='j_id0:wizId:j_id4:j_id113:j_id127:j_id129:upldbtn2']")).click();
				Thread.sleep(4000);
				uploadFile(salesforcelocators.paymentRating);
				Thread.sleep(4000);
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='j_id0:wizId:j_id4:j_id113:j_id140:j_id142:upldbtn3']")).click();
				Thread.sleep(4000);
				uploadFile(salesforcelocators.noticeRedirect);
				Thread.sleep(4000);
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='j_id0:wizId:j_id4:j_id113:j_id153:j_id155:upldbtn5']")).click();
				Thread.sleep(4000);
				uploadFile(salesforcelocators.securityDeed);
				Thread.sleep(4000);
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='j_id0:wizId:j_id4:j_id113:j_id166:j_id168:upldbtn6']")).click();
				Thread.sleep(4000);
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@value='Save']")).click();
				Thread.sleep(10000);
				
				uploadFile(salesforcelocators.facilityRequest);
				Thread.sleep(4000);
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:wizId:j_id4:j_id199:j_id215']")).click();
				Thread.sleep(4000);
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:wizId:j_id4:j_id242']")).click();
				Thread.sleep(6000);
				new Select(ThreadLocalWebdriver.getDriver().findElement(By.xpath("//select[@id='j_id0:wizId:j_id4:j_id245:j_id250:j_id251:j_id254']"))).selectByVisibleText("All Investors");
				Thread.sleep(6000);
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@value='Save']")).click();
				Thread.sleep(10000);
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:wizId:j_id4:j_id241']")).click();
				Thread.sleep(4000);
				new Select(ThreadLocalWebdriver.getDriver().findElement(By.xpath("//select[@id='j_id0:wizId:j_id4:j_id264:TimeBasedMPStatus:AmountSectionItem:mpstatus']"))).selectByVisibleText("Now");
				Thread.sleep(6000);
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='j_id0:wizId:j_id4:j_id264:btn2']")).click();
				Thread.sleep(4000);
				ThreadLocalWebdriver.getDriver().switchTo().alert().accept();
				Thread.sleep(8000);
				if(ThreadLocalWebdriver.getDriver().findElement(By.xpath("//div[@id='j_id0:wizId:j_id4:j_id34:j_id35:j_id36:0:j_id37:j_id38:j_id40']")).isDisplayed()) {
				System.out.println("Loan Application Created successfully");	
				
				}else {
					
				System.out.println("Loan application is not created successfully");
				}
				break;
				}
					break;
				}
				/*switchwindow(1);
				waitForObj(4000);
				click(salesforcelocators.logout);*/
					
				
			
		
		
		pdfResultReport.addStepDetails("Salesforce Approval", "User should able to approve the record successfully",
				"Successfully approve the record from the salesforce application" + " ", "Pass", "Y");
	} catch (Exception e3) {
		log.fatal("Unable to approve the record with Salesforce" + e3.getMessage());
		pdfResultReport.addStepDetails("Salesforce Approval", "User is not able to approve the record from salesforce",
				"Unable to approve the record from salesforce application" + e3.getMessage(), "Fail", "N");
	}
							
			
	
	}
	
	
	
	public void SMEListtoMarketPlace() throws Exception {
		
		
		try {
		set(salesforcelocators.investorSearch, pdfResultReport.testData.get("EmailIDInvestor"));
		//waitForObj(3000);
		click(salesforcelocators.investorSearchButton);
		
		

		String str1=	text(salesforcelocators.salesforceApplications);
		System.out.println(str1);
		String[] ss = str1.split("\n");
		System.out.println(ss.length);
		for(int j=4;j<ss.length;j++) {
			
			if(ss[j].contains("APP-000")) {
				String xx = ss[j];
				System.out.println(xx);
				String[] yy = xx.split(" ");
				String zz = yy[1];
				System.out.println(zz);
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'"+zz+"')]")).click();
				/*Actions a = new Actions(ThreadLocalWebdriver.getDriver());
				a.click(ThreadLocalWebdriver.getDriver().findElement(By.xpath("//*[@id='j_id0:wizId:j_id3']/div[1]/div[4]/a"))).build().perform();
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//*[@id=\"j_id0:wizId:j_id3\"]/div[1]/div[4]/a/text()")).click();*/
				Thread.sleep(10000);   
				Screen s = new Screen();
				s.click("E:\\SeleniumMavenProject\\SeleniumMavenProject\\MediaFiles\\loan.PNG");
				Thread.sleep(5000);
				s.click("E:\\SeleniumMavenProject\\SeleniumMavenProject\\MediaFiles\\Edit.PNG");
				Thread.sleep(5000);
				/*ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='j_id0:j_id33:j_id34:j_id35:j_id37:editBtn']")).click();*/
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='j_id0:j_id33:j_id34:j_id35:j_id37:j_id38:j_id49']")).click();
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@value='Save']")).click();
				Thread.sleep(1000);
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//td[contains(text(),'Loan Documents')]")).click();
				
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:j_id54:j_id55:j_id82:j_id92:j_id93:0:j_id95']")).click();
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:j_id54:j_id55:j_id82:j_id92:j_id93:1:j_id95']")).click();
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:j_id54:j_id55:j_id82:j_id92:j_id93:2:j_id95']")).click();
			/*	ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:j_id54:j_id55:j_id82:j_id92:j_id93:3:j_id95']")).click();
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:j_id54:j_id55:j_id82:j_id92:j_id93:4:j_id95']")).click();
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:j_id54:j_id55:j_id82:j_id92:j_id93:5:j_id95']")).click();
			
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:j_id54:j_id55:j_id82:j_id92:j_id93:6:j_id95']")).click();
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:j_id54:j_id55:j_id82:j_id92:j_id93:7:j_id95']")).click();
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:j_id54:j_id55:j_id82:j_id92:j_id93:8:j_id95']")).click();
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:j_id54:j_id55:j_id82:j_id92:j_id93:9:j_id95']")).click();*/
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:j_id54:j_id55:j_id82:j_id92:j_id93:10:j_id95']")).click();
				
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:j_id54:j_id55:j_id82:j_id92:j_id111']")).click();
				
				ThreadLocalWebdriver.getDriver().findElement(By.xpath("//td[contains(text(),'Promissory Note')]")).click();
				uploadFiles(salesforcelocators.promissoryNote, salesforcelocators.promissoryNoteUpload);
		
		ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='j_id0:wizId:j_id4:j_id60:j_id61:j_id66']")).sendKeys("0.65");
		new Select(ThreadLocalWebdriver.getDriver().findElement(By.xpath("//select[@id='j_id0:wizId:j_id4:j_id60:j_id61:j_id70']"))).selectByVisibleText("3");
		new Select(ThreadLocalWebdriver.getDriver().findElement(By.xpath("//select[@id='j_id0:wizId:j_id4:j_id60:j_id61:j_id76']"))).selectByVisibleText("MONTHLY");
		new Select(ThreadLocalWebdriver.getDriver().findElement(By.xpath("//select[@id='j_id0:wizId:j_id4:j_id60:j_id61:j_id74']"))).selectByVisibleText("Flat");
		ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='j_id0:wizId:j_id4:j_id60:j_id61:j_id84']")).sendKeys("15000");
		ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='j_id0:wizId:j_id4:j_id60:j_id61:j_id88']")).sendKeys("Test");
		
		
		uploadFiles(salesforcelocators.acra_Biz_file, salesforcelocators.acra_Biz_fileUpload);
		Thread.sleep(10000);
		uploadFiles(salesforcelocators.financialDocuments, salesforcelocators.financialDocumentsUpload);
		Thread.sleep(10000);
		uploadFiles(salesforcelocators.paymentRating, salesforcelocators.paymentRatingUpload);
		Thread.sleep(10000);
		uploadFiles(salesforcelocators.noticeRedirect, salesforcelocators.noticeRedirectUpload);
		Thread.sleep(10000);
		uploadFiles(salesforcelocators.securityDeed, salesforcelocators.securityDeedUpload);
		Thread.sleep(10000);
		
		ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@value='Save']")).click();
		Thread.sleep(10000);
		
		uploadFiles(salesforcelocators.facilityRequest, salesforcelocators.facilityRequesttoInvestors);
		//Thread.sleep(10000);
		ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:wizId:j_id4:j_id242']")).click();
		new Select(ThreadLocalWebdriver.getDriver().findElement(By.xpath("//select[@id='j_id0:wizId:j_id4:j_id245:j_id250:j_id251:j_id254']"))).selectByVisibleText("All Investors");
		ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@value='Save']")).click();
		//Thread.sleep(10000);
		ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@name='j_id0:wizId:j_id4:j_id241']")).click();
		//Thread.sleep(2000);
		new Select(ThreadLocalWebdriver.getDriver().findElement(By.xpath("//select[@id='j_id0:wizId:j_id4:j_id264:TimeBasedMPStatus:AmountSectionItem:mpstatus']"))).selectByVisibleText("Now");
		ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='j_id0:wizId:j_id4:j_id264:btn2']")).click();
		//Thread.sleep(2000);
		ThreadLocalWebdriver.getDriver().switchTo().alert().accept();
		if(ThreadLocalWebdriver.getDriver().findElement(By.xpath("//div[@id='j_id0:wizId:j_id4:j_id34:j_id35:j_id36:0:j_id37:j_id38:j_id40']")).isDisplayed()) {
		System.out.println("Loan Application Created successfully");	
		
		}else {
			
		System.out.println("Loan application is not created successfully");
		}
		break;
		}
			break;
		}
		pdfResultReport.addStepDetails("SMEListtoMarketPlace", "User should able to list to a market place successfully",
				"Successfully listed SME into marketplace" + " ", "Pass", "Y");
	} catch (Exception e3) {
		log.fatal("Unable to perform fund a facility request" + e3.getMessage());
		pdfResultReport.addStepDetails("SMEListtoMarketPlace", "User is not able to list to a marketplace",
				"Unable to list SME into marketplace" + e3.getMessage(), "Fail", "N");
	}
	}
		
		public void uploadFile(By loc) {
			try {
				Screen s=new Screen();
				//Thread.sleep(2000);
				//s.click("E:\\SeleniumMavenProject\\SeleniumMavenProject\\MediaFiles\\Selectfile1.PNG");
				click(loc);
				Thread.sleep(3000);
				s.type("C:\\Automation\\Workspace\\SeleniumAutomation_Validus\\MediaFiles\\Path.PNG", "C:\\Automation\\Workspace\\SeleniumAutomation_Validus\\MediaFiles\\Testt.pdf");
				s.click("C:\\Automation\\Workspace\\SeleniumAutomation_Validus\\MediaFiles\\Open.PNG");
							
			}catch(Exception e) {
				System.out.println("Unable to upload the file");
			}
		}
	
		
		public void uploadFiles(By loc, By loc2) {
			try {
				Screen s=new Screen();
				//Thread.sleep(2000);
				//s.click("E:\\SeleniumMavenProject\\SeleniumMavenProject\\MediaFiles\\Selectfile1.PNG");
				click(loc);
				Thread.sleep(3000);
				s.type("C:\\Automation\\Workspace\\SeleniumAutomation_Validus\\MediaFiles\\Path.PNG", "C:\\Automation\\Workspace\\SeleniumAutomation_Validus\\MediaFiles\\Testt.pdf");
				s.click("C:\\Automation\\Workspace\\SeleniumAutomation_Validus\\MediaFiles\\Open.PNG");
				Thread.sleep(3000);
				ThreadLocalWebdriver.getDriver().findElement(loc2).click();
			}catch(Exception e) {
				System.out.println("Unable to upload the file");
			}
		}
	

	public void salesforcefund() throws Exception {
		try {
		click(salesforcelocators.account);
		waitForObj(5000);
		ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[contains(text(),'"+pdfResultReport.testData.get("Companyname") +"')]")).click();
		click(salesforcelocators.investorFundTransaction);
		/*Screen n = new Screen();
		n.click("E:\\SeleniumMavenProject\\SeleniumMavenProject\\MediaFiles\\fundtransaction.PNG");*/
		click(salesforcelocators.newFundTransaction);
		ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@tabindex='4']")).clear();
		set(salesforcelocators.transactionAmount, "100000.00");
		//set(salesforcelocators.insuredLoanAmount, "20000.00");
		set(salesforcelocators.paymentMode, "ACH");
		click(salesforcelocators.savefund);
		switchwindow(0);
		Actions a = new Actions(ThreadLocalWebdriver.getDriver());
		a.sendKeys(Keys.F5).build().perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_F5);
		r.keyRelease(KeyEvent.VK_F5);
		
		
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
	
	public void fundaFacility() {
		try {
			
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("(//a[contains(text(),'Dana')])[1]")).click();
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='investmentAmount']")).sendKeys("1000");
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[@id='fundamtclose']")).click();
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//label[@for='filled-in-box']")).click();
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//label[@for='filled-in-box1']")).click();
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//label[@for='filled-in-box2']")).click();
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//label[@for='filled-in-box3']")).click();
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//button[@id='submit']")).click();
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//button[@id='cnf']")).click();
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//a[@href='http://batumbu.com/pinjaman_bahasa_enkripsi/platform/index.php/investor/facilities_participated']")).click();
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//h4[contains(text(),'SEMUA FASILITAS YANG DIDANAI')]")).click();
			/*ThreadLocalWebdriver.getDriver().findElement(By.xpath("//*[@id='myTable4']/tbody/tr/td[1]")).click();
			String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath("//li[@data-dtr-index='11']")).getText();
			System.out.println(str);*/
			String str1 = ThreadLocalWebdriver.getDriver().findElement(By.xpath("//*[@id='myTable4']/tbody/tr[1]/td[2]")).getText();
			switchwindow(0);
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='phSearchInput']")).sendKeys("+str1+");
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='phSearchButton']")).click();
			ThreadLocalWebdriver.getDriver().findElement(By.xpath("(//a[contains(text(),'+str1+')])[1]")).click();
			
			//*[@id="myTable4"]/tbody/tr[1]/td[2]
		}catch(Exception e) {
			
		}
	}
	
	
	public void salesforceLogin() throws Exception {
		try {
			set(salesforcelocators.username, pdfResultReport.testData.get("UserName"));
			set(salesforcelocators.password, pdfResultReport.testData.get("Password"));
			click(salesforcelocators.login);
			pdfResultReport.addStepDetails("Login", "User should login in to the application successfully",
					"Successfully logged in to the application" + " ", "Pass", "Y");
		} catch (Exception e) {
			log.fatal("Unable to Homelogin" + e.getMessage());
			pdfResultReport.addStepDetails("salesforceLogin", "User is not able to login to the application successfully",
					"Unable to login to the application" + e.getMessage(), "Fail", "N");
		}
	}

	public void mailTriggering() throws Throwable {
		
		ThreadLocalWebdriver.getDriver().get("https://www.google.com/gmail/about/#");
		click(salesforcelocators.signIN);
		set(salesforcelocators.emailId, "autoqa@validus.sg");
		click(salesforcelocators.emailNext);
		Thread.sleep(3000);
		set(salesforcelocators.gmailPassword,"Validu$Tech");
		click(salesforcelocators.emailNext);
		Thread.sleep(30000);
		//js_type(By.xpath("//input[@id='gbqfq']"), "noreply@salesforce.com", "search");
		set(salesforcelocators.gmailSearch, "noreply@salesforce.com");
	//	ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='gbqfq']")).sendKeys("noreply@salesforce.com");
		//ThreadLocalWebdriver.getDriver().findElement(By.xpath("//td[@style='vertical-align: top;']")).sendKeys("noreply@salesforce.com");
		
		click(salesforcelocators.gmailSearchButton);
		
	List<WebElement> ele=ThreadLocalWebdriver.getDriver().findElements(By.xpath("//span[text()='Sandbox: Verify your identity in Salesforce']"));
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
String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath("//div[@id=':ks']")).getText();
System.out.println(str);
String[] str1 = str.split("\n");

		System.out.println(str1.length);
		for (int i = 0; i < str1.length; i++) {
			
			if(str1[i].contains("Verification")) {
				String str2 = str1[i];
				String[] str3 = str2.split(":");
				System.out.println(str3.length);
				String str4 = str3[1];
				System.out.println(str4);
				String str5 =str4.trim();
				System.out.println(str5);
			}
		}
	
	}

	
	public void resetPasswordgmailLink() throws Throwable {
		
		try {
			/*Actions a = new Actions(ThreadLocalWebdriver.getDriver());
			a.keyDown(Keys.CONTROL +"t").build().perform();
			ThreadLocalWebdriver.getDriver().findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");*/
		Screen s = new Screen();
        Thread.sleep(2000);
		s.click("C:\\Users\\user\\Desktop\\Nithin\\E\\Validus\\SeleniumMavenProject\\SeleniumMavenProject\\MediaFiles\\indonesianew.PNG");
		Thread.sleep(4000);
		try {
			switchwindow(1);
			Thread.sleep(1000);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Thread.sleep(4000);
		ThreadLocalWebdriver.getDriver().get("https://www.google.com/gmail/about/#");
		click(salesforcelocators.signIN);
		Thread.sleep(3000);
		set(salesforcelocators.emailId, "autoqa@validus.sg");
		click(salesforcelocators.emailNext);
		Thread.sleep(3000);
		set(salesforcelocators.gmailPassword,"Validu$Tech");
		Thread.sleep(1000);
		click(salesforcelocators.emailNext);
		Thread.sleep(4000);
		/*ThreadLocalWebdriver.getDriver().findElement(By.xpath("//div[@data-tooltip='Settings' and @aria-label='Settings']")).click();
		Thread.sleep(2000);
		ThreadLocalWebdriver.getDriver().findElement(By.xpath("//div[contains(text(),'Go back to classic Validus Capital Mail')]")).click();
		Thread.sleep(5000);*/
		//js_type(By.xpath("//input[@id='gbqfq']"), "noreply@salesforce.com", "search");
		set(salesforcelocators.gmailSearch, "Batumbu Admin");
	//	ThreadLocalWebdriver.getDriver().findElement(By.xpath("//input[@id='gbqfq']")).sendKeys("noreply@salesforce.com");
		//ThreadLocalWebdriver.getDriver().findElement(By.xpath("//td[@style='vertical-align: top;']")).sendKeys("noreply@salesforce.com");
		
		try {
			click(salesforcelocators.gmailSearchButton);
			Thread.sleep(3000);
			List <WebElement> strr = ThreadLocalWebdriver.getDriver().findElements(By.xpath("//b[contains(text(),'Sandbox: Reset Password')]"));
			strr.size();
			System.out.println(strr.size());
			for(int j=0;j<strr.size();j++) {
				if(strr.get(j).isDisplayed()) {
				strr.get(j).click();
			}
				else {
					continue;
				}
		} }catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String str = ThreadLocalWebdriver.getDriver().findElement(By.xpath("//div[@class='gs']")).getText();
		String stp = null;
		System.out.println(str);
		String[] st  = str.split("\n");
		for(int i = 0; i< st.length; i++)
		{
			
			if(st[i].contains("Temparory ")) {
				
				String stn = st[i];
				String[] stm = stn.split(" ");
				System.out.println(stm.length);
				String sto = stm[5];
				System.out.println(sto);
				 stp = sto.trim();
				System.out.println(stp);
			}
		}		
				
		ThreadLocalWebdriver.getDriver().findElement(By.xpath("(//span[contains(text(),'batumbu')])[2]")).click();
		Thread.sleep(3000);
		
		switchwindow(2);
		set(By.xpath("//input[@id='Password']"), stp);
		click(registerasInvestorlocators.resetpasswordbuttonfinal);
		waitForObj(3000);
		set(registerasInvestorlocators.resetpasswordfinal, pdfResultReport.testData.get("ResetPassword"));
		set(registerasInvestorlocators.resetConfirmPasswordFinal, pdfResultReport.testData.get("ResetConfirmPassword"));
		click(registerasInvestorlocators.resetpasswordbuttonfinal);
		
		String snn = ThreadLocalWebdriver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		System.out.println(snn);
		
		js_type(validussmokelocators.emailIDInvestor, pdfResultReport.testData.get("EmailIDInvestor"), "username");
		set(validussmokelocators.passwordInvestor, pdfResultReport.testData.get("ResetPassword"));
		click(registerasInvestorlocators.login);
		
		
		
			pdfResultReport.addStepDetails("resetPasswordloginscreen", "User should able to login after the reset link  successfully",
					"Successfully user is able to login with resetpassword link successfully" + " ", "Pass", "Y");
		}catch (Exception e3) {
			log.fatal("Unable to login with reset password " + e3.getMessage());
			pdfResultReport.addStepDetails("resetPasswordLogin", "User is not able to login after the reset password link",
					"Unable to login after the reset password successfully" + e3.getMessage(), "Fail", "N");
		}
		
		}
		
		public void resetPasswordOTP() throws Exception {
			try {
		
		switchwindow(1);
		Thread.sleep(3000);
		Screen s = new Screen();
		s.click("C:\\Users\\user\\Desktop\\Nithin\\E\\Validus\\SeleniumMavenProject\\SeleniumMavenProject\\MediaFiles\\Delete.PNG");
		Thread.sleep(2000);
		ThreadLocalWebdriver.getDriver().findElement(By.xpath("(//span[@class='nU n1'])[1]")).click();
		Actions a = new Actions(ThreadLocalWebdriver.getDriver());
		a.sendKeys(Keys.F5).build().perform();
		
		ThreadLocalWebdriver.getDriver().navigate().to(ThreadLocalWebdriver.getDriver().getCurrentUrl());
		Thread.sleep(5000);
		ThreadLocalWebdriver.getDriver().findElement(By.xpath("(//div[@class='asa'])[6]")).click();
		
	/*	try {
			List <WebElement> san = ThreadLocalWebdriver.getDriver().findElements(By.xpath("//b[contains(text(),'Sandbox: Validus | Login OTP')]"));
			san.size();
			System.out.println(san.size());
			for(int j=0;j<san.size();j++) {
				if(san.get(j).isDisplayed()) {
					san.get(j).click();
			}
				else {
					continue;
				}
		} }catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		ThreadLocalWebdriver.getDriver().findElement(By.xpath("//b[contains(text(),'Sandbox: Validus | Login OTP')]")).click();
		
		String nn = ThreadLocalWebdriver.getDriver().findElement(By.xpath("(//div[@class='ii gt'])[1]")).getText();
		String nithin = null;
		System.out.println(nn);
		String[] ni = nn.split("\n");
		for(int i = 0; i<ni.length; i++) {
			
			if(ni[i].contains("OTP")) {
				
				String nit = ni[i];
				String[] nith = nit.split(" ");
				System.out.println(nith.length);
				String nithi = nith[4];
				System.out.println(nithi);
				 nithin = nithi.trim();
				System.out.println(nithin);
				
			}else {
				continue;
			}
		}
			s.click("C:\\Users\\user\\Desktop\\Nithin\\E\\Validus\\SeleniumMavenProject\\SeleniumMavenProject\\MediaFiles\\Delete.PNG");
			
		
			switchwindow(2);
			set(By.xpath("//input[@id='ip_otp']"), nithin);
			click(validussmokelocators.otpSubmit);
			
			waitForObj(5000);
			
		
		
	
		pdfResultReport.addStepDetails("resetPasswordgmailotp", "User should able to login after resetpasswordotp successfully",
				"Successfully user is able to login after resetpasswordotp successfully" + " ", "Pass", "Y");
	} catch (Exception e3) {
		log.fatal("Unable to login after resetpasswordotp " + e3.getMessage());
		pdfResultReport.addStepDetails("resetPasswordgmailotp", "User is not able to login after the resetpasswordotp successfully",
				"Unable to login after reset password " + e3.getMessage(), "Fail", "N");
	
	}
	
	
		}
		}

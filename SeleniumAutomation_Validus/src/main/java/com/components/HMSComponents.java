package com.components;

import com.baseClasses.BaseClass_Web;
import com.baseClasses.PDFResultReport;
import com.objectRepository.DBSOpenAccountLocators;
import com.objectRepository.GmailLoginLocators;
import com.objectRepository.HMSLocators;

import bsh.org.objectweb.asm.Type;

public class HMSComponents extends BaseClass_Web{
	
	public HMSLocators loginLocators=new HMSLocators();
	
	public HMSComponents(PDFResultReport pdfresultReport){
		this.pdfResultReport=pdfresultReport;
	}
	
	public void openURL() throws Exception{
		try{
			launchapp(pdfResultReport.testDataValue.get("AppURL"));
			waitForObj(1000);
			pdfResultReport.addStepDetails("openURL","Application should open the url","Successfully opened the URL" + " ","Pass", "Y");
		  }catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  pdfResultReport.addStepDetails("openURL","Application should open the url", "Unable to open the URL"+e.getMessage(),"Fail", "N");
		  }
	}
	
	public void login() throws Exception{
		try{
			set(loginLocators.username, pdfResultReport.testData.get("Username"));
			set(loginLocators.password, pdfResultReport.testData.get("Password"));
			click(loginLocators.login);
			
			pdfResultReport.addStepDetails("login","Application should navigate to homepage","Successfully navigated to homepage","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  pdfResultReport.addStepDetails("login","Application should navigate to homepage", "Unable to navigate to homepage"+e.getMessage(),"Fail", "N");
		  }
		
	}
	public void navigateToReg() throws Exception{
		try{
			click(loginLocators.regristration);
			
			pdfResultReport.addStepDetails("navigateToReg","Application should navigate to Permanent Registration page","Successfully navigated to Permanent Registration page","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  pdfResultReport.addStepDetails("navigateToReg","Application should navigate to Permanent Registration page", "Unable to navigate to Permanent Registration page"+e.getMessage(),"Fail", "N");
		  }
		
	}
	
	public void registrationPermanent() throws Throwable{
		try {
			select(loginLocators.patientCategory, pdfResultReport.testData.get("PatientCategory"));
			select(loginLocators.relation, pdfResultReport.testData.get("Relation"));
			select(loginLocators.title, pdfResultReport.testData.get("Title"));
			set(loginLocators.motherMaidenName, pdfResultReport.testData.get("MotherMaidenName"));
			set(loginLocators.firstName, pdfResultReport.testData.get("FirstName"));
			select(loginLocators.patientIdentifier, pdfResultReport.testData.get("PatientIdentifier"));
			set(loginLocators.middleName, pdfResultReport.testData.get("MiddleName"));
			set(loginLocators.lastName, pdfResultReport.testData.get("LastName"));
			set(loginLocators.panVoterId, pdfResultReport.testData.get("PanVoterId"));
			set(loginLocators.dob, pdfResultReport.testData.get("DOB"));
			set(loginLocators.age, pdfResultReport.testData.get("AGE"));
			select(loginLocators.gender, pdfResultReport.testData.get("Gender"));
			select(loginLocators.maritialStatus, pdfResultReport.testData.get("MaritialStatus"));
			select(loginLocators.religion, pdfResultReport.testData.get("Religion"));
			select(loginLocators.primaryLanguage, pdfResultReport.testData.get("PrimaryLanguage"));
			select(loginLocators.nationality, pdfResultReport.testData.get("Nationality"));
			select(loginLocators.vip, pdfResultReport.testData.get("VIP"));
			select(loginLocators.education, pdfResultReport.testData.get("Education"));
			select(loginLocators.occupation, pdfResultReport.testData.get("Occupation"));
			select(loginLocators.bloodGroup, pdfResultReport.testData.get("BloodGroup"));
			select(loginLocators.citizenship, pdfResultReport.testData.get("Citizenship"));
			select(loginLocators.seniorCitizenship, pdfResultReport.testData.get("SeniorCitizenship"));
			set(loginLocators.address, pdfResultReport.testData.get("Address"));
			set(loginLocators.address2, pdfResultReport.testData.get("Address2"));
			set(loginLocators.phone, pdfResultReport.testData.get("Phone"));
			set(loginLocators.eMail, pdfResultReport.testData.get("EMail"));
			set(loginLocators.pin, pdfResultReport.testData.get("PIN"));
			select(loginLocators.country, pdfResultReport.testData.get("Country"));
			set(loginLocators.upload, pdfResultReport.testData.get("Image"));
			JSClick(loginLocators.save, "Clicked on save");
			pdfResultReport.addStepDetails("registrationPermanent","Application should create patient in PR page","Successfully created patient in PR page","Pass", "Y");
			
		}
		catch(Exception e) {
			  log.fatal("Unable to open the URL"+e.getMessage());
			  pdfResultReport.addStepDetails("registrationPermanent","Application should create patient in PR page", "Unable to create patient in PR page"+e.getMessage(),"Fail", "N");
		  
			
		}
		
	}
	public void verifyAlert() throws Exception{
		try{
			Thread.sleep(2000);
			alertaction("accept");
			pdfResultReport.addStepDetails("verifyAlert","Application should verify Alert","Successfully verified Alert","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  pdfResultReport.addStepDetails("verifyAlert","Application should verify Alert", "Unable to verify Alert"+e.getMessage(),"Fail", "N");
		  }
	}
	public void logout() throws Exception{
		try{
			//click(loginLocators.logoutImage);
			click(loginLocators.logout);
			pdfResultReport.addStepDetails("logout","Application should logout","Successfully logged out from the application","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  pdfResultReport.addStepDetails("openAccount_ViewMore","Application should logout", "Unable to logout from the application"+e.getMessage(),"Fail", "N");
		  }
	}
	public void logoutError() throws Exception{
		try{
			//click(loginLocators.logoutImage);
			click(loginLocators.logoutError);
			pdfResultReport.addStepDetails("logout","Application should logout","Successfully logged out from the application","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  pdfResultReport.addStepDetails("openAccount_ViewMore","Application should logout", "Unable to logout from the application"+e.getMessage(),"Fail", "N");
		  }
	}
	
	}

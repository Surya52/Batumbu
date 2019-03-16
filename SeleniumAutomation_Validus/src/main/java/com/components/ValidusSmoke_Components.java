package com.components;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.baseClasses.BaseClass_Web;
import com.baseClasses.PDFResultReport;
import com.baseClasses.ThreadLocalWebdriver;
import com.objectRepository.DBSOpenAccountLocators;
import com.objectRepository.ValidusSmoke_Loc;

import bsh.org.objectweb.asm.Type;

public class ValidusSmoke_Components extends BaseClass_Web {

	public ValidusSmoke_Loc validussmokelocators = new ValidusSmoke_Loc();
	public static String emailIDInvestor;

	public ValidusSmoke_Components(PDFResultReport pdfresultReport) {
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

	public void Homelogin() throws Exception {

		try {
			click(validussmokelocators.validusMainpageLogin);
			pdfResultReport.addStepDetails("Homelogin", "Application should accept the credentials",
					"Successfully login to the home" + " ", "Pass", "Y");
		} catch (Exception e) {
			log.fatal("Unable to Homelogin" + e.getMessage());
			pdfResultReport.addStepDetails("Homelogin", "Unable to enter the credentials",
					"Unable to Homelogin" + e.getMessage(), "Fail", "N");
		}
	}

	public void CreateAccount() throws Exception {
		try {
			click(validussmokelocators.validusMainpageLogin);
			click(validussmokelocators.validusCreateanAccount);
			waitForElement(validussmokelocators.validusInvestor, 30);
			waitForObj(3000);
			click(validussmokelocators.validusInvestor);
			SimpleDateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");
			Date d = new Date();
			String time = df.format(d);
			System.out.println("time::" + time);
			emailIDInvestor = time + "@gmail.com";
			//set(validussmokelocators.emailIDInvestor, emailIDInvestor);
			set(validussmokelocators.emailIDInvestor, pdfResultReport.testData.get("EmailIDInvestor"));
			set(validussmokelocators.passwordInvestor, pdfResultReport.testData.get("PasswordInvestor"));
			set(validussmokelocators.confirmPasswordInvestor, pdfResultReport.testData.get("ConfirmPasswordInvestor"));
			SimpleDateFormat df1 = new SimpleDateFormat("hhmmss");
			Date d1 = new Date();
			String time1 = df1.format(d1);
			System.out.println("time1::" + time1);
		
			set(validussmokelocators.mobileNumber, pdfResultReport.testData.get("MobileNumber"));
			click(validussmokelocators.investorLoginTermsandCondition);
			click(validussmokelocators.investorContinue);
			waitForElement(validussmokelocators.otpContent, "30");
			text(validussmokelocators.otpContent);
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

	private void waitForElement(By otpContent, String string) {
		// TODO Auto-generated method stub
		
	}

	public void investoraccount() {

		try {

		} catch (Exception e) {

		}
	}

}

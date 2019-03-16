package com.components;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Screen;

import com.baseClasses.BaseClass_Web;
import com.baseClasses.PDFResultReport;
import com.baseClasses.ThreadLocalWebdriver;
import com.objectRepository.DBSOpenAccountLocators;
import com.objectRepository.Pinjaman_Label_Locators;
import com.objectRepository.ValidusRegisterAsInvester;
import com.objectRepository.ValidusSmoke_Loc;
import com.objectRepository.Validus_SalesforceLoc;

import bsh.org.objectweb.asm.Type;

public class ValidusLabelsComponents extends BaseClass_Web {

	public Pinjaman_Label_Locators pinjamanlabels = new Pinjaman_Label_Locators();
	

	public ValidusLabelsComponents(PDFResultReport pdfresultReport) {
		this.pdfResultReport = pdfresultReport;
	}

	public void loginPageLabelValidation() throws Exception {
		try {
			
			click(pinjamanlabels.login);
			IsElementPresent(pinjamanlabels.pinjaman_back);
			IsElementPresent(pinjamanlabels.pinjaman_LoginHeading);
			IsElementPresent(pinjamanlabels.pinjaman_termsCondi);
			IsElementPresent(pinjamanlabels.pinjaman_termsCondi);
			IsElementPresent(pinjamanlabels.pinjaman_loginButton);
			IsElementPresent(pinjamanlabels.pinjaman_reset);
			IsElementPresent(pinjamanlabels.pinjaman_resetLink);
			IsElementPresent(pinjamanlabels.pinjaman_createaccount);
			
			
			
			pdfResultReport.addStepDetails("loginPageLabelValidation", "Application should validate the labels in login page",
					"Successfully validated the labels in login page" + " ", "Pass", "Y");
			click(pinjamanlabels.pinjaman_createaccount);
			
		} catch (Exception e) {
			log.fatal("Unable to open the URL" + e.getMessage());
			pdfResultReport.addStepDetails("loginPageLabelValidation", "Application should validate the labels in login page",
					"Unable to validate the labels in login page" + e.getMessage(), "Fail", "N");
		}

	}


	
	public void CreateAccountPopupLabelValidation() throws Exception {
		try {
			IsElementPresent(pinjamanlabels.pinjaman_caheading);
			IsElementPresent(pinjamanlabels.pinjaman_casubheading);
			IsElementPresent(pinjamanlabels.pinjaman_investor);
			IsElementPresent(pinjamanlabels.pinjaman_sme);
			
			
			
			pdfResultReport.addStepDetails("CreateAccountpopupLabelValidation", "Application should validate the labels in create account pop up",
					"Successfully validated the labels in create account pop up" + " ", "Pass", "Y");
			click(pinjamanlabels.pinjaman_investor);
		} catch (Exception e) {
			log.fatal("Unable to open the URL" + e.getMessage());
			pdfResultReport.addStepDetails("CreateAccountPageLabelValidation", "Application should validate the labels in create account pop up",
					"Unable to validate the labels in create account pop up" + e.getMessage(), "Fail", "N");
		}

	}
	
	
	
	public void CreateAccountPageLabelValidation() throws Exception {
		try {
		
			IsElementPresent(pinjamanlabels.pinjaman_investorca);
			IsElementPresent(pinjamanlabels.pinjaman_registerasinvestor);
			IsElementPresent(pinjamanlabels.pinjaman_emailId);
			IsElementPresent(pinjamanlabels.pinjaman_emailIDtwo);
			IsElementPresent(pinjamanlabels.pinjaman_password);
			IsElementPresent(pinjamanlabels.pinjaman_passwordtwo);
			IsElementPresent(pinjamanlabels.pinjaman_confirmpassword);
			IsElementPresent(pinjamanlabels.pinjaman_phonenumber);
			IsElementPresent(pinjamanlabels.pinjaman_TandCone);
			IsElementPresent(pinjamanlabels.pinjaman_TandCtwo);
			IsElementPresent(pinjamanlabels.pinjaman_TandCthree);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			pdfResultReport.addStepDetails("CreateAccountPageLabelValidation", "Application should validate the labels in create account page",
					"Successfully validated the labels in create account page" + " ", "Pass", "Y");
		} catch (Exception e) {
			log.fatal("Unable to open the URL" + e.getMessage());
			pdfResultReport.addStepDetails("CreateAccountPageLabelValidation", "Application should validate the labels in create account page",
					"Unable to validate the labels in create account page" + e.getMessage(), "Fail", "N");
		}

	}
}

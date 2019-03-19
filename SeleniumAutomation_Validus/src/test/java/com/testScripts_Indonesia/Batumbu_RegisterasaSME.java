package com.testScripts_Indonesia;

import org.bouncycastle.jce.provider.JCEKeyGenerator.Salsa20;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseClasses.BaseClass_Web;
import com.components.ValidusRegisterAsInvestorComponents;
import com.components.ValidusSalesforceComponents;
import com.components.ValidusSmoke_Components;


public class Batumbu_RegisterasaSME extends BaseClass_Web{
	public ValidusRegisterAsInvestorComponents borrowercomponents =new ValidusRegisterAsInvestorComponents(pdfResultReport);
	  
	
	@Parameters("TestcaseNo")
	@Test(description = "Scenario:1 - Test the functionality of Consumer with valid flow")
  public void f(String no) throws Throwable {
	
		System.out.println("Entered in the test method..................");
	  
		try {
		pdfResultReport.readTestDataFile(System.getProperty("user.dir")	+ "\\Resources\\Batumbu_Data.xlsx", no);
	} catch (Exception e) {
		 
		e.printStackTrace();
	}
	  
	   
		borrowercomponents.openURL();
	/*	borrowercomponents.CreateAccountSME();
		borrowercomponents.salesforceIntegrationLogin();
		borrowercomponents.gmailOTP();
		borrowercomponents.salesforceOTP();
	*/ 
		borrowercomponents.login();
		borrowercomponents.registeringasSME();
		borrowercomponents.SubmitLoan();
		borrowercomponents.login();
		borrowercomponents.batumbuAdminVerifyDocuments();
		borrowercomponents.batumbuAdminApproval();
		borrowercomponents.batumbuAdminApproveLoan();
	 	   
	
	}
}

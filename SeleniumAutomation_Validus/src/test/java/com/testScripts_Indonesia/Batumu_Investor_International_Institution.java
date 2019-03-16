package com.testScripts_Indonesia;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseClasses.BaseClass_Web;
import com.components.Batumbu_Investor_ForeignBusinessEntity_Components;
import com.components.ValidusRegisterAsInvestorComponents;

public class Batumu_Investor_International_Institution extends BaseClass_Web{
public Batumbu_Investor_ForeignBusinessEntity_Components investorcomponents = new Batumbu_Investor_ForeignBusinessEntity_Components(pdfResultReport);	
	@Parameters("TestcaseNo")
	@Test(description = "Scenario:1 - Test the functionality of Consumer with valid flow")
  public void f(String no) throws Throwable {
	
		System.out.println("Entered in the test method..................");
	  
		try {
		pdfResultReport.readTestDataFile(System.getProperty("user.dir")	+ "\\Resources\\Batumbu_Data.xlsx", no);
	} catch (Exception e) {
		 
		e.printStackTrace();
	}

		investorcomponents.openURL();
		
		investorcomponents.CreateAccount();
		investorcomponents.salesforceIntegrationLogin();
		investorcomponents.gmailOTP();
		investorcomponents.salesforceOTP();
		 
		investorcomponents.login();
		investorcomponents.internationalInstitution();
		investorcomponents.batumbuAdminApproval();
		investorcomponents.salesforcefund();
		
		
		
		
}
}
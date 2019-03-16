package com.testScripts_Singapore;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseClasses.BaseClass_Web;
import com.components.ValidusRegisterAsInvestorComponents;
import com.components.ValidusSalesforceComponents;
import com.components.ValidusSmoke_Components;

public class Validus_Salesforce extends BaseClass_Web{
	public ValidusSalesforceComponents loginComponents =new ValidusSalesforceComponents(pdfResultReport); 
	
	public void initializeRepository() throws Exception {		
		reportDetails.put("Test Script Name", this.getClass().getSimpleName());
		reportDetails.put("Test Script MyWorksshop Document ID", "Doc1234567");
		reportDetails.put("Test Script Revision No", "1");
		reportDetails.put("Test Author Name", "Nithin");
		reportDetails.put("Test Script Type", "User Acceptance Testing");
		reportDetails.put("Requirement Document ID of System", "Doc1234567");
		reportDetails.put("Requirement ID", "US2202");
	}
	
	@Parameters("TestcaseNo")
	@Test(description = "Scenario:1 - Test the functionality of Consumer with valid flow")
  public void f(String no) throws Throwable {
	  System.out.println("Entered in the test method..................");
	  try {
		pdfResultReport.readTestDataFile(System.getProperty("user.dir")	+ "\\Resources\\Validus_Testdata.xlsx", no);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  initializeRepository();
	/*  loginComponents.openURL();
	  loginComponents.salesforceLogin();*/
	  loginComponents.mailTriggering();
  }
}

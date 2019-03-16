package com.testScripts_Indonesia;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.baseClasses.BaseClass_Web;
import com.components.Batumbu_Investor_Foreign_Legal_Entity_Components;
import com.components.ValidusRegisterAsInvestorComponents;
import com.components.ValidusSalesforceComponents;
import com.components.ValidusSmoke_Components;

public class Batumbu_Foreign_Legal_Entities extends BaseClass_Web{

	public Batumbu_Investor_Foreign_Legal_Entity_Components  foreignlegalcomponents = new Batumbu_Investor_Foreign_Legal_Entity_Components(pdfResultReport);
 	public void initializeRepository() throws Exception {		
		
 		reportDetails.put("Test Script Name", this.getClass().getSimpleName());
		reportDetails.put("Test Script MyWorksshop Document ID", "Doc1234567");
		reportDetails.put("Test Script Revision No", "1");
		reportDetails.put("Test Author Name", "SURYA");
		reportDetails.put("Test Script Type", "User Acceptance Testing");
		reportDetails.put("Requirement Document ID of System", "Doc1234567");
		reportDetails.put("Requirement ID", "US2202");
	}
	
	@Parameters("TestcaseNo")
	@Test(description = "Scenario:1 - Test the functionality of Consumer with valid flow")
  public void f(String no) throws Throwable {
	  System.out.println("Entered in the test method..................");
	  try {
		
		  pdfResultReport.readTestDataFile(System.getProperty("user.dir")	+ "\\Resources\\Batumbu_Data.xlsx", no);
	
	  } catch (Exception e) {
		 
		e.printStackTrace();
	}
	  
	  
	     initializeRepository();
	  	
	  	foreignlegalcomponents.openURL();
	  	
	  	foreignlegalcomponents.CreateAccount();
	  	foreignlegalcomponents.salesforceIntegrationLogin();
	  	foreignlegalcomponents.gmailOTP();
	  	foreignlegalcomponents.salesforceOTP();	
	  	
	  	
	  	foreignlegalcomponents.login();
	  	foreignlegalcomponents.navigateToForeignlegalentity();
	  	foreignlegalcomponents.foreignLegalEntityRegistration();
	  	foreignlegalcomponents.login();
	  	
	  	foreignlegalcomponents.batumbuAdminApproval();
	   	foreignlegalcomponents.salesforcefund();
	  	foreignlegalcomponents.investorfunddetails();
	
	  	}
}

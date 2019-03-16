package com.testScripts_Indonesia;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseClasses.BaseClass_Web;
import com.components.Batumbu_Investor_ForeignBusinessEntity_Components;
import com.components.ValidusRegisterAsInvestorComponents;
import com.components.ValidusSalesforceComponents;
import com.components.ValidusSmoke_Components;

public class Batumbu_Investor_ForeignBusiness_Entity extends BaseClass_Web{
	
	public Batumbu_Investor_ForeignBusinessEntity_Components foreignbusinesscomponents = new Batumbu_Investor_ForeignBusinessEntity_Components(pdfResultReport);
	public ValidusRegisterAsInvestorComponents investorComponents =new ValidusRegisterAsInvestorComponents(pdfResultReport); 
	public ValidusSmoke_Components smokeComponent =new ValidusSmoke_Components(pdfResultReport); 
	public ValidusSalesforceComponents salesforceComponent = new ValidusSalesforceComponents(pdfResultReport);
	 
	@Parameters("TestcaseNo")
	@Test(description = "Scenario:1 - Test the functionality of Consumer with valid flow")
  public void f(String no) throws Throwable {
	  System.out.println("Entered in the test method..................");
	  try {
		pdfResultReport.readTestDataFile(System.getProperty("user.dir")	+ "//Resources//Batumbu_Data.xlsx", no);
	} catch (Exception e) {                                  
	 	e.printStackTrace();
	}
	   foreignbusinesscomponents.openURL();
	  
	   foreignbusinesscomponents.CreateAccount();
	  foreignbusinesscomponents.salesforceIntegrationLogin();
	  foreignbusinesscomponents.gmailOTP();
	  foreignbusinesscomponents.salesforceOTP();	  
	    
	  foreignbusinesscomponents.login();
	  foreignbusinesscomponents.navigatetoForeignBUsinessEntity();
	  foreignbusinesscomponents.foreignbusinessregistration();  
	  foreignbusinesscomponents.batumbuAdminApprovalforeignbusiness();
	  foreignbusinesscomponents.salesforcefund();
	  foreignbusinesscomponents.investorfunddetails();
	}
}

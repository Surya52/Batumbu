package com.testScripts_Indonesia;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseClasses.BaseClass_Web;
import com.baseClasses.PDFResultReport;
import com.components.Batumbu_IndividualForeign_Components;

public class Batumbu_Investor_IndividualForeigners extends BaseClass_Web{
 
	  
	public Batumbu_IndividualForeign_Components individualforeigncomponents =new Batumbu_IndividualForeign_Components(pdfResultReport);
 
	
	 
	@Parameters("TestcaseNo")
	@Test(description = "Scenario:1 - Test the functionality of Consumer with valid flow")
  public void f(String no) throws Throwable {
	  System.out.println("Entered in the test method..................");
	  try {
		pdfResultReport.readTestDataFile(System.getProperty("user.dir")	+ "//Resources//Batumbu_Data.xlsx", no);
	} catch (Exception e) {                                  
	 
		e.printStackTrace();
	}
	 
	  individualforeigncomponents.openURL();
	/*  individualforeigncomponents.CreateAccount();
	  individualforeigncomponents.salesforceIntegrationLogin();
	  individualforeigncomponents.gmailOTP();
	  individualforeigncomponents.salesforceOTP();	  
	*/  individualforeigncomponents.login();
	  individualforeigncomponents.navigatetoIndividualForeignCitizens();
	  individualforeigncomponents.IndividualForeignCitizens(); 
	  individualforeigncomponents.login();
	  individualforeigncomponents.batumbuAdminApproval();
	
	  // individualforeigncomponents.ESignatureVerification();
	  
	 
	  individualforeigncomponents.salesforcefund();
	  individualforeigncomponents.login();
	  individualforeigncomponents.investorfunddetails();
	
	}

}

package com.testScripts_Indonesia;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseClasses.BaseClass_Web;
import com.components.Batumbu_Investor_Foreign_Legal_Entity_Components;
import com.components.Batumbu_Investor_Indonesia_LegalEntity_Components;
  
public class Batumbu_Indonesia_Legal_Entity extends BaseClass_Web{

	public Batumbu_Investor_Indonesia_LegalEntity_Components  indonesialegalcomponents = new Batumbu_Investor_Indonesia_LegalEntity_Components(pdfResultReport);
	
	
	 
	
	@Parameters("TestcaseNo")
	@Test(description = "Scenario:1 - Test the functionality of Consumer with valid flow")
  public void f(String no) throws Throwable {
	
		System.out.println("Entered in the test method..................");
	  
		try {
		
			pdfResultReport.readTestDataFile(System.getProperty("user.dir")	+ "\\Resources\\Batumbu_Data.xlsx", no);
	
		} catch (Exception e) {
		e.printStackTrace();
	}
	  
		  
	  	  indonesialegalcomponents.openURL();
	  	  
	  	  indonesialegalcomponents.CreateAccount();
		  indonesialegalcomponents.salesforceIntegrationLogin();
		  indonesialegalcomponents.gmailOTP();
		  indonesialegalcomponents.salesforceOTP();
	   	  indonesialegalcomponents.login();
	   	  indonesialegalcomponents.navigateToIndonesianLegalEntity();
	  	  indonesialegalcomponents.PinjamancompanyIncorporatedInSingapore();
	  	  indonesialegalcomponents.login();
	  	  
		  indonesialegalcomponents.batumbuAdminApproval();
	  	  indonesialegalcomponents.salesforcefund();
	 	 
	 	  indonesialegalcomponents.investorfunddetails();
		  
	
}}
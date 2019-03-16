package com.testScripts_Indonesia;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseClasses.BaseClass_Web;
import com.components.Batumbu_Investor_IndonesianCitizens_Componnets;

public class Batumbu_Investor_IndonesianCitizens extends BaseClass_Web {

	
 public  Batumbu_Investor_IndonesianCitizens_Componnets indonesianCitizencompnents= new  Batumbu_Investor_IndonesianCitizens_Componnets(pdfResultReport);
	
	
	 
	@Parameters("TestcaseNo")
	@Test(description = "Scenario:1 - Test the functionality of Consumer with valid flow")
  public void f(String no) throws Throwable {
	  System.out.println("Entered in the test method..................");
	  try {
		pdfResultReport.readTestDataFile(System.getProperty("user.dir")	+ "//Resources//Batumbu_Data.xlsx", no);
	} catch (Exception e) {                                  
		 
		e.printStackTrace();
	}
	  
	  indonesianCitizencompnents.openURL();
	
	  indonesianCitizencompnents.CreateAccount();
	  indonesianCitizencompnents.salesforceIntegrationLogin();
	  indonesianCitizencompnents.gmailOTP();
	  indonesianCitizencompnents.salesforceOTP();
	  //210708
	  
	  indonesianCitizencompnents.login();
	  indonesianCitizencompnents.navigatetoIndonesianCitizen();
	  indonesianCitizencompnents.indonesianCitizenregistration();
	  indonesianCitizencompnents.batumbuAdminApproval();
	 
	  indonesianCitizencompnents.salesforcefund();
	  indonesianCitizencompnents.investorfunddetails();
	   
	  
	
	}
}
	


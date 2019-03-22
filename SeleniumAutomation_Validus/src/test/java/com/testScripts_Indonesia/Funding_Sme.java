
package com.testScripts_Indonesia;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseClasses.BaseClass_Web;
import com.components.ValidusRegisterAsInvestorComponents;

public class Funding_Sme extends BaseClass_Web {

	public  ValidusRegisterAsInvestorComponents investorcomponents = new ValidusRegisterAsInvestorComponents(pdfResultReport);
	
	
	

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
	 investorcomponents.login();
	 investorcomponents.fundinSME();
	// investorcomponents.batumbuAdminFunding();
	 
	 
	
	
	
	
	
}}

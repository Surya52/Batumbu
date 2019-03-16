package com.objectRepository;

import org.openqa.selenium.By;

public class DBSOpenAccountLocators {
	
	public By digitalBusinessAccountViewMore = By.xpath("//*[@id='account_type1_1']");
	public By applyNow = By.xpath("//*[@id='testing']");

	// Contact Person Detailss
	public By name = By.xpath("//*[@id='name']");
	public By email = By.xpath("//*[@id='email_address']");
	public By mobileNumber = By.xpath("//*[@id='mobile_number']");
	public By standardMail = By.xpath("//*[@id='dda_dev_mod1']/div/div[1]/input");
	public By registeredMail = By.xpath("//*[@id='dda_dev_mod1']/div/div[2]/input");
	public By next = By.xpath("//*[@id='online_account_step1']/div[7]/div/div[1]/a");

	// Business Details
	public By businessDetails_Text = By.xpath("//h2[text()='Business Details']");
	public By companyIncorporatedWithACRA_radiobtn = By.id("localBusinessIncorp");
	public By registredBusinessName_textbox = By.id("business_name");
	public By yOI_textbox = By.id("dateOfIncorporation");
	public By retriveDetailsfromACRA_btn = By.xpath("//a[@onclick='javascript:return searchACRACompanies();']");
	public By proceedWithoutACRADetails_radiobtn = By.id("acraproceed");
	public By registeredBusinessName1_txtbox = By.id("enterCompanyName");
	public By dOI_txtbox = By.id("enterDateOfIncorporation");
	public By businessRegistrationNo_txtbox = By.id("enterRegistrationNumber");
	public By soleProp_radiobtn = By.xpath("//input[@value='Sole Prop']");
	// Registered Address
	public By country_select = By.id("enterCountry");
	public By postCode_txtbox = By.id("enterPin");
	public By blockNo_txtbox = By.id("enterStreet");
	public By unitNumber_txtBox = By.id("enterApartment");
	public By unitNumber1_txtBox = By.id("enterApartment1");
	public By streetName_txtBox = By.id("streetName");
	public By city_txtBox = By.id("enterCity");
	public By state_txtbox = By.id("enterState");
	public By mailingAdd_radioox = By.id("checkMailingAddYes");
	// ACCOUNT USERS
	public By firstName_txtbox = By.id("fname_edit1");
	public By lastName_txtbox = By.id("lname_edit1");
	public By nationality_select = By.id("nationality_edit1");
	public By nRIC_txtbox = By.id("passport_edit1");
	public By emailAddress = By.id("Email1");
	public By mobileNo_txtbox = By.id("Mobile_number1");
	public By authorisedSignature_chkbox = By.id("authorizationOptionsYes1");
	public By anyOne_radiobtn = By.id("anyone");
	// BUSINESS BANKING SERVICES
	public By creditCardNo_radiobtn = By.id("colno");
	// DECLAIRATION
	public By tradingNo_radiobtn = By.id("tradingoilNo");
	public By tellUs_txtbox = By.id("businessActivities");
	public By doesYourNo_radiobtn = By.id("oprno");
	public By nomineeNo_radiobtn = By.id("nominee_no");
	public By isYourBusiness_radiobtn = By.id("bizOwnedByInd_no");
	public By isYourTax_radiobtn = By.id("non_sole_singapore_resident");
	public By IsYourFinaceYes_radiobtn = By.id("nonSolBizEntity_yes");
	public By iAm_radiobtn = By.xpath("ass_bank_per");

	// CONFIRM
	public By password_txtbox = By.id("pdfPasswordTextBoxId");
	public By confirmPassword_txtbox = By.id("confirmPdfPasswordTextBoxId");

	public By finalSubmit_radiobtn = By.id("finalSubmit");

}

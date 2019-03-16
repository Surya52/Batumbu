package com.objectRepository;

import org.openqa.selenium.By;

public class DBSBusinessAccOpening_Loc {

	/*WebDriver driver;
	public DBSBusinessAccOpening_Loc(WebDriver driver){
		this.driver=driver;
	}
	*/
	public By digitalBusinessAccount_chkbox=By.id("account_type1_1");
	public By applyNow_btn=By.id("testing");
	public By name_textbox=By.id("name");
	public By email_textbox=By.id("email_address");
	public By mobileNumber_textbox=By.id("mobile_number");
	public By standardMail_radibox=By.xpath("(//input[@ name='delivery_mode'])[1]");
	public By noOfChkbook_radibox=By.xpath("(//input[@value='0'])[1]");
	public By next_btn=By.xpath("(//a[text()='Next'])[1]");
	//Business Details 
	public By businessDetails_Text=By.xpath("//h2[text()='Business Details']");
	public By companyIncorporatedWithACRA_radiobox=By.id("localBusinessIncorp");
	public By registredBusinessName_textbox=By.id("business_name");
	public By yOI_textbox=By.id("dateOfIncorporation");
	public By retriveDetailsfromACRA_btn=By.xpath("//a[@onclick='javascript:return searchACRACompanies();']");
	public By proceedWithoutACRADetails_radiobox=By.id("acraproceed");
	public By registeredBusinessName1_txtbox=By.id("enterCompanyName");
	public By dOI_txtbox=By.id("enterDateOfIncorporation");
	public By businessRegistrationNo_txtbox=By.id("enterRegistrationNumber");
	public By soleProp_radiobox=By.xpath("//input[@value='Sole Prop']");
	//Registered Address
  public By country_select=By.id("enterCountry");
  public By postCode_txtbox=By.id("enterPin");
  public By blockNo_txtbox=By.id("enterStreet");
  public By unitNumber_txtBox=By.id("enterApartment");
  public By unitNumber1_txtBox=By.id("enterApartment1");
  public By streetName_txtBox=By.id("streetName");
  public By city_txtBox=By.id("enterCity");
  public By state_txtbox=By.id("enterState");
  public By mailingAdd_radioox=By.id("checkMailingAddYes");
  //ACCOUNT USERS
  public By firstName_txtbox=By.id("fname_edit1");
  public By lastName_txtbox=By.id("lname_edit1");
  public By nationality_select=By.id("nationality_edit1");
  public By nRIC_txtbox=By.id("passport_edit1");
  public By emailAddress=By.id("Email1");
  public By mobileNo_txtbox=By.id("Mobile_number1");
  public By authorisedSignature_chkbox=By.id("authorizationOptionsYes1");
  public By anyOne_radiobox=By.id("anyone");
  //BUSINESS BANKING SERVICES
  public By creditCardNo_radiobox=By.id("colno");
  //DECLAIRATION
  public By tradingNo_radiobox=By.id("tradingoilNo");
  public By tellUs_txtbox=By.id("businessActivities");
  public By doesYourNo_radiobox=By.id("oprno");
  public By nomineeNo_radiobox=By.id("nominee_no");
  public By isYourBusiness_radiobox=By.id("bizOwnedByInd_no");
  public By isYourTax_radiobox=By.id("non_sole_singapore_resident");
  public By IsYourFinaceYes_radiobox=By.id("nonSolBizEntity_yes");
  public By iAm_radiobox=By.xpath("ass_bank_per");
  
  //CONFIRM
  public By password_txtbox=By.id("pdfPasswordTextBoxId");
  public By confirmPassword_txtbox=By.id("confirmPdfPasswordTextBoxId");
  
  public By finalSubmit_radiobox=By.id("finalSubmit");
  
  
	
	
}

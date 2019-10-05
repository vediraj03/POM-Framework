package com.leafBot.testcases;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class CreateLeadTestCase extends ProjectSpecificMethods {
	
		
	
	  @BeforeTest
	  public void beforeTest() { 
	  excelFileName="TestLeafCreateLead";
	  testcaseName="Create Lead";
	  testcaseDec = "create new lead to Leaftaps"; author="Vediraj";
	  category="smoke"; 
	  }
	 
	
	@Test(dataProvider="fetchData")
	public void tC001_CreateLead(String uName, String password,String CompanyName,String firstName,String lastName,String phoneNo, String email) {
		
		new LoginPage()
		.enterUsername(uName)
		.enterPassword(password)
		.clickLogin()
		.clickOnCRMLink()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(CompanyName)
		.enterFirstName(firstName)
		.enetrLastName(lastName)
		.enetrPhoneNumber(phoneNo)
		.enetrEmailId(email)
		.clickCreateLead()
		.verifyCreateLeadFname(firstName);
		

		
	}
	
	

}

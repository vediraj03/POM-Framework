package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;


public class DuplicateLeadTestCase extends ProjectSpecificMethods {
	
	
	@BeforeTest
	public void setData() {
		excelFileName="DuplicateLead";
		testcaseName="Duplicate Lead";
		  testcaseDec = "Duplicate the existing lead in Leaftaps"; author="Vediraj";
		  category="smoke";
		
	}
	
	@Test(dataProvider="fetchData")
	public void tc004_DuplicateLeadTestCase(String uName,String password,String email ) throws InterruptedException{
		
		new LoginPage().enterUsername(uName).enterPassword(password).clickLogin()
		.clickOnCRMLink().clickLeads().clickOnFindLeads()
		.clickOnEmailLink().enterEmailId(email).clickOnFindLeadsButton().clickFLeadRecord()
		.clickDuplicate().clickOnCreateLead().verifyDuplicateLead();
		
	}

}

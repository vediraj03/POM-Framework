package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;



public class DeleteLeadTestCase extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData()  {
		excelFileName="DeleteLead";
		testcaseName="Delete Lead";
		  testcaseDec = "Delete the existing lead to Leaftaps"; author="Vediraj";
		  category="smoke";
		
	}
	
	
	@Test(priority=3,dataProvider="fetchData")
	public void tC003_DeleteLeadTestCase(String uName, String password,String phoneNo) throws InterruptedException{
		new LoginPage().enterUsername(uName).enterPassword(password).clickLogin()
		.clickOnCRMLink().clickLeads().clickOnFindLeads().clickOnPhoneLink()
		.enterPhoneNumber(phoneNo)
		.clickOnFindLeadsButton()
		.clickFLeadRecord()
		.clickOnDelete()
		.clickOnFindLeads()
		.enterLeadId()
		.clickOnFindLeadsButton()
		.verifyOnDeletedLeadId();
		
		
	}
	

}

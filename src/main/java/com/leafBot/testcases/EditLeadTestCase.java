package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;


public class EditLeadTestCase extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData() {
		excelFileName="EditLead";
		testcaseName="Edit Lead";
		  testcaseDec = "Edit the existing lead compani name in Leaftaps"; author="Vediraj";
		  category="smoke";
		
		
	}
	
	@Test(priority=2,dataProvider="fetchData")
	public void tc002_EditLead(String uName,String password,String firstName,String uCompanyName) throws InterruptedException {
		
		new LoginPage()
		.enterUsername(uName)
		.enterPassword(password)
		.clickLogin()
		.clickOnCRMLink()
		.clickLeads()
		.clickOnFindLeads()
		.enterFirstName(firstName)
		.clickOnFindLeadsButton()
		.clickFirstLeadRecord()
		.clickEdit()
		.updateCompanyName(uCompanyName)
		.clickUpadte()
		.verifyUpatedCompanyName(uCompanyName);
		
				
	}
	
	

}

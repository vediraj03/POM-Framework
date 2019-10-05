package com.leafBot.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class MergeLeadTestCase extends ProjectSpecificMethods{
	

	@BeforeTest
	public void setData() {
		excelFileName="MergeLead";
		testcaseName="Merge Lead";
		  testcaseDec = "me the existing two leads in Leaftaps"; author="Vediraj";
		  category="smoke";
		
	}
	
	@Test(dataProvider="fetchData")
	
	public void tc005_MergeLeadTestCase(String uName,String password,String name) throws InterruptedException, IOException{
		
		new LoginPage().enterUsername(uName).enterPassword(password).clickLogin()
		.clickOnCRMLink().clickLeads().clickOnMergeLeads()
		.clickOnFromLead().switchToNewFindLeadsWindow().enterFirstNameW(name)
		.clickOnFindLeadsButton().clickOnFromFirstValue().switchToMergeLeadWindow()
		.clickOnToLead().switchToNewFindLeadsWindow().enterFirstNameW(name).clickOnFindLeadsButton()
		.clickOnToSceondValue().switchToMergeLeadWindow().clickOnMerge()
		.clickOnFindLeadsMergeP().enterLeadId().clickOnFindLeadsButton().verifyMergeLead();
		
	}

}

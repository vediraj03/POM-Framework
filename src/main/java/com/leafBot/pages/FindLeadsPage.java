package com.leafBot.pages;

import java.io.IOException;

import com.leafBot.selenium.api.base.SeleniumBase;

public class FindLeadsPage extends SeleniumBase{

	static String valueFirstrow;
	public FindLeadsPage enterFirstName(String firstName) {

		clearAndType(locateElement("xpath", "(//input[@name='firstName'])[3]"), firstName);

		return this;

	}
	public FindLeadsPage enterLead() {
		clearAndType(locateElement("xpath","(//input[contains(@id,'ext-gen')])[30]"), NewWindowFindLeadsPage.eleFromdata);

		return this;

	}

	public FindLeadsPage enterPhoneNumber(String phoneNo){

		clearAndType(locateElement("xpath", "//input[@name='phoneNumber']"), phoneNo);

		return this;
	}

	public FindLeadsPage verifyMergeLead() throws IOException{
		String resultsText = getElementText(locateElement("xpath", "//div[contains(@class,'paging')]"));
		System.out.println(resultsText);

		if(resultsText.equalsIgnoreCase("No records to display")){
			System.out.println(NewWindowFindLeadsPage.eleFromdata+" is Sucessfully Marged with : " +NewWindowFindLeadsPage.eleTodata);
		}
		else{
			System.out.println(NewWindowFindLeadsPage.eleFromdata+"is not Marged with : " +NewWindowFindLeadsPage.eleTodata);
		}

		return this;
	}
	public FindLeadsPage clickOnEmailLink(){
		
		click(locateElement("xpath", "//span[text()='Email']"));
		
		return this;

	}
	public FindLeadsPage enterEmailId(String email){
		clearAndType(locateElement("xpath", "//input[@name='emailAddress']"), email);
		
		return this;
	}

	public FindLeadsPage clickOnFindLeadsButton() {
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		
		return this;
	}

	public ViewLeadsPage clickFirstLeadRecord() {
		click(locateElement("xpath", "(//a[text()='Vediraj'])[1]"));
		
		return new ViewLeadsPage();

	}
	public ViewLeadsPage clickFLeadRecord() throws InterruptedException {
		Thread.sleep(2000);
		 valueFirstrow = getElementText(locateElement("xpath", "//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a"));
		System.out.println(valueFirstrow);
		 click(locateElement("xpath", "//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a"));

	return new ViewLeadsPage();
	}

	public FindLeadsPage enterLeadId(){
		System.out.println(valueFirstrow);
		clearAndType(locateElement("xpath", "//input[@name='id']"), valueFirstrow);
		
		return this;

	}
	public FindLeadsPage verifyOnDeletedLeadId(){
		
		String findLeadText = getElementText(locateElement("xpath", "//div[text()='No records to display']"));
		
		if(findLeadText.equalsIgnoreCase("No records to display")){
			System.out.println("Lead record is sucessfully deleted :"+findLeadText);
		}
		else{
			System.out.println("Lead record is not deleted :");
		}
		return this;
	}

	public FindLeadsPage clickOnPhoneLink(){
		click(locateElement("xpath", "//span[text()='Phone']"));
		
		return this;
	}





}

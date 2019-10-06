package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class CreateLeadPage extends SeleniumBase {
	
	public CreateLeadPage enterCompanyName(String CompanyName) {
		clearAndType(locateElement("xpath","//input[@id='createLeadForm_companyName']"), CompanyName);
		
		return this;
	}
	
	public CreateLeadPage enterFirstName(String firstName) {
		
		clearAndType(locateElement("xpath","//input[@id='createLeadForm_firstName']"), firstName);
		
		return this;
	}
	
	public CreateLeadPage enetrLastName(String lastName) {
		clearAndType(locateElement("xpath","//input[@id='createLeadForm_lastName']"), lastName);
		
		return this;
		
	}
	
	public CreateLeadPage enetrPhoneNumber(String phoneNo) {
		
		clearAndType(locateElement("id","createLeadForm_primaryPhoneNumber"), phoneNo);
		
		return this;
		
	}
	public CreateLeadPage enetrEmailId(String email) {
		clearAndType(locateElement("id", "createLeadForm_primaryEmail"), email);
		
		return this;
		
	}
	
	public ViewLeadsPage clickCreateLead() {
		click(locateElement("xpath", "//input[@name='submitButton']"));
		
		return new ViewLeadsPage();
	}


}

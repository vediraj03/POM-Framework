package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;



public class ViewLeadsPage extends SeleniumBase {

	public void verifyCreateLeadFname(String vFirstName) {

		String fName = getElementText(locateElement("xpath","(//span[text()='First name']/following::span)[1]"));


		if(fName.equals(vFirstName)){
			System.out.println("First name "+vFirstName+" is correct : "+fName);
		}

		else{
			System.out.println("First name "+vFirstName+" is incorrect : "+fName);
		}


	}

	public OpenTapsCRMPage clickEdit() {

		click(locateElement("xpath", "//a[text()='Edit']"));

		return new OpenTapsCRMPage();
	}


	public DuplicateLeadPage clickDuplicate() {
		click(locateElement("xpath", "//a[text()='Duplicate Lead']"));

		return new DuplicateLeadPage();
	}

	public FindLeadsPage clickOnFindLeadsMergeP() {
		click(locateElement("link", "Find Leads"));
		return new FindLeadsPage();
	}



	public DuplicateLeadPage verifyDuplicateLead() {
		String firstNameViewLead = getElementText(locateElement("xpath", "(//span[text()='First name']//following::span)[1]"));
		
		if(DuplicateLeadPage.firstNameDuptext.equalsIgnoreCase(firstNameViewLead)){
			System.out.println(DuplicateLeadPage.firstNameDuptext+" First name validated sucessfully: "+firstNameViewLead);
		}
		else {
			System.out.println(DuplicateLeadPage.firstNameDuptext+" Not created the duplicate lead: "+firstNameViewLead);
		}
		return new DuplicateLeadPage();
	}
	public MyLeadsPage clickOnDelete() {
		click(locateElement("xpath", "//a[text()='Delete']"));

		return new MyLeadsPage();
	}
	public ViewLeadsPage verifyUpatedCompanyName(String uCompanyName) {

		String eleUpdatedCompany = getElementText(locateElement("xpath", "//span[text()='Company Name']/following::span"));
				
		String []UpdatedCompany = eleUpdatedCompany.split(" ");
		System.out.println(UpdatedCompany[0]);

		if(UpdatedCompany[0].equalsIgnoreCase(uCompanyName)){
			System.out.println("Updated Company Name is:" +UpdatedCompany[0]);
		}
		else {
			System.out.println("unable to split company name with lead id");
		}

		if(eleUpdatedCompany.contains(uCompanyName)){
			System.out.println("Updated Company Name is:" +eleUpdatedCompany);
		}

		else {
			System.out.println("updated Name is not repleated");
		}

		return this;

	}


}

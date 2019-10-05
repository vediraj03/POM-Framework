package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;


public class MyLeadsPage extends SeleniumBase{
	
	public CreateLeadPage clickCreateLead() {
		click(locateElement("xpath", "//a[text()='Create Lead']"));
		
		return new CreateLeadPage();
	}
	
	public FindLeadsPage clickOnFindLeads() {
		click(locateElement("xpath", "//a[text()='Find Leads']"));
		
		return new FindLeadsPage();
	}
	public MergeLeadsPage clickOnMergeLeads() {
		
		click(locateElement("link", "Merge Leads"));
		
		return new MergeLeadsPage();
	}
	
	

}

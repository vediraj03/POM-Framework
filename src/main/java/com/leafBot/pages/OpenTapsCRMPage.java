package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;


public class OpenTapsCRMPage extends SeleniumBase{
	
	public OpenTapsCRMPage updateCompanyName(String uCompanyName) {
		clearAndType(locateElement("id", "updateLeadForm_companyName"), uCompanyName);
		
		return this;
		
	}
	
	public ViewLeadsPage clickUpadte() {
		
		click(locateElement("xpath", "//input[@value='Update']"));
		
		return new ViewLeadsPage();
		
	}

}

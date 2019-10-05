package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.selenium.api.base.SeleniumBase;



public class DuplicateLeadPage extends SeleniumBase {
	
	static String firstNameDuptext ;
	
	public ViewLeadsPage clickOnCreateLead(){
	
		
	WebElement firstNameDup = driver.findElementByXPath("//input[@id='createLeadForm_firstName']");
	
	 firstNameDuptext = firstNameDup.getAttribute("value");
	 System.out.println(firstNameDuptext);
	String title = driver.getTitle();
	if(title.contains("Duplicate Lead")){
		System.out.println("Title is verified :"+title);
	}
			
	driver.findElementByXPath("//input[@name='submitButton']").click();
	
	return new ViewLeadsPage();
}
	
}
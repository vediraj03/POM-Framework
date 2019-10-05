package com.leafBot.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;

import com.leafBot.selenium.api.base.SeleniumBase;

public class MergeLeadsPage extends SeleniumBase{
	
	static List<String> ls;
	
	
	public NewWindowFindLeadsPage switchToNewFindLeadsWindow(){
		switchToWindow(1);
		
		return new NewWindowFindLeadsPage();
	}
	
	public MergeLeadsPage clickOnFromLead(){
		driver.findElementByXPath("//input[@id='partyIdFrom']//following::img[1]").click();
		return this;

	}


	public MergeLeadsPage clickOnToLead(){
		driver.findElementByXPath("//input[@id='partyIdTo']//following::img[1]").click();
		return this;

	}
	public ViewLeadsPage clickOnMerge(){
		driver.findElementByLinkText("Merge").click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		return new ViewLeadsPage();

	}

	


}

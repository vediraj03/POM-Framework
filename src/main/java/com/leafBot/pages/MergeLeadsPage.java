package com.leafBot.pages;

import java.util.List;
import com.leafBot.selenium.api.base.SeleniumBase;

public class MergeLeadsPage extends SeleniumBase{

	static List<String> ls;


	public NewWindowFindLeadsPage switchToNewFindLeadsWindow(){
		switchToWindow(1);

		return new NewWindowFindLeadsPage();
	}

	public MergeLeadsPage clickOnFromLead(){
		click(locateElement("xpath", "//input[@id='partyIdFrom']//following::img[1]"));
		return this;

	}


	public MergeLeadsPage clickOnToLead(){
		click(locateElement("xpath", "//input[@id='partyIdTo']//following::img[1]"));
		return this;

	}
	public ViewLeadsPage clickOnMerge() throws InterruptedException{
		click(locateElement("link", "Merge"));
		Thread.sleep(3000);
		//acceptAlert();
		return new ViewLeadsPage();

	}




}

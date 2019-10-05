package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;



public class NewWindowFindLeadsPage extends SeleniumBase {
	static String eleFromdata;
	static String eleTodata;
	public NewWindowFindLeadsPage enterFirstNameW(String name){
		clearAndType(locateElement("xpath", "//input[@name='firstName']"), name);

		return this;
	}

	public NewWindowFindLeadsPage clickOnFindLeadsButton(){
		click(locateElement("xpath", "(//button[contains(@type,'button')])[1]"));

		return this;
	}

	public NewWindowFindLeadsPage clickOnFromFirstValue() throws InterruptedException{
		Thread.sleep(2000);
		eleFromdata = getElementText(locateElement("xpath","(//table[contains(@class,'row-table')]//a)[1]"));
		click(locateElement("xpath", "(//table[contains(@class,'row-table')]//a)[1]"));

		return this;

	}

	public MergeLeadsPage switchToMergeLeadWindow(){
		switchToWindow(0);
		return new MergeLeadsPage();
	}

	public NewWindowFindLeadsPage clickOnToSceondValue() throws InterruptedException{
		Thread.sleep(2000);
		eleTodata = getElementText(locateElement("xpath","(//div[contains(@class,'partyId')]//a)[3]"));
		click(locateElement("xpath", "(//div[contains(@class,'partyId')]//a)[3]"));

		return this;

	}


}

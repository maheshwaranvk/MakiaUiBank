package com.framework.selenium.uiBank.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.UIBankMethods;

public class ApplyNewAccountPage extends UIBankMethods{
	
	
	public ApplyNewAccountPage typeNickName(String name) {
		type(locateElement(Locators.ID,"accountNickname"), name);
		reportStep(name+" Username is entered successfully", "pass");
		return this;
	}

	
	public ApplyNewAccountPage selectAccountType(String text) {
		selectDropDownUsingText(locateElement(Locators.ID,"typeOfAccount"), text);
		reportStep(text+" is selected successfully", "pass");
		return this;
	}	
	

	public ApplyNewAccountPage clickApply() {
		click(locateElement(Locators.XPATH,"//button[text()='Apply']"));
		reportStep("Apply button is clicked", "pass");
		return this;		
	}
	
	
	public ApplyNewAccountPage verifyAccountCreation() {
		verifyDisplayed(locateElement(Locators.ID,"accountId"));
		reportStep("Account is created", "pass");
		return this;
	}
	
	
	
	

}

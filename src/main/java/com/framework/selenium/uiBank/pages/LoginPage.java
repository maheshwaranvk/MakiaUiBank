package com.framework.selenium.uiBank.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.UIBankMethods;

public class LoginPage extends UIBankMethods{
	
	
	public LoginPage typeUsername(String username) {
		type(locateElement(Locators.ID,"username"), username);
		reportStep(username+" Username is entered successfully", "pass");
		return this;
	}

	
	public LoginPage typePassword(String password) {
		type(locateElement(Locators.ID,"password"), password);
		reportStep(password+" Password is entered successfully", "pass");
		return this;
	}	
	

	public HomePage clickLogIn() {
		click(locateElement(Locators.XPATH,"//button[text()='Sign In']"));
		reportStep("Sign In button is clicked", "pass");
		return new HomePage();		
	}

}

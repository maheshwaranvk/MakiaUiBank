package com.framework.selenium.uiBank.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.UIBankMethods;

import io.github.sukgu.Shadow;

public class HomePage extends UIBankMethods{
	
	public ApplyNewAccountPage clickApplyForNewAccount() {
		click(locateElement(Locators.XPATH, "//div[text()='Apply For New Account']"));

		return new ApplyNewAccountPage();
	}
	

}

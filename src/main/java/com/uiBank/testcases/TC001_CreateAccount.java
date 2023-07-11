package com.uiBank.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.selenium.uiBank.pages.LoginPage;
import com.framework.testng.api.base.UIBankMethods;
import com.github.javafaker.Faker;

public class TC001_CreateAccount extends UIBankMethods{
	
	@BeforeTest
	public void setValues() {
		testcaseName = "Create New Account";
		testDescription ="CCreate new savinngs account";
		authors="Hari";
		category ="Smoke";
		excelFileName="CreateAccount";
	}
	
	@Test(dataProvider = "fetchData")
	public void createNewAccount(String username, String password, String actType) {
		Faker fake = new Faker();
		String nickName = fake.name().firstName();
		
		new LoginPage()
		.typeUsername(username)
		.typePassword(password)
		.clickLogIn()
		.clickApplyForNewAccount()
		.typeNickName(nickName)
		.selectAccountType(actType)
		.clickApply()
		.verifyAccountCreation();
	}

}

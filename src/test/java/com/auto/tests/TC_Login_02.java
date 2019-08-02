package com.auto.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.auto.baseClass.BaseTest;
import com.auto.pageObject.LoginPage;
import com.auto.pageObject.RegistrationPage;
import com.auto.utility.ReadPropertyConfig;
import com.auto.utility.ReportsClass;
import com.aventstack.extentreports.Status;

/**
 * 
 * * Author : Bhargav Sathwara ***
 * 
 */
public class TC_Login_02 extends BaseTest {

	ReadPropertyConfig readProp = new ReadPropertyConfig();
	String url = readProp.getSiteURL();
	String uname = readProp.getEmail();
	String pwd = readProp.getPassword();

	@BeforeMethod
	public void beforeMethod() {
		ReportsClass.startUp();
		ReportsClass.initialisation("TC_Login_02");
		openBrowser(url);
	}

	@Test
	public void loginTest() throws Exception {
		RegistrationPage regPage = new RegistrationPage();
		LoginPage loginPage = new LoginPage();
		regPage.clickOnMyAccountMenu();
		loginPage.login(uname, pwd);
		ReportsClass.logStat(Status.PASS, "User is able to login successfully");
		Assert.assertTrue(loginPage.isLoginSuccess(), "Login is not success as expected !!!");

	}

	@AfterMethod
	public void afterMethod() {
		ReportsClass.endTest();
	}
}

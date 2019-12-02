package com.auto.parabankTest;

import org.testng.annotations.Test;

import com.auto.baseClass.BaseTest;
import com.auto.pageObject.ParabankRegister;
import com.auto.utility.ReadPropertyConfig;
import com.auto.utility.ReportsClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class ParabankRegister_Test extends BaseTest {

	ReadPropertyConfig readPro = new ReadPropertyConfig();
	String url = readPro.getParabankURL();
	String firstname = readPro.getFirstName();
	String lastname = readPro.getLastName();
	String address = readPro.getAddress();
	String city = readPro.getCity();
	String state = readPro.getState();
	String zipcode = readPro.getZipCode();
	String phone = readPro.getPhoneNumber();
	String ssn = readPro.getSSN();
	String username = readPro.getUserName();
	String password = readPro.getPassword();
	String confirmpassword = readPro.getConfirmPassword();

	@BeforeMethod
	public void beforeMethod() {
		ReportsClass.startUp();
		ReportsClass.initialisation("ParabankRegister_Test");
		openBrowser(url);
	}

	@Test
	public void parabankRegisterTest() throws Exception {
		ParabankRegister paraPage = new ParabankRegister();
		paraPage.clickRegisterLink();
		paraPage.parabankRegister(firstname, lastname, address, city, state, zipcode, phone, ssn, username, password,
				confirmpassword);
	}

	@AfterMethod
	public void afterMethod() {
		ReportsClass.endTest();
	}
}

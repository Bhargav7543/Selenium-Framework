package com.auto.locators;

/**
 * 
 * * Author : Bhargav Sathwara ***
 * 
 */
public interface Locators {

	public interface registrationLocators {
		String FIRST_NAME = "//*[@placeholder='First Name']";
		String LAST_NAME = "//*[@placeholder='Last Name']";
		String ADDRESS = "//div//textarea[@ng-model='Adress']";
		String EMAIL_ADDRESS = "//div//input[@ng-model='EmailAdress']";
		String PHONE = "//div//input[@ng-model='Phone']";
		String GENDER = "//input[@value='Male']";
		String COUNTRY_NAME = "//[@id='countries']";
		String PASSWORD = "//div//input[@ng-model='Password']";
		String CONFIRM_PASSWORD = "//div//input[@ng-model='CPassword']";
		String SUBMIT_BUTTON = "//*[@id='submitbtn']";
		String EMAIL_SHOP = "//*[@id='reg_email']";
		String PASSWORD_SHOP = "//*[@id='reg_password']";
		String RESITER_BUTTON = "//*[@name='register']";
		String MYACCOUNT = "//*[@id='menu-item-50']/a";
	}

	public interface loginPageLocators {
		String USERNAME = "//*[@id='username']";
		String LOGIN_PASSWORD = "//*[@id='password']";
		String LOGIN_BUTTON = "//*[@name='login']";
		String LOGIN_SUCCESS = "//*[@id='page-36']/div";
	}

	// Parabank Locators
	public interface parabankRegister {
		String REGISTER = "//*[@id='loginPanel']/p[2]/a";
		String FIRSTNAME = "//*[@id='customer.firstName']";
		String LASTNAME = "//*[@id='customer.lastName']";
		String ADDRESS = "//*[@id='customer.address.street']";
		String CITY = "//*[@id='customer.address.city']";
		String STATE = "//*[@id='customer.address.state']";
		String ZIPCODE = "//*[@id='customer.address.zipCode']";
		String PHONENUMBER = "//*[@id='customer.phoneNumber']";
		String SSN = "//*[@id='customer.ssn']";
		String USERNAME = "//*[@id='customer.username']";
		String PASSWORD = "//*[@id='customer.password']";
		String CONFIRMPASSWORD = "//*[@id='repeatedPassword']";
		String REGBUTTON = "//*[@id='customerForm']/table/tbody/tr[13]/td[2]/input";
	}
}

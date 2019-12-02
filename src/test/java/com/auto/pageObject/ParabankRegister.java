package com.auto.pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.auto.baseClass.BaseTest;
import com.auto.locators.Locators.parabankRegister;

public class ParabankRegister extends BaseTest implements parabankRegister {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@FindBy(xpath = REGISTER)
	WebElement registerLink;
	@FindBy(xpath = FIRSTNAME)
	WebElement fname;
	@FindBy(xpath = LASTNAME)
	WebElement lname;
	@FindBy(xpath = ADDRESS)
	WebElement adress;
	@FindBy(xpath = CITY)
	WebElement cty;
	@FindBy(xpath = STATE)
	WebElement stat;
	@FindBy(xpath = ZIPCODE)
	WebElement zip;
	@FindBy(xpath = PHONENUMBER)
	WebElement pno;
	@FindBy(xpath = SSN)
	WebElement ssnno;
	@FindBy(xpath = USERNAME)
	WebElement uname;
	@FindBy(xpath = PASSWORD)
	WebElement pwd;
	@FindBy(xpath = CONFIRMPASSWORD)
	WebElement cpwd;
	@FindBy(xpath = REGBUTTON)
	WebElement regBtn;

	public ParabankRegister() {
		PageFactory.initElements(driver, this);
	}

	public void clickRegisterLink() throws Exception {
		registerLink.click();
		waitFor3Sec();
	}

	public void parabankRegister(String firstname, String lastname, String address, String city, String state,
			String zipcode, String phone, String ssn, String username, String password, String confirmpassword)
			throws Exception {
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
		adress.sendKeys(address);
		cty.sendKeys(city);
		stat.sendKeys(state);
		zip.sendKeys(zipcode);
		pno.sendKeys(phone);
		ssnno.sendKeys(ssn);
		uname.sendKeys(username);
		js.executeScript("window.scrollBy(0,250)");
		pwd.sendKeys(password);
		cpwd.sendKeys(confirmpassword);
		waitFor2Sec();
		regBtn.click();
	}
}

package com.edvora.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage {

	WebDriver ldriver;

	public SettingsPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(xpath = "//input[@autocomplete='username']")
	@CacheLookup
	WebElement username;

	@FindBy(xpath = "//input[@autocomplete='current-password']")
	@CacheLookup
	WebElement pass;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	@CacheLookup
	WebElement btnLogin;

	public void setUserName(String uname) {
		username.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		pass.sendKeys(pwd);
	}

	public void clickLogin() {
		btnLogin.click();
	}

	@FindBy(xpath = "//button[normalize-space()='Edit']")
	@CacheLookup
	WebElement btnEdit;

	@FindBy(name = "fullname")
	@CacheLookup
	WebElement fullname;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	@CacheLookup
	WebElement btnSave;


	public void clickEdit() {
		btnEdit.click();
	}

	public void changeFullName(String fname) {
		fullname.sendKeys(fname);
	}


	public void clickSave() {
		btnSave.click();
	}

}

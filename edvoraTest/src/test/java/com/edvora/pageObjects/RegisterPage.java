package com.edvora.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	WebDriver ldriver;

	public RegisterPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//button[normalize-space()='SignIn']")
	@CacheLookup
	WebElement btnSignIn;

	@FindBy(xpath = "//input[@autocomplete='username']")
	@CacheLookup
	WebElement username;

	@FindBy(xpath = "//input[@autocomplete='current-password']")
	@CacheLookup
	WebElement pass;

	@FindBy(xpath = "//button[normalize-space()='Create Account']")
	@CacheLookup
	WebElement btnCreateAcc;

	public void clickSignIn() {
		btnSignIn.click();
	}

	public void setUserName(String uname) {
		username.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		pass.sendKeys(pwd);
	}

	public void clickCreateAcc() {
		btnCreateAcc.click();
	}
}

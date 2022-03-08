package com.edvora.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.edvora.pageObjects.LoginPage;

public class TS002 extends BaseClass {

	@Test

	public void LoginTest() throws InterruptedException {

		driver.get(baseURL);

		LoginPage lp = new LoginPage(driver);

		lp.setUserName(username);
		Thread.sleep(2000);

		lp.setPassword(password);
		Thread.sleep(2000);

		lp.clickLogin();
		Thread.sleep(3500);

		boolean isEditButtonDisplayed = driver.findElement(By.xpath("//button[normalize-space()='Edit']"))
				.isDisplayed();

		if (isEditButtonDisplayed == true) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}
}

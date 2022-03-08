package com.edvora.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.edvora.pageObjects.RegisterPage;

public class TS001 extends BaseClass {

	@Test

	public void SignupTest() throws InterruptedException {

		driver.get(baseURL);

		RegisterPage rp = new RegisterPage(driver);
		rp.clickSignIn();
		Thread.sleep(2000);

		rp.setUserName(username);
		Thread.sleep(2000);

		rp.setPassword(password);
		Thread.sleep(2000);

		rp.clickCreateAcc();
		Thread.sleep(3500);

		driver.switchTo().alert().accept();
		Thread.sleep(3000);


		boolean isEditButtonDisplayed = driver.findElement(By.xpath("//button[normalize-space()='Edit']"))
				.isDisplayed();

		if (isEditButtonDisplayed == true) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
}

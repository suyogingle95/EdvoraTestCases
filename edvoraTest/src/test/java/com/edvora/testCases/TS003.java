package com.edvora.testCases;

import org.testng.annotations.Test;

import com.edvora.pageObjects.SettingsPage;

@Test
public class TS003 extends BaseClass {

	public void EditTest() throws InterruptedException {

		driver.get(baseURL);

		SettingsPage sp = new SettingsPage(driver);

		sp.setUserName(username);
		Thread.sleep(2000);

		sp.setPassword(password);
		Thread.sleep(2000);

		sp.clickLogin();
		Thread.sleep(3500);

		sp.clickEdit();
		Thread.sleep(3500);

		sp.changeFullName(fullname);
		Thread.sleep(3500);

		sp.clickSave();



//		boolean isEditButtonDisplayed = driver.findElement(By.xpath("//button[normalize-space()='Edit']"))
//				.isDisplayed();
//
//		if (isEditButtonDisplayed == true) {
//			Assert.assertTrue(true);
//		} else {
//			Assert.assertTrue(false);
//		}

	}
}

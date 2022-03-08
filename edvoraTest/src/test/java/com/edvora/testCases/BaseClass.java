package com.edvora.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String baseURL = "https://testing-assessment-foh15kew9-edvora.vercel.app/";
	public String username = "aaaa2";
	public String password = "aaaa2";
	public String fullname = "Suyog Ingle";
	public String editUserName = "Suyog";
	public String mobileNumber = "9822160767";
	public static WebDriver driver;


	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	}

//	@AfterClass
//	public void tearDown() {
//		driver.quit();
//	}
}

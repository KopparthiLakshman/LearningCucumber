package com.cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class StartDriver {

	protected static WebDriver driver;

	public StartDriver(WebDriver driver) {
		StartDriver.driver = driver;
	}

	@BeforeTest
	public WebDriver getChromerDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseWorkSpace_01_03_2015\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}

	@AfterTest
	public void afterTest(){

		driver.quit();
		System.out.println("Execution after Test : quitting browser");

	}



}

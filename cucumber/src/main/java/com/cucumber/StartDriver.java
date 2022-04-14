package com.cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartDriver {


//	public StartDriver(WebDriver driver) {
//		StartDriver.driver = driver;
//	}
	WebDriver driver;
	@BeforeTest
	public WebDriver getChromerDriver() {
		
//		Scanner sc = new Scanner(System.in);

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	@Test
	public void test1()
	{
		System.out.println("ssss");
	}
	

	@AfterTest
	public void afterTest(){

		driver.quit();
		System.out.println("Execution after Test : quitting browser");

	}



}

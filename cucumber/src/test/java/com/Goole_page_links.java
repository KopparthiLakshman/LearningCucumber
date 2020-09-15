package com;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Goole_page_links {

	
	WebDriver driver;
	int i = 0;

	@Test
	public void get_all_link_From_Webpage() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseWorkSpace_01_03_2015\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.co.in/");
		
		
		driver.findElement(By.id("lst-ib")).sendKeys("Whats app", Keys.ENTER);
		
		ArrayList<WebElement> element = new ArrayList<WebElement>();
		element.addAll(driver.findElements(By.xpath("*//div/h3/a[contains(@href, 'https://')]")));
		element.addAll(driver.findElements(By.xpath("*//h3/a[contains(@href, 'https://')]")));
		System.out.println("No of hyperlinks availabe in current webpage : "+element.size());
		
		for (WebElement ele : element) {
			
			System.out.println("Web element : " + i + " " + ele.getAttribute("href"));
			i++;
			
		}
		
		driver.quit();
	}
	
	
	
	
	
}

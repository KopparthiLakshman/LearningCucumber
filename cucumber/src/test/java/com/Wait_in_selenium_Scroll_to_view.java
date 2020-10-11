package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Wait_in_selenium_Scroll_to_view {

	
	public void scroll_to_view_element(WebDriver driver) throws InterruptedException {
				
		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.id("u_q_5"));
		driver.wait(2000);
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		driver.manage().deleteAllCookies();

		/**Implicit waight in selenium*/
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/**Explicit webdriver wait in selenium */
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.id("id")));
//		ele.click();
		
		/** how to define pooling in java using Fluentwait */
		
//		  Wait waiti = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS)
//				  .pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
			
		
//		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
//			       .withTimeout(30, TimeUnit.SECONDS)
//			       .pollingEvery(5, TimeUnit.SECONDS)
//			       .ignoring(NoSuchElementException.class);
//
//			   WebElement foo = wait1.until(new Function<WebDriver, WebElement>() {
//			     public WebElement apply(WebDriver driver) {
//			       return driver.findElement(By.id("foo"));
//			     }
//			   });
		
		
		
		
		
		
		
		
	}
}

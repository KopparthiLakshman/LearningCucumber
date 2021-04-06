package testNG;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import beforeClass.Driver;

public class Scroll_in_Selenium extends Driver {

	public Scroll_in_Selenium() {
		driver = getChromerDriver();
	}
	
	
	@Test
	public void scrolling() throws Exception {
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		Alert alert = driver.switchTo().alert();
//		driver.switchTo().window("1");
		WebElement element = driver.findElement(By.className("_2AkmmA _29YdH8"));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		
        // This  will scroll down the page by  1000 pixel vertical		
        jse.executeScript("window.scrollBy(0,1000)");

        // This  will scroll down the page by  1000 pixel horizontally		
        jse.executeScript("window.scrollBy(1000, 0)");
        
        // To scroll the page till the web element 
		jse.executeScript("arguments[0].scrollIntoView();", element);
		
		// How to scroll the page till the bottom
		jse.executeScript("windows.scrollTo(0,document.body.scrollHeight)");
		
		// Horizontal scrolling
		jse.executeScript("window.scrollBy(14350, 0)");
		
		//Scroll the weblement
		element = driver.findElement(By.className("_2AkmmA _29YdH8"));
		element.sendKeys(Keys.END);
		
		
		//how to scroll the page dynamically
		long initialheight = (Long) (jse.executeScript("return document.body.scrollHeight"));
		
		while(true){
		
			long finalheight = (Long) jse.executeScript("windows.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(1000);
			initialheight = (Long) (jse.executeScript("return document.body.scrollHeight"));
			if(finalheight == initialheight)
				break;
			initialheight = finalheight;
			
		}
		

		
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}
	
	
}

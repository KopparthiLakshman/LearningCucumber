package afterClass;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AfterTest {
	
	WebDriver driver;
	
	public void afterTest(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseWorkSpace_01_03_2015\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Execution after Test : quitting browser");
		driver.quit();
	}
}

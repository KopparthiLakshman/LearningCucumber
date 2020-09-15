package beforeClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Driver {
	
	public static WebDriver driver;

	@BeforeTest
	public void chromer_driver() {
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseWorkSpace_01_03_2015\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public WebDriver getChromerDriver() {
		return driver;
	}

	public void setChromeDriver(WebDriver driver) {
		Driver.driver = driver;
	}
	
	
	@AfterTest
	public void afterTest(){
		
		driver.quit();
		System.out.println("Execution after Test : quitting browser");
		
	}
}

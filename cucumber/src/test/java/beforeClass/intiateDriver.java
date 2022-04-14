package beforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class intiateDriver {

		
		protected static WebDriver driver;

		public intiateDriver(WebDriver driver) {
			intiateDriver.driver = driver;
		}

		@BeforeTest
		public static WebDriver getChromerDriver() {
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://www.facebook.com");
			return driver;
		}
		
		@AfterTest
		public void afterTest(){
			
			driver.quit();
			System.out.println("Execution after Test : quitting browser");
			
		}
	}


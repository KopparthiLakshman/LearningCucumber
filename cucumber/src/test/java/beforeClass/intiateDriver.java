package beforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class intiateDriver {

		
		protected static WebDriver driver;

		public intiateDriver(WebDriver driver) {
			intiateDriver.driver = driver;
		}

		@BeforeTest
		public static WebDriver getChromerDriver() {
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://www.facebook.com");
//			WebDriverWait wait = new WebDriverWait(driver, 10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
//			WebElement element = null;
//			Actions act = new Actions(driver);
//			Select sel = new Select(element);
			
//			driver = new InternetExplorerDriver();
			return driver;
		}
		
		@AfterTest
		public void afterTest(){
			
			driver.quit();
			System.out.println("Execution after Test : quitting browser");
			
		}
	}


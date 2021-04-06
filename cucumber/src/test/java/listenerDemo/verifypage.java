package listenerDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class verifypage extends Assert {
	
	public static WebDriver driver;

	@Test(groups = { "windows.checkintest" })
	@Parameters("browser")
	public void verifyPageTitle(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\EclipseWorkSpace_01_03_2015\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\EclipseWorkSpace_01_03_2015\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} 
		else if(browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "D:\\EclipseWorkSpace_01_03_2015\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("ge the title of the page : "+driver.getTitle());
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.quit();
		
	}
	
}

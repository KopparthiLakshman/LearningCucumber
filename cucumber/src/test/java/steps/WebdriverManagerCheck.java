package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManagerCheck {

	@Test
	public void webDriveManage() {
		
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://www.google.com");
		driver.quit();
	}
}

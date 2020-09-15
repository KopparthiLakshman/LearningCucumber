package testNG;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TakeScreenshot {

public static WebDriver driver;

	@Test
	public void takeScreenshot() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseWorkSpace_01_03_2015\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Pass the url
		driver.get("http://www.google.com");

		// Take screenshot and store as a file format
		String src= ((TakesScreenshot)driver).getScreenshotAs((OutputType.BASE64));
		
//		try {
//			// now copy the  screenshot to desired location using copyFile //method
//			FileUtils.copyFile(src, new File("C:\\Users\\lakshman\\Desktop\\error.png"));}
//		catch (IOException e){
//			System.out.println(e.getMessage());	}
		System.out.println(src);
//		Actions act = new Actions(driver);
		driver.quit();	
//		Alert alert = driver.switchTo().alert();
//		alert.getText();
	}
}

package waitInsele;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitInSelenium {

	
	public static void main(String[] args) {
		
		
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseWorkSpace_01_03_2015\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//")));
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame("");
		//switch to parrent window
		driver.switchTo().defaultContent();
		driver.switchTo().window("");
		WebElement ele = driver.findElement(By.xpath(""));
		Actions actions=new Actions(driver);
		actions.moveToElement(ele).perform();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(""));
		} catch (IOException e) {
			e.printStackTrace();
		}
		// input[Contains(@id, 'lakshman')];
		// input[Contains(text(), 'lakshman')];
	}
}

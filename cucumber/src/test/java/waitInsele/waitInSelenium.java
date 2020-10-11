package waitInsele;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitInSelenium {

	
	public static void main(String[] args) {
		
		
		
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseWorkSpace_01_03_2015\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://www.google.com");

		//3.0
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement ele = driver.findElement(By.xpath("//img[contains(@id, 'hplogo')]")); 

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(30))
				.ignoring(ElementNotVisibleException.class);

		ele = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id(""));
			};
		});

		File screenshotAs = ele.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotAs,new File("Google.png"));
		} catch (IOException e1) {
			System.out.println("UInable to find the screnshot taken by driver");
		}
		System.out.println("Title of the web page that is opoened :: " +driver.getTitle());

//		WebDriverWait wait2 = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//")));
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame("");
		//switch to parrent window
		driver.switchTo().defaultContent();
		driver.switchTo().window("");
		WebElement ele3 = driver.findElement(By.xpath(""));
		Actions actions=new Actions(driver);
		actions.moveToElement(ele3).perform();
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

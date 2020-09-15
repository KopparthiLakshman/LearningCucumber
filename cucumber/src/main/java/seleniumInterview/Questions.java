package seleniumInterview;

import java.io.File;
import java.io.IOException;
import java.util.EnumSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Questions {


	public static void main(String[] args) {
	
		/**Locators in selenium : 
		 * id
		 * Name
		 * ClassName
		 * tagName
		 * Xpath - Absolute xpath
		 * 		 - Relative xpath/ Dymanic xpath
		 * 				-	input[starts-with(@id,'ctrl')]	
		 * 				-	input[ends-with(@id,'_userName')]
		 * 				-	Input[contains(@id,'userName')] , Input[contains(text(),'userName')]
		 * CSS Selector
		 * 	-	input[id^='ctrl']
		 * 	-	input[id$='_userName']
		 * 	-	Input[id*='userName']
		 * Linkedtext
		 * PartialLinkedtext
		 * */
		
		
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseWorkSpace_01_03_2015\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(""))));
		
		driver.getWindowHandle();
		
		Set<String> wHandles = driver.getWindowHandles();
		// switch to default window
		driver.switchTo().defaultContent();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		alert.getText();
		
		Select sel = new Select(driver.findElement(By.xpath("")));
		sel.deselectAll();
		sel.selectByIndex(0);
		List<WebElement> options = sel.getOptions();
		WebElement webElement = options.get(2);
		ListIterator<WebElement> listIterator = options.listIterator();
		
		Actions act = new Actions(driver);
		act.dragAndDrop(driver.findElement(By.id("")), driver.findElement(By.id("")));
		
		
		driver.navigate().forward();
		driver.navigate().back();
		
		
		driver.manage().window().getPosition().getX();
		driver.manage().window().getPosition().getX();
		
		Point position = driver.manage().window().getPosition();
		position.getX();
		position.getY();
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scr, new File("C:\\Lakshman\\Desktop\\screen.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		driver.get("");
		driver.getCurrentUrl();
		driver.getTitle();
		
		driver.findElement(By.xpath("@id[name='Submit']//following-sibling::td[2]]"));
		driver.findElement(By.xpath("@id[name='Submit']//preceeding-sibling::td[2]]"));
		driver.findElement(By.xpath("@id[name='Submit']//child::td[2]]"));
		
		driver.findElements(By.name("")).get(5);
		
		
		
		
		
		
		
	}
	
	
}

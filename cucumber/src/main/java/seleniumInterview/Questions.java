package seleniumInterview;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

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


		Wait<WebDriver> waitF = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(30))
				.ignoring(NoSuchContextException.class)
				.ignoring(NoSuchElementException.class)
				.ignoring(ElementNotInteractableException.class)
				.ignoring(ElementNotSelectableException.class)
				.ignoring(ElementNotVisibleException.class);


		WebElement eleF = waitF.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("@id selector"));
			}
		});


		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://www.google.com");

		//3.0
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement ele = driver.findElement(By.xpath("//img[contains(@id, 'hplogo')]")); 



		driver.getWindowHandle();

		Set<String> wHandles = driver.getWindowHandles();
		// switch to default window
		driver.switchTo().defaultContent();

		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		alert.getText();

		Select sel = new Select(driver.findElement(By.xpath("")));
		List<WebElement> options2 = sel.getOptions();
		sel.deselectAll();
		sel.selectByIndex(0);
		
		List<WebElement> options = sel.getOptions();
		WebElement webElement = options.get(2);
		ListIterator<WebElement> listIterator = options.listIterator();

		Actions act = new Actions(driver);
		act.dragAndDrop(driver.findElement(By.id("")), driver.findElement(By.id("")));
		act.build();
		act.click(ele); // overloading
		act.click();

		act.contextClick();
		act.contextClick(ele);
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys(Keys.NUMPAD0,Keys.NUMPAD2).click();
		
		act.build().perform();
		
		act.moveToElement(ele);
		act.moveToElement(ele, 1, 2); // with off set values

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

		driver.switchTo();
		driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		
		windowHandles.iterator().next();
		driver.switchTo().window("");
		
//		Absolute XPath  - /html/body/div[2]/div[1]/div/h4[1]/b/html[1]/body[1]/div[2]/div[1]/div[1]/h4[1]/b[1]
//		Relative Xpath - //div[2]/div[1]/div[1]/h4[1]/b[1]
//		Xpath=//input[@name='uid']
//		Xpath=//input[@type='text']				
//		Xpath=	//label[@id='message23']
//		Xpath=	//input[@value='RESET']
//		Xpath=//*[@class='barone']
//		Xpath=//a[@href='http://demo.guru99.com/']
//		Xpath= //img[@src='//cdn.guru99.com/images/home/java.png']

//		Xpath=//*[contains(@name,'btn')]

//		Xpath=//*[contains(text(),'here')]

//		Xpath=//*[@type='submit' or @name='btnReset']
//		Xpath=//*[@type='submit' and @name='btnReset']

//		Xpath=//label[starts-with(@id,'message')]

//		Xpath=//td[text()='UserID']
		
		
		/*
		 * Different Type of Axes method for defining  the Xpath
		 * 
		 * Child::
		 * Following::
		 * Following-sibling
		 * Parent::
		 * Ancestor:: 
		 * Preceding::
		 * Preceding-sibling
		 * Descendant::
		 * 
		 * */
		
//		driver.findElement(By.xpath("@id[name='Submit']//following-sibling::td[2]]"));
		
//		Xpath=//*[text()='Enterprise Testing']//ancestor::div
		
//		driver.findElement(By.xpath("@id[name='Submit']//child::td[2]]"));
//		driver.findElement(By.xpath("Xpath=//*[@id='rt-feature']//parent::div"));
		
//		Xpath=//*[@type='submit']//preceding::input		
		
//		driver.findElement(By.xpath("@id[name='Submit']//preceeding-sibling::td[2]]"));

//		Xpath=//*[@id='rt-feature']//descendant::a[1]







	}


}

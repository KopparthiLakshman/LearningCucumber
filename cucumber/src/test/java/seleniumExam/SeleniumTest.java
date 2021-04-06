package seleniumExam;


import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class SeleniumTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		CustomerForm customerForm = PageFactory.initElements(driver, CustomerForm.class);
		customerForm.setDriver(driver);
		customerForm.setcName("abc");
		customerForm.setAge("1");
		customerForm.setAddress("aaaccc");
		customerForm.setPhoneNumber("2132143452");
		customerForm.setEmail("ee@ee.com");
		customerForm.submitForm();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		WebElement ele = null;
		
		File scr1 = ele.getScreenshotAs(OutputType.FILE);
		
		
	}
}


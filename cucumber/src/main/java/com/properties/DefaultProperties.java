package com.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.util.page.TestUtill;

public class DefaultProperties {

	static WebDriver driver;
	static Properties prop;
	
	public Properties LoadProperties() {
		
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("config.properties");
			prop.load(fis);
		}catch (FileNotFoundException e) {
			System.out.println("FIle is not available in the path specifiedin Class : DefaultProperties");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop;
	}

//	public void returnFileData(Properties prop) {
//		prop.getProperty(key)
//	}
	
	public void intialization() {
		
		String browserName = prop.getProperty("BrowserName");
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
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtill.TIMEOUT_FOR_PAGELOAD, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtill.TIMEOUT_FOR_IMPLICIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("URL"));
		System.out.println("ge the title of the page : "+driver.getTitle());
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
	}
	
}

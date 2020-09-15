package irctc_Development;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC_ticket_booking {

	public static WebDriver driver ;
	
		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "D:\\EclipseWorkSpace_01_03_2015\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			String url = "http://www.irctc.co.in/eticketing/loginHome.jsf";
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			driver.findElement(By.id("usernameId")).sendKeys("luky244");
			driver.findElement(By.name("j_password")).sendKeys("qazxc",Keys.TAB);
			
//			boolean altOptButPresence = driver.findElement(By.id("loginbutton")).isDisplayed();
//	     	boolean altOptButPresence_2 = driver.findElement(By.id("loginbutton")).isEnabled();

//	     	System.out.println("Status of th SUBMIT button with isDisplayed() : "+ altOptButPresence);
//	     	System.out.println("Status of th SUBMIT button with isEisplayed() : "+ altOptButPresence_2);
	     	
	     	try {
	     		Thread.sleep(7000);
	     	} catch (InterruptedException interruptedException) {
	     		System.out.println("captche bock sleep exception " + interruptedException);
	     	}
	     	driver.findElement(By.id("loginbutton")).click();
			/*driver.findElement(By.id("jpform:fromStation")).click();Thread.sleep(1000);*/
			driver.findElement(By.id("jpform:fromStation")).sendKeys("Secunderabad",Keys.TAB);Thread.sleep(1000);
			driver.findElement(By.id("jpform:toStation")).sendKeys("CHENNAI CENTRAL - MAS",Keys.TAB);//Thread.sleep(1000);
			driver.findElement(By.id("jpform:journeyDateInputDate")).click();//Thread.sleep(1000);
//			driver.findElement(By.id("jpform:journeyDateInputDate")).sendKeys("09-08-2015");
			driver.findElement(By.id("jpform:journeyDateInputDate")).sendKeys("25-02-2018");
			driver.findElement(By.id("jpform:jpsubmit")).click();
			Thread.sleep(20000);
			driver.findElement(By.xpath("//*[@id='qcbd']/table/tbody/tr/td[3]/input")).click();
			List<WebElement> list = driver.findElements(By.className("trainNoLink"));
				System.out.println(list.size());
			for (WebElement webElement : list) {
				if(webElement.getText().equals("12760"))
						driver.findElement(By.id("cllink-12760-SL-3")).click();
			}
			Thread.sleep(1000);
	     	driver.findElements(By.partialLinkText("Book Now")).get(0).click();
	     	 boolean altOptButPresence = driver.findElement(By.id("altavlfrm:continue")).isDisplayed();
	     	 boolean altOptButPresence_2 = driver.findElement(By.id("altavlfrm:continue")).isEnabled();
	     	if(altOptButPresence && altOptButPresence_2)
	     	{
	     		driver.findElement(By.id("altavlfrm:continue")).click();
	     		driver.wait();
	     	}
	     	
	     	
	     	driver.findElement(By.id("altavlfrm:continue")).click();
			
	     	driver.findElement(By.id("addPassengerForm:psdetail:0:psgnName")).sendKeys("Dinesh");
			driver.findElement(By.id("addPassengerForm:psdetail:0:psgnAge")).sendKeys("23",Keys.TAB,Keys.ARROW_DOWN,Keys.TAB,Keys.TAB);
			driver.findElement(By.id("addPassengerForm:psdetail:0:j_idt537")).sendKeys("505424211140");
			driver.findElement(By.id("j_captcha")).click();
			Thread.sleep(10000);
			
			driver.findElement(By.id("validate")).click();
			Thread.sleep(1000);
			
			driver.findElements(By.id("NETBANKING")).get(1).click();
			Thread.sleep(1000);

			driver.findElement(By.id("validate")).click();
			driver.findElement(By.id("username")).click();


			
			

		
	}
}

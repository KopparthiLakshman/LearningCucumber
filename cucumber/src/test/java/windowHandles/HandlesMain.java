package windowHandles;
import java.util.Set;
import java.util.TreeSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import beforeClass.intiateDriver;

public class HandlesMain extends intiateDriver {
	public HandlesMain() {
		super(driver);
	}
	ITestContext context;
	@Test
	public void GetCurrentWindow() throws Exception {
			Set<String> allWindows = new TreeSet<String>(); 
			driver.get("http://seleniumpractise.blogspot.in/");
			System.out.println("Main window title :: "+driver.getTitle());
			driver.findElement(By.xpath(".//*[@id='post-body-3980379804063727309']/a[1]")).click();
			String mainWindow =driver.getWindowHandle();
			System.out.println(mainWindow);
//			Alert alert = driver.switchTo().alert();
//			alert.accept();
			WebElement month_dropdown =driver.findElement(By.id("month"));
			Select month=new Select(month_dropdown);
			month.selectByValue("5");
			System.out.println("Main window title :: "+driver.getTitle());
			allWindows = driver.getWindowHandles();
			System.out.println(allWindows);
			System.out.println(driver.switchTo().window(mainWindow).getTitle());
			Thread.sleep(2000);
			WebElement element = driver.findElement(By.className("gsfi"));
			element.click();
			element.sendKeys("selenium practice blogspot");
			Thread.sleep(5000);
			
	}
}

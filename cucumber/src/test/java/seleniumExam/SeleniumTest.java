package seleniumExam;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

public class SeleniumTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\khaza\\softwares\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://apps.qa2qe.cognizant.e-box.co.in/CustomerRegistration");
		CustomerForm customerForm = PageFactory.initElements(driver, CustomerForm.class);
		customerForm.setDriver(driver);
		customerForm.setcName("abc");
		customerForm.setAge("1");
		customerForm.setAddress("aaaccc");
		customerForm.setPhoneNumber("2132143452");
		customerForm.setEmail("ee@ee.com");
		customerForm.submitForm();
	}
}


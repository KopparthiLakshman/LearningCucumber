package seleniumExam;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestDisplayCustomer {

	private static WebDriver webdriver;
	private static DriverSetup driverSetup = new DriverSetup();
	private static final String REGISTRATION_SUCCESS_MSG = "Registered Succesfully";
	@BeforeClass
	public static void setUp() throws Exception {
		webdriver = driverSetup.getDriver();
	}

	@AfterClass
	public static void closeBrowser() throws Exception {
		webdriver.quit();
	}

	@Test
	public void testValidCustomer() {
		driverSetup.launchApp();
		String name = "Sri";
		String age = "21";
		String address = "Coimbatore";
		String phoneNumber = "8012715789";
		String email = "madhu@gmail.com";
		CustomerForm customerForm = PageFactory.initElements(webdriver, CustomerForm.class);
		customerForm.setDriver(webdriver);
		customerForm.setcName(name);
		customerForm.setAge(age);
		customerForm.setAddress(address);
		customerForm.setPhoneNumber(phoneNumber);
		customerForm.setEmail(email);
		customerForm.submitForm();
		DisplayCustomer displayCustomer = PageFactory.initElements(webdriver, DisplayCustomer.class);
//		new WebDriverWait(webdriver, 10L);
		assertEquals(REGISTRATION_SUCCESS_MSG, displayCustomer.getTitle());
		assertEquals(name + " " + age, displayCustomer.getName());
		assertEquals(age, displayCustomer.getAge());
		assertEquals(address, displayCustomer.getAddress());
		assertEquals(phoneNumber, displayCustomer.getPhoneNumber());
		assertEquals(email, displayCustomer.getEmail());
	}

}


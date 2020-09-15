package seleniumExam;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCustomerForm {

private static WebDriver webdriver;
private static final String PHONE_NUMBER_ERROR_MSG = "phoneNumber cannot be blank";
private static DriverSetup driverSetup = new DriverSetup();
@BeforeClass
public static void setUp() throws Exception {
webdriver = driverSetup.getDriver();
}
@Test
public void testInvalidCustomerDetails() {
driverSetup.launchApp();

CustomerForm customerForm = PageFactory.initElements(webdriver, CustomerForm.class);
customerForm.setDriver(webdriver);
customerForm.setcName("Sri");
customerForm.setAge("21");
customerForm.setAddress("Coimbatore");
customerForm.setPhoneNumber("");
customerForm.setEmail("madhu@gmail.com");
customerForm.submitForm();
new WebDriverWait(webdriver, 3L);
assertEquals(PHONE_NUMBER_ERROR_MSG, customerForm.getErrorMessage());
}
@AfterClass
public static void closeBrowser() throws Exception {
webdriver.quit();
}
}


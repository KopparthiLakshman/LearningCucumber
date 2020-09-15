package steps;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.properties.DefaultProperties;

import beforeClass.intiateDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition extends DefaultProperties {

	WebDriver driver;
	DefaultProperties prop = new DefaultProperties();
	
//	@After(order = 1)
//	public void openBrowser1() {
//		driver = intiateDriver.getChromerDriver();
//	}
	
	@Given("^Open chrome browser$")
	public void openBrowser() {
		driver = intiateDriver.getChromerDriver();
	}
	
	
	@Given("^Launch url \"([^\"]*)\" in browser$")
	public void launchUrl(String url) throws Exception {
		
		Properties loadProperties = prop.LoadProperties();
		String testcaseurl = loadProperties.getProperty(url).toString().trim();
		System.out.println("Logging into url :: "+testcaseurl);
		driver.get(testcaseurl);
	}

	
	@When("^enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void loginIntoApp(String username, String password) throws InterruptedException {

		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password, Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("^close all instances$")
	public void closeallinstances() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	
}

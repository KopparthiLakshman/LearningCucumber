package seleniumExam;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerForm {

	private WebDriver driver;
	@FindBy(name="cname")
	private WebElement custNameEle;
	@FindBy(name="age")
	private WebElement ageEle;
	@FindBy(name="address")
	private WebElement addressEle;
	@FindBy(name="phonenumber")
	private WebElement phNumberEle;
	@FindBy(name="email")
	private WebElement emailEle;
	@FindBy(id="submit")
	private WebElement submitEle;
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public void setcName(String cName) {
		custNameEle.sendKeys(cName);
	}
	public void setAge(String age) {
		ageEle.sendKeys(age);
	}
	public void setAddress(String address) {
		addressEle.sendKeys(address);
	}
	public void setPhoneNumber(String phoneNumber) {
		phNumberEle.sendKeys(phoneNumber);
	}
	public void setEmail(String email) {
		emailEle.sendKeys(email);
	}
	public void submitForm() {
		submitEle.click();
	}
	public String getErrorMessage() {
		WebElement errorMessage = driver.findElement(By.id("message"));
		return errorMessage.getText();
	}
}

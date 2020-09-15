package seleniumExam;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DisplayCustomer {
	@FindBy(xpath="//h2")
	private WebElement titleEle;
	@FindBy(xpath="//table/tbody/tr[1]/td[2]")
	private WebElement nameEle;
	@FindBy(xpath="//table/tbody/tr[2]/td[2]")
	private WebElement ageEle;
	@FindBy(xpath="//table/tbody/tr[5]/td[2]")
	private WebElement emailEle;
	@FindBy(xpath="//table/tbody/tr[3]/td[2]")
	private WebElement addressEle;
	@FindBy(xpath="//table/tbody/tr[4]/td[2]")
	private WebElement phoneNumberEle;

	public String getTitle() {
		return titleEle.getText();
	}

	public String getName() {
		return nameEle.getText();
	}

	public String getAge() {
		return ageEle.getText();
	}

	public String getEmail() {
		return emailEle.getText();
	}

	public String getAddress() {
		return addressEle.getText();
	}

	public String getPhoneNumber() {
		return phoneNumberEle.getText();
	}

}


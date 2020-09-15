//package com;
//
//import org.openqa.selenium.By;
//import com.cucumber.StartDriver;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Sco_Main  extends StartDriver{
//	
//	public Sco_Main() {
//		super(driver);
//	}
//
//	By link1 = By.xpath("html/body/nav/div/a[2]");
//	
//	@Given("^login in to rummyCircle application$")
//	public void openURL() {
//		driver.get("https://mail.google.com/mail");
//	}
//
//	@When("^enter valid \"([^\"]*)\" and \"([^\"]*)\" details$")
//	public void enterUIPW(String UserName, String Password) {
//		driver.findElement(link1).click();
//	}
//	
//	@Then("^close the application$")
//	public void quitBrowser(){
//		driver.quit();
//	}
//	
//}




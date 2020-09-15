package testNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import beforeClass.Driver;

public class WindowsHandle extends Driver{

	public WindowsHandle() {
		driver = getChromerDriver();
	}
	
	
	@BeforeTest
	public void getNoOfWindows() {
		driver.getWindowHandle();
	}
	
	@Test
	public void getCurrentWIndow() {
		
		
	}
	
}

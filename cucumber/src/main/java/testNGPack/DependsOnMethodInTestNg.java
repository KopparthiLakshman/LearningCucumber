package testNGPack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodInTestNg {

	

	@Test()
	public void LogIn() {
//		Assert.assertFalse(true);
		Assert.assertFalse(false);
		System.out.println("LogIn()");
	}

	@Test(dependsOnMethods= {"LogIn"})
	public void Test() {
		System.out.println("Test() depends On");
	}
	
	@Test(dependsOnMethods= {"LogIn"})
	public void LogOut() {
		System.out.println("LogOut()");
	}


}

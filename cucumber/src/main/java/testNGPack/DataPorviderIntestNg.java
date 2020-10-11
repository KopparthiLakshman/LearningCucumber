package testNGPack;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPorviderIntestNg {

	int i =0;
	@Test(dataProvider="DataProvider", description = " Run the test ")
	public void test(String a, String b) {
		i++;
		System.out.println("UserName :: "+a +"  Password :: "+b +"  run " +i);
	}
	
	@DataProvider()
	public Object[][] DataProvider() {
		return new Object[][] {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};
	}
	
	@DataProvider(name = "Data")
	public Object[][] DataProviderWithoutMethodName() {
		return new Object[][] {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};
	}

	@DataProvider()
	public Object[] DataProvider1() {
		return new Object[] {"user1","user2","user3"};
	}
	
	@Test(dataProvider="DataProvider1", description = " Run the test with sigle parameter")
	public void test1(String a) {
		i++;
		System.out.println("UserName :: "+a );
	}
	
}

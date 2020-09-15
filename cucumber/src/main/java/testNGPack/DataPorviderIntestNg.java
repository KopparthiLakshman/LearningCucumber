package testNGPack;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPorviderIntestNg {

	int i =0;
	@Test(dataProvider="data", description = " Run the test ")
	public void test(String a, String b) {
		i++;
		System.out.println("UserName :: "+a +"  Password :: "+b +"  run " +i);
	}
	
	@DataProvider(name = "data")
	public Object[][] DataProvider() {
		return new Object[][] {{"user1","pas1"},{"user2","pass2"},{"user3","pass3"}};
	}
}

package testNGPack;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParametersInTestng {

	
	@Test
	@Parameters({"UserName","password"})
	public void testNGLogin(@Optional("Optional Usename ")String UserName, @Optional("Optional Password")String password) {
		System.out.println("UserName :: "+UserName+ "\nPassword :: "+password);
		
	}
}

package testNGPack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class GourpInTestNG {

	@BeforeClass(groups= {"sanity","regression","database"})
	public void setUpInGroups() {
		System.out.println("groups= {\"sanity\",\"regression\",\"database\"}");
	}
	
	@Test(groups= {"sanity","regression"})
	public void Test1()
	{
		System.out.println("groups= {\"sanity\",\"regression\"}");
	}

	@Test(groups= {"sanity","database"})
	public void Test2()
	{
		System.out.println("groups= {\"sanity\",\"database\"}");
	}
	
	@Test(groups= {"regression"})
	public void Test3()
	{
		System.out.println("groups= {\"regression\"}");
	}

	@Test(groups= {"database"})
	public void Test4()
	{
		System.out.println("groups= {\"database\"}");
	}
}

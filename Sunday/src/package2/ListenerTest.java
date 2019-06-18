package package2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ListenerTest {

	@Test(priority=1)
	public void login()
	{
		Reporter.log("Login script", true);
	}
	
	@Test(priority=2)
	public void createCustomer()
	{
		Reporter.log("Create Customer Script", true);
	}
	
	@Test(dependsOnMethods= {"createCustomer"})
	public void createProject()
	{
		Reporter.log("Create Project Script", true);
	}
}

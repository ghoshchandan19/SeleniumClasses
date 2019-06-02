package package2;

import org.testng.annotations.Test;

public class GroupExecutionTest {
	
	@Test(groups={"smoke"})
	public void login()
	{
		System.out.println("Login Script");
	}
	
	@Test(groups= {"Regression"})
	public void purchaseProduct()
	{
		System.out.println("Purchase Script");
	}
	@Test(groups= {"Regression"})
	public void payment()
	{
		System.out.println("Payment script");
	}

}

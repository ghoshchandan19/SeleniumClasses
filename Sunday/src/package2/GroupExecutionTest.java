package package2;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;

public class GroupExecutionTest {
	
	public void configBC() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod(groups= {"smoke"})
	public void configBM() {
		System.out.println("Before Method");
	}
	
	

	@Test(groups = { "smoke" })
	public void login() {
		System.out.println("Login Script");
	}

	@Test(groups = { "Regression" })
	public void purchaseProduct() {
		System.out.println("Purchase Script");
	}

	@Test(groups = { "Regression" })
	public void payment() {
		System.out.println("Payment script");
	}

}

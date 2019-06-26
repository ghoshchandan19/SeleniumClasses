package package3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import package2.LoginPage;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void preCondition() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chandan Ghosh\\Downloads\\Sunday\\Sunday\\exefiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1");
		
	}

	@Test(priority=1)
	public void login() {
		LoginPagePom login = new LoginPagePom(driver);
		login.getUnTxtBx().sendKeys("admin");
		login.getPwdTxtBx().sendKeys("manager");
		login.getLoginBtn().click();

	}
	
	@Test(priority=2)
	public void rememberLogin()
	{
		LoginPagePom login = new LoginPagePom(driver);
		login.getUnTxtBx().sendKeys("admin");
		login.getPwdTxtBx().sendKeys("manager");
		login.getChkBx().click();
		login.getLoginBtn().click();
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}


}

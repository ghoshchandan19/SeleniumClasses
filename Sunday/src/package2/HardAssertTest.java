package package2;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssertTest {

	WebDriver driver;

	@BeforeMethod
	public void preCondition() {
		System.out.println("Before Method");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chandan Ghosh\\Downloads\\Sunday\\Sunday\\exefiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do");
	}

	@AfterMethod
	public void postCondition() {
		System.out.println("After Method");
		driver.close();
	}

	@Test(priority = 1)
	public void validLogin() {
		System.out.println("Login started");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Reporter.log("Home Page is verified", true);
		String expTitle = "Enter Time-Track";
		String actTitle = driver.findElement(By.className("pagetitle")).getText();
		System.out.println(actTitle);
		Assert.assertEquals(actTitle, expTitle);

	}

	@Test(priority=2)
	public void invalidLogin() {
		System.out.println("Invalid Login");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("123");
		driver.findElement(By.id("loginButton")).click();
		String expMsg = "Username or Password is invalid. Please try again.";
		String actMsg = driver.findElement(By.xpath("//div[@id='ServerSideErrorMessage']//span")).getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log("Invalid Login Msg is verified", true);
	}

}

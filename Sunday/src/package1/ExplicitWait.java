package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chandan Ghosh\\Downloads\\Sunday\\Sunday\\exefiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com");
		driver.findElement(By.xpath("(//a[text()=\"Login\"])[3]")).click();
		WebElement bUser = driver.findElement(By.xpath("//button[text()='Business user ']"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(bUser));
		bUser.click();
		driver.findElement(By.id("loginemail")).sendKeys("ghoshchandan19@gmail.com");
		driver.findElement(By.id("password")).sendKeys("abc");
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
	
		String xp="//label[@class='small text-danger ng-binding']";
		String expected="Please login using the OTP option";
		Boolean flag = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(xp),expected));
		System.out.println(flag);

		
	}

}

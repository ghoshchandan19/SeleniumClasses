package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chandan Ghosh\\Downloads\\Sunday\\Sunday\\exefiles\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		String xp="//div[@id='banner']//a[contains(text(),'CONTINUE')]";
		driver.findElement(By.xpath(xp)).click();
		driver.findElement(By.id("Button2")).click();
		Alert alrt = driver.switchTo().alert();
		System.out.println(alrt.getClass().getSimpleName());
		
		System.out.println("Get Text from the popup: "+alrt.getText());
		Thread.sleep(5000);
		alrt.accept();
		driver.findElement(By.id("username")).sendKeys("Chandan");

	}
}

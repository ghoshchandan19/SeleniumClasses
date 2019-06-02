package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWebElement1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/chandanghosh/Desktop/Softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Chandan%20Ghosh/Desktop/practise.html");
		
		WebElement unTxtBx = driver.findElement(By.id("user"));
		unTxtBx.sendKeys("abc");
		
		Thread.sleep(2000);
		
		unTxtBx.clear();
		
		Thread.sleep(2000);
		
		unTxtBx.sendKeys("xyz");
		
		//Clearing data without using clear()
		unTxtBx.sendKeys(Keys.COMMAND+"a");
		unTxtBx.sendKeys(Keys.DELETE);

	}

}

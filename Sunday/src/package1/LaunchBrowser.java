package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Chandan Ghosh\\Downloads\\Sunday\\Sunday\\exefiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Chandan%20Ghosh/Desktop/practise.html");
		
		driver.findElement(By.id("user")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("pwd");
		
		String text1 = driver.findElement(By.tagName("h1")).getText();
		System.out.println(text1);

	}

}

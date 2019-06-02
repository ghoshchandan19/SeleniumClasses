package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/chandanghosh/Desktop/Softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///Users/chandanghosh/Desktop/Automation.html");
		
		//Understanding ClassName
		driver.findElement(By.className("MyCheckbox")).click();
		
		//Understanding tagName
		driver.findElement(By.tagName("a")).click();
		
		//Understanding CssSelector
		driver.findElement(By.cssSelector("input[value='LOGIN']")).click();
		
	}

}

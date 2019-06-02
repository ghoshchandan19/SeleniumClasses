package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckDropdownType {
	
	public  static boolean   verifyDropdown(WebElement dropdown)
	{
		Select sel=new Select(dropdown);
		boolean flag = sel.isMultiple();
		return flag;
	}

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/chandanghosh/Desktop/Softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/chandanghosh/Desktop/Automation.html");
		
		WebElement drpDwn1 = driver.findElement(By.name("Courses"));
		boolean flag1 = verifyDropdown(drpDwn1);
		System.out.println("Is the dropdown multiple :"+flag1);
		
		WebElement drpDwn2 = driver.findElement(By.name("Country"));
		boolean flag2 = verifyDropdown(drpDwn2);
		System.out.println("Is the dropdown multiple :"+flag2);
		
		

	}

}

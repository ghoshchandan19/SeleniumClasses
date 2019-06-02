package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/chandanghosh/Desktop/Softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/chandanghosh/Desktop/Automation.html");
		
		WebElement drpDwn = driver.findElement(By.name("Country"));
		Select sel =new Select(drpDwn);
		List<WebElement> allOptions = sel.getOptions();
		
		System.out.println(allOptions.getClass().getSimpleName());
		//To get total number of elements present in the dropdown
		int count = allOptions.size();
		
		System.out.println("Total Count: "+count);
		
		//Get all the elements from the dropdown
		for(int i=0;i<allOptions.size();i++)
		{
			System.out.println(allOptions.get(i).getText());
		}
		

	}

}

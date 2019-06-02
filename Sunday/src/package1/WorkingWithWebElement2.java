package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWebElement2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/chandanghosh/Desktop/Softwares/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///Users/chandanghosh/Desktop/Automation.html");
		

		// Understanding getText()
		String headerText = driver.findElement(By.tagName("h1")).getText();
		System.out.println(headerText);

		// Understanding getAttribute()
		WebElement pwdTxtBx = driver.findElement(By.name("pwd"));
		String attrbValue = pwdTxtBx.getAttribute("placeholder");
		System.out.println(attrbValue);

		// Understanding CssAttribute
		String value1 = driver.findElement(By.tagName("h1")).getCssValue("font-size");
		System.out.println(value1);

		String value2 = driver.findElement(By.tagName("a")).getCssValue("font-size");
		System.out.println(value2);

		// Width and height of an webElement
		Dimension dim = driver.findElement(By.tagName("img")).getSize();
		int width = dim.getWidth();
		int height = dim.getHeight();
		System.out.println("Width:" + width);
		System.out.println("Height:" + height);

		// Total page height
		int pageHeight = driver.findElement(By.tagName("body")).getSize().getHeight();
		System.out.println(pageHeight);

		// Understanding getLocation()
		Point pt = driver.findElement(By.tagName("img")).getLocation();
		int x = pt.getX();
		int y = pt.getY();
		System.out.println("Location of the webelement:"+x+","+y);
	}

}

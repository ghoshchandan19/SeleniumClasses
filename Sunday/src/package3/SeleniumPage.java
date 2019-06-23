package package3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import lombok.Getter;

public class SeleniumPage {

	private @Getter WebElement about;
	private @Getter WebElement support;
	private @Getter WebElement doc;
	private @Getter WebElement download;
	private @Getter WebElement projects;

	public SeleniumPage(WebDriver driver) {
		about = driver.findElement(By.xpath("//li[@id='menu_about']/a"));
		support =driver.findElement(By.xpath("//li[@id='menu_support']/a"));

	}

}

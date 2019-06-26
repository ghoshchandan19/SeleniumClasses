package package3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class SeleniumPomPage {
	@FindBy(xpath="//li[@id='menu_about']/a")
	private @Getter WebElement about;
	@FindBy(xpath="//li[@id='menu_support']/a")
	private @Getter WebElement support;
	@FindBy(xpath="//li[@id='menu_documentation']/a")
	private @Getter WebElement doc;
	@FindBy(xpath="//li[@id='menu_download']/a")
	private @Getter WebElement download;
	@FindBy(xpath="//li[@id='menu_projects']/a")
	private @Getter WebElement projects;
	
	public SeleniumPomPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}

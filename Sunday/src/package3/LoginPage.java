package package3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class LoginPage {
	
	@FindBy(name="username")
	private @Getter WebElement unTxtBx;
	@FindBy(name="pwd")
	private @Getter WebElement pwdTxtBx;
	@FindBy(id="keepLoggedInCheckBox")
	private @Getter WebElement chkBx;
	@FindBy(id="loginButton")
	private @Getter WebElement loginBtn;
	

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}

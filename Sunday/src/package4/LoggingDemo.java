package package4;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoggingDemo {
	 
	 static final Logger log=Logger.getLogger(LoggingDemo.class);
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Chandan Ghosh\\Downloads\\Sunday\\Sunday\\exefiles\\chromedriver.exe");
		//Logger log=Logger.getLogger("LoggingDemo");
		PropertyConfigurator.configure("log4j.properties");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		log.debug("Opening Website");
		log.info("test");
		
		
		

	}

}

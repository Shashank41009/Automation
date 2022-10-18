package assignmentClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableNotification {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions c = new ChromeOptions();
		c.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.yatra.com/");
	}
}

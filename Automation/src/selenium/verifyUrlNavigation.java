package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyUrlNavigation {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		driver.get("http://www.selenium.org");
		String goturl = driver.getPageSource();
		String expectedurl = "https://www.selenium.dev/downloads/";
		if(goturl.equals(expectedurl))
		{
			System.out.println("testpass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
	}
}

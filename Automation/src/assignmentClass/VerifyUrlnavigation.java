package assignmentClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrlnavigation {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		String actualurl = "https://www.selenium.dev/";
		if(currenturl.equals(actualurl))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.close();
	}

}

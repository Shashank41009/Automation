package assignmentClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginIsEnabled {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		boolean login = driver.findElement(By.xpath("//button[text()='Log in']")).isEnabled();
		if(login==true)
		{
			System.out.println("Button is enabled");
		}
		else
		{
			System.out.println("Button isnt enabled");
		}
		driver.close();
	}

}

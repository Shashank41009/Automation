package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadResume {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/shash/OneDrive/Documents/resume.html");
		Thread.sleep(2000);
		driver.findElement(By.id("cv")).sendKeys("C:\\Users\\shash\\OneDrive\\Documents");
		driver.close();
	}

}
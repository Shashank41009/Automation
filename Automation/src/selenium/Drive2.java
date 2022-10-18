package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drive2 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
			
			driver.get("http://www.google.com");
			System.out.println(driver.getTitle());
			driver.navigate().to("http://www.gmail.com");
			driver.navigate().forward();
			driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.className("class")).click();
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjYxNzk0NDA0LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		driver.findElement(By.id("loginbutton")).click();
		
			
			//driver.close();
			
		}
	}



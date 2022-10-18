package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCssSelector {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/shash/OneDrive/Documents/sample.html");
		
		driver.findElement(By.cssSelector("a[id='d1']")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[name='n1']")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a[class='c1']")).click();
		driver.navigate().back();
		Thread.sleep(2000); 
		driver.findElement(By.cssSelector("a[href='http://www.amazon.com/']")).click();
		//driver.navigate().back();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		

	}

}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoxpath {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/shash/OneDrive/Documents/sample.html");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[name=n1]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[href='http://www.amazon.com/']")).click();
		
		driver.findElement(By.xpath("//a[2]")).click();
		driver.findElement(By.xpath("/html/body/a[1]")).click();
	}
}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demopat {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/shash/OneDrive/Documents/Demo1.htm");
		driver.findElement(By.xpath("//input[@type='text' and @value='A']")).click();
		driver.findElement(By.xpath("//input[@type='text' and @value='B']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).click();
		driver.findElement(By.xpath("//input[@type='text' or @type='button']")).click();
		driver.findElement(By.xpath("//input[@value='A']" )).click();
		driver.findElement(By.xpath("//input[@checked]")).click();
		driver.findElement(By.xpath("//input[not(@checked) and @type='checkbox']")).click();
		
		
		
	}
}

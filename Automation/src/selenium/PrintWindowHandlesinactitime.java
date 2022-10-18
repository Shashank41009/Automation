package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//write a  script to print window handles of all the tabs present in actitime after clicking on actitime link

public class PrintWindowHandlesinactitime {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allwh = driver.getWindowHandles();
		for(String i : allwh)
		{
			WebDriver whs = driver.switchTo().window(i);
			System.out.println(whs);
		}
		driver.quit();
		
		
	}
	
	

}

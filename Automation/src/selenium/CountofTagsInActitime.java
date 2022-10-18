package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Write a script to count no of tabs present in actiTime after clicking actitime link
public class CountofTagsInActitime {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		
		Set<String> allwh = driver.getWindowHandles();
		int count=0;
		System.out.println(allwh.size());
		
		for(String i : allwh)
		{
			driver.switchTo().window(i);
			count++;
			
		}
		System.out.println("The no of tags present after clicking on actiTime link "+count);
		driver.quit();
		
		
	}

}
